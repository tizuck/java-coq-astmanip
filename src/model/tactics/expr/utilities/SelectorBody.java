package model.tactics.expr.utilities;

import model.visitor.expr.SelectorBodyVisitor;

public abstract class SelectorBody {

	private int value;

	public SelectorBody( int value) {
		this.value = value;
	}

	abstract <R,P> R accept(SelectorBodyVisitor<R,P> selectorBodyVisitor, P p);

}
