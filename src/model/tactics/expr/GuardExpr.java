package model.tactics.expr;

import model.tactics.expr.utilities.Test;
import model.visitor.expr.ExprVisitor;

import java.util.Objects;

public class GuardExpr implements Expr {

	private Test test;

	public GuardExpr(Test test) {
		this.test = test;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		GuardExpr guardExpr = (GuardExpr) o;
		return Objects.equals(test, guardExpr.test);
	}

	@Override
	public int hashCode() {
		return Objects.hash(test);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}
}
