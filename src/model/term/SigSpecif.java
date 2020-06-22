package model.term;

import model.term.utilities.Ident;
import model.visitor.term.TermVisitor;

import java.util.Objects;
import java.util.Optional;

public class SigSpecif extends SpecifTerm {

	private Optional<Term> oTerm;

	private Ident ident;


	public SigSpecif(Term term1, Optional<Term> oTerm, Ident ident) {
		super(term1);
		this.oTerm = oTerm;
		this.ident = ident;
	}

	public Optional<Term> getoTerm() {
		return oTerm;
	}

	public Ident getIdent() {
		return ident;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SigSpecif sigSpecif = (SigSpecif) o;
		return Objects.equals(oTerm, sigSpecif.oTerm) &&
				Objects.equals(ident, sigSpecif.ident);
	}

	@Override
	public int hashCode() {
		return Objects.hash(oTerm, ident);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
