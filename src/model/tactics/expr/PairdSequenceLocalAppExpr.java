package model.tactics.expr;

import model.visitor.expr.ExprVisitor;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PairdSequenceLocalAppExpr implements Expr {

	private Expr expr;

	private Optional<List<Optional<Expr>>> oExprs;


	public PairdSequenceLocalAppExpr(Expr expr, Optional<List<Optional<Expr>>> oExprs) {
		this.expr = expr;
		this.oExprs = oExprs;
	}

	public Expr getExpr() {
		return expr;
	}

	public Optional<List<Optional<Expr>>> getoExprs() {
		return oExprs;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PairdSequenceLocalAppExpr that = (PairdSequenceLocalAppExpr) o;
		return Objects.equals(expr, that.expr) &&
				Objects.equals(oExprs, that.oExprs);
	}

	@Override
	public int hashCode() {
		return Objects.hash(expr, oExprs);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}
}
