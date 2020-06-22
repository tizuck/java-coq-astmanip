package model.tactics.expr.utilities;


import model.visitor.expr.SelectorVisitor;

public interface Selector {

    <R,P> R accept(SelectorVisitor<R,P> selectorVisitor, P p);

}
