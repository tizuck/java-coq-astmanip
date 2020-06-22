package model.tactics.atomic.utilities;

import java.util.List;
import java.util.Objects;

public class IntroPatternList {

	private List<IntroPattern> introPatterns;

	public List<IntroPattern> getIntroPatterns() {
		return introPatterns;
	}

	public IntroPatternList(List<IntroPattern> introPatterns) {
		this.introPatterns = introPatterns;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		IntroPatternList that = (IntroPatternList) o;
		return Objects.equals(introPatterns, that.introPatterns);
	}

	@Override
	public int hashCode() {
		return Objects.hash(introPatterns);
	}
}
