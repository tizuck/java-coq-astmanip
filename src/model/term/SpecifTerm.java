package model.term;


import java.util.Objects;

public abstract class SpecifTerm implements Term {

	private Term term1;

	public SpecifTerm(Term term1) {
		this.term1 = term1;
	}

	public Term getTerm1() {
		return term1;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SpecifTerm that = (SpecifTerm) o;
		return Objects.equals(term1, that.term1);
	}

	@Override
	public int hashCode() {
		return Objects.hash(term1);
	}
}
