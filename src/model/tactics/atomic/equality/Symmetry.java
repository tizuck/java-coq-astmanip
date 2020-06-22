package model.tactics.atomic.equality;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.IdentComponent;
import model.visitor.expr.ExprVisitor;

public class Symmetry extends AtomicTacticExpr {

	public Symmetry(){

	}

	public Symmetry(IdentComponent ident) {
		tacArgs.add(ident);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
