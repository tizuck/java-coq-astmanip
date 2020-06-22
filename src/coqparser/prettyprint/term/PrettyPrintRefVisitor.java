package coqparser.prettyprint.term;

import coqparser.prettyprint.PrettyPrintContext;
import model.term.Number;
import model.term.utilities.Ident;
import model.visitor.term.RefVisitor;

public class PrettyPrintRefVisitor implements RefVisitor<String, PrettyPrintContext> {
    @Override
    public String visit(Number number, PrettyPrintContext prettyPrintContext) {
        return number.toString();
    }

    @Override
    public String visit(Ident ident, PrettyPrintContext prettyPrintContext) {
        return ident.accept(new PrettyPrintIdentVisitor(),prettyPrintContext);
    }
}
