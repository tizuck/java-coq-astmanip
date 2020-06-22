package model.vernacular;

import model.vernacular.utilities.AssumptionKeywordType;
import model.vernacular.utilities.Assums;
import model.visitor.toplevel.CoqFragmentVisitor;

import java.util.List;
import java.util.Objects;

public class Assumption implements Sentence {

	private AssumptionKeywordType assumptionKeyword;

	private List<Assums> assumsList;

	public Assumption(AssumptionKeywordType assumptionKeyword, List<Assums> assumsList) {
		this.assumptionKeyword = assumptionKeyword;
		this.assumsList = assumsList;
	}

	public AssumptionKeywordType getAssumptionKeyword() {
		return assumptionKeyword;
	}

	public List<Assums> getAssumsList() {
		return assumsList;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Assumption that = (Assumption) o;
		return assumptionKeyword == that.assumptionKeyword &&
				Objects.equals(assumsList, that.assumsList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(assumptionKeyword, assumsList);
	}

	@Override
	public <R, P> R accept(CoqFragmentVisitor<R,P> coqFragmentVisitor, P p) {
		return coqFragmentVisitor.visit(this,p);
	}


}
