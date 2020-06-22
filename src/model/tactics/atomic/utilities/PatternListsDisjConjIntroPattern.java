package model.tactics.atomic.utilities;

import model.visitor.atomic.IntroPatternVisitor;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PatternListsDisjConjIntroPattern implements DisjConjIntroPattern {

	private Optional<List<IntroPatternList>> optionalIntroPatternLists;


	public PatternListsDisjConjIntroPattern(Optional<List<IntroPatternList>> optionalIntroPatternLists) {
		this.optionalIntroPatternLists = optionalIntroPatternLists;
	}

	public Optional<List<IntroPatternList>> getOptionalIntroPatternLists() {
		return optionalIntroPatternLists;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PatternListsDisjConjIntroPattern that = (PatternListsDisjConjIntroPattern) o;
		return Objects.equals(optionalIntroPatternLists, that.optionalIntroPatternLists);
	}

	@Override
	public int hashCode() {
		return Objects.hash(optionalIntroPatternLists);
	}

	@Override
	public <R, P> R accept(IntroPatternVisitor<R, P> introPatternVisitor, P p) {
		return introPatternVisitor.visit(this,p);
	}

}
