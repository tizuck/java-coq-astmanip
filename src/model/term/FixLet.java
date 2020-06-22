package model.term;

import model.term.utilities.FixBody;
import model.visitor.term.TermVisitor;

import java.util.Objects;

public class FixLet extends LetTerm {

	private FixBody fixBody;

	public FixLet(Term term, FixBody fixBody) {
		super(term);
		this.fixBody = fixBody;
	}

	public FixBody getFixBody() {
		return fixBody;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		FixLet fixLet = (FixLet) o;
		return Objects.equals(fixBody, fixLet.fixBody);
	}

	@Override
	public int hashCode() {
		return Objects.hash(fixBody);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
