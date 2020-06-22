package model.tactics.expr;

public abstract class TimeoutExpr extends LabeledExpr {

    public TimeoutExpr(Expr expr) {
        super(expr);
    }
}
