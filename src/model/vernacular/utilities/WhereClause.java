package model.vernacular.utilities;

import model.term.Term;
import model.term.utilities.Ident;

import java.util.Objects;

public class WhereClause {

    private String name;

    private Term term;

    private Ident id;


    public WhereClause(String name, Term term, Ident id) {
        this.name = name;
        this.term = term;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Term getTerm() {
        return term;
    }

    public Ident getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WhereClause that = (WhereClause) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(term, that.term) &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, term, id);
    }
}
