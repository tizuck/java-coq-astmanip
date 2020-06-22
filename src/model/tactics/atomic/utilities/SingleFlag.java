package model.tactics.atomic.utilities;

import model.visitor.atomic.FlagVisitor;

import java.util.Objects;

public class SingleFlag extends Flag {

	private SingleFlagtype flag;

	public SingleFlag(SingleFlagtype flag) {
		this.flag = flag;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SingleFlag that = (SingleFlag) o;
		return flag == that.flag;
	}

	@Override
	public int hashCode() {
		return Objects.hash(flag);
	}

	@Override
	<R, P> R accept(FlagVisitor<R, P> flagVisitor, P p) {
		return flagVisitor.visit(this,p);
	}
}
