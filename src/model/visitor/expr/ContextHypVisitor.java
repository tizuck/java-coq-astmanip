package model.visitor.expr;

import model.tactics.expr.utilities.ExprContextHyp;
import model.tactics.expr.utilities.StdContextHyp;

public interface ContextHypVisitor<R,P> {
    R visit(StdContextHyp stdContextHyp,P p);

    R visit(ExprContextHyp exprContextHyp,P p);

}
