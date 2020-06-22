package model.tactics.atomic.decisionprocs;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.TermComponent;
import model.visitor.expr.ExprVisitor;

import java.util.List;

public class Congruence extends AtomicTacticExpr {

	public Congruence() {

	}

	public Congruence(List<TermComponent> terms) {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
