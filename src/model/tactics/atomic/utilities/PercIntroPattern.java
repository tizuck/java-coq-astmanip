package model.tactics.atomic.utilities;

import model.term.Term;
import model.visitor.atomic.IntroPatternVisitor;

import java.util.List;
import java.util.Objects;

public class PercIntroPattern implements IntroPattern {

	private IntroPattern introPattern;

	private List<Term> term;


	public PercIntroPattern(IntroPattern introPattern, List<Term> term) {
		this.introPattern = introPattern;
		this.term = term;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PercIntroPattern that = (PercIntroPattern) o;
		return Objects.equals(introPattern, that.introPattern) &&
				Objects.equals(term, that.term);
	}

	@Override
	public int hashCode() {
		return Objects.hash(introPattern, term);
	}

	@Override
	public <R, P> R accept(IntroPatternVisitor<R, P> introPatternVisitor, P p) {
		return introPatternVisitor.visit(this,p);
	}
}
