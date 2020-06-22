package model.tactics.atomic.manageloccont;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.IdentComponent;
import model.visitor.expr.ExprVisitor;

public class ClearDependent extends AtomicTacticExpr {

	public ClearDependent(IdentComponent id) {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
