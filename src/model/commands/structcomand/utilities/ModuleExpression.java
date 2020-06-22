package model.commands.structcomand.utilities;

import model.term.Qualid;

import java.util.List;
import java.util.Objects;

public class ModuleExpression {

	private boolean hasExclamationMark;

	private List<Qualid> qualids;

	public ModuleExpression(boolean hasExclamationMark, List<Qualid> qualids) {
		this.hasExclamationMark = hasExclamationMark;
		this.qualids = qualids;
	}

	public boolean isHasExclamationMark() {
		return hasExclamationMark;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ModuleExpression that = (ModuleExpression) o;
		return hasExclamationMark == that.hasExclamationMark &&
				Objects.equals(qualids, that.qualids);
	}

	@Override
	public int hashCode() {
		return Objects.hash(hasExclamationMark, qualids);
	}

	public List<Qualid> getQualids() {
		return qualids;
	}
}
