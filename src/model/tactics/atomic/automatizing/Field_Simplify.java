package model.tactics.atomic.automatizing;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.TermComponent;
import model.visitor.expr.ExprVisitor;

import java.util.List;

public class Field_Simplify extends AtomicTacticExpr {

	public Field_Simplify(List<TermComponent> terms) {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
