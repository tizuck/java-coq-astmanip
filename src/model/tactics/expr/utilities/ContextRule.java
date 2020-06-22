package model.tactics.expr.utilities;

import model.tactics.expr.Expr;
import model.term.utilities.Ident;
import model.visitor.expr.ContextRuleVisitor;

import java.util.Objects;
import java.util.Optional;

public abstract class ContextRule {

	private Expr expr;

	private Optional<Ident> optionalIdent;


	public ContextRule(Expr expr, Optional<Ident> optionalIdent) {
		this.expr = expr;
		this.optionalIdent = optionalIdent;
	}

	public Expr getExpr() {
		return expr;
	}

	public Optional<Ident> getOptionalIdent() {
		return optionalIdent;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ContextRule that = (ContextRule) o;
		return Objects.equals(expr, that.expr) &&
				Objects.equals(optionalIdent, that.optionalIdent);
	}

	@Override
	public int hashCode() {
		return Objects.hash(expr, optionalIdent);
	}

	public abstract <R,P> R accept(ContextRuleVisitor<R,P> contextRuleVisitor, P p);
}
