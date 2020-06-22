package model.term;

import java.util.Objects;

public abstract class LetTerm implements Term {

	private Term term;

	public LetTerm(Term term) {
		this.term = term;
	}

	public Term getTerm() {
		return term;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		LetTerm letTerm = (LetTerm) o;
		return Objects.equals(term, letTerm.term);
	}

	@Override
	public int hashCode() {
		return Objects.hash(term);
	}
}
