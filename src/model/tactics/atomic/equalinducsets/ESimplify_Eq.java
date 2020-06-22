package model.tactics.atomic.equalinducsets;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.BinderComponent;
import model.tactics.atomic.tacargcomponents.TermComponent;
import model.visitor.expr.ExprVisitor;

import java.util.List;
import java.util.Optional;

public class ESimplify_Eq extends AtomicTacticExpr {

	public ESimplify_Eq(TermComponent term, Optional<List<BinderComponent>> oBinders) {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
