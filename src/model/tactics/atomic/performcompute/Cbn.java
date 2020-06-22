package model.tactics.atomic.performcompute;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.BooleanComponent;
import model.tactics.expr.utilities.QualidTacArg;
import model.visitor.expr.ExprVisitor;

public class Cbn  extends AtomicTacticExpr {

    public Cbn() {

    }

    public Cbn(BooleanComponent isNegativ, QualidTacArg qualid) {

    }

    @Override
    public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
        return exprVisitor.visit(this,p);
    }

}

