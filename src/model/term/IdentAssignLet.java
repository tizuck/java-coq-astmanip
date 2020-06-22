package model.term;

import model.term.utilities.Binder;
import model.term.utilities.Ident;
import model.visitor.term.TermVisitor;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * <p> Model Refering rule {@code 'let' ident   (binders)? (':' model.term)? ':=' model.term 'in' ident_assign_term} </p>
 *
 * <p> {@code ident} refers Member {@code ident} </p>
 *
 * <p> {@code (binders)?} refers Member {@code oBinders  }</p>
 *
 * <p> {@code (':' model.term)?} refers Member {@code oTerm }</p>
 *
 * <p> {@code model.term} refers Member {@code term1}</p>
 *
 * <p> {@code ident_assign_term} refers Member {@code super.model.term}</p>
 */
public class IdentAssignLet extends LetTerm {


	private Ident id;

	private Optional<List<Binder>> oBinders;

	private Optional<Term> oTerm;

	private Term term1;

	public IdentAssignLet(Ident ident, Term term, Optional<List<Binder>> oBinders, Optional<Term> oTerm, Term term1) {
		super(term);
		this.oBinders = oBinders;
		this.oTerm = oTerm;
		this.term1 = term1;
		this.id = id;
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

	public Term getTerm1() {
		return term1;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		IdentAssignLet that = (IdentAssignLet) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(oBinders, that.oBinders) &&
				Objects.equals(oTerm, that.oTerm) &&
				Objects.equals(term1, that.term1);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, oBinders, oTerm, term1);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
