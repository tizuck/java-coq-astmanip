package antlr.visitor.vernacular;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.term.IdentVisitor;
import antlr.visitor.term.TermVisitor;
import model.term.utilities.Ident;
import model.vernacular.utilities.Assums;

import java.util.ArrayList;
import java.util.List;

public class AssumsVisitor extends GenericVisitor<Assums> {
    private final IdentVisitor identVisitor;
    private final TermVisitor termVisitor;

    public AssumsVisitor(){
        identVisitor = new IdentVisitor();
        termVisitor = new TermVisitor();
    }
    @Override
    public Assums visitAssums(coqParser.AssumsContext ctx){
        List<Ident> ids = new ArrayList<>();
        ctx.ident().forEach(identContext -> {ids.add(identVisitor.visit(identContext));});
        return new Assums( ids,
                termVisitor.visit(ctx.term()));
    }
}
