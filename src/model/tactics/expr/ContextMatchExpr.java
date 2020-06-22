package model.tactics.expr;

import model.tactics.expr.utilities.ContextRule;

import java.util.List;
import java.util.Objects;

public abstract class ContextMatchExpr implements MatchExpr {

	private boolean isReverse;

	private List<ContextRule> contextRules;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ContextMatchExpr that = (ContextMatchExpr) o;
		return isReverse == that.isReverse &&
				Objects.equals(contextRules, that.contextRules);
	}

	public boolean isReverse() {
		return isReverse;
	}

	public List<ContextRule> getContextRules() {
		return contextRules;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isReverse, contextRules);
	}

	public ContextMatchExpr(boolean isReverse, List<ContextRule> contextRules) {
		this.isReverse = isReverse;
		this.contextRules = contextRules;
	}
}
