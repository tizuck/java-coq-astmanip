package model.tactics.atomic.utilities;

import model.visitor.atomic.IntroPatternVisitor;

import java.util.List;
import java.util.Objects;

public class AndPatternDisjConjIntroPattern implements DisjConjIntroPattern {

	private List<IntroPattern> introPatterns;

	public AndPatternDisjConjIntroPattern(List<IntroPattern> introPatterns) {
		this.introPatterns = introPatterns;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		AndPatternDisjConjIntroPattern that = (AndPatternDisjConjIntroPattern) o;
		return Objects.equals(introPatterns, that.introPatterns);
	}

	@Override
	public int hashCode() {
		return Objects.hash(introPatterns);
	}

	@Override
	public <R, P> R accept(IntroPatternVisitor<R, P> introPatternVisitor, P p) {
		return introPatternVisitor.visit(this,p);
	}

	public List<IntroPattern> getIntroPatterns() {
		return introPatterns;
	}
}
