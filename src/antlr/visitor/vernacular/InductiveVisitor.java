package antlr.visitor.vernacular;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.term.IdentVisitor;
import antlr.visitor.term.TermVisitor;
import model.vernacular.CoInductive;
import model.vernacular.Inductive;
import model.vernacular.StdInductive;
import model.vernacular.utilities.IndBody;
import model.vernacular.utilities.WhereClause;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InductiveVisitor extends GenericVisitor<Inductive> {

    @Override
    public Inductive visitStdInductive(coqParser.StdInductiveContext ctx) {
        Optional<WhereClause> optionalWhereClause = Optional.empty();
        List<IndBody> indBodies = new ArrayList<>();

        ctx.ind_body().forEach(ind_bodyContext -> {indBodies.add(new IndBodyVisitor().visit(ind_bodyContext));});

        if(ctx.STRING() != null){
            optionalWhereClause = Optional.of(new WhereClause(ctx.STRING().getSymbol().getText(),
                                                              new TermVisitor().visit(ctx.term()),
                                                              new IdentVisitor().visit(ctx.ident())));
        }

        return new StdInductive(indBodies,optionalWhereClause);

    }

    @Override
    public Inductive visitCoInductive(coqParser.CoInductiveContext ctx) {
        Optional<WhereClause> optionalWhereClause = Optional.empty();
        List<IndBody> indBodies = new ArrayList<>();

        ctx.ind_body().forEach(ind_bodyContext -> {indBodies.add(new IndBodyVisitor().visit(ind_bodyContext));});

        if(ctx.STRING() != null){
            optionalWhereClause = Optional.of(new WhereClause(ctx.STRING().getSymbol().getText(),
                    new TermVisitor().visit(ctx.term()),
                    new IdentVisitor().visit(ctx.ident())));
        }

        return new CoInductive(indBodies,optionalWhereClause);
    }
}
