package antlr.visitor.vernacular;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.term.CofixBodyVisitor;
import antlr.visitor.term.FixBodyVisitor;
import antlr.visitor.term.IdentVisitor;
import antlr.visitor.term.TermVisitor;
import model.term.utilities.CoFixBody;
import model.term.utilities.FixBody;
import model.vernacular.CoFixPoint;
import model.vernacular.Fixpoint;
import model.vernacular.StdFixPoint;
import model.vernacular.utilities.WhereClause;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FixPointVisitor extends GenericVisitor<Fixpoint> {

    @Override
    public Fixpoint visitStdFixPoint(coqParser.StdFixPointContext ctx) {
        List<FixBody> fixBodies = new ArrayList<>();
        Optional<WhereClause> optionalWhereClause = Optional.empty();

        ctx.fix_body().forEach(fix_bodyContext -> {fixBodies.add(new FixBodyVisitor(new TermVisitor()).visit(fix_bodyContext));});

        if(ctx.STRING() != null){
            optionalWhereClause = Optional.of(new WhereClause(ctx.STRING().getSymbol().getText(),
                    new TermVisitor().visit(ctx.term()),
                    new IdentVisitor().visit(ctx.ident())));
        }

        return new StdFixPoint(optionalWhereClause,
                fixBodies);
    }

    @Override
    public Fixpoint visitCoFixPoint(coqParser.CoFixPointContext ctx) {
        List<CoFixBody> cofixBodies = new ArrayList<>();
        Optional<WhereClause> optionalWhereClause = Optional.empty();

        ctx.cofix_body().forEach(cofix_bodyContext -> {cofixBodies.add(new CofixBodyVisitor(new TermVisitor()).visit(cofix_bodyContext));});

        if(ctx.STRING() != null){
            optionalWhereClause = Optional.of(new WhereClause(ctx.STRING().getSymbol().getText(),
                    new TermVisitor().visit(ctx.term()),
                    new IdentVisitor().visit(ctx.ident())));
        }

        return new CoFixPoint(optionalWhereClause,
                cofixBodies);
    }
}
