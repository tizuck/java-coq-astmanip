package model.visitor.expr;

import model.tactics.expr.utilities.IdentSelector;
import model.tactics.expr.utilities.SelectorBodySelector;

public interface SelectorVisitor<R,P> {

    R visit(IdentSelector identSelector,P p);

    R visit(SelectorBodySelector selectorBodySelector,P p);

}
