package model.tactics.atomic.controlproofflow;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.TermComponent;
import model.tactics.atomic.tacargcomponents.IntroPatternComponent;
import model.tactics.atomic.tacargcomponents.ExprComponent;
import model.visitor.expr.ExprVisitor;

public class EAssert extends AtomicTacticExpr {

	public EAssert(TermComponent term, IntroPatternComponent introPattern, ExprComponent expr) {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
