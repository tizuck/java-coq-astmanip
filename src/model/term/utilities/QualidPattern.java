package model.term.utilities;

import model.term.Qualid;
import model.visitor.term.PatternVisitor;

import java.util.Objects;

public class QualidPattern implements SinglePattern {

	private Qualid qualid;

	public QualidPattern(Qualid qualid) {
		this.qualid = qualid;
	}

	public Qualid getQualid() {
		return qualid;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		QualidPattern that = (QualidPattern) o;
		return Objects.equals(qualid, that.qualid);
	}

	@Override
	public int hashCode() {
		return Objects.hash(qualid);
	}

	@Override
	public <R, P> R accept(PatternVisitor<R, P> patternVisitor, P p) {
		return patternVisitor.visit(this,p);
	}
}
