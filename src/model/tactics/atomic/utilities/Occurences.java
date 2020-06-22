package model.tactics.atomic.utilities;

import model.term.Number;

import java.util.List;
import java.util.Objects;

public class Occurences {

	private boolean isNegativ;

	private List<Number> nums;

	public boolean isNegativ() {
		return isNegativ;
	}

	public List<Number> getNums() {
		return nums;
	}

	public Occurences(boolean isNegativ, List<Number> nums) {
		this.isNegativ = isNegativ;
		this.nums = nums;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Occurences that = (Occurences) o;
		return isNegativ == that.isNegativ &&
				Objects.equals(nums, that.nums);
	}

	@Override
	public int hashCode() {
		return Objects.hash(isNegativ, nums);
	}
}
