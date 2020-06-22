package model.tactics.atomic.caseanalysisind;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.NumComponent;
import model.tactics.atomic.tacargcomponents.IdentComponent;
import model.visitor.expr.ExprVisitor;

public class DoubleInduction extends AtomicTacticExpr {

	public DoubleInduction(NumComponent num1, NumComponent num2) {

	}

	public DoubleInduction(IdentComponent id1, IdentComponent id2) {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
