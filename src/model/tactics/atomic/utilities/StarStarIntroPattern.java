package model.tactics.atomic.utilities;


import model.visitor.atomic.IntroPatternVisitor;

public class StarStarIntroPattern implements IntroPattern {

    public StarStarIntroPattern() {
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof StarStarIntroPattern;
    }

    @Override
    public <R, P> R accept(IntroPatternVisitor<R, P> introPatternVisitor, P p) {
        return introPatternVisitor.visit(this,p);
    }
}
