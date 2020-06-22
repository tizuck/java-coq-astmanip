package model.term;

import model.visitor.term.TermVisitor;

public class RightArrowRewTerm extends RewTerm {

    public RightArrowRewTerm(Term term1, Term term2) {
        super(term1, term2);
    }

    @Override
    public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
        return termVisitor.visit(this,p);
    }
}
