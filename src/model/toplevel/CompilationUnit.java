package model.toplevel;

import model.visitor.toplevel.CoqFileVisitor;

import java.util.List;
import java.util.Objects;

public class CompilationUnit {

	private List<CoqFragment> coqFragments;

	public CompilationUnit(List<CoqFragment> coqFragments) {
		this.coqFragments = coqFragments;
	}

	public List<CoqFragment> getCoqFragments() {
		return coqFragments;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CompilationUnit that = (CompilationUnit) o;
		return Objects.equals(coqFragments, that.coqFragments);
	}

	@Override
	public int hashCode() {
		return Objects.hash(coqFragments);
	}

	public <R,P> R accept(CoqFileVisitor<R,P> coqFileVisitor, P p){
		return coqFileVisitor.visit(this,p);
	}
}
