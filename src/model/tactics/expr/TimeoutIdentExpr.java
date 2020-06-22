package model.tactics.expr;

import model.term.utilities.Ident;
import model.visitor.expr.ExprVisitor;

import java.util.Objects;

public class TimeoutIdentExpr extends TimeoutExpr {

	private Ident id;

	public TimeoutIdentExpr(Expr expr, Ident id) {
		super(expr);
		this.id = id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		TimeoutIdentExpr that = (TimeoutIdentExpr) o;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), id);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}
}
