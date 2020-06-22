package model.term;

import model.visitor.term.TermVisitor;

import java.util.Objects;

public class TwoOpsTerm extends OpsTerm {

	private Term term3;

	private Operatortype operator2;


	public TwoOpsTerm(Term term1, Operatortype operator, Term term2, Operatortype operator2, Term term3) {
		super(term1, term2, operator);
		this.term3 = term3;
		this.operator2 = operator2;
	}

	public Term getTerm3() {
		return term3;
	}

	public Operatortype getOperator2() {
		return operator2;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		TwoOpsTerm that = (TwoOpsTerm) o;
		return Objects.equals(term3, that.term3) &&
				operator2 == that.operator2;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), term3, operator2);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
