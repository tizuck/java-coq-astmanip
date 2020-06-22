package model.tactics.atomic.rewriteexpr;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.IdentComponent;
import model.visitor.expr.ExprVisitor;

import java.util.List;

public class Subst extends AtomicTacticExpr {

	public Subst() {

	}

	public Subst(List<IdentComponent> ids) {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
