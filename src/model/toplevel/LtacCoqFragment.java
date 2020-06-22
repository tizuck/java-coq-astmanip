package model.toplevel;

import model.toplevel.utilities.Ltac;
import model.visitor.toplevel.CoqFragmentVisitor;

import java.util.Objects;

public class LtacCoqFragment implements CoqFragment {

	private Ltac ltac;

	public LtacCoqFragment(Ltac ltac) {
		this.ltac = ltac;
	}

	public Ltac getLtac() {
		return ltac;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		LtacCoqFragment that = (LtacCoqFragment) o;
		return Objects.equals(ltac, that.ltac);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ltac);
	}

	@Override
	public <R, P> R accept(CoqFragmentVisitor<R,P> coqFragmentVisitor, P p) {
		return coqFragmentVisitor.visit(this,p);
	}
}
