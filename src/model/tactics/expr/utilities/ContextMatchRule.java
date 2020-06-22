package model.tactics.expr.utilities;

import java.util.Objects;
import java.util.Optional;

import model.tactics.expr.Expr;
import model.term.Term;
import model.term.utilities.Ident;
import model.visitor.expr.MatchRuleVisitor;

public class ContextMatchRule extends MatchRule {

	private Optional<Ident> oIdent;

	private Term term;

	public ContextMatchRule(Expr expr, Optional<Ident> ident, Term term) {
		super(expr);
		this.oIdent = ident;
		this.term = term;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		ContextMatchRule that = (ContextMatchRule) o;
		return Objects.equals(oIdent, that.oIdent) &&
				Objects.equals(term, that.term);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), oIdent, term);
	}

	public Optional<Ident> getoIdent() {
		return oIdent;
	}

	public Term getTerm() {
		return term;
	}

	@Override
	public <R, P> R accept(MatchRuleVisitor<R, P> matchRuleVisitor, P p) {
		return matchRuleVisitor.visit(this,p);
	}
}
