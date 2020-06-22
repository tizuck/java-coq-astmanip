package model.tactics.expr.utilities;

import java.util.Objects;
import java.util.Optional;
import model.tactics.expr.Expr;
import model.term.Term;
import model.term.utilities.Name;
import model.visitor.expr.ContextHypVisitor;

public class ExprContextHyp extends ContextHyp {

	private Optional<Term> oTerm;

	private Expr expr;

	public Optional<Term> getoTerm() {
		return oTerm;
	}

	public Expr getExpr() {
		return expr;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		ExprContextHyp that = (ExprContextHyp) o;
		return Objects.equals(oTerm, that.oTerm) &&
				Objects.equals(expr, that.expr);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), oTerm, expr);
	}

	public ExprContextHyp(Name name, Term term, Optional<Term> oTerm, Expr expr) {
		super(name, term);
		this.oTerm = oTerm;
		this.expr = expr;
	}

	@Override
	public <R, P> R accept(ContextHypVisitor<R, P> contextHypVisitor, P p) {
		return contextHypVisitor.visit(this,p);
	}
}
