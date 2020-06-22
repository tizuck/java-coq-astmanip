package model.tactics.atomic.controlproofflow;

import model.tactics.atomic.AtomicTacticExpr;
import model.visitor.expr.ExprVisitor;

public class Give_up extends AtomicTacticExpr {

	public Give_up() {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
