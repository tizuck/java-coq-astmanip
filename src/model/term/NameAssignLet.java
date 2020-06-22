package model.term;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import model.term.utilities.DepRetType;
import model.term.utilities.Name;
import model.visitor.term.TermVisitor;

/**
 * <p> Model Refering rule {@code 'let' '(' (name)? (',' name)* ')' (dep_ret_type)? ':=' model.term 'in' name_assign_term} </p>
 *
 * <p> {@code '(' (name)? (',' name)* ')'} refers Member {@code oNames  }</p>
 *
 * <p> {@code (dep_ret_type)?} refers Member {@code oDepRetType }</p>
 *
 * <p> {@code model.term} refers Member {@code term1}</p>
 *
 * <p> {@code name_assign_term} refers Member {@code super.model.term}</p>
 */
public class NameAssignLet extends LetTerm {

	private Optional<List<Name>> oNames;

	private Optional<DepRetType> oDepRetType;

	private Term term1;

	public NameAssignLet(Term term, Term term1, Optional<List<Name>> oNames, Optional<DepRetType> oDepRetType) {
		super(term);
		this.oNames = oNames;
		this.oDepRetType = oDepRetType;
		this.term1 = term1;
	}

	public Optional<List<Name>> getoNames() {
		return oNames;
	}

	public Optional<DepRetType> getoDepRetType() {
		return oDepRetType;
	}

	public Term getTerm1() {
		return term1;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		NameAssignLet that = (NameAssignLet) o;
		return Objects.equals(oNames, that.oNames) &&
				Objects.equals(oDepRetType, that.oDepRetType) &&
				Objects.equals(term1, that.term1);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), oNames, oDepRetType, term1);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
