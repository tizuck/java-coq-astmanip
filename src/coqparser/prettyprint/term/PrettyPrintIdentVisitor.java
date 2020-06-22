package coqparser.prettyprint.term;

import coqparser.prettyprint.PrettyPrintContext;
import model.term.utilities.AccessIdent;
import model.term.utilities.Ident;
import model.visitor.term.IdentVisitor;

public class PrettyPrintIdentVisitor implements IdentVisitor<String, PrettyPrintContext> {
    @Override
    public String visit(Ident ident, PrettyPrintContext ctx) {
        return ident.getId();
    }

    @Override
    public String visit(AccessIdent accessIdent, PrettyPrintContext ctx) {
        return accessIdent.getId();
    }
}
