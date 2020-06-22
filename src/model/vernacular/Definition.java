package model.vernacular;

import model.term.utilities.Binder;
import model.term.utilities.Ident;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import model.term.Term;

public abstract class Definition implements Sentence {

	private Ident id;

	private Optional<List<Binder>> oBinders;

	private Optional<Term> oBindTerm;

	private Term term;

	public Ident getId() {
		return id;
	}

	public Optional<List<Binder>> getoBinders() {
		return oBinders;
	}

	public Optional<Term> getoBindTerm() {
		return oBindTerm;
	}

	public Term getTerm() {
		return term;
	}



	public Definition(Ident id, Optional<List<Binder>> oBinders, Optional<Term> oBindTerm, Term term) {
		this.id = id;
		this.oBinders = oBinders;
		this.oBindTerm = oBindTerm;
		this.term = term;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass())return false;
		Definition that = (Definition) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(oBinders, that.oBinders) &&
				Objects.equals(oBindTerm, that.oBindTerm) &&
				Objects.equals(term, that.term);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, oBinders, oBindTerm, term);
	}
}
