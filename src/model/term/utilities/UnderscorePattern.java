package model.term.utilities;

import model.visitor.term.PatternVisitor;

public class UnderscorePattern implements SinglePattern {

    public UnderscorePattern() {
    }


    @Override
    public boolean equals(Object obj) {
        return obj instanceof UnderscorePattern;
    }

    @Override
    public <R, P> R accept(PatternVisitor<R, P> patternVisitor, P p) {
        return patternVisitor.visit(this,p);
    }
}
