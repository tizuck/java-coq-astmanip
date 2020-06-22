package model.term;

import coqparser.prettyprint.PrettyPrintConfiguration;
import coqparser.prettyprint.PrettyPrintContext;
import coqparser.prettyprint.term.PrettyPrintTermVisitor;
import model.visitor.term.TermVisitor;

import java.util.Objects;

public class OpsTerm implements Term {

	private Term term1;

	private Term term2;

	private Operatortype operator;


	public OpsTerm(Term term1, Term term2, Operatortype operator) {
		this.term1 = term1;
		this.term2 = term2;
		this.operator = operator;
	}

	public Term getTerm1() {
		return term1;
	}

	public Term getTerm2() {
		return term2;
	}

	public Operatortype getOperator() {
		return operator;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		OpsTerm opsTerm = (OpsTerm) o;
		return Objects.equals(term1, opsTerm.term1) &&
				Objects.equals(term2, opsTerm.term2) &&
				operator == opsTerm.operator;
	}

	@Override
	public int hashCode() {
		return Objects.hash(term1, term2, operator);
	}

	@Override
	public String toString() {
		return new PrettyPrintTermVisitor(PrettyPrintConfiguration.fromIndentType(PrettyPrintConfiguration.IndentType.TABS)).visit(this,
				new PrettyPrintContext(0,PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
