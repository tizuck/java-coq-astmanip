package model.tactics.atomic.applytheorem;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.TermComponent;
import model.visitor.expr.ExprVisitor;

public class NotTypeClassesRefine extends AtomicTacticExpr {

	public NotTypeClassesRefine(TermComponent term) {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
