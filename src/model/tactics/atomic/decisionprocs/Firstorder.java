package model.tactics.atomic.decisionprocs;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.QualidComponent;
import model.visitor.expr.ExprVisitor;

import java.util.List;

public class Firstorder extends AtomicTacticExpr {

	public Firstorder() {

	}

	public Firstorder(List<QualidComponent> qualids) {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
