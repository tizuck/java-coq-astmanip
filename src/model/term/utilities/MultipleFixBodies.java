package model.term.utilities;

import model.visitor.term.FixBodiesVisitor;

import java.util.List;
import java.util.Objects;

public class MultipleFixBodies implements FixBodies {

	private Ident id;

	private List<FixBody> fixBody;

	public MultipleFixBodies(Ident id, List<FixBody> fixBody) {
		this.id = id;
		this.fixBody = fixBody;
	}

	public Ident getId() {
		return id;
	}

	public List<FixBody> getFixBody() {
		return fixBody;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		MultipleFixBodies that = (MultipleFixBodies) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(fixBody, that.fixBody);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, fixBody);
	}

	@Override
	public <R, P> R accept(FixBodiesVisitor<R, P> fixBodiesVisitor, P p) {
		return fixBodiesVisitor.visit(this,p);
	}
}
