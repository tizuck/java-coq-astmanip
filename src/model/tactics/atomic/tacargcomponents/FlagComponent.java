package model.tactics.atomic.tacargcomponents;

import model.tactics.atomic.utilities.Flag;
import model.visitor.atomic.TacArgComponentVisitor;

import java.util.Objects;

public class FlagComponent extends TacArgComponent {

	private Flag flag;

	public FlagComponent(Flag flag) {
		this.flag = flag;
	}

	public FlagComponent(ComponentType componentType, Flag flag) {
		super(componentType);
		this.flag = flag;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		FlagComponent that = (FlagComponent) o;
		return Objects.equals(flag, that.flag);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), flag);
	}

	@Override
	public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
		return tacArgComponentVisitor.visit(this,p);
	}
}
