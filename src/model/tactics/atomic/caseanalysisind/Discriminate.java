package model.tactics.atomic.caseanalysisind;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.BindingListComponent;
import model.tactics.atomic.tacargcomponents.TermComponent;
import model.visitor.expr.ExprVisitor;

public class Discriminate extends AtomicTacticExpr {

	public Discriminate(TermComponent term) {
		tacArgs.add(term);
	}


	public Discriminate() {
	}

	public Discriminate(TermComponent term, BindingListComponent bindingList){
		tacArgs.add(term);
		tacArgs.add(bindingList);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}
}
