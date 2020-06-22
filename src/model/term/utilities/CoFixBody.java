package model.term.utilities;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import model.term.Term;

public class CoFixBody {

	private Ident id;

	private Optional<List<Binder>> oBinders;

	private Optional<Term> oTerm;

	private Term assocTerm;

	public CoFixBody(Ident id, Optional<List<Binder>> oBinders, Optional<Term> oTerm, Term assocTerm) {
		this.id = id;
		this.oBinders = oBinders;
		this.oTerm = oTerm;
		this.assocTerm = assocTerm;
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

	public Term getAssocTerm() {
		return assocTerm;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CoFixBody coFixBody = (CoFixBody) o;
		return Objects.equals(id, coFixBody.id) &&
				Objects.equals(oBinders, coFixBody.oBinders) &&
				Objects.equals(oTerm, coFixBody.oTerm) &&
				Objects.equals(assocTerm, coFixBody.assocTerm);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, oBinders, oTerm, assocTerm);
	}
}
