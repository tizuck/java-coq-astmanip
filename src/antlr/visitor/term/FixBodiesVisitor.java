package antlr.visitor.term;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.term.utilities.*;

import java.util.ArrayList;
import java.util.List;

public class FixBodiesVisitor extends GenericVisitor<FixBodies> {

    private final FixBodyVisitor fixBodyVisitor;
    private final IdentVisitor identVisitor;

    public FixBodiesVisitor(TermVisitor termVisitor){
        fixBodyVisitor = new FixBodyVisitor(termVisitor);
        identVisitor = new IdentVisitor();
    }
    @Override
    public FixBodies visitSingleFixBody(coqParser.SingleFixBodyContext ctx){
        return new SingleFixBody(fixBodyVisitor.visit(ctx.fix_body()));
    }

    @Override
    public FixBodies visitMultipleFixBodies(coqParser.MultipleFixBodiesContext ctx){

        List<FixBody> fixBodies = new ArrayList<>();
        ctx.fix_body().forEach(fix_bodyContext -> {fixBodies.add(fixBodyVisitor.visit(fix_bodyContext));});

        return new MultipleFixBodies( identVisitor.visit(ctx.ident()),
                fixBodies);
    }
}
