package model.term.utilities;

import model.visitor.term.FixBodiesVisitor;

import java.util.Objects;

public class SingleFixBody implements FixBodies {

	private FixBody fixBody;

	public SingleFixBody(FixBody fixBody) {
		this.fixBody = fixBody;
	}

	public FixBody getFixBody() {
		return fixBody;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SingleFixBody that = (SingleFixBody) o;
		return Objects.equals(fixBody, that.fixBody);
	}

	@Override
	public int hashCode() {
		return Objects.hash(fixBody);
	}

	@Override
	public <R, P> R accept(FixBodiesVisitor<R, P> fixBodiesVisitor, P p) {
		return fixBodiesVisitor.visit(this,p);
	}
}
