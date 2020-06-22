package model.tactics.atomic.utilities;

import model.visitor.atomic.IntroPatternVisitor;

import java.util.List;
import java.util.Objects;

public class NamingIntroPatternEqualIntroPattern implements EqualIntroPattern {

	private List<NamingIntroPattern> namingIntroPatterns;

	public NamingIntroPatternEqualIntroPattern(List<NamingIntroPattern> namingIntroPatterns) {
		this.namingIntroPatterns = namingIntroPatterns;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		NamingIntroPatternEqualIntroPattern that = (NamingIntroPatternEqualIntroPattern) o;
		return Objects.equals(namingIntroPatterns, that.namingIntroPatterns);
	}

	@Override
	public int hashCode() {
		return Objects.hash(namingIntroPatterns);
	}

	@Override
	public <R, P> R accept(IntroPatternVisitor<R, P> introPatternVisitor, P p) {
		return introPatternVisitor.visit(this,p);
	}
}
