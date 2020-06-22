package model.vernacular.utilities;

import model.term.utilities.Binder;
import model.term.utilities.Ident;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import model.term.Term;

public class IndBodyAllocElement {

	private Ident id;

	private Optional<List<Binder>> oBinders;

	private Optional<Term> oTerm;



	public IndBodyAllocElement(Ident id, Optional<List<Binder>> oBinders, Optional<Term> oTerm) {
		this.id = id;
		this.oBinders = oBinders;
		this.oTerm = oTerm;
	}

	public Ident getId() {
		return id;
	}

	public Optional<List<Binder>> getoBinders() {
		return oBinders;
	}

	public Optional<Term> getoTerm() {
		return oTerm;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		IndBodyAllocElement that = (IndBodyAllocElement) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(oBinders, that.oBinders) &&
				Objects.equals(oTerm, that.oTerm);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, oBinders, oTerm);
	}
}
