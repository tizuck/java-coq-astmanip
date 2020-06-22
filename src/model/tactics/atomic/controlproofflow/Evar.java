package model.tactics.atomic.controlproofflow;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.IdentTermComponent;
import model.visitor.expr.ExprVisitor;

public class Evar extends AtomicTacticExpr {

	public Evar(IdentTermComponent identTermComponent) {
		tacArgs.add(identTermComponent);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
