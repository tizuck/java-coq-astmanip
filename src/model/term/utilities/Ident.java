package model.term.utilities;

import model.tactics.expr.utilities.Natural;
import model.visitor.term.IdentVisitor;
import model.visitor.term.RefVisitor;

import java.util.Objects;

public class Ident implements Ref, Natural {

	public String getId() {
		return id;
	}

	private String id;

	public Ident(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Ident ident = (Ident) o;
		return Objects.equals(id, ident.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	public <R, P> R accept(IdentVisitor<R, P> identVisitor, P p) {
		return identVisitor.visit(this,p);
	}

	@Override
	public <R, P> R accept(RefVisitor<R, P> refVisitor, P p) {
		return refVisitor.visit(this,p);
	}
}
