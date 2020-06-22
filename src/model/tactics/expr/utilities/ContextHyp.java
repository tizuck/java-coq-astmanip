package model.tactics.expr.utilities;

import model.term.utilities.Name;
import model.term.Term;
import model.visitor.expr.ContextHypVisitor;

import java.util.Objects;

public abstract class ContextHyp {

	private Name name;

	private Term term;

	public ContextHyp(Name name, Term term) {
		this.name = name;
		this.term = term;
	}

	public Name getName() {
		return name;
	}

	public Term getTerm() {
		return term;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ContextHyp that = (ContextHyp) o;
		return Objects.equals(name, that.name) &&
				Objects.equals(term, that.term);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, term);
	}

	public abstract <R,P> R accept(ContextHypVisitor<R,P> contextHypVisitor, P p);
}
