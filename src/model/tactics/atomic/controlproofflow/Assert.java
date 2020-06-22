package model.tactics.atomic.controlproofflow;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.IdentComponent;
import model.tactics.atomic.tacargcomponents.TermComponent;
import model.tactics.atomic.tacargcomponents.IntroPatternComponent;
import model.tactics.atomic.tacargcomponents.ExprComponent;
import model.visitor.expr.ExprVisitor;

public class Assert extends AtomicTacticExpr {

	public Assert(IdentComponent id, TermComponent term) {
		tacArgs.add(id);
		tacArgs.add(term);
	}

	public Assert(TermComponent term, IntroPatternComponent introPattern, ExprComponent expr) {
		tacArgs.add(term);
		tacArgs.add(introPattern);
		tacArgs.add(expr);
	}

	public Assert(TermComponent term, ExprComponent expr){
		tacArgs.add(term);
		tacArgs.add(expr);
	}

	public Assert(TermComponent term){
		tacArgs.add(term);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
