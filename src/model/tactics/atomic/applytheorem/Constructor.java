package model.tactics.atomic.applytheorem;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.BindingListComponent;
import model.tactics.atomic.tacargcomponents.NumComponent;
import model.visitor.expr.ExprVisitor;

public class Constructor extends AtomicTacticExpr {

	public Constructor() {

	}

	public Constructor(NumComponent num) {
		tacArgs.add(num);
	}

	public Constructor(NumComponent num, BindingListComponent bindingList ){
		tacArgs.add(num);
		tacArgs.add(bindingList);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
