package model.tactics.atomic.tacargcomponents;

import model.term.Term;
import model.visitor.atomic.TacArgComponentVisitor;

import java.util.Objects;

public class TermComponent extends TacArgComponent {

	private Term term;

	public TermComponent(Term term) {
		this.term = term;
	}

	public TermComponent(ComponentType componentType, Term term) {
		super(componentType);
		this.term = term;
	}

	public Term getTerm() {
		return term;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		TermComponent that = (TermComponent) o;
		return Objects.equals(term, that.term);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), term);
	}

	@Override
	public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
		return tacArgComponentVisitor.visit(this,p);
	}
}
