package model.tactics.expr;

import model.visitor.expr.ExprVisitor;

import java.util.Objects;

public class OpsExpr implements Expr {

	private Expr expr1;

	private Expr expr2;

	public OpsExpr(Expr expr1, Expr expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	public Expr getExpr1() {
		return expr1;
	}

	public Expr getExpr2() {
		return expr2;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		OpsExpr opsExpr = (OpsExpr) o;
		return Objects.equals(expr1, opsExpr.expr1) &&
				Objects.equals(expr2, opsExpr.expr2);
	}

	@Override
	public int hashCode() {
		return Objects.hash(expr1, expr2);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}
}
