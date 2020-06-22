package model.tactics.expr.utilities;

import model.tactics.expr.Expr;
import model.term.Term;
import model.visitor.expr.MatchRuleVisitor;

import java.util.Objects;

public class StdMatchRule extends MatchRule {

	private Term term;

	public StdMatchRule(Expr expr, Term term) {
		super(expr);
		this.term = term;
	}

	public Term getTerm() {
		return term;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		StdMatchRule that = (StdMatchRule) o;
		return Objects.equals(term, that.term);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), term);
	}

	@Override
	public <R, P> R accept(MatchRuleVisitor<R, P> matchRuleVisitor, P p) {
		return matchRuleVisitor.visit(this,p);
	}
}
