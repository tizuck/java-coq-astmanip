package model.tactics.atomic.utilities;

import model.term.utilities.Ident;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class GoalOccurences {

	private Ident id;

	private Optional<AtOccurences> oAtAoccurences;

	private Optional<List<FirstGoalOccurencesBody>> ofirstGoalOccurencesBody;

	private Optional<SecondGoalOccurencesBody> oSecondGOalOccurencesBody;

	public GoalOccurences(Ident id, Optional<AtOccurences> oAtAoccurences, Optional<List<FirstGoalOccurencesBody>> ofirstGoalOccurencesBody, Optional<SecondGoalOccurencesBody> oSecondGOalOccurencesBody) {
		this.id = id;
		this.oAtAoccurences = oAtAoccurences;
		this.ofirstGoalOccurencesBody = ofirstGoalOccurencesBody;
		this.oSecondGOalOccurencesBody = oSecondGOalOccurencesBody;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		GoalOccurences that = (GoalOccurences) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(oAtAoccurences, that.oAtAoccurences) &&
				Objects.equals(ofirstGoalOccurencesBody, that.ofirstGoalOccurencesBody) &&
				Objects.equals(oSecondGOalOccurencesBody, that.oSecondGOalOccurencesBody);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, oAtAoccurences, ofirstGoalOccurencesBody, oSecondGOalOccurencesBody);
	}

	public Ident getId() {
		return id;
	}

	public Optional<AtOccurences> getoAtAoccurences() {
		return oAtAoccurences;
	}

	public Optional<List<FirstGoalOccurencesBody>> getOfirstGoalOccurencesBody() {
		return ofirstGoalOccurencesBody;
	}

	public Optional<SecondGoalOccurencesBody> getoSecondGOalOccurencesBody() {
		return oSecondGOalOccurencesBody;
	}
}
