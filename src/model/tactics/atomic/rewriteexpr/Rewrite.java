package model.tactics.atomic.rewriteexpr;

import model.tactics.atomic.AtomicTacticExpr;

import model.tactics.atomic.tacargcomponents.RewPrefixComponent;
import model.tactics.atomic.tacargcomponents.TermComponent;
import model.visitor.expr.ExprVisitor;

public class Rewrite extends AtomicTacticExpr {


	public Rewrite(RewPrefixComponent rewPrefix, TermComponent term){
		tacArgs.add(rewPrefix);
		tacArgs.add(term);
	}

	public Rewrite( TermComponent term){
		tacArgs.add(term);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
