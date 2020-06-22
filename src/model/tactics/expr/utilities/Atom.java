package model.tactics.expr.utilities;

import model.visitor.expr.AtomVisitor;

public interface Atom {
    <R,P> R accept(AtomVisitor<R,P> atomVisitor, P p);
}
