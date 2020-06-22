package model.term.utilities;

import model.visitor.term.PatternVisitor;

import java.util.Objects;

public class OpsPattern implements SinglePattern {

	private PatternOps patternOps;

	private Pattern pattern;

	private Ident id;

	public OpsPattern(PatternOps patternOps, Pattern pattern, Ident id) {
		this.patternOps = patternOps;
		this.pattern = pattern;
		this.id = id;
	}

	public PatternOps getPatternOps() {
		return patternOps;
	}

	public Pattern getPattern() {
		return pattern;
	}

	public Ident getId() {
		return id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		OpsPattern that = (OpsPattern) o;
		return patternOps == that.patternOps &&
				Objects.equals(pattern, that.pattern) &&
				Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(patternOps, pattern, id);
	}

	@Override
	public <R, P> R accept(PatternVisitor<R, P> patternVisitor, P p) {
		return patternVisitor.visit(this,p);
	}
}
