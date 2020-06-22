package model.tactics.atomic.nonlogical;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.NegativeNumComponent;
import model.visitor.expr.ExprVisitor;

public class Swap extends AtomicTacticExpr {

	public Swap(NegativeNumComponent negNum1, NegativeNumComponent negNum2) {
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
