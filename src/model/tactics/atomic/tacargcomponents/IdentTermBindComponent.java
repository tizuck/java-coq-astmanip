package model.tactics.atomic.tacargcomponents;

import model.term.Term;
import model.term.utilities.Ident;
import model.visitor.atomic.TacArgComponentVisitor;

import java.util.Objects;

public class IdentTermBindComponent extends TacArgComponent {

    private Ident ident;

    private Term term;

    public IdentTermBindComponent(Ident ident, Term term) {
        this.ident = ident;
        this.term = term;
    }

    public IdentTermBindComponent(ComponentType componentType, Ident ident, Term term) {
        super(componentType);
        this.ident = ident;
        this.term = term;
    }

    public Ident getIdent() {
        return ident;
    }

    public Term getTerm() {
        return term;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        IdentTermBindComponent that = (IdentTermBindComponent) o;
        return Objects.equals(ident, that.ident) &&
                Objects.equals(term, that.term);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ident, term);
    }

    @Override
    public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
        return tacArgComponentVisitor.visit(this,p);
    }
}
