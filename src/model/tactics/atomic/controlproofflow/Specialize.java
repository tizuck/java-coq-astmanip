package model.tactics.atomic.controlproofflow;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.*;
import model.visitor.expr.ExprVisitor;


public class Specialize extends AtomicTacticExpr {

	public Specialize(IdentComponent id) {
		tacArgs.add(id);
	}

	public Specialize(IdentComponent id, IntroPatternComponent introPattern){
		tacArgs.add(id);
		tacArgs.add(introPattern);
	}

	public Specialize(IdentComponent id, AtomicTermListComponent terms) {
		tacArgs.add(id);
		tacArgs.add(terms);
	}

	public Specialize(IdentComponent id, AtomicTermListComponent terms, IntroPatternComponent introPattern){
		tacArgs.add(id);
		tacArgs.add(terms);
		tacArgs.add(introPattern);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
