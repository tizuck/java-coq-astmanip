package model.tactics.expr;

import java.util.List;
import java.util.Objects;

import model.term.utilities.Name;
import model.visitor.expr.ExprVisitor;

public class FunExpr implements Expr {

	private List<Name> names;

	private List<Expr> exprs;


	public FunExpr(List<Name> names, List<Expr> exprs) {
		this.names = names;
		this.exprs = exprs;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		FunExpr funExpr = (FunExpr) o;
		return Objects.equals(names, funExpr.names) &&
				Objects.equals(exprs, funExpr.exprs);
	}

	public List<Name> getNames() {
		return names;
	}

	public List<Expr> getExprs() {
		return exprs;
	}

	@Override
	public int hashCode() {
		return Objects.hash(names, exprs);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}
}
