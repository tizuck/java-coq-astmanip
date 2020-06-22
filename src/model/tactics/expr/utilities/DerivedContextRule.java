package model.tactics.expr.utilities;

import model.tactics.expr.Expr;
import model.term.Term;
import model.term.utilities.Ident;
import model.visitor.expr.ContextRuleVisitor;

import java.util.Objects;
import java.util.Optional;

public class DerivedContextRule extends ContextRule {

	private Term term;

	public DerivedContextRule(Expr expr, Optional<Ident> optionalIdent, Term term) {
		super(expr, optionalIdent);
		this.term = term;
	}

	public Term getTerm() {
		return term;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		DerivedContextRule that = (DerivedContextRule) o;
		return Objects.equals(term, that.term);
	}

	@Override
	public int hashCode() {
		return Objects.hash(term);
	}

	@Override
	public <R, P> R accept(ContextRuleVisitor<R, P> visitor, P p) {
		return visitor.visit(this,p);
	}
}
