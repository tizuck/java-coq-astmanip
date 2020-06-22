package model.toplevel.utilities;

import model.tactics.expr.Expr;
import model.visitor.toplevel.LtacDefVisitor;

import java.util.Objects;

public abstract class LtacDef {

	private Expr expr;

	public LtacDef(Expr expr) {
		this.expr = expr;
	}

	public Expr getExpr() {
		return expr;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		LtacDef ltacDef = (LtacDef) o;
		return Objects.equals(expr, ltacDef.expr);
	}

	@Override
	public int hashCode() {
		return Objects.hash(expr);
	}

	public abstract <R,P> R accept(LtacDefVisitor<R,P> ltacDefVisitor, P p);
}
