package model.tactics.atomic.automatizing;

import model.tactics.atomic.AtomicTacticExpr;
import model.visitor.expr.ExprVisitor;

public class Ring extends AtomicTacticExpr {

	public Ring() {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
