package model.term;

import model.term.utilities.Binder;
import model.visitor.term.TermVisitor;

import java.util.List;
import java.util.Objects;

public class FunTerm implements Term {

	private List<Binder> binders;

	private Term term;

	public FunTerm(List<Binder> binders, Term term) {
		this.binders = binders;
		this.term = term;
	}

	public List<Binder> getBinders() {
		return binders;
	}

	public Term getTerm() {
		return term;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		FunTerm funTerm = (FunTerm) o;
		return Objects.equals(binders, funTerm.binders) &&
				Objects.equals(term, funTerm.term);
	}

	@Override
	public int hashCode() {
		return Objects.hash(binders, term);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
