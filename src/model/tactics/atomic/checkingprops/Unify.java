package model.tactics.atomic.checkingprops;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.IdentComponent;
import model.tactics.atomic.tacargcomponents.TermComponent;
import model.visitor.expr.ExprVisitor;

import java.util.Optional;

public class Unify extends AtomicTacticExpr {

	public Unify(TermComponent term1, TermComponent term2, Optional<IdentComponent> oIdent) {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
