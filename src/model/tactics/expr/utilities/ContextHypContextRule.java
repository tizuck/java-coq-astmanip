package model.tactics.expr.utilities;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import model.tactics.expr.Expr;
import model.term.Term;
import model.term.utilities.Ident;
import model.visitor.expr.ContextRuleVisitor;

public class ContextHypContextRule extends ContextRule {

	private List<ContextHyp> contextHyps;

	private Term term;


	public ContextHypContextRule(Expr expr, Optional<Ident> optionalIdent, List<ContextHyp> contextHyps, Term term) {
		super(expr, optionalIdent);
		this.contextHyps = contextHyps;
		this.term = term;
	}

	public List<ContextHyp> getContextHyps() {
		return contextHyps;
	}

	public Term getTerm() {
		return term;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		ContextHypContextRule that = (ContextHypContextRule) o;
		return Objects.equals(contextHyps, that.contextHyps) &&
				Objects.equals(term, that.term);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), contextHyps, term);
	}

	@Override
	public <R, P> R accept(ContextRuleVisitor<R, P> contextRuleVisitor, P p) {
		return contextRuleVisitor.visit(this,p);
	}
}
