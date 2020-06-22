package model.tactics.expr;

import model.visitor.expr.ExprVisitor;

import java.util.Objects;
import java.util.Optional;

public class TimeExpr extends LabeledExpr {

	private Optional<String> oString;

	public TimeExpr(Expr expr, Optional<String> oString) {
		super(expr);
		this.oString = oString;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		TimeExpr timeExpr = (TimeExpr) o;
		return Objects.equals(oString, timeExpr.oString);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), oString);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}
}
