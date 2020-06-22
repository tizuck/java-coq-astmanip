package model.term;

import model.term.utilities.Pattern;
import model.term.utilities.ReturnType;
import model.visitor.term.TermVisitor;

import java.util.Objects;
import java.util.Optional;

public class PatternAssignLet extends LetTerm {

	private Pattern pattern;

	private Optional<Term> oTerm;

	private Term term1;

	private Optional<ReturnType> oReturnType;

	public PatternAssignLet(Term term, Pattern pattern, Optional<Term> oTerm, Term term1, Optional<ReturnType> oReturnType) {
		super(term);
		this.pattern = pattern;
		this.oTerm = oTerm;
		this.term1 = term1;
		this.oReturnType = oReturnType;
	}

	public Pattern getPattern() {
		return pattern;
	}

	public Optional<Term> getoTerm() {
		return oTerm;
	}

	public Term getTerm1() {
		return term1;
	}

	public Optional<ReturnType> getoReturnType() {
		return oReturnType;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		PatternAssignLet that = (PatternAssignLet) o;
		return Objects.equals(pattern, that.pattern) &&
				Objects.equals(oTerm, that.oTerm) &&
				Objects.equals(term1, that.term1) &&
				Objects.equals(oReturnType, that.oReturnType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), pattern, oTerm, term1, oReturnType);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
