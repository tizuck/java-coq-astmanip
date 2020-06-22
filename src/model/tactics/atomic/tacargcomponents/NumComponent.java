package model.tactics.atomic.tacargcomponents;

import model.term.Number;
import model.visitor.atomic.TacArgComponentVisitor;

import java.util.Objects;

public class NumComponent extends TacArgComponent {

	private Number num;

	public NumComponent(Number num) {
		this.num = num;
	}

	public NumComponent(ComponentType componentType, Number num) {
		super(componentType);
		this.num = num;
	}

	public Number getNum() {
		return num;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		NumComponent that = (NumComponent) o;
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
