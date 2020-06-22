package model.term;

import model.visitor.term.TermVisitor;

import java.util.List;
import java.util.Objects;

public class MultTermProjectionTerm extends RecordProjectionTerm {

	private List<Term> terms;

	public MultTermProjectionTerm(Term term, Qualid qualid, List<Term> terms) {
		super(term, qualid);
		this.terms = terms;
	}

	public List<Term> getTerms() {
		return terms;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		MultTermProjectionTerm that = (MultTermProjectionTerm) o;
		return Objects.equals(terms, that.terms);
	}

	@Override
	public int hashCode() {
		return Objects.hash(terms);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
