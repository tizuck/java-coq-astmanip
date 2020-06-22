package model.tactics.atomic.automation;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.ExprComponent;
import model.visitor.expr.ExprVisitor;

public class Now extends AtomicTacticExpr {

	public Now(ExprComponent expr) {
		tacArgs.add(expr);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
