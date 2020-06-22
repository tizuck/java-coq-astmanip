package model.visitor.expr;

import model.tactics.expr.utilities.ContextMatchRule;
import model.tactics.expr.utilities.StdMatchRule;
import model.tactics.expr.utilities.UnderscoreMatchRule;

public interface MatchRuleVisitor<R,P> {

    R visit(StdMatchRule stdMatchRule,P p);

    R visit(ContextMatchRule contextMatchRule,P p);

    R visit(UnderscoreMatchRule underscoreMatchRule,P p);

}
