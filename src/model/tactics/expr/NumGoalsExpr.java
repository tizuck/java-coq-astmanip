package model.tactics.expr;

import model.visitor.expr.ExprVisitor;

public class NumGoalsExpr implements Expr {

    public NumGoalsExpr() {
    }

    @Override
    public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
        return exprVisitor.visit(this,p);
    }
}
