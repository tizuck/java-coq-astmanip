package model.tactics.atomic.utilities;

import model.term.utilities.Ident;

import java.util.Objects;
import java.util.Optional;

public class FirstGoalOccurencesBody {

	private Ident id;

	private Optional<AtOccurences> oAtOccurences;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		FirstGoalOccurencesBody that = (FirstGoalOccurencesBody) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(oAtOccurences, that.oAtOccurences);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, oAtOccurences);
	}

	public FirstGoalOccurencesBody(Ident id, Optional<AtOccurences> oAtOccurences) {
		this.id = id;
		this.oAtOccurences = oAtOccurences;
	}
}
