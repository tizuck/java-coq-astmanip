package model.tactics.expr;

import model.tactics.expr.utilities.MatchRule;
import model.visitor.expr.ExprVisitor;

import java.util.List;

public class MultiMatchMatchExpression extends MatchMatchExpression {

    public MultiMatchMatchExpression(List<MatchRule> matchRules, Expr expr) {
        super(matchRules, expr);
    }

    @Override
    public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
        return exprVisitor.visit(this,p);
    }
}
