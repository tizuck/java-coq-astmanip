package model.term.utilities;

import model.visitor.term.PatternVisitor;

import java.util.Objects;

public class BracedPattern implements Pattern{

    private Pattern pattern;


    public BracedPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public Pattern getPattern() {
        return pattern;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BracedPattern that = (BracedPattern) o;
        return Objects.equals(pattern, that.pattern);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pattern);
    }

    @Override
    public <R, P> R accept(PatternVisitor<R, P> patternVisitor, P p) {
        return patternVisitor.visit(this,p);
    }
}
