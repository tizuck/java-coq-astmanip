package model.tactics.atomic.utilities;

import java.util.Objects;
import java.util.Optional;

public class SecondGoalOccurencesBody {

	private boolean isDerived;

	private boolean hasStar;

	private Optional<AtOccurences> oAtOccurences;

	public SecondGoalOccurencesBody(boolean isDerived, boolean hasStar, Optional<AtOccurences> oAtOccurences) {
		this.isDerived = isDerived;
		this.hasStar = hasStar;
		this.oAtOccurences = oAtOccurences;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SecondGoalOccurencesBody that = (SecondGoalOccurencesBody) o;
		return isDerived == that.isDerived &&
				hasStar == that.hasStar &&
				Objects.equals(oAtOccurences, that.oAtOccurences);
	}

	@Override
	public int hashCode() {
		return Objects.hash(isDerived, hasStar, oAtOccurences);
	}
}
