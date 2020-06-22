package model.tactics.atomic.controlproofflow;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.IntroPatternComponent;
import model.tactics.atomic.tacargcomponents.TermComponent;
import model.visitor.expr.ExprVisitor;

public class PoseProof extends AtomicTacticExpr {

	public PoseProof(TermComponent term) {
		tacArgs.add(term);
	}

	public PoseProof(TermComponent term, IntroPatternComponent introPattern ){
		tacArgs.add(term);
		tacArgs.add(introPattern);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
