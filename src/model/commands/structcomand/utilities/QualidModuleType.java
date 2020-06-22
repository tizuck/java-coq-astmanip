package model.commands.structcomand.utilities;

import model.term.Qualid;
import model.visitor.commands.ModuleTypeVisitor;

import java.util.Objects;

public class QualidModuleType implements ModuleType {

	private Qualid qualid;

	public QualidModuleType(Qualid qualid) {
		this.qualid = qualid;
	}

	public Qualid getQualid() {
		return qualid;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		QualidModuleType that = (QualidModuleType) o;
		return Objects.equals(qualid, that.qualid);
	}

	@Override
	public int hashCode() {
		return Objects.hash(qualid);
	}

	@Override
	public <R, P> R accept(ModuleTypeVisitor<R, P> moduleTypeVisitor, P p) {
		return moduleTypeVisitor.visit(this,p);
	}
}
