package model.vernacular;

import model.term.utilities.Binder;
import model.vernacular.utilities.Field;
import model.vernacular.utilities.RecordKeywordType;
import model.term.utilities.Ident;

import java.util.Objects;
import java.util.Optional;
import model.term.Sort;
import model.visitor.toplevel.CoqFragmentVisitor;

import java.util.List;

public class Record implements Sentence {

	private RecordKeywordType recordKeyword;

	private Ident id;

	private Optional<List<Binder>> oBinders;

	private Optional<Sort> oSort;

	private Optional<Ident> oId;

	private Optional<List<Field>> fieldList;


	public Record(RecordKeywordType recordKeyword, Ident id, Optional<List<Binder>> oBinders, Optional<Sort> oSort, Optional<Ident> oId, Optional<List<Field>> fieldList) {
		this.recordKeyword = recordKeyword;
		this.id = id;
		this.oBinders = oBinders;
		this.oSort = oSort;
		this.oId = oId;
		this.fieldList = fieldList;
	}

	public RecordKeywordType getRecordKeyword() {
		return recordKeyword;
	}

	public Ident getId() {
		return id;
	}

	public Optional<List<Binder>> getoBinders() {
		return oBinders;
	}

	public Optional<Sort> getoSort() {
		return oSort;
	}

	public Optional<Ident> getoId() {
		return oId;
	}

	public Optional<List<Field>> getFieldList() {
		return fieldList;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Record record = (Record) o;
		return recordKeyword == record.recordKeyword &&
				Objects.equals(id, record.id) &&
				Objects.equals(oBinders, record.oBinders) &&
				Objects.equals(oSort, record.oSort) &&
				Objects.equals(oId, record.oId) &&
				Objects.equals(fieldList, record.fieldList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(recordKeyword, id, oBinders, oSort, oId, fieldList);
	}

	@Override
	public <R, P> R accept(CoqFragmentVisitor<R,P> coqFragmentVisitor, P p) {
		return coqFragmentVisitor.visit(this,p);
	}
}
