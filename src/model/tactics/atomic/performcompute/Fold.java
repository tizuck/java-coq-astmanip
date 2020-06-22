package model.tactics.atomic.performcompute;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.AtomicTermListComponent;
import model.visitor.expr.ExprVisitor;


public class Fold extends AtomicTacticExpr {

	public Fold(AtomicTermListComponent terms) {
		tacArgs.add(terms);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
