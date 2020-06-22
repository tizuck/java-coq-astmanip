package model.tactics.atomic.manageloccont;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.TermComponent;
import model.visitor.expr.ExprVisitor;

public class DecomposeSum extends AtomicTacticExpr {

	public DecomposeSum(TermComponent term) {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
