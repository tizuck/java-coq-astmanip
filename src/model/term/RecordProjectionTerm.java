package model.term;

import model.visitor.term.TermVisitor;

import java.util.Objects;

public class RecordProjectionTerm implements Term {

	private Term term;

	private Qualid qualid;

	public RecordProjectionTerm(Term term, Qualid qualid) {
		this.term = term;
		this.qualid = qualid;
	}

	public Term getTerm() {
		return term;
	}

	public Qualid getQualid() {
		return qualid;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		RecordProjectionTerm that = (RecordProjectionTerm) o;
		return Objects.equals(term, that.term) &&
				Objects.equals(qualid, that.qualid);
	}

	@Override
	public int hashCode() {
		return Objects.hash(term, qualid);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
