package model.tactics.expr;

import model.visitor.expr.ExprVisitor;

import java.util.Objects;

public class GeneralizedBranchingExpr implements Expr {

	private Expr expr1;

	private Expr expr2;

	private Expr expr3;

	public GeneralizedBranchingExpr(Expr expr1, Expr expr2, Expr expr3) {
		this.expr1 = expr1;
		this.expr2 = expr2;
		this.expr3 = expr3;
	}

	public Expr getExpr1() {
		return expr1;
	}

	public Expr getExpr2() {
		return expr2;
	}

	public Expr getExpr3() {
		return expr3;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		GeneralizedBranchingExpr that = (GeneralizedBranchingExpr) o;
		return Objects.equals(expr1, that.expr1) &&
				Objects.equals(expr2, that.expr2) &&
				Objects.equals(expr3, that.expr3);
	}

	@Override
	public int hashCode() {
		return Objects.hash(expr1, expr2, expr3);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}
}
