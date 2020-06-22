package model.term.utilities;

import java.util.List;
import java.util.Objects;

public class OrPattern {

	private List<Pattern> pattern;

	public List<Pattern> getPattern() {
		return pattern;
	}

	public OrPattern(List<Pattern> pattern) {
		this.pattern = pattern;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		OrPattern orPattern = (OrPattern) o;
		return Objects.equals(pattern, orPattern.pattern);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pattern);
	}
}
