package model.vernacular.utilities;

import model.term.utilities.Binder;
import model.term.utilities.Name;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import model.term.Term;
import model.visitor.vernacular.FieldVisitor;

public abstract class Field {

	private Name name;

	private Optional<List<Binder>> oBinders;

	private Term term;

	public Field(Name name, Optional<List<Binder>> oBinders, Term term) {
		this.name = name;
		this.oBinders = oBinders;
		this.term = term;
	}

	public Name getName() {
		return name;
	}

	public Optional<List<Binder>> getoBinders() {
		return oBinders;
	}

	public Term getTerm() {
		return term;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Field field = (Field) o;
		return Objects.equals(name, field.name) &&
				Objects.equals(oBinders, field.oBinders) &&
				Objects.equals(term, field.term);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, oBinders, term);
	}

	public abstract <R,P> R accept(FieldVisitor<R,P> fieldVisitor, P p);
}
