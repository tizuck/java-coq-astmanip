package model.term;

import model.term.utilities.Ident;
import model.visitor.term.TermVisitor;

import java.util.Objects;
import java.util.Optional;

public class ExistsTerm implements Term {

	private Ident id;

	private Optional<Term> oBindTerm;

	private Term term;

	public ExistsTerm(Ident id, Optional<Term> oBindTerm, Term term) {
		this.id = id;
		this.oBindTerm = oBindTerm;
		this.term = term;
	}


	public Ident getId() {
		return id;
	}

	public Optional<Term> getoBindTerm() {
		return oBindTerm;
	}

	public Term getTerm() {
		return term;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ExistsTerm that = (ExistsTerm) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(oBindTerm, that.oBindTerm) &&
				Objects.equals(term, that.term);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, oBindTerm, term);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
