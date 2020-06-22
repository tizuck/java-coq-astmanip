package model.term;

import model.visitor.term.TermVisitor;

import java.util.Objects;

public class Boolean extends AtomicTerm {

	private boolean value;

	public Boolean(boolean value) {
		this.value = value;
	}

	public boolean isValue() {
		return value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Boolean aBoolean = (Boolean) o;
		return value == aBoolean.value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
