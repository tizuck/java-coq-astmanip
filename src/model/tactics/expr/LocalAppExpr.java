package model.tactics.expr;

import model.visitor.expr.ExprVisitor;

import java.util.List;
import java.util.Objects;

public class LocalAppExpr implements Expr {

	private List<Expr> exprs;

	public LocalAppExpr(List<Expr> exprs) {
		this.exprs = exprs;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		LocalAppExpr that = (LocalAppExpr) o;
		return Objects.equals(exprs, that.exprs);
	}

	@Override
	public int hashCode() {
		return Objects.hash(exprs);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}
}
