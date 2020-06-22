package model.visitor.term;

import model.term.Number;
import model.term.utilities.Ident;

public interface RefVisitor<R,P> {
    R visit(Number number,P p);
    R visit(Ident ident,P p);
}
