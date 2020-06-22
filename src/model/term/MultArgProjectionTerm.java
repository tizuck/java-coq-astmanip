package model.term;

import model.visitor.term.TermVisitor;

import java.util.List;
import java.util.Objects;

public class MultArgProjectionTerm extends RecordProjectionTerm {

	private List<Term> args;

	public MultArgProjectionTerm(Term term, Qualid qualid, List<Term> args) {
		super(term, qualid);
		this.args = args;
	}

	public List<Term> getArgs() {
		return args;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		MultArgProjectionTerm that = (MultArgProjectionTerm) o;
		return Objects.equals(args, that.args);
	}

	@Override
	public int hashCode() {
		return Objects.hash(args);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
