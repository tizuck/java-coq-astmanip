package model.tactics.expr;

import model.visitor.expr.ExprVisitor;

public class RepeatExpr extends LabeledExpr {

    public RepeatExpr(Expr expr) {
        super(expr);
    }



    @Override
    public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
        return exprVisitor.visit(this,p);
    }
}
