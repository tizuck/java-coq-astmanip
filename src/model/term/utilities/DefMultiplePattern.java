package model.term.utilities;

import model.term.Qualid;
import model.visitor.term.PatternVisitor;

import java.util.List;
import java.util.Objects;

public class DefMultiplePattern implements MultiplePattern {

	private Qualid qualid;

	private List<Pattern> pattern;


	public DefMultiplePattern(Qualid qualid, List<Pattern> pattern) {
		this.qualid = qualid;
		this.pattern = pattern;
	}

	public Qualid getQualid() {
		return qualid;
	}

	public List<Pattern> getPattern() {
		return pattern;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		DefMultiplePattern that = (DefMultiplePattern) o;
		return Objects.equals(qualid, that.qualid) &&
				Objects.equals(pattern, that.pattern);
	}

	@Override
	public int hashCode() {
		return Objects.hash(qualid, pattern);
	}

	@Override
	public <R, P> R accept(PatternVisitor<R, P> patternVisitor, P p) {
		return patternVisitor.visit(this,p);
	}
}
