package model.tactics.atomic.utilities;

import model.visitor.atomic.AtUnfoldVisitor;

import java.util.List;
import java.util.Objects;

public abstract class AtUnfoldBody {

	private List<Number> nums;

	public AtUnfoldBody(List<Number> nums) {
		this.nums = nums;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		AtUnfoldBody that = (AtUnfoldBody) o;
		return Objects.equals(nums, that.nums);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nums);
	}

	abstract <R,P> R accept(AtUnfoldVisitor<R,P> atUnfoldVisitor, P p);
}
