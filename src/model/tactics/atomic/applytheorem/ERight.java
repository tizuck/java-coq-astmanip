package model.tactics.atomic.applytheorem;

import model.tactics.atomic.AtomicTacticExpr;
import model.visitor.expr.ExprVisitor;

public class ERight extends AtomicTacticExpr {

	public ERight() {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
