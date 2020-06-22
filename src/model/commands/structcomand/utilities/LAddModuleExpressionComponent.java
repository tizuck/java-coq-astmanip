package model.commands.structcomand.utilities;

import model.visitor.commands.ModuleComponentVisitor;

import java.util.Objects;

public class LAddModuleExpressionComponent extends LAddComponent {

	private ModuleExpression moduleExpression;

	public LAddModuleExpressionComponent(ModuleExpression moduleExpression) {
		this.moduleExpression = moduleExpression;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		LAddModuleExpressionComponent that = (LAddModuleExpressionComponent) o;
		return Objects.equals(moduleExpression, that.moduleExpression);
	}

	@Override
	public int hashCode() {
		return Objects.hash(moduleExpression);
	}

	@Override
	public <R, P> R accept(ModuleComponentVisitor<R, P> moduleComponentVisitor, P p) {
		return moduleComponentVisitor.visit(this,p);
	}
}
