package model.tactics.expr.utilities;

import model.term.Qualid;
import model.visitor.expr.TacArgVisitor;

import java.util.Objects;

public class QualidTacArg implements TacArg {

	private Qualid qualid;

	public QualidTacArg(Qualid qualid) {
		this.qualid = qualid;
	}

	public Qualid getQualid() {
		return qualid;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		QualidTacArg that = (QualidTacArg) o;
		return Objects.equals(qualid, that.qualid);
	}

	@Override
	public int hashCode() {
		return Objects.hash(qualid);
	}

	@Override
	public <R, P> R accept(TacArgVisitor<R, P> tacArgVisitor, P p) {
		return tacArgVisitor.visit(this,p);
	}
}
