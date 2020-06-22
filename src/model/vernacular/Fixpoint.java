package model.vernacular;

import model.vernacular.utilities.WhereClause;

import java.util.Objects;
import java.util.Optional;

public abstract class Fixpoint implements Sentence {
    private Optional<WhereClause> optionalWhereClause;

    public Optional<WhereClause> getOptionalWhereClause() {
        return optionalWhereClause;
    }

    public Fixpoint(Optional<WhereClause> optionalWhereClause) {
        this.optionalWhereClause = optionalWhereClause;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fixpoint fixpoint = (Fixpoint) o;
        return Objects.equals(optionalWhereClause, fixpoint.optionalWhereClause);
    }

    @Override
    public int hashCode() {
        return Objects.hash(optionalWhereClause);
    }
}
