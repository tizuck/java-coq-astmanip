package model.term;

import model.term.utilities.Ident;
import model.visitor.term.TermVisitor;

import java.util.Objects;

public class SimpleQualid extends Qualid {

	private Ident id;

	public SimpleQualid(Ident id) {
		this.id = id;
	}

	public Ident getId() {
		return id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SimpleQualid that = (SimpleQualid) o;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
