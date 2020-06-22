package model.tactics.atomic.caseanalysisind;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.*;
import model.visitor.expr.ExprVisitor;

public class Injection extends AtomicTacticExpr {

	public Injection(TermComponent term) {
		tacArgs.add(term);
	}

	public Injection(TermComponent term, ListOfIntroPatternComponent introPatterns) {
		tacArgs.add(term);
		tacArgs.add(introPatterns);
	}

	public Injection(TermComponent term, ListOfIntroPatternComponent introPatterns, BindingListComponent bindingList){
		tacArgs.add(term);
		tacArgs.add(introPatterns);
		tacArgs.add(bindingList);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
