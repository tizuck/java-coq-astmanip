package model.vernacular;

import model.vernacular.utilities.IndBody;
import model.vernacular.utilities.WhereClause;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public abstract class Inductive implements Sentence {

	private List<IndBody> indBodys;

	private Optional<WhereClause> whereClause;

	public List<IndBody> getIndBodys() {
		return indBodys;
	}

	public Optional<WhereClause> getWhereClause() {
		return whereClause;
	}

	public Inductive(List<IndBody> indBodys, Optional<WhereClause> whereClause) {
		this.indBodys = indBodys;
		this.whereClause = whereClause;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Inductive inductive = (Inductive) o;
		return Objects.equals(indBodys, inductive.indBodys) &&
				Objects.equals(whereClause, inductive.whereClause);
	}

	@Override
	public int hashCode() {
		return Objects.hash(indBodys, whereClause);
	}
}
