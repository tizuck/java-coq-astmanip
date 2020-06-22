package model.tactics.expr;

import model.tactics.expr.utilities.ContextRule;
import model.visitor.expr.ExprVisitor;

import java.util.List;

public class LazyContextMatchExpr extends ContextMatchExpr {

    public LazyContextMatchExpr(boolean isReverse, List<ContextRule> contextRules) {
        super(isReverse, contextRules);
    }



    @Override
    public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
        return exprVisitor.visit(this,p);
    }
}
