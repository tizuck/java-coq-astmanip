package model.term.utilities;

import model.term.Term;
import model.visitor.term.BinderVisitor;

import java.util.Objects;
import java.util.Optional;

public class BracedNameBinder implements Binder {
    Name name;
    Optional<Term> oTerm;
    Term term;

    public BracedNameBinder(Name name, Optional<Term> oTerm, Term term) {
        this.name = name;
        this.oTerm = oTerm;
        this.term = term;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BracedNameBinder that = (BracedNameBinder) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(oTerm, that.oTerm) &&
                Objects.equals(term, that.term);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, oTerm, term);
    }

    @Override
    public <R, P> R accept(BinderVisitor<R,P> binderVisitor, P p) {
        return binderVisitor.visit(this,p);
    }

    public Name getName() {
        return name;
    }

    public Optional<Term> getoTerm() {
        return oTerm;
    }

    public Term getTerm() {
        return term;
    }
}
