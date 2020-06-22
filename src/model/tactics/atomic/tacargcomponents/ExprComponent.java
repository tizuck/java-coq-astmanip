package model.tactics.atomic.tacargcomponents;

import model.tactics.expr.Expr;
import model.visitor.atomic.TacArgComponentVisitor;

import java.util.Objects;

public class ExprComponent extends TacArgComponent {

	private Expr expr;

	public ExprComponent(Expr expr) {
		this.expr = expr;
	}

	public ExprComponent(ComponentType componentType, Expr expr) {
		super(componentType);
		this.expr = expr;
	}

	public Expr getExpr() {
		return expr;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		ExprComponent that = (ExprComponent) o;
		return Objects.equals(expr, that.expr);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), expr);
	}

	@Override
	public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
		return tacArgComponentVisitor.visit(this,p);
	}
}
