package model.term.utilities;

import model.visitor.term.PatternVisitor;

public interface Pattern {
    <R,P> R accept(PatternVisitor<R,P> patternVisitor,P p);
}
