package model.term;

import model.visitor.term.TermVisitor;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class AtTerm implements Term {

	private Qualid qualid;

	private Optional<List<Term>> terms;

	public AtTerm(Qualid qualid, Optional<List<Term>> terms) {
		this.qualid = qualid;
		this.terms = terms;
	}

	public Qualid getQualid() {
		return qualid;
	}

	public Optional<List<Term>> getTerms() {
		return terms;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		AtTerm atTerm = (AtTerm) o;
		return Objects.equals(qualid, atTerm.qualid) &&
				Objects.equals(terms, atTerm.terms);
	}

	@Override
	public int hashCode() {
		return Objects.hash(qualid, terms);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}

}
