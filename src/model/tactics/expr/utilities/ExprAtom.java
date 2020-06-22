package model.tactics.expr.utilities;

import model.tactics.expr.Expr;
import model.visitor.expr.AtomVisitor;

import java.util.Objects;

public class ExprAtom implements Atom {

    private Expr expr;


    public ExprAtom(Expr expr) {
        this.expr = expr;
    }

    public Expr getExpr() {
        return expr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExprAtom exprAtom = (ExprAtom) o;
        return Objects.equals(expr, exprAtom.expr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expr);
    }

    @Override
    public <R, P> R accept(AtomVisitor<R, P> atomVisitor, P p) {
        return atomVisitor.visit(this,p);
    }
}
