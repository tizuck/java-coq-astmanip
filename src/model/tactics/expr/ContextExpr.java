package model.tactics.expr;

import model.term.Term;
import model.term.utilities.Ident;
import model.visitor.expr.ExprVisitor;

import java.util.Objects;
import java.util.Optional;

public class ContextExpr implements Expr {

	private Ident id;

	private Optional<Term> oTerm;

	private boolean isBraced;

	public ContextExpr(Ident id, Optional<Term> oTerm,boolean isBraced) {
		this.id = id;
		this.oTerm = oTerm;
		this.isBraced = isBraced;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ContextExpr that = (ContextExpr) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(oTerm, that.oTerm);
	}

	public Ident getId() {
		return id;
	}

	public Optional<Term> getoTerm() {
		return oTerm;
	}

	public boolean isBraced() {
		return isBraced;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, oTerm);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}
}
