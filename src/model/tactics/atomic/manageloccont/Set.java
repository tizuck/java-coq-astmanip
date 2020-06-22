package model.tactics.atomic.manageloccont;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.*;
import model.visitor.expr.ExprVisitor;

import java.util.List;

public class Set extends AtomicTacticExpr {

	public Set(IdentTermBindComponent identTermBindComponent){
		tacArgs.add(identTermBindComponent);
	}

	public Set(IdentComponent id, List<BinderComponent> binders, TermComponent term, GoalOccurencesComponent goalOccurences) {
		tacArgs.add(id);
		tacArgs.addAll(binders);
		tacArgs.add(term);
		tacArgs.add(goalOccurences);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
