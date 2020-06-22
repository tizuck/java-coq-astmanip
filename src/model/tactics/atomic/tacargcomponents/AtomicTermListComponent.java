package model.tactics.atomic.tacargcomponents;

import model.term.Term;
import model.visitor.atomic.TacArgComponentVisitor;

import java.util.List;

public class AtomicTermListComponent extends TacArgComponent{

    private List<Term> terms;

    public AtomicTermListComponent(List<Term> terms) {
        this.terms = terms;
    }

    public AtomicTermListComponent(ComponentType componentType, List<Term> terms) {
        super(componentType);
        this.terms = terms;
    }

    public List<Term> getTerms() {
        return terms;
    }

    @Override
    public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
        return tacArgComponentVisitor.visit(this,p);
    }
}
