package model.tactics.atomic.applytheorem;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.BindingListComponent;
import model.visitor.expr.ExprVisitor;

public class Right extends AtomicTacticExpr {

	public Right() {

	}

	public Right(BindingListComponent bindingList) {
		tacArgs.add(bindingList);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
