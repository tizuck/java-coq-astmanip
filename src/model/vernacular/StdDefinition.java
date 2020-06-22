package model.vernacular;

import coqparser.prettyprint.PrettyPrintConfiguration;
import coqparser.prettyprint.PrettyPrintContext;
import coqparser.prettyprint.toplevel.PrettyPrintCoqFragmentVisitor;
import model.term.Term;
import model.term.utilities.Binder;
import model.term.utilities.Ident;
import model.visitor.toplevel.CoqFragmentVisitor;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class StdDefinition extends Definition {

	private boolean isLocal;

	public StdDefinition(Ident id, Optional<List<Binder>> oBinders, Optional<Term> oBindTerm, Term term, boolean isLocal) {
		super(id, oBinders, oBindTerm, term);
		this.isLocal = isLocal;
	}

	public boolean isLocal() {
		return isLocal;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass())return false;
		if (!super.equals(o))return false;
		StdDefinition that = (StdDefinition) o;
		return isLocal == that.isLocal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), isLocal);
	}

	@Override
	public String toString() {
		return this.accept(new PrettyPrintCoqFragmentVisitor(PrettyPrintConfiguration.fromIndentType(PrettyPrintConfiguration.IndentType.TABS)),
				new PrettyPrintContext(0,PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
	}

	@Override
	public <R, P> R accept(CoqFragmentVisitor<R,P> coqFragmentVisitor, P p) {
		return coqFragmentVisitor.visit(this,p);
	}
}
