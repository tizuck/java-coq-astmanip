package model.tactics.expr.utilities;

import model.tactics.expr.Expr;
import model.visitor.expr.MatchRuleVisitor;

public class UnderscoreMatchRule extends MatchRule {

    public UnderscoreMatchRule(Expr expr) {
        super(expr);
    }

    @Override
    public <R, P> R accept(MatchRuleVisitor<R, P> matchRuleVisitor, P p) {
        return matchRuleVisitor.visit(this,p);
    }
}
