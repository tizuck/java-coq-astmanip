package model.commands.structcomand.utilities;

import model.term.Qualid;
import model.visitor.commands.ModuleTypeVisitor;

import java.util.Objects;

public class ModuleModuleType implements ModuleType {

	private ModuleType moduleType;

	private Qualid qualid1;

	private Qualid qualid2;


	public ModuleModuleType(ModuleType moduleType, Qualid qualid1, Qualid qualid2) {
		this.moduleType = moduleType;
		this.qualid1 = qualid1;
		this.qualid2 = qualid2;
	}

	public ModuleType getModuleType() {
		return moduleType;
	}

	public Qualid getQualid1() {
		return qualid1;
	}

	public Qualid getQualid2() {
		return qualid2;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ModuleModuleType that = (ModuleModuleType) o;
		return Objects.equals(moduleType, that.moduleType) &&
				Objects.equals(qualid1, that.qualid1) &&
				Objects.equals(qualid2, that.qualid2);
	}

	@Override
	public int hashCode() {
		return Objects.hash(moduleType, qualid1, qualid2);
	}

	@Override
	public <R, P> R accept(ModuleTypeVisitor<R, P> moduleTypeVisitor, P p) {
		return moduleTypeVisitor.visit(this,p);
	}
}
