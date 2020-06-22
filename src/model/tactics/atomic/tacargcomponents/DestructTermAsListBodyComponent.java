package model.tactics.atomic.tacargcomponents;

import model.tactics.atomic.utilities.DisjConjIntroPattern;
import model.term.Term;
import model.visitor.atomic.TacArgComponentVisitor;

import java.util.Objects;

public class DestructTermAsListBodyComponent extends TacArgComponent {
    private Term term;

    private DisjConjIntroPattern disjConjIntroPattern;


    public DestructTermAsListBodyComponent(Term term, DisjConjIntroPattern disjConjIntroPattern) {
        this.term = term;
        this.disjConjIntroPattern = disjConjIntroPattern;
    }

    public DestructTermAsListBodyComponent(ComponentType componentType, Term term, DisjConjIntroPattern disjConjIntroPattern) {
        super(componentType);
        this.term = term;
        this.disjConjIntroPattern = disjConjIntroPattern;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DestructTermAsListBodyComponent that = (DestructTermAsListBodyComponent) o;
        return Objects.equals(term, that.term) &&
                Objects.equals(disjConjIntroPattern, that.disjConjIntroPattern);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), term, disjConjIntroPattern);
    }

    @Override
    public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
        return tacArgComponentVisitor.visit(this,p);
    }
}
