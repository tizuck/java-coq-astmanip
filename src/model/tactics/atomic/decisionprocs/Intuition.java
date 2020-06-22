package model.tactics.atomic.decisionprocs;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.ExprComponent;
import model.visitor.expr.ExprVisitor;

public class Intuition extends AtomicTacticExpr {

	public Intuition(ExprComponent expr) {

	}

	public Intuition() {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
