package model.term;

import model.term.utilities.FieldDef;
import model.visitor.term.TermVisitor;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class RecordTerm implements Term {

	private Optional<List<FieldDef>> oFieldDefs;

	public RecordTerm(Optional<List<FieldDef>> oFieldDefs) {
		this.oFieldDefs = oFieldDefs;
	}

	public Optional<List<FieldDef>> getoFieldDefs() {
		return oFieldDefs;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		RecordTerm that = (RecordTerm) o;
		return Objects.equals(oFieldDefs, that.oFieldDefs);
	}

	@Override
	public int hashCode() {
		return Objects.hash(oFieldDefs);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
