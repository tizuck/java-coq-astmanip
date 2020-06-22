package model.commands.structcomand.utilities;

import model.visitor.commands.ModuleTypeVisitor;

import java.util.Objects;

public class ModuleExpressionModuleType implements ModuleType {

	private ModuleExpression moduleExpression;

	public ModuleExpressionModuleType(ModuleExpression moduleExpression) {
		this.moduleExpression = moduleExpression;
	}

	public ModuleExpression getModuleExpression() {
		return moduleExpression;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ModuleExpressionModuleType that = (ModuleExpressionModuleType) o;
		return Objects.equals(moduleExpression, that.moduleExpression);
	}

	@Override
	public int hashCode() {
		return Objects.hash(moduleExpression);
	}

	@Override
	public <R, P> R accept(ModuleTypeVisitor<R, P> moduleTypeVisitor, P p) {
		return moduleTypeVisitor.visit(this,p);
	}
}
