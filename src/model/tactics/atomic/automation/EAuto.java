package model.tactics.atomic.automation;

import model.tactics.atomic.AtomicTacticExpr;
import model.visitor.expr.ExprVisitor;

public class EAuto extends AtomicTacticExpr {

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
