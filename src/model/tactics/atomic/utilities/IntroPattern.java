package model.tactics.atomic.utilities;

import model.visitor.atomic.IntroPatternVisitor;

public interface IntroPattern {
    <R,P> R accept(IntroPatternVisitor<R,P> introPatternVisitor,P p);
}
