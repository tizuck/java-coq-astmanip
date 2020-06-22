package model.tactics.atomic.checkingprops;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.TermComponent;
import model.visitor.expr.ExprVisitor;

public class Constr_Eq extends AtomicTacticExpr {

	public Constr_Eq(TermComponent term1, TermComponent term2) {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
