package model.term.utilities;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import model.term.Term;

public class FieldDef {

	private Name name;

	private Optional<List<Binder>> oBinders;

	private Term term;

	public FieldDef(Name name, Optional<List<Binder>> oBinders, Term term) {
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
		FieldDef fieldDef = (FieldDef) o;
		return Objects.equals(name, fieldDef.name) &&
				Objects.equals(oBinders, fieldDef.oBinders) &&
				Objects.equals(term, fieldDef.term);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, oBinders, term);
	}
}
