package model.tactics.expr.utilities;

import model.term.utilities.Ident;
import model.visitor.expr.SelectorVisitor;

public class IdentSelector implements Selector {

	private Ident id;

	public IdentSelector(Ident id) {
		this.id = id;
	}

	@Override
	public <R, P> R accept(SelectorVisitor<R, P> selectorVisitor, P p) {
		return selectorVisitor.visit(this,p);
	}
}
