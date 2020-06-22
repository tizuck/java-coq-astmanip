package model.tactics.expr.utilities;

import model.term.Term;
import model.visitor.expr.TacArgVisitor;

import java.util.Objects;

public class TermTacArg implements TacArg {

	private Term term;

	public TermTacArg(Term term) {
		this.term = term;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		TermTacArg that = (TermTacArg) o;
		return Objects.equals(term, that.term);
	}

	@Override
	public int hashCode() {
		return Objects.hash(term);
	}

	public Term getTerm() {
		return term;
	}

	@Override
	public <R, P> R accept(TacArgVisitor<R, P> tacArgVisitor, P p) {
		return tacArgVisitor.visit(this,p);
	}
}
