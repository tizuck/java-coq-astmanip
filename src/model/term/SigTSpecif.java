package model.term;

import model.term.utilities.Ident;
import model.visitor.term.TermVisitor;

import java.util.Objects;

public class SigTSpecif extends SpecifTerm {

	private Term term2;

	private Ident ident;

	public SigTSpecif(Term term1, Term term2, Ident ident) {
		super(term1);
		this.term2 = term2;
		this.ident = ident;
	}

	public Term getTerm2() {
		return term2;
	}

	public Ident getIdent() {
		return ident;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SigTSpecif that = (SigTSpecif) o;
		return Objects.equals(term2, that.term2) &&
				Objects.equals(ident, that.ident);
	}

	@Override
	public int hashCode() {
		return Objects.hash(term2, ident);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
