package model.tactics.expr.utilities;

import model.visitor.expr.SelectorBodyVisitor;

public class SingleSelectorBody extends SelectorBody {

    public SingleSelectorBody(int value) {
        super( value);
    }

    @Override
    <R, P> R accept(SelectorBodyVisitor<R, P> selectorBodyVisitor, P p) {
        return selectorBodyVisitor.visit(this,p);
    }
}
