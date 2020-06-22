package model.term;

import model.visitor.term.TermVisitor;

public interface Term {
    <R,P> R  accept(TermVisitor<R,P> termVisitor, P p);

}
