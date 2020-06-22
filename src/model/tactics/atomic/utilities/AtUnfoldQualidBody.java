package model.tactics.atomic.utilities;

import model.term.Qualid;
import model.visitor.atomic.AtUnfoldVisitor;

import java.util.List;
import java.util.Objects;

public class AtUnfoldQualidBody extends AtUnfoldBody {

	private Qualid qualid;

	public AtUnfoldQualidBody(List<Number> nums, Qualid qualid) {
		super(nums);
		this.qualid = qualid;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		AtUnfoldQualidBody that = (AtUnfoldQualidBody) o;
		return Objects.equals(qualid, that.qualid);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), qualid);
	}

	@Override
	<R, P> R accept(AtUnfoldVisitor<R, P> atUnfoldVisitor, P p) {
		return atUnfoldVisitor.visit(this,p);
	}
}
