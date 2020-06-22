package coqparser.prettyprint.term;

import coqparser.prettyprint.PrettyPrintConfiguration;
import coqparser.prettyprint.PrettyPrintContext;
import model.term.utilities.*;
import model.visitor.term.BinderVisitor;

public class PrettyPrintBinderVisitor implements BinderVisitor<String, PrettyPrintContext> {

    private final PrettyPrintConfiguration prettyPrintConfiguration;

    public PrettyPrintBinderVisitor(PrettyPrintConfiguration prettyPrintConfiguration) {
        this.prettyPrintConfiguration = prettyPrintConfiguration;
    }

    @Override
    public String visit(SingleNameBinder singleNameBinder, PrettyPrintContext ctx) {
        return singleNameBinder.toString();
    }

    @Override
    public String visit(NameBinder nameBinder, PrettyPrintContext ctx) {
            String names = "";
            for (Name name : nameBinder.getNames()) {
                names += " " + name.toString();
            }
            String term = nameBinder.getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                    new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,ctx.getTreetype()));
            return  names + " : " + term;

    }

    @Override
    public String visit(BracedNameBinder bracedNameBinder, PrettyPrintContext ctx) {
        if(bracedNameBinder.getoTerm().isPresent()){
            String prefix= "( ";
            String name = bracedNameBinder.getName().toString();
            String oTerm = bracedNameBinder.getoTerm().get().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                    new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,ctx.getTreetype()));
            String term = bracedNameBinder.getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                    new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,ctx.getTreetype()));
            return prefix + name + " : " + oTerm + " := " + term + " )";
        }
        String prefix= "( ";
        String name = bracedNameBinder.getName().toString();
        String term = bracedNameBinder.getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,ctx.getTreetype()));
        return prefix + name + " := " + term + " )";
    }

    @Override
    public String visit(ImplicitBinder implicitBinder, PrettyPrintContext ctx) {
        String binders = "";
        for (Binder binder : implicitBinder.getBinders()) {
            binders += " " + binder.accept(this,ctx);
        }
        return "{" + binders + "}";
    }
}
