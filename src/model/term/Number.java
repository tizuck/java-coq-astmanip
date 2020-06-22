package model.term;

import model.term.utilities.Ref;
import model.tactics.expr.utilities.Natural;
import model.visitor.term.RefVisitor;
import model.visitor.term.TermVisitor;

import java.util.Objects;

public class Number extends AtomicTerm implements Ref, Natural {

	private Integer value;

	public Number(Integer value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Number number = (Number) o;
		return Objects.equals(value, number.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}

	@Override
	public <R, P> R accept(RefVisitor<R, P> refVisitor, P p) {
		return refVisitor.visit(this,p);
	}
}
