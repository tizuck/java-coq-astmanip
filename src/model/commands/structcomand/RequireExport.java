package model.commands.structcomand;


import model.commands.Command;
import model.term.Qualid;
import model.visitor.toplevel.CoqFragmentVisitor;

import java.util.List;
import java.util.Objects;

public class RequireExport implements Command {

	private List<Qualid> qualids;

	public RequireExport(List<Qualid> qualids) {
		this.qualids = qualids;
	}

	public List<Qualid> getQualids() {
		return qualids;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		RequireExport that = (RequireExport) o;
		return Objects.equals(qualids, that.qualids);
	}

	@Override
	public int hashCode() {
		return Objects.hash(qualids);
	}



	@Override
	public <R, P> R accept(CoqFragmentVisitor<R,P> coqFragmentVisitor, P p) {
		return coqFragmentVisitor.visit(this,p);
	}
}
