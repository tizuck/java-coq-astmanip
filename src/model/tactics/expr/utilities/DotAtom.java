package model.tactics.expr.utilities;

import model.visitor.expr.AtomVisitor;

public class DotAtom implements Atom {
    @Override
    public <R, P> R accept(AtomVisitor<R, P> atomVisitor, P p) {
        return atomVisitor.visit(this,p);
    }
}
