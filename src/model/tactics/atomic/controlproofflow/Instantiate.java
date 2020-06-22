package model.tactics.atomic.controlproofflow;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.IdentComponent;
import model.tactics.atomic.tacargcomponents.TermComponent;
import model.tactics.atomic.tacargcomponents.NumComponent;
import model.visitor.expr.ExprVisitor;

public class Instantiate extends AtomicTacticExpr {

	public Instantiate(IdentComponent id, TermComponent term) {

	}

	public Instantiate(NumComponent num, TermComponent term) {

	}

	public Instantiate() {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
