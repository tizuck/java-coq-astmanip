package model.tactics.expr;

import model.tactics.expr.utilities.MessageToken;
import model.tactics.expr.utilities.Natural;
import model.visitor.expr.ExprVisitor;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class FailExpr implements Expr {

	private Optional<Natural> oNatural;

	private Optional<List<MessageToken>> oMessageTokens;

	public FailExpr(Optional<Natural> oNatural, Optional<List<MessageToken>> oMessageTokens) {
		this.oNatural = oNatural;
		this.oMessageTokens = oMessageTokens;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		FailExpr failExpr = (FailExpr) o;
		return Objects.equals(oNatural, failExpr.oNatural) &&
				Objects.equals(oMessageTokens, failExpr.oMessageTokens);
	}

	public Optional<Natural> getoNatural() {
		return oNatural;
	}

	public Optional<List<MessageToken>> getoMessageTokens() {
		return oMessageTokens;
	}

	@Override
	public int hashCode() {
		return Objects.hash(oNatural, oMessageTokens);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}
}
