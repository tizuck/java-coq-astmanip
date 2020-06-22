package model.term;

import model.term.utilities.Ident;
import model.visitor.term.TermVisitor;

import java.util.Objects;
import java.util.Optional;

public class Exists2Term extends ExistsTerm {

	private Term term2;


	public Exists2Term(Ident id, Optional<Term> oBindTerm, Term term, Term term2) {
		super(id, oBindTerm, term);
		this.term2 = term2;
	}

	public Term getTerm2() {
		return term2;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Exists2Term that = (Exists2Term) o;
		return Objects.equals(term2, that.term2);
	}

	@Override
	public int hashCode() {
		return Objects.hash(term2);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
