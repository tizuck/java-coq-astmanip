package model.tactics.atomic.utilities;

import model.term.Term;
import model.term.utilities.Ref;
import model.visitor.atomic.BindingListBodyVisitor;

import java.util.Objects;

public class RefBindingListBody implements BindingListBody {

	private Ref ref;

	private Term term;


	public RefBindingListBody(Ref ref, Term term) {
		this.ref = ref;
		this.term = term;
	}

	public Ref getRef() {
		return ref;
	}

	public Term getTerm() {
		return term;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		RefBindingListBody that = (RefBindingListBody) o;
		return Objects.equals(ref, that.ref) &&
				Objects.equals(term, that.term);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ref, term);
	}

	@Override
	public <R, P> R accept(BindingListBodyVisitor<R, P> bindingListBodyVisitor, P p) {
		return bindingListBodyVisitor.visit(this,p);
	}
}
