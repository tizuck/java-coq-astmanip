package model.term.utilities;

import java.util.List;
import java.util.Objects;

import model.term.Term;

public class Equation {

	private List<List<Pattern>> pattern;

	private Term term;

	public Equation(List<List<Pattern>> pattern, Term term) {
		this.pattern = pattern;
		this.term = term;
	}

	public List<List<Pattern>> getPattern() {
		return pattern;
	}

	public Term getTerm() {
		return term;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Equation equation = (Equation) o;
		return Objects.equals(pattern, equation.pattern) &&
				Objects.equals(term, equation.term);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pattern, term);
	}
}
