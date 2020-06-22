package model.vernacular.utilities;

import java.util.List;
import java.util.Objects;

import model.term.Term;
import model.term.utilities.Ident;

public class Assums {

	private List<Ident> ids;

	private Term term;

	public Assums(List<Ident> ids, Term term) {
		this.ids = ids;
		this.term = term;
	}

	public List<Ident> getIds() {
		return ids;
	}

	public Term getTerm() {
		return term;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Assums assums = (Assums) o;
		return Objects.equals(ids, assums.ids) &&
				Objects.equals(term, assums.term);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ids, term);
	}
}
