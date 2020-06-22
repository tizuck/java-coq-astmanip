package model.term.utilities;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import model.term.Term;

public class FixBody {

	private Ident id;

	private List<Binder> binders;

	private Optional<Annotation> oAnnotation;

	private Optional<Term> oTerm;

	private Term term;

	public FixBody(Ident id, List<Binder> binders, Optional<Annotation> oAnnotation, Optional<Term> oTerm, Term term) {
		this.id = id;
		this.binders = binders;
		this.oAnnotation = oAnnotation;
		this.oTerm = oTerm;
		this.term = term;
	}

	public Ident getId() {
		return id;
	}

	public List<Binder> getBinders() {
		return binders;
	}

	public Optional<Annotation> getoAnnotation() {
		return oAnnotation;
	}

	public Optional<Term> getoTerm() {
		return oTerm;
	}

	public Term getTerm() {
		return term;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		FixBody fixBody = (FixBody) o;
		return Objects.equals(id, fixBody.id) &&
				Objects.equals(binders, fixBody.binders) &&
				Objects.equals(oAnnotation, fixBody.oAnnotation) &&
				Objects.equals(oTerm, fixBody.oTerm) &&
				Objects.equals(term, fixBody.term);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, binders, oAnnotation, oTerm, term);
	}
}
