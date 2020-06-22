package model.tactics.atomic.tacargcomponents;

import model.term.Term;
import model.visitor.atomic.TacArgComponentVisitor;

import java.util.List;
import java.util.Objects;

public class TermListComponent extends TacArgComponent {

    private List<Term> terms;


    public TermListComponent(ComponentType componentType, List<Term> terms) {
        super(componentType);
        this.terms = terms;
    }

    public TermListComponent(List<Term> terms) {

        this.terms = terms;
    }

    public List<Term> getTerms() {
        return terms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TermListComponent that = (TermListComponent) o;
        return Objects.equals(terms, that.terms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), terms);
    }

    @Override
    public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
        return tacArgComponentVisitor.visit(this,p);
    }
}
