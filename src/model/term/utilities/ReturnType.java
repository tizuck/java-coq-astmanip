package model.term.utilities;

import model.term.Term;

import java.util.Objects;

public class ReturnType {

	private Term term;

	public ReturnType(Term term) {
		this.term = term;
	}

	public Term getTerm() {
		return term;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ReturnType that = (ReturnType) o;
		return Objects.equals(term, that.term);
	}

	@Override
	public int hashCode() {
		return Objects.hash(term);
	}
}
