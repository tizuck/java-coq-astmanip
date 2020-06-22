package model.visitor.expr;

import model.tactics.expr.utilities.MinusSelectorBody;
import model.tactics.expr.utilities.SingleSelectorBody;

public interface SelectorBodyVisitor<R,P> {

    R visit(SingleSelectorBody singleSelectorBody,P p);

    R visit(MinusSelectorBody minusSelectorBody,P p);
}
