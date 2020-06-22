package model.tactics.atomic.caseanalysisind;

import model.tactics.atomic.AtomicTacticExpr;
import model.visitor.expr.ExprVisitor;

public class Inversion_Sigma extends AtomicTacticExpr {

	public Inversion_Sigma() {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
