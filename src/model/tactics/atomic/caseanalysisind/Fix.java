package model.tactics.atomic.caseanalysisind;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.IdentComponent;
import model.tactics.atomic.tacargcomponents.NumComponent;
import model.visitor.expr.ExprVisitor;

public class Fix extends AtomicTacticExpr {

	public Fix(IdentComponent id, NumComponent num) {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
