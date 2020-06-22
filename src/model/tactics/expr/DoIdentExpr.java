package model.tactics.expr;

import model.term.utilities.Ident;
import model.visitor.expr.ExprVisitor;

import java.util.Objects;

public class DoIdentExpr extends DoExpr {

	private Ident id;

	public DoIdentExpr(Expr expr, Ident id) {
		super(expr);
		this.id = id;
	}

	public Ident getId() {
		return id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		DoIdentExpr that = (DoIdentExpr) o;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}
}
