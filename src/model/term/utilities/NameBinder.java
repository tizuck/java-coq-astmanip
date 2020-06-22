package model.term.utilities;

import model.term.Term;
import model.visitor.term.BinderVisitor;

import java.util.List;
import java.util.Objects;

public class NameBinder implements Binder{
     List<Name> names;
     Term term;

    public NameBinder(List<Name> names, Term term) {
        this.names = names;
        this.term = term;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NameBinder that = (NameBinder) o;
        return Objects.equals(names, that.names) &&
                Objects.equals(term, that.term);
    }

    @Override
    public int hashCode() {
        return Objects.hash(names, term);
    }

    @Override
    public <R, P> R accept(BinderVisitor<R,P> binderVisitor, P p) {
        return binderVisitor.visit(this,p);
    }

    public List<Name> getNames() {
        return names;
    }

    public Term getTerm() {
        return term;
    }
}
