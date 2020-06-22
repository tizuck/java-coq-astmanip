package model.tactics.expr;

import model.term.Number;
import model.visitor.expr.ExprVisitor;

import java.util.Objects;

public class DoNumExpr extends DoExpr {

	private Number num;

	public DoNumExpr(Expr expr, Number num) {
		super(expr);
		this.num = num;
	}

	public Number getNum() {
		return num;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		DoNumExpr doNumExpr = (DoNumExpr) o;
		return Objects.equals(num, doNumExpr.num);
	}

	@Override
	public int hashCode() {
		return Objects.hash(num);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}
}
