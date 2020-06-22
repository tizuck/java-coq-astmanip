package model.term.utilities;

import model.visitor.term.PatternVisitor;

import java.util.List;
import java.util.Objects;

public class OrMultiplePattern implements MultiplePattern {

	private List<OrPattern> orPattern;

	public OrMultiplePattern(List<OrPattern> orPattern) {
		this.orPattern = orPattern;
	}

	public List<OrPattern> getOrPattern() {
		return orPattern;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		OrMultiplePattern that = (OrMultiplePattern) o;
		return Objects.equals(orPattern, that.orPattern);
	}

	@Override
	public int hashCode() {
		return Objects.hash(orPattern);
	}

	@Override
	public <R, P> R accept(PatternVisitor<R, P> patternVisitor, P p) {
		return patternVisitor.visit(this,p);
	}
}
