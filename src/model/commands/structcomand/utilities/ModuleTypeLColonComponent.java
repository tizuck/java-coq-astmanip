package model.commands.structcomand.utilities;

import model.visitor.commands.ModuleComponentVisitor;

import java.util.Objects;

public class ModuleTypeLColonComponent extends LColonComponent {

	private ModuleType moduleType;

	public ModuleTypeLColonComponent(ModuleType moduleType) {
		this.moduleType = moduleType;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		ModuleTypeLColonComponent that = (ModuleTypeLColonComponent) o;
		return Objects.equals(moduleType, that.moduleType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(moduleType);
	}

	@Override
	public <R, P> R accept(ModuleComponentVisitor<R, P> moduleComponentVisitor, P p) {
		return moduleComponentVisitor.visit(this,p);
	}
}
