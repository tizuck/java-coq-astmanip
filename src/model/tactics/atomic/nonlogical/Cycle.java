package model.tactics.atomic.nonlogical;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.NegativeNumComponent;
import model.visitor.expr.ExprVisitor;

public class Cycle extends AtomicTacticExpr {

	public Cycle(NegativeNumComponent negNum) {
		tacArgs.add(negNum);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
