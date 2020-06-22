package model.tactics.expr;

import model.term.Term;
import model.visitor.expr.ExprVisitor;

import java.util.Objects;

public class SimpleTermExpr implements Expr {

	private TermExprType termExprType;

	private Term term;

	public SimpleTermExpr(TermExprType termExprType, Term term) {
		this.termExprType = termExprType;
		this.term = term;
	}

	public TermExprType getTermExprType() {
		return termExprType;
	}

	public Term getTerm() {
		return term;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SimpleTermExpr that = (SimpleTermExpr) o;
		return termExprType == that.termExprType &&
				Objects.equals(term, that.term);
	}

	@Override
	public int hashCode() {
		return Objects.hash(termExprType, term);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}
}
