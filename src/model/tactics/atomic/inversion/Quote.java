package model.tactics.atomic.inversion;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.IdentComponent;
import model.visitor.expr.ExprVisitor;

import java.util.List;

public class Quote extends AtomicTacticExpr {

	public void Quote(List<IdentComponent> ids) {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
