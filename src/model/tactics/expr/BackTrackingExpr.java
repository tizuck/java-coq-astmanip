package model.tactics.expr;

import model.visitor.expr.ExprVisitor;

public class BackTrackingExpr extends OpsExpr {

    public BackTrackingExpr(Expr expr1, Expr expr2) {
        super(expr1, expr2);
    }



    @Override
    public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
        return exprVisitor.visit(this,p);
    }
}
