package model.term;

import model.term.utilities.DepRetType;
import model.visitor.term.TermVisitor;

import java.util.Objects;
import java.util.Optional;

public class IfThenElseTerm implements Term {

	private Term term1;

	private Optional<DepRetType> oDepRetType;

	private Term term2;

	private Term term3;

	public IfThenElseTerm(Term term1, Optional<DepRetType> oDepRetType, Term term2, Term term3) {
		this.term1 = term1;
		this.oDepRetType = oDepRetType;
		this.term2 = term2;
		this.term3 = term3;
	}

	public Term getTerm1() {
		return term1;
	}

	public Term getTerm2() {
		return term2;
	}

	public Term getTerm3() {
		return term3;
	}

	public Optional<DepRetType> getoDepRetType() {
		return oDepRetType;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		IfThenElseTerm that = (IfThenElseTerm) o;
		return Objects.equals(term1, that.term1) &&
				Objects.equals(oDepRetType, that.oDepRetType) &&
				Objects.equals(term2, that.term2) &&
				Objects.equals(term3, that.term3);
	}

	@Override
	public int hashCode() {
		return Objects.hash(term1, oDepRetType, term2, term3);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
