package model.tactics.expr;

import model.tactics.expr.utilities.Atom;
import model.visitor.expr.ExprVisitor;

import java.util.Objects;

public class AtomExpr implements Expr {
    private Atom atom;


    public AtomExpr(Atom atom) {
        this.atom = atom;
    }

    public Atom getAtom() {
        return atom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AtomExpr atomExpr = (AtomExpr) o;
        return Objects.equals(atom, atomExpr.atom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atom);
    }

    @Override
    public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
        return exprVisitor.visit(this,p);
    }
}
