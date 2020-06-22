package model.tactics.expr.utilities;

import model.term.Qualid;
import model.visitor.expr.AtomVisitor;

import java.util.Objects;

public class QualidAtom implements Atom {

	private Qualid qualid;

	public QualidAtom(Qualid qualid) {
		this.qualid = qualid;
	}

	public Qualid getQualid() {
		return qualid;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		QualidAtom that = (QualidAtom) o;
		return Objects.equals(qualid, that.qualid);
	}

	@Override
	public int hashCode() {
		return Objects.hash(qualid);
	}

	@Override
	public <R, P> R accept(AtomVisitor<R, P> atomVisitor, P p) {
		return atomVisitor.visit(this,p);
	}
}
