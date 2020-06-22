package model.term;

import model.visitor.term.TermVisitor;

import java.util.Objects;

public class Sort extends AtomicTerm {

	private Sorttype sortType;

	public Sort(Sorttype sortType) {
		this.sortType = sortType;
	}

	public Sorttype getSortType() {
		return sortType;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Sort sort = (Sort) o;
		return sortType == sort.sortType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(sortType);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
