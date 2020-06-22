package model.commands.structcomand.utilities;

import model.visitor.commands.ModuleComponentVisitor;

import java.util.List;
import java.util.Objects;

public class ModuleBindingsComponent implements ModuleComponent {

	private List<ModuleBinding> bindings;

	public ModuleBindingsComponent(List<ModuleBinding> bindings) {
		this.bindings = bindings;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ModuleBindingsComponent that = (ModuleBindingsComponent) o;
		return Objects.equals(bindings, that.bindings);
	}

	@Override
	public int hashCode() {
		return Objects.hash(bindings);
	}

	@Override
	public <R, P> R accept(ModuleComponentVisitor<R, P> moduleComponentVisitor, P p) {
		return moduleComponentVisitor.visit(this,p);
	}
}
