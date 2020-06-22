package model.commands.structcomand.utilities;

import model.term.Qualid;
import model.term.Term;
import model.visitor.commands.ModuleTypeVisitor;

import java.util.Objects;

public class DefinitionModuleType implements ModuleType {

	private ModuleType moduleType;

	private Qualid qualid;

	private Term term;

	public DefinitionModuleType(ModuleType moduleType, Qualid qualid, Term term) {
		this.moduleType = moduleType;
		this.qualid = qualid;
		this.term = term;
	}

	public ModuleType getModuleType() {
		return moduleType;
	}

	public Qualid getQualid() {
		return qualid;
	}

	public Term getTerm() {
		return term;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		DefinitionModuleType that = (DefinitionModuleType) o;
		return Objects.equals(moduleType, that.moduleType) &&
				Objects.equals(qualid, that.qualid) &&
				Objects.equals(term, that.term);
	}

	@Override
	public int hashCode() {
		return Objects.hash(moduleType, qualid, term);
	}

	@Override
	public <R, P> R accept(ModuleTypeVisitor<R, P> moduleTypeVisitor, P p) {
		return moduleTypeVisitor.visit(this,p);
	}
}
