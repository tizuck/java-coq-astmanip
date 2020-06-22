package model.tactics.expr.utilities;

import model.visitor.expr.SelectorVisitor;

import java.util.List;

public class SelectorBodySelector implements Selector {

	private List<SelectorBody> selectorBodys;

	public SelectorBodySelector(List<SelectorBody> selectorBodys) {
		this.selectorBodys = selectorBodys;
	}

	@Override
	public <R, P> R accept(SelectorVisitor<R, P> selectorVisitor, P p) {
		return selectorVisitor.visit(this,p);
	}
}
