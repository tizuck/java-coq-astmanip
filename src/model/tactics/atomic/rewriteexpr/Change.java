package model.tactics.atomic.rewriteexpr;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.IdentComponent;
import model.tactics.atomic.tacargcomponents.TermComponent;
import model.visitor.expr.ExprVisitor;

public class Change extends AtomicTacticExpr {

	public Change(TermComponent term1, TermComponent term2) {
		tacArgs.add(term1);
		tacArgs.add(term2);
	}

	public Change(TermComponent term1, IdentComponent id) {
		tacArgs.add(term1);
		tacArgs.add(id);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
