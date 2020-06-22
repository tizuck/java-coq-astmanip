package model.tactics.expr.utilities;

import model.visitor.expr.SelectorBodyVisitor;

public class MinusSelectorBody extends SelectorBody {

	private int value2;


	public MinusSelectorBody(int value, int value2) {
		super(value);
		this.value2 = value2;
	}

	@Override
	<R, P> R accept(SelectorBodyVisitor<R,P> selectorBodyVisitor, P p) {
		return selectorBodyVisitor.visit(this,p);
	}
}
