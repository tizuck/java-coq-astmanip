package model.tactics.expr;

import model.visitor.expr.ExprVisitor;

import java.util.List;
import java.util.Objects;

public class SolveExpr implements Expr {

	private List<Expr> exprs;

	public SolveExpr(List<Expr> exprs) {
		this.exprs = exprs;
	}

	public List<Expr> getExprs() {
		return exprs;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SolveExpr solveExpr = (SolveExpr) o;
		return Objects.equals(exprs, solveExpr.exprs);
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
