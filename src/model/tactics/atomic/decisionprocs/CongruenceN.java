package model.tactics.atomic.decisionprocs;

import model.tactics.atomic.AtomicTacticExpr;
import model.visitor.expr.ExprVisitor;

public class CongruenceN extends AtomicTacticExpr {

	public CongruenceN() {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
