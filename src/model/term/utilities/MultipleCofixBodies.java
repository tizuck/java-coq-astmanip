package model.term.utilities;

import model.visitor.term.CoFixBodiesVisitor;

import java.util.Collection;
import java.util.Objects;

public class MultipleCofixBodies implements CoFixBodies {

	private Ident id;

	private Collection<CoFixBody> coFixBody;

	public MultipleCofixBodies(Ident id, Collection<CoFixBody> coFixBody) {
		this.id = id;
		this.coFixBody = coFixBody;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		MultipleCofixBodies that = (MultipleCofixBodies) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(coFixBody, that.coFixBody);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, coFixBody);
	}

	@Override
	public <R, P> R accept(CoFixBodiesVisitor<R, P> coFixBodiesVisitor, P p) {
		return coFixBodiesVisitor.visit(this,p);
	}

	public Ident getId() {
		return id;
	}

	public Collection<CoFixBody> getCoFixBody() {
		return coFixBody;
	}
}
