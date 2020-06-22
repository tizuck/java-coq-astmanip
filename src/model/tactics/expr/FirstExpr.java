package model.tactics.expr;

import model.visitor.expr.ExprVisitor;

import java.util.List;
import java.util.Objects;

public class FirstExpr implements Expr {

	private List<Expr> exprs;

	public FirstExpr(List<Expr> exprs) {
		this.exprs = exprs;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		FirstExpr firstExpr = (FirstExpr) o;
		return Objects.equals(exprs, firstExpr.exprs);
	}

	@Override
	public int hashCode() {
		return Objects.hash(exprs);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}
}
