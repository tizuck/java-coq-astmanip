package model.tactics.atomic.utilities;

import model.visitor.atomic.AtUnfoldVisitor;

import java.util.List;
import java.util.Objects;

public class AtUnfoldStringBody extends AtUnfoldBody {

	private String str;

	public AtUnfoldStringBody(List<Number> nums, String str) {
		super(nums);
		this.str = str;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		AtUnfoldStringBody that = (AtUnfoldStringBody) o;
		return Objects.equals(str, that.str);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), str);
	}

	@Override
	<R, P> R accept(AtUnfoldVisitor<R, P> atUnfoldVisitor, P p) {
		return atUnfoldVisitor.visit(this,p);
	}
}
