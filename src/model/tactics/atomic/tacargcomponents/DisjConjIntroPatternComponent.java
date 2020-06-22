package model.tactics.atomic.tacargcomponents;

import model.tactics.atomic.utilities.DisjConjIntroPattern;
import model.visitor.atomic.TacArgComponentVisitor;

import java.util.Objects;

public class DisjConjIntroPatternComponent extends TacArgComponent {

    private DisjConjIntroPattern disjConjIntroPattern;

    public DisjConjIntroPatternComponent(DisjConjIntroPattern disjConjIntroPattern) {
        this.disjConjIntroPattern = disjConjIntroPattern;
    }

    public DisjConjIntroPatternComponent(ComponentType componentType, DisjConjIntroPattern disjConjIntroPattern) {
        super(componentType);
        this.disjConjIntroPattern = disjConjIntroPattern;
    }

    public DisjConjIntroPattern getDisjConjIntroPattern() {
        return disjConjIntroPattern;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DisjConjIntroPatternComponent that = (DisjConjIntroPatternComponent) o;
        return Objects.equals(disjConjIntroPattern, that.disjConjIntroPattern);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), disjConjIntroPattern);
    }

    @Override
    public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
        return tacArgComponentVisitor.visit(this,p);
    }
}
