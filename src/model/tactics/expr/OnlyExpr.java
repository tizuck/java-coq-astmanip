package model.tactics.expr;

import model.tactics.expr.utilities.Selector;
import model.visitor.expr.ExprVisitor;

import java.util.Objects;
import java.util.Optional;

public class OnlyExpr extends LabeledExpr {

	private Optional<Selector> oSelector;

	public OnlyExpr(Expr expr, Optional<Selector> oSelector) {
		super(expr);
		this.oSelector = oSelector;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		OnlyExpr onlyExpr = (OnlyExpr) o;
		return Objects.equals(oSelector, onlyExpr.oSelector);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), oSelector);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}
}
