package model.tactics.atomic.utilities;

import model.term.utilities.Ident;
import model.visitor.atomic.IntroPatternVisitor;

import java.util.Objects;
import java.util.Optional;

public class NamingIntroPattern implements IntroPattern {

	private boolean isQuestionmark;

	private Optional<Ident> oIdent;

	public NamingIntroPattern(boolean isQuestionmark, Optional<Ident> oIdent) {
		this.isQuestionmark = isQuestionmark;
		this.oIdent = oIdent;
	}

	public boolean isQuestionmark() {
		return isQuestionmark;
	}

	public Optional<Ident> getoIdent() {
		return oIdent;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		NamingIntroPattern that = (NamingIntroPattern) o;
		return isQuestionmark == that.isQuestionmark &&
				Objects.equals(oIdent, that.oIdent);
	}

	@Override
	public int hashCode() {
		return Objects.hash(isQuestionmark, oIdent);
	}

	@Override
	public <R, P> R accept(IntroPatternVisitor<R, P> introPatternVisitor, P p) {
		return introPatternVisitor.visit(this,p);
	}
}
