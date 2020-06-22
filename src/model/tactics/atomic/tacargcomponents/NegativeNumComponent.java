package model.tactics.atomic.tacargcomponents;

import model.term.Number;
import model.visitor.atomic.TacArgComponentVisitor;

import java.util.Objects;

public class NegativeNumComponent extends TacArgComponent {

	private Number num;


	public NegativeNumComponent(Number num) {
		this.num = num;
	}

	public NegativeNumComponent(ComponentType componentType, Number num) {
		super(componentType);
		this.num = num;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		NegativeNumComponent that = (NegativeNumComponent) o;
		return Objects.equals(num, that.num);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), num);
	}

	@Override
	public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
		return tacArgComponentVisitor.visit(this,p);
	}
}
