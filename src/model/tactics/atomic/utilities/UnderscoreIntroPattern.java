package model.tactics.atomic.utilities;

import model.visitor.atomic.IntroPatternVisitor;

public class UnderscoreIntroPattern implements IntroPattern {

    public UnderscoreIntroPattern() {
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof UnderscoreIntroPattern;
    }

    @Override
    public <R, P> R accept(IntroPatternVisitor<R, P> introPatternVisitor, P p) {
        return introPatternVisitor.visit(this,p);
    }
}
