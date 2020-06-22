package model.tactics.atomic.caseanalysisind;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.BindingListComponent;
import model.tactics.atomic.tacargcomponents.DisjConjIntroPatternComponent;
import model.tactics.atomic.tacargcomponents.TermComponent;
import model.visitor.expr.ExprVisitor;

public class Induction extends AtomicTacticExpr {

	public Induction(TermComponent term) {
		tacArgs.add(term);
	}

	public Induction(TermComponent term, DisjConjIntroPatternComponent disjConjIntroPattern){
		tacArgs.add(term);
		tacArgs.add(disjConjIntroPattern);
	}

	public Induction(TermComponent term, DisjConjIntroPatternComponent disjConjIntroPattern,TermComponent term2){
		tacArgs.add(term);
		tacArgs.add(disjConjIntroPattern);
		tacArgs.add(term2);
	}

	public Induction(TermComponent term, BindingListComponent bindingList){
		tacArgs.add(term);
		tacArgs.add(bindingList);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
