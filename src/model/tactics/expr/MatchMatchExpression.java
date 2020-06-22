package model.tactics.expr;

import model.tactics.expr.utilities.MatchRule;

import java.util.List;
import java.util.Objects;

public abstract class MatchMatchExpression implements MatchExpr {

	private List<MatchRule> matchRules;

	private Expr expr;

	public MatchMatchExpression(List<MatchRule> matchRules, Expr expr) {
		this.matchRules = matchRules;
		this.expr = expr;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		MatchMatchExpression that = (MatchMatchExpression) o;
		return Objects.equals(matchRules, that.matchRules) &&
				Objects.equals(expr, that.expr);
	}

	public List<MatchRule> getMatchRules() {
		return matchRules;
	}

	public Expr getExpr() {
		return expr;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matchRules, expr);
	}
}
