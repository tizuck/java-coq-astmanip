package model.tactics.expr;

import model.visitor.expr.ExprVisitor;

import java.util.Objects;
import java.util.Optional;

public class StringFreshExpr implements FreshExpr {

	private Optional<String> oString;

	public StringFreshExpr(Optional<String> oString) {
		this.oString = oString;
	}

	public Optional<String> getoString() {
		return oString;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		StringFreshExpr that = (StringFreshExpr) o;
		return Objects.equals(oString, that.oString);
	}

	@Override
	public int hashCode() {
		return Objects.hash(oString);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}
}
