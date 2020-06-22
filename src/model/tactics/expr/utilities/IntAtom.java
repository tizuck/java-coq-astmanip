package model.tactics.expr.utilities;

import model.visitor.expr.AtomVisitor;

public class IntAtom implements Atom {

	private int value;

	public IntAtom(int value) {
		this.value = value;
	}

	@Override
	public <R, P> R accept(AtomVisitor<R, P> atomVisitor, P p) {
		return atomVisitor.visit(this,p);
	}
}
