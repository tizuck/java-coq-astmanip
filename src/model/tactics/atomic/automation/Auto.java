package model.tactics.atomic.automation;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.NumComponent;
import model.tactics.atomic.tacargcomponents.StarComponent;
import model.visitor.expr.ExprVisitor;

public class Auto extends AtomicTacticExpr {

	public Auto() {

	}

	public Auto(NumComponent num) {
		tacArgs.add(num);
	}

	public Auto(StarComponent star){
		tacArgs.add(star);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
