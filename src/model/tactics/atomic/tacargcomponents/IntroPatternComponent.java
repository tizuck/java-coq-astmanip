package model.tactics.atomic.tacargcomponents;

import model.tactics.atomic.utilities.IntroPattern;
import model.visitor.atomic.TacArgComponentVisitor;

import java.util.Objects;

public class IntroPatternComponent extends TacArgComponent {

	private IntroPattern introPattern;

	public IntroPatternComponent(IntroPattern introPattern) {
		this.introPattern = introPattern;
	}

	public IntroPatternComponent(ComponentType componentType, IntroPattern introPattern) {
		super(componentType);
		this.introPattern = introPattern;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		IntroPatternComponent that = (IntroPatternComponent) o;
		return Objects.equals(introPattern, that.introPattern);
	}

	public IntroPattern getIntroPattern() {
		return introPattern;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), introPattern);
	}

	@Override
	public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
		return tacArgComponentVisitor.visit(this,p);
	}
}
