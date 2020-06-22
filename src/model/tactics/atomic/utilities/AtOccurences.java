package model.tactics.atomic.utilities;

import java.util.Objects;

public class AtOccurences {

	private Occurences occurences;

	public AtOccurences(Occurences occurences) {
		this.occurences = occurences;
	}

	public Occurences getOccurences() {
		return occurences;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		AtOccurences that = (AtOccurences) o;
		return Objects.equals(occurences, that.occurences);
	}

	@Override
	public int hashCode() {
		return Objects.hash(occurences);
	}
}
