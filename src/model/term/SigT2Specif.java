package model.term;

import model.term.utilities.Ident;
import model.visitor.term.TermVisitor;

import java.util.Objects;

public class SigT2Specif extends SpecifTerm {

	private Term term2;

	private Ident ident;

	private Term term3;

	public SigT2Specif(Term term1, Term term2, Ident ident, Term term3) {
		super(term1);
		this.term2 = term2;
		this.ident = ident;
		this.term3 = term3;
	}

	public Term getTerm2() {
		return term2;
	}

	public Ident getIdent() {
		return ident;
	}

	public Term getTerm3() {
		return term3;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SigT2Specif that = (SigT2Specif) o;
		return Objects.equals(term2, that.term2) &&
				Objects.equals(ident, that.ident) &&
				Objects.equals(term3, that.term3);
	}

	@Override
	public int hashCode() {
		return Objects.hash(term2, ident, term3);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
