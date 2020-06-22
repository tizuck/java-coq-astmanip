package model.tactics.atomic.performcompute;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.ComponentType;
import model.tactics.atomic.tacargcomponents.IdentComponent;
import model.tactics.atomic.tacargcomponents.StarComponent;
import model.visitor.expr.ExprVisitor;

public class Simpl extends AtomicTacticExpr {

	public Simpl() {

	}

	public Simpl(IdentComponent ids) {

	}

	private Simpl(StarComponent star){
		tacArgs.add(star);
	}

	public static Simpl ofStar(){
		return new Simpl(new StarComponent(ComponentType.IN));
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
