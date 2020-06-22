package model.tactics.expr.utilities;

import model.visitor.expr.TacArgVisitor;

public class UnitTacArg implements TacArg {

    public UnitTacArg() {
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof UnitTacArg;
    }

    @Override
    public <R, P> R accept(TacArgVisitor<R, P> tacArgVisitor, P p) {
        return tacArgVisitor.visit(this,p);
    }
}
