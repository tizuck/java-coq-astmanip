package antlr.visitor.expr;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.term.IdentVisitor;
import antlr.visitor.term.NameVisitor;
import model.tactics.expr.utilities.LetClause;
import model.term.utilities.Name;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LetClauseVisitor extends GenericVisitor<LetClause> {

    private ExprVisitor exprVisitor;

    public LetClauseVisitor(ExprVisitor exprVisitor) {
        this.exprVisitor = exprVisitor;
    }

    @Override
    public LetClause visitLet_clause(coqParser.Let_clauseContext ctx) {
        Optional<List<Name>> optionalNames = Optional.empty();
        if(ctx.name() != null && ctx.name().size() > 0){
            optionalNames = Optional.of(ctx.name().stream()
            .map(nameContext -> new NameVisitor().visit(nameContext))
            .collect(Collectors.toList()));
        }

        return new LetClause(new IdentVisitor().visit(ctx.ident()),
                optionalNames,
                exprVisitor.visit(ctx.expr()));
    }
}
