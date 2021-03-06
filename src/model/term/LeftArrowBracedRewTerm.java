package model.term;

import model.visitor.term.TermVisitor;

public class LeftArrowBracedRewTerm extends BracedRewTerm {

    public LeftArrowBracedRewTerm(Term term1, Term term2, Term term3) {
        super(term1, term2, term3);
    }



    @Override
    public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
        return termVisitor.visit(this,p);
    }
}
