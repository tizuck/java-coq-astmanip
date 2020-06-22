package model.tactics.atomic.utilities;

import model.term.Qualid;
import model.visitor.atomic.FlagVisitor;

import java.util.List;
import java.util.Objects;

public class Delta extends Flag {

	public Delta(List<Qualid> qualids, boolean isNegative) {
		this.qualids = qualids;
		this.isNegative = isNegative;
	}

	private List<Qualid> qualids;

	private boolean isNegative;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Delta delta = (Delta) o;
		return isNegative == delta.isNegative &&
				Objects.equals(qualids, delta.qualids);
	}

	@Override
	public int hashCode() {
		return Objects.hash(qualids, isNegative);
	}

	@Override
	<R, P> R accept(FlagVisitor<R, P> flagVisitor, P p) {
		return flagVisitor.visit(this,p);
	}

}
