package model.term;

import model.term.utilities.Ident;
import model.visitor.term.TermVisitor;

import java.util.Objects;

public class ArgTerm implements Term {
    private Ident id;
    private Term term;

    public ArgTerm(Ident id, Term term) {
        this.id = id;
        this.term = term;
    }

    public Ident getId() {
        return id;
    }

    public Term getTerm() {
        return term;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArgTerm argTerm = (ArgTerm) o;
        return Objects.equals(id, argTerm.id) &&
                Objects.equals(term, argTerm.term);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, term);
    }

    @Override
    public String toString() {
        return id.toString() + " := " + term.toString();
    }

    @Override
    public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
        return termVisitor.visit(this,p);
    }
}
