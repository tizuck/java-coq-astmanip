package model.term.utilities;

import model.visitor.term.CoFixBodiesVisitor;

import java.util.Objects;

public class SingleCoFixBody implements CoFixBodies {

	private CoFixBody coFixBody;

	public SingleCoFixBody(CoFixBody coFixBody) {
		this.coFixBody = coFixBody;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SingleCoFixBody that = (SingleCoFixBody) o;
		return Objects.equals(coFixBody, that.coFixBody);
	}

	@Override
	public int hashCode() {
		return Objects.hash(coFixBody);
	}

	@Override
	public <R, P> R accept(CoFixBodiesVisitor<R,P> coFixBodiesVisitor, P p) {
		return coFixBodiesVisitor.visit(this,p);
	}

	public CoFixBody getCoFixBody() {
		return coFixBody;
	}
}
