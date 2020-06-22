package model.tactics.atomic.utilities;

import model.term.Term;
import model.visitor.atomic.BindingListBodyVisitor;

import java.util.Objects;

public class TermBindingListBody implements BindingListBody {

	private Term term;

	public TermBindingListBody(Term term) {
		this.term = term;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		TermBindingListBody that = (TermBindingListBody) o;
		return Objects.equals(term, that.term);
	}

	@Override
	public int hashCode() {
		return Objects.hash(term);
	}

	@Override
	public <R, P> R accept(BindingListBodyVisitor<R, P> bindingListBodyVisitor, P p) {
		return bindingListBodyVisitor.visit(this,p);
	}
}
