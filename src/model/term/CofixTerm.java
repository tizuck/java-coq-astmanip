package model.term;

import model.term.utilities.CoFixBodies;
import model.visitor.term.TermVisitor;

import java.util.Objects;

public class CofixTerm implements Term {

	private CoFixBodies coFixBodies;

	public CofixTerm(CoFixBodies coFixBodies) {
		this.coFixBodies = coFixBodies;
	}

	public CoFixBodies getCoFixBodies() {
		return coFixBodies;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CofixTerm cofixTerm = (CofixTerm) o;
		return Objects.equals(coFixBodies, cofixTerm.coFixBodies);
	}

	@Override
	public int hashCode() {
		return Objects.hash(coFixBodies);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
