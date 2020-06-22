package model.tactics.expr.utilities;

import model.visitor.expr.TacArgVisitor;

public interface TacArg {
    <R,P> R accept(TacArgVisitor<R,P> tacArgVisitor, P p);
}
