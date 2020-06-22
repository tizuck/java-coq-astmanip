package model.tactics.atomic.tacargcomponents;

import model.tactics.atomic.utilities.IntroPatternList;
import model.visitor.atomic.TacArgComponentVisitor;

import java.util.Objects;

public class IntroPatternListComponent extends TacArgComponent {

    private IntroPatternList introPatternList;

    public IntroPatternListComponent(IntroPatternList introPatternList) {
        this.introPatternList = introPatternList;
    }

    public IntroPatternListComponent(ComponentType componentType, IntroPatternList introPatternList) {
        super(componentType);
        this.introPatternList = introPatternList;
    }

    public IntroPatternList getIntroPatternList() {
        return introPatternList;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        IntroPatternListComponent that = (IntroPatternListComponent) o;
        return Objects.equals(introPatternList, that.introPatternList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), introPatternList);
    }

    @Override
    public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
        return tacArgComponentVisitor.visit(this,p);
    }
}
