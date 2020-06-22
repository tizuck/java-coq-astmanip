package model.tactics.atomic.utilities;

import model.visitor.atomic.IntroPatternVisitor;

public class OrEqualIntroPattern implements EqualIntroPattern {

    public OrEqualIntroPattern() {
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof OrEqualIntroPattern;
    }

    @Override
    public <R, P> R accept(IntroPatternVisitor<R, P> introPatternVisitor, P p) {
        return introPatternVisitor.visit(this,p);
    }
}
