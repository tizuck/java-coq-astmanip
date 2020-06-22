package model.term;

import model.visitor.term.TermVisitor;

import java.util.Objects;

public class Pair extends AtomicTerm {

	private Term term1;

	private Term term2;

	public Pair(Term term1, Term term2) {
		this.term1 = term1;
		this.term2 = term2;
	}

	public Term getTerm1() {
		return term1;
	}

	public Term getTerm2() {
		return term2;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Pair pair = (Pair) o;
		return Objects.equals(term1, pair.term1) &&
				Objects.equals(term2, pair.term2);
	}

	@Override
	public int hashCode() {
		return Objects.hash(term1, term2);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
