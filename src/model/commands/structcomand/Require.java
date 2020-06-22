package model.commands.structcomand;


import model.commands.Command;
import model.term.Qualid;
import model.visitor.toplevel.CoqFragmentVisitor;

import java.util.Objects;
import java.util.Optional;

public class Require implements Command {

	private Qualid qualid;

	private Optional<String> oFrom;

	public Require(Qualid qualid, Optional<String> oFrom) {
		this.qualid = qualid;
		this.oFrom = oFrom;
	}

	public Qualid getQualid() {
		return qualid;
	}

	public Optional<String> getoFrom() {
		return oFrom;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Require require = (Require) o;
		return Objects.equals(qualid, require.qualid) &&
				Objects.equals(oFrom, require.oFrom);
	}

	@Override
	public int hashCode() {
		return Objects.hash(qualid, oFrom);
	}

	@Override
	public <R, P> R accept(CoqFragmentVisitor<R,P> coqFragmentVisitor, P p) {
		return coqFragmentVisitor.visit(this,p);
	}
}
