package model.tactics.atomic.tacargcomponents;

import model.term.Term;
import model.term.utilities.Ident;
import model.visitor.atomic.TacArgComponentVisitor;

public class IdentTermComponent extends TacArgComponent {

    private Ident ident;

    private Term term;

    public IdentTermComponent(Ident ident, Term term) {
        this.ident = ident;
        this.term = term;
    }

    public IdentTermComponent(ComponentType componentType, Ident ident, Term term) {
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
    public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
        return tacArgComponentVisitor.visit(this,p);
    }
}
