package model.tactics.expr;

import model.term.Number;
import model.visitor.expr.ExprVisitor;

import java.util.Objects;

public class TimeoutNumExpr extends TimeoutExpr {

	private Number num;

	public TimeoutNumExpr(Expr expr, Number num) {
		super(expr);
		this.num = num;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		TimeoutNumExpr that = (TimeoutNumExpr) o;
		return Objects.equals(num, that.num);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), num);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}
}
