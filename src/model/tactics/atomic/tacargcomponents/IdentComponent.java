package model.tactics.atomic.tacargcomponents;

import model.term.utilities.Ident;
import model.visitor.atomic.TacArgComponentVisitor;

import java.util.Objects;

public class IdentComponent extends TacArgComponent {

	private Ident id;

	public IdentComponent(Ident id) {
		this.id = id;
	}

	public IdentComponent(ComponentType componentType, Ident id) {
		super(componentType);
		this.id = id;
	}

	public Ident getId() {
		return id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		IdentComponent that = (IdentComponent) o;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), id);
	}

	@Override
	public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
		return tacArgComponentVisitor.visit(this,p);
	}
}
