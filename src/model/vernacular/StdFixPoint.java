package model.vernacular;

import model.term.utilities.FixBody;
import model.vernacular.utilities.WhereClause;
import model.visitor.toplevel.CoqFragmentVisitor;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class StdFixPoint extends Fixpoint {

	private List<FixBody> fixBodies;


	public StdFixPoint(Optional<WhereClause> optionalWhereClause, List<FixBody> fixBodies) {
		super(optionalWhereClause);
		this.fixBodies = fixBodies;
	}

	public List<FixBody> getFixBodies() {
		return fixBodies;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		StdFixPoint that = (StdFixPoint) o;
		return Objects.equals(fixBodies, that.fixBodies);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), fixBodies);
	}

	@Override
	public <R, P> R accept(CoqFragmentVisitor<R,P> coqFragmentVisitor, P p) {
		return coqFragmentVisitor.visit(this,p);
	}
}
