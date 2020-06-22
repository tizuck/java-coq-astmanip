package model.tactics.atomic.applytheorem;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.BinderComponent;
import model.tactics.atomic.tacargcomponents.TermComponent;
import model.tactics.atomic.tacargcomponents.TermListComponent;
import model.visitor.expr.ExprVisitor;

import java.util.List;

public class Apply extends AtomicTacticExpr {

	public Apply(TermComponent term, List<BinderComponent> binder) {
		tacArgs.add(term);
		tacArgs.addAll(binder);
	}

	public Apply(TermComponent term){
		tacArgs.add(term);
	}

	public Apply(TermListComponent terms){
		tacArgs.add(terms);
	}



	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}
}
