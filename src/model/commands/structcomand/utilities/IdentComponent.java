package model.commands.structcomand.utilities;

import model.term.utilities.Ident;
import model.visitor.commands.ModuleComponentVisitor;

import java.util.Objects;

public class IdentComponent implements ModuleComponent {

	private Ident id;

	public IdentComponent(Ident id) {
		this.id = id;
	}

	public Ident getId() {
		return id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		IdentComponent that = (IdentComponent) o;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public <R, P> R accept(ModuleComponentVisitor<R, P> moduleComponentVisitor, P p) {
		return moduleComponentVisitor.visit(this,p);
	}
}
