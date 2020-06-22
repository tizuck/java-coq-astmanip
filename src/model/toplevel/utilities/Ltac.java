package model.toplevel.utilities;

import java.util.List;
import java.util.Objects;

public class Ltac {

	private boolean isLocal;

	private List<LtacDef> ltacDefs;

	public Ltac(boolean isLocal, List<LtacDef> ltacDefs) {
		this.isLocal = isLocal;
		this.ltacDefs = ltacDefs;
	}

	public boolean isLocal() {
		return isLocal;
	}

	public List<LtacDef> getLtacDefs() {
		return ltacDefs;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Ltac ltac = (Ltac) o;
		return isLocal == ltac.isLocal &&
				Objects.equals(ltacDefs, ltac.ltacDefs);
	}

	@Override
	public int hashCode() {
		return Objects.hash(isLocal, ltacDefs);
	}
}
