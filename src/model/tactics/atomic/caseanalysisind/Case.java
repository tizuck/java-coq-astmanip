package model.tactics.atomic.caseanalysisind;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.BindingListComponent;
import model.tactics.atomic.tacargcomponents.TermComponent;
import model.visitor.expr.ExprVisitor;

public class Case extends AtomicTacticExpr {

	public Case(TermComponent term) {
		tacArgs.add(term);
	}

	public Case(TermComponent term, BindingListComponent bindingList){
		tacArgs.add(term);
		tacArgs.add(bindingList);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}


}
