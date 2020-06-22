package antlr.visitor.term;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.term.utilities.Name;

public class NameVisitor extends GenericVisitor<Name> {

    private IdentVisitor identVisitor;

    public NameVisitor(){
        identVisitor = new IdentVisitor();
    }
    @Override
    public Name visitSimpleName(coqParser.SimpleNameContext ctx){
        return new Name(identVisitor.visit(ctx.ident()).getId());
    }

    @Override
    public Name visitUnderscoreName(coqParser.UnderscoreNameContext ctx){
        return new Name("_");
    }
}
