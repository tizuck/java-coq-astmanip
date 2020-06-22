package model.vernacular;

import model.term.utilities.Binder;
import model.vernacular.utilities.AssertionKeywordType;
import model.term.utilities.Ident;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import model.term.Term;
import model.vernacular.utilities.Proof;
import model.visitor.toplevel.CoqFragmentVisitor;

public class Assertion implements Sentence {

	private AssertionKeywordType assertionKeyword;

	private Ident id;

	private Optional<List<Binder>> oBinders;

	private Term term;

	private Optional<Proof> oProof;

	public Assertion(AssertionKeywordType assertionKeyword, Ident id, Optional<List<Binder>> oBinders, Term term, Optional<Proof> oProof) {
		this.assertionKeyword = assertionKeyword;
		this.id = id;
		this.oBinders = oBinders;
		this.term = term;
		this.oProof = oProof;
	}

	public AssertionKeywordType getAssertionKeyword() {
		return assertionKeyword;
	}

	public Ident getId() {
		return id;
	}

	public Optional<List<Binder>> getoBinders() {
		return oBinders;
	}

	public Term getTerm() {
		return term;
	}

	public Optional<Proof> getoProof() {
		return oProof;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Assertion assertion = (Assertion) o;
		return assertionKeyword == assertion.assertionKeyword &&
				Objects.equals(id, assertion.id) &&
				Objects.equals(oBinders, assertion.oBinders) &&
				Objects.equals(term, assertion.term) &&
				Objects.equals(oProof, assertion.oProof);
	}

	@Override
	public int hashCode() {
		return Objects.hash(assertionKeyword, id, oBinders, term, oProof);
	}

	@Override
	public <R, P> R accept(CoqFragmentVisitor<R,P> coqFragmentVisitor, P p) {
		return coqFragmentVisitor.visit(this,p);
	}
}
