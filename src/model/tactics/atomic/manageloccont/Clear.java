package model.tactics.atomic.manageloccont;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.IdentListComponent;
import model.visitor.expr.ExprVisitor;

public class Clear extends AtomicTacticExpr {

	public Clear(IdentListComponent ids) {
		tacArgs.add(ids);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
