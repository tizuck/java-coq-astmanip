package model.tactics.atomic.automatizing;

import model.tactics.atomic.AtomicTacticExpr;
import model.visitor.expr.ExprVisitor;

public class Field_Simplify_Eq extends AtomicTacticExpr {

	public Field_Simplify_Eq() {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
