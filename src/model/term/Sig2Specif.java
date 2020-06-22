package model.term;

import model.term.utilities.Ident;
import model.visitor.term.TermVisitor;

import java.util.Objects;

public class Sig2Specif extends SpecifTerm {

	private Term term2;

	private Term term3;

	private Ident ident;


	public Sig2Specif(Term term1, Term term2, Term term3, Ident ident) {
		super(term1);
		this.term2 = term2;
		this.term3 = term3;
		this.ident = ident;
	}

	public Term getTerm2() {
		return term2;
	}

	public Term getTerm3() {
		return term3;
	}

	public Ident getIdent() {
		return ident;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Sig2Specif that = (Sig2Specif) o;
		return Objects.equals(term2, that.term2) &&
				Objects.equals(term3, that.term3) &&
				Objects.equals(ident, that.ident);
	}

	@Override
	public int hashCode() {
		return Objects.hash(term2, term3, ident);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
