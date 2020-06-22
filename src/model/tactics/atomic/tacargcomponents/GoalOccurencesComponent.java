package model.tactics.atomic.tacargcomponents;

import model.tactics.atomic.utilities.GoalOccurences;
import model.visitor.atomic.TacArgComponentVisitor;

import java.util.Objects;

public class GoalOccurencesComponent extends TacArgComponent {

	private GoalOccurences goalOccurences;

	public GoalOccurencesComponent(GoalOccurences goalOccurences) {
		this.goalOccurences = goalOccurences;
	}

	public GoalOccurencesComponent(ComponentType componentType, GoalOccurences goalOccurences) {
		super(componentType);
		this.goalOccurences = goalOccurences;
	}

	public GoalOccurences getGoalOccurences() {
		return goalOccurences;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		GoalOccurencesComponent that = (GoalOccurencesComponent) o;
		return Objects.equals(goalOccurences, that.goalOccurences);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), goalOccurences);
	}

	@Override
	public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
		return tacArgComponentVisitor.visit(this,p);
	}
}
