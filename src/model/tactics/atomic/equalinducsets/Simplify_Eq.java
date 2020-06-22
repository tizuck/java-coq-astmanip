package model.tactics.atomic.equalinducsets;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.BinderComponent;
import model.tactics.atomic.tacargcomponents.TermComponent;
import model.visitor.expr.ExprVisitor;

import java.util.List;
import java.util.Optional;

public class Simplify_Eq extends AtomicTacticExpr {

	public Simplify_Eq(TermComponent term, Optional<List<BinderComponent>> oBinders) {

	}

	public Simplify_Eq() {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
