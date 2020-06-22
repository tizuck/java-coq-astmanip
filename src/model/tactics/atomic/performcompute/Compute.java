package model.tactics.atomic.performcompute;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.BooleanComponent;
import model.tactics.atomic.tacargcomponents.QualidComponent;
import model.visitor.expr.ExprVisitor;

import java.util.List;

public class Compute extends AtomicTacticExpr {

	public Compute(BooleanComponent isNegativ, List<QualidComponent> qualids) {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
