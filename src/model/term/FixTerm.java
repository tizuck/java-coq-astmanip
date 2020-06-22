package model.term;

import model.term.utilities.FixBodies;
import model.visitor.term.TermVisitor;

import java.util.Objects;

public class FixTerm implements Term {

	private FixBodies fixbodies;

	public FixTerm(FixBodies fixbodies) {
		this.fixbodies = fixbodies;
	}

	public FixBodies getFixbodies() {
		return fixbodies;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		FixTerm fixTerm = (FixTerm) o;
		return Objects.equals(fixbodies, fixTerm.fixbodies);
	}

	@Override
	public int hashCode() {
		return Objects.hash(fixbodies);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
