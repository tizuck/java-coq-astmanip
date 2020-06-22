package model.term;

import model.term.utilities.Ident;
import model.visitor.term.TermVisitor;

import java.util.Objects;

public class TypeTerm implements Term {

	private Term term;

	private Ident id;

	public TypeTerm(Term term, Ident id) {
		this.term = term;
		this.id = id;
	}

	public Term getTerm() {
		return term;
	}

	public Ident getId() {
		return id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		TypeTerm typeTerm = (TypeTerm) o;
		return Objects.equals(term, typeTerm.term) &&
				Objects.equals(id, typeTerm.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(term, id);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
