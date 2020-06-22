package model.term.utilities;

import model.term.Qualid;
import model.visitor.term.PatternVisitor;

import java.util.List;
import java.util.Objects;

public class AtDefMultiplePattern implements MultiplePattern {

    private List<Pattern> pattern;

    private Qualid qualid;

    public AtDefMultiplePattern( Qualid qualid, List<Pattern> pattern) {
        this.pattern = pattern;
        this.qualid = qualid;
    }

    public List<Pattern> getPattern() {
        return pattern;
    }

    public Qualid getQualid() {
        return qualid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AtDefMultiplePattern that = (AtDefMultiplePattern) o;
        return Objects.equals(pattern, that.pattern) &&
                Objects.equals(qualid, that.qualid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pattern, qualid);
    }

    @Override
    public <R, P> R accept(PatternVisitor<R, P> patternVisitor, P p) {
        return patternVisitor.visit(this,p);
    }
}
