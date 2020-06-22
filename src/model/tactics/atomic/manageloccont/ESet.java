package model.tactics.atomic.manageloccont;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.IdentComponent;
import model.tactics.atomic.tacargcomponents.BinderComponent;
import model.tactics.atomic.tacargcomponents.TermComponent;
import model.tactics.atomic.tacargcomponents.GoalOccurencesComponent;
import model.visitor.expr.ExprVisitor;

import java.util.List;

public class ESet extends AtomicTacticExpr {

	public ESet(IdentComponent id, List<BinderComponent> binders, TermComponent term, GoalOccurencesComponent goalOccurences) {

	}

	public ESet(IdentComponent id, List<BinderComponent> binders, TermComponent term) {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
