package model.tactics.atomic.performcompute;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.FlagComponent;
import model.visitor.expr.ExprVisitor;

import java.util.Optional;

public class Lazy extends AtomicTacticExpr {

	public Lazy(Optional<FlagComponent> oFlags) {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
