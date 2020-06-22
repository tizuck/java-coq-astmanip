package model.tactics.atomic.utilities;

import model.visitor.atomic.IntroPatternVisitor;

public class StarIntroPattern implements IntroPattern {

    public StarIntroPattern() {
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof StarIntroPattern;
    }

    @Override
    public <R, P> R accept(IntroPatternVisitor<R, P> introPatternVisitor, P p) {
        return introPatternVisitor.visit(this,p);
    }
}
