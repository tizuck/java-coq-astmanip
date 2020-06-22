package model.term;

import model.visitor.term.TermVisitor;

public class Underscore implements Term {

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Underscore;
    }

    @Override
    public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
        return termVisitor.visit(this,p);
    }
}
