package model.tactics.expr;

import java.util.Objects;

public abstract class AssertExpr implements Expr {

	private Expr expr;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		AssertExpr that = (AssertExpr) o;
		return Objects.equals(expr, that.expr);
	}

	@Override
	public int hashCode() {
		return Objects.hash(expr);
	}

	public Expr getExpr() {
		return expr;
	}

	public AssertExpr(Expr expr) {
		this.expr = expr;
	}
}
