package model.tactics.atomic.tacargcomponents;

import model.tactics.atomic.utilities.IntroPattern;
import model.visitor.atomic.TacArgComponentVisitor;

import java.util.List;
import java.util.Objects;

public class ListOfIntroPatternComponent extends TacArgComponent {

    private List<IntroPattern> introPatterns;


    public ListOfIntroPatternComponent(List<IntroPattern> introPatterns) {
        this.introPatterns = introPatterns;
    }

    public ListOfIntroPatternComponent(ComponentType componentType, List<IntroPattern> introPatterns) {
        super(componentType);
        this.introPatterns = introPatterns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ListOfIntroPatternComponent that = (ListOfIntroPatternComponent) o;
        return Objects.equals(introPatterns, that.introPatterns);
    }

    public List<IntroPattern> getIntroPatterns() {
        return introPatterns;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), introPatterns);
    }

    @Override
    public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
        return tacArgComponentVisitor.visit(this,p);
    }
}
