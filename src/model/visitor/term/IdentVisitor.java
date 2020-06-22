package model.visitor.term;

import model.term.utilities.AccessIdent;
import model.term.utilities.Ident;

public interface IdentVisitor<R,P> {

    R visit(Ident ident,P p);

    R visit(AccessIdent accessIdent, P p);
}
