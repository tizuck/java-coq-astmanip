package model.tactics.atomic.tacargcomponents;

import model.term.utilities.Binder;
import model.visitor.atomic.TacArgComponentVisitor;

import java.util.Objects;

public class BinderComponent extends TacArgComponent {

	private Binder binder;

	public BinderComponent(Binder binder) {
		this.binder = binder;
	}

	public BinderComponent(ComponentType componentType, Binder binder) {
		super(componentType);
		this.binder = binder;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		BinderComponent that = (BinderComponent) o;
		return Objects.equals(binder, that.binder);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), binder);
	}

	@Override
	public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
		return tacArgComponentVisitor.visit(this,p);
	}
}
