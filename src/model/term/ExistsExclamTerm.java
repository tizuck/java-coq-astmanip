package model.term;

import model.term.utilities.Ident;
import model.visitor.term.TermVisitor;

import java.util.List;
import java.util.Objects;

public class ExistsExclamTerm implements Term {
    List<Ident> ids;
    Term term;

    public ExistsExclamTerm(List<Ident> ids, Term term) {
        this.ids = ids;
        this.term = term;
    }

    public List<Ident> getIds() {
        return ids;
    }

    public Term getTerm() {
        return term;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExistsExclamTerm that = (ExistsExclamTerm) o;
        return Objects.equals(ids, that.ids) &&
                Objects.equals(term, that.term);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids, term);
    }

    @Override
    public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
        return termVisitor.visit(this,p);
    }
}
