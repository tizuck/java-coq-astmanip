package model.tactics.atomic.nonlogical;

import model.tactics.atomic.AtomicTacticExpr;
import model.visitor.expr.ExprVisitor;

public class Shelve_Unifiable extends AtomicTacticExpr {

	public Shelve_Unifiable() {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
