package model.vernacular.utilities;

import model.term.utilities.Binder;
import model.term.utilities.Ident;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import model.term.Term;

public class IndBody {

	private Ident id;

	private Optional<List<Binder>> oBinders;

	private Optional<Term> oTerm;

	private Optional<IndBodyAlloc> optionalIndBodyAlloc;


	public IndBody(Ident id, Optional<List<Binder>> oBinders, Optional<Term> oTerm, Optional<IndBodyAlloc> optionalIndBodyAlloc) {
		this.id = id;
		this.oBinders = oBinders;
		this.oTerm = oTerm;
		this.optionalIndBodyAlloc = optionalIndBodyAlloc;
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

	public Optional<IndBodyAlloc> getOptionalIndBodyAlloc() {
		return optionalIndBodyAlloc;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		IndBody indBody = (IndBody) o;
		return Objects.equals(id, indBody.id) &&
				Objects.equals(oBinders, indBody.oBinders) &&
				Objects.equals(oTerm, indBody.oTerm) &&
				Objects.equals(optionalIndBodyAlloc, indBody.optionalIndBodyAlloc);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, oBinders, oTerm, optionalIndBodyAlloc);
	}
}
