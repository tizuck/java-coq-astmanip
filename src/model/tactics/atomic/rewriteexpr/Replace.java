package model.tactics.atomic.rewriteexpr;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.ByTacticComponent;
import model.tactics.atomic.tacargcomponents.InClauseComponent;
import model.tactics.atomic.tacargcomponents.TermComponent;
import model.visitor.expr.ExprVisitor;

public class Replace extends AtomicTacticExpr {

	public void Replace(TermComponent term1, TermComponent term2, InClauseComponent inClause) {

	}

	public void Replace(TermComponent term1, TermComponent term2, ByTacticComponent byTactic) {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
