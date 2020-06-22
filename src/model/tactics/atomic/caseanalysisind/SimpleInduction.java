package model.tactics.atomic.caseanalysisind;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.NumComponent;
import model.tactics.atomic.tacargcomponents.IdentComponent;
import model.visitor.expr.ExprVisitor;

public class SimpleInduction extends AtomicTacticExpr {

	public SimpleInduction(NumComponent num) {

	}

	public SimpleInduction(IdentComponent id) {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
