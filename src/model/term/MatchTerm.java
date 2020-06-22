package model.term;

import model.term.utilities.Equation;
import model.term.utilities.MatchItem;
import model.term.utilities.ReturnType;
import model.visitor.term.TermVisitor;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class MatchTerm implements Term {

	private List<MatchItem> matchItems;

	private Optional<ReturnType> oReturnType;

	private Optional<List<Equation>> oEquations;

	public MatchTerm(List<MatchItem> matchItems, Optional<ReturnType> oReturnType, Optional<List<Equation>> oEquations) {
		this.matchItems = matchItems;
		this.oReturnType = oReturnType;
		this.oEquations = oEquations;
	}

	public List<MatchItem> getMatchItems() {
		return matchItems;
	}

	public Optional<ReturnType> getoReturnType() {
		return oReturnType;
	}

	public Optional<List<Equation>> getoEquations() {
		return oEquations;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		MatchTerm matchTerm = (MatchTerm) o;
		return Objects.equals(matchItems, matchTerm.matchItems) &&
				Objects.equals(oReturnType, matchTerm.oReturnType) &&
				Objects.equals(oEquations, matchTerm.oEquations);
	}

	@Override
	public int hashCode() {
		return Objects.hash(matchItems, oReturnType, oEquations);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
