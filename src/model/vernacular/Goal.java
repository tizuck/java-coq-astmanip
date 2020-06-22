package model.vernacular;

import model.tactics.expr.Expr;
import model.term.Term;
import model.visitor.toplevel.CoqFragmentVisitor;

import java.util.Objects;

public class Goal implements Sentence {

	private Term term;

	private Expr proof;


	public Goal(Term term, Expr proof) {
		this.term = term;
		this.proof = proof;
	}

	@Override
	public <R, P> R accept(CoqFragmentVisitor<R,P> coqFragmentVisitor, P p) {
		return coqFragmentVisitor.visit(this,p);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Goal goal = (Goal) o;
		return Objects.equals(term, goal.term) &&
				Objects.equals(proof, goal.proof);
	}

	@Override
	public int hashCode() {
		return Objects.hash(term, proof);
	}
}
