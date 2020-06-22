package model.tactics.expr.utilities;

import model.visitor.expr.TacArgVisitor;

import java.util.Objects;

public class LtacTacArg implements TacArg {

	private Atom atom;

	public LtacTacArg(Atom atom) {
		this.atom = atom;
	}

	public Atom getAtom() {
		return atom;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		LtacTacArg that = (LtacTacArg) o;
		return Objects.equals(atom, that.atom);
	}

	@Override
	public int hashCode() {
		return Objects.hash(atom);
	}

	@Override
	public <R, P> R accept(TacArgVisitor<R, P> tacArgVisitor, P p) {
		return tacArgVisitor.visit(this,p);
	}
}
