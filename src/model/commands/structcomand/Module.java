package model.commands.structcomand;


import model.commands.Command;
import model.commands.structcomand.utilities.IdentComponent;
import model.commands.structcomand.utilities.ModuleBindingsComponent;
import model.commands.structcomand.utilities.ModuleComponent;
import model.visitor.toplevel.CoqFragmentVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Module implements Command {

	private List<ModuleComponent> moduleComponents;

	public Module(IdentComponent id) {
		moduleComponents = new ArrayList<>();
		moduleComponents.add(id);
	}

	public Module(IdentComponent id, ModuleBindingsComponent moduleBindings) {
		moduleComponents = new ArrayList<>();
		moduleComponents.add(id);
		moduleComponents.add(moduleBindings);
	}

	public List<ModuleComponent> getModuleComponents() {
		return moduleComponents;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Module module = (Module) o;
		return Objects.equals(moduleComponents, module.moduleComponents);
	}

	@Override
	public int hashCode() {
		return Objects.hash(moduleComponents);
	}

	@Override
	public <R, P> R accept(CoqFragmentVisitor<R,P> coqFragmentVisitor, P p) {
		return coqFragmentVisitor.visit(this,p);
	}
}
