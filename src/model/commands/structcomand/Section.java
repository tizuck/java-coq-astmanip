package model.commands.structcomand;


import model.commands.Command;
import model.term.utilities.Ident;
import model.visitor.toplevel.CoqFragmentVisitor;

import java.util.Objects;

public class Section implements Command {

	private Ident id;

	public Section(Ident id) {
		this.id = id;
	}

	public Ident getId() {
		return id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Section section = (Section) o;
		return Objects.equals(id, section.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public <R, P> R accept(CoqFragmentVisitor<R,P> coqFragmentVisitor, P p) {
		return coqFragmentVisitor.visit(this,p);
	}
}
