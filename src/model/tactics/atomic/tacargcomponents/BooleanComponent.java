package model.tactics.atomic.tacargcomponents;

import model.visitor.atomic.TacArgComponentVisitor;

import java.util.Objects;

public class BooleanComponent extends TacArgComponent {

	private boolean bool;

	public BooleanComponent(boolean bool) {
		this.bool = bool;
	}

	public BooleanComponent(ComponentType componentType, boolean bool) {
		super(componentType);
		this.bool = bool;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		BooleanComponent that = (BooleanComponent) o;
		return bool == that.bool;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), bool);
	}

	@Override
	public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
		return tacArgComponentVisitor.visit(this,p);
	}
}
