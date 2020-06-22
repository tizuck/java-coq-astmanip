package model.term;

import model.visitor.term.TermVisitor;

import java.util.Objects;

public class SumBoolSpecif extends SpecifTerm {

    private Term term2;

    public SumBoolSpecif(Term term1, Term term2) {
        super(term1);
        this.term2 = term2;
    }

    public Term getTerm2() {
        return term2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SumBoolSpecif that = (SumBoolSpecif) o;
        return Objects.equals(term2, that.term2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), term2);
    }

    @Override
    public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
        return termVisitor.visit(this,p);
    }
}
