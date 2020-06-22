package model.term;

import model.visitor.term.TermVisitor;

import java.util.Objects;

public class SingleOpsTerm implements Term {


	private Term term;

	private Operatortype operator;

	public SingleOpsTerm(Term term, Operatortype operator) {
		this.term = term;
		this.operator = operator;
	}

	public Term getTerm() {
		return term;
	}

	public Operatortype getOperator() {
		return operator;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SingleOpsTerm that = (SingleOpsTerm) o;
		return Objects.equals(term, that.term) &&
				operator == that.operator;
	}

	@Override
	public int hashCode() {
		return Objects.hash(term, operator);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
