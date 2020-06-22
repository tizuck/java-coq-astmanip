package model.tactics.atomic.manageloccont;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.IdentPairListComponent;
import model.visitor.expr.ExprVisitor;



public class Rename extends AtomicTacticExpr {

	public Rename(IdentPairListComponent idPairs) {
		tacArgs.add(idPairs);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
