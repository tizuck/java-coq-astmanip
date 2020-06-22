package model.term;

import model.term.utilities.CoFixBody;
import model.visitor.term.TermVisitor;

import java.util.Objects;

public class CofixLet extends LetTerm {

	private CoFixBody coFixBody;


	public CofixLet(Term term, CoFixBody coFixBody) {
		super(term);
		this.coFixBody = coFixBody;
	}

	public CoFixBody getCoFixBody() {
		return coFixBody;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CofixLet cofixLet = (CofixLet) o;
		return Objects.equals(coFixBody, cofixLet.coFixBody);
	}

	@Override
	public int hashCode() {
		return Objects.hash(coFixBody);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
