package antlr.visitor.term;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.term.utilities.*;

import java.util.ArrayList;
import java.util.List;

public class CofixBodiesVisitor extends GenericVisitor<CoFixBodies> {

    private final IdentVisitor identVisitor;

    private final CofixBodyVisitor cofixBodyVisitor;

    public CofixBodiesVisitor(TermVisitor termVisitor) {
        cofixBodyVisitor = new CofixBodyVisitor(termVisitor);
        identVisitor = new IdentVisitor();
    }

    @Override
    public CoFixBodies visitSingleCoFixBody(coqParser.SingleCoFixBodyContext ctx){
        return new SingleCoFixBody(cofixBodyVisitor.visit(ctx.cofix_body()));
    }

    @Override
    public CoFixBodies visitMultipleCoFixBodies(coqParser.MultipleCoFixBodiesContext ctx){
        List<CoFixBody> coFixBodies = new ArrayList<>();

        ctx.cofix_body().forEach(cofix_bodyContext -> {coFixBodies.add(cofixBodyVisitor.visit(cofix_bodyContext));});

        return new MultipleCofixBodies( identVisitor.visit(ctx.ident()),
                coFixBodies);
    }
}
