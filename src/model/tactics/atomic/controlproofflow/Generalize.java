package model.tactics.atomic.controlproofflow;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.TermListComponent;
import model.visitor.expr.ExprVisitor;

public class Generalize extends AtomicTacticExpr {

	public Generalize(TermListComponent terms) {
		tacArgs.add(terms);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}
}
