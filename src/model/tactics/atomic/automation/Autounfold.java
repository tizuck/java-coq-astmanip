package model.tactics.atomic.automation;

import model.tactics.atomic.AtomicTacticExpr;
import java.util.List;
import model.tactics.atomic.tacargcomponents.BooleanComponent;
import model.tactics.atomic.tacargcomponents.IdentComponent;
import model.visitor.expr.ExprVisitor;

public class Autounfold extends AtomicTacticExpr {

	public Autounfold(List<IdentComponent> ids, BooleanComponent isInClause) {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
