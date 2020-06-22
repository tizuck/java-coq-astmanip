package model.tactics.expr.utilities;

import model.tactics.expr.Expr;
import model.visitor.expr.MatchRuleVisitor;

import java.util.Objects;

public abstract class MatchRule {

	private Expr expr;

	public MatchRule(Expr expr) {
		this.expr = expr;
	}

	public Expr getExpr() {
		return expr;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		MatchRule matchRule = (MatchRule) o;
		return Objects.equals(expr, matchRule.expr);
	}

	@Override
	public int hashCode() {
		return Objects.hash(expr);
	}

	public abstract <R,P> R accept(MatchRuleVisitor<R,P> matchRuleVisitor, P p);
}
