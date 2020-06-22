package model.vernacular;

import model.term.utilities.CoFixBody;
import model.vernacular.utilities.WhereClause;
import model.visitor.toplevel.CoqFragmentVisitor;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CoFixPoint extends Fixpoint {

	private List<CoFixBody> coFixBodies;


	public CoFixPoint(Optional<WhereClause> optionalWhereClause, List<CoFixBody> coFixBodies) {
		super(optionalWhereClause);
		this.coFixBodies = coFixBodies;
	}

	public List<CoFixBody> getCoFixBodies() {
		return coFixBodies;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CoFixPoint that = (CoFixPoint) o;
		return Objects.equals(coFixBodies, that.coFixBodies);
	}

	@Override
	public int hashCode() {
		return Objects.hash(coFixBodies);
	}

	@Override
	public <R, P> R accept(CoqFragmentVisitor<R,P> coqFragmentVisitor, P p) {
		return coqFragmentVisitor.visit(this,p);
	}
}
