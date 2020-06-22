package model.tactics.atomic.inversion;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.IdentComponent;
import model.tactics.atomic.tacargcomponents.QualidComponent;
import model.visitor.expr.ExprVisitor;

public class FunctionalInversion extends AtomicTacticExpr {

	public FunctionalInversion(IdentComponent id, QualidComponent oQualid) {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
