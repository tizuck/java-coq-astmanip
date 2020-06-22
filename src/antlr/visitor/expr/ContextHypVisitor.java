package antlr.visitor.expr;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.term.NameVisitor;
import antlr.visitor.term.TermVisitor;
import model.tactics.expr.utilities.ContextHyp;
import model.tactics.expr.utilities.ExprContextHyp;
import model.tactics.expr.utilities.StdContextHyp;

import java.util.Optional;

public class ContextHypVisitor extends GenericVisitor<ContextHyp> {

    private ExprVisitor exprVisitor;


    public ContextHypVisitor(ExprVisitor exprVisitor) {
        this.exprVisitor = exprVisitor;
    }

    @Override
    public ContextHyp visitStdContextHyp(coqParser.StdContextHypContext ctx) {
        return new StdContextHyp(new NameVisitor().visit(ctx.name()),
                new TermVisitor().visit(ctx.term()));
    }

    @Override
    public ContextHyp visitExprContextHyp(coqParser.ExprContextHypContext ctx) {
        return new ExprContextHyp(new NameVisitor().visit(ctx.name()),
                new TermVisitor().visit(ctx.term(0)),
                ctx.term().size() > 1 ? Optional.of(new TermVisitor().visit(ctx.term(1))) : Optional.empty(),
                exprVisitor.visit(ctx.expr()));
    }
}
