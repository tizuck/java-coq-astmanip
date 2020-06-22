package model.vernacular.utilities;

import model.term.Term;
import model.term.utilities.Binder;
import model.term.utilities.Name;
import model.visitor.vernacular.FieldVisitor;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class DefField extends Field {

	private Optional<Term> oTerm;

	public DefField(Name name, Optional<List<Binder>> oBinders, Term term, Optional<Term> oTerm) {
		super(name, oBinders, term);
		this.oTerm = oTerm;
	}

	public Optional<Term> getoTerm() {
		return oTerm;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		DefField defField = (DefField) o;
		return Objects.equals(oTerm, defField.oTerm);
	}

	@Override
	public int hashCode() {
		return Objects.hash(oTerm);
	}

	public <R,P> R accept(FieldVisitor<R,P> fieldVisitor, P p){
		return fieldVisitor.visit(this,p);
	}
}
