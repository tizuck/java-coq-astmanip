package model.tactics.atomic.caseanalysisind;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.IdentComponent;
import model.tactics.atomic.tacargcomponents.NumComponent;
import model.visitor.expr.ExprVisitor;

public class Inversion_Clear extends AtomicTacticExpr {

	public Inversion_Clear(IdentComponent id) {
		tacArgs.add(id);
	}

	public Inversion_Clear(NumComponent num) {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
