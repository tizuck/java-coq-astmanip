package model.tactics.atomic.rewriteexpr;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.ExprComponent;
import model.tactics.atomic.tacargcomponents.TermComponent;
import model.visitor.expr.ExprVisitor;

public class Stepl extends AtomicTacticExpr {

	public Stepl(TermComponent term, ExprComponent expr) {

	}

	public Stepl(TermComponent term) {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
