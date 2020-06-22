package model.tactics.expr;

import java.util.Objects;

public abstract class LabeledExpr implements Expr {

	private Expr expr;

	public LabeledExpr(Expr expr) {
		this.expr = expr;
	}

	public Expr getExpr() {
		return expr;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		LabeledExpr that = (LabeledExpr) o;
		return Objects.equals(expr, that.expr);
	}

	@Override
	public int hashCode() {
		return Objects.hash(expr);
	}
}
