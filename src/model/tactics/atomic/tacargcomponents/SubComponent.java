package model.tactics.atomic.tacargcomponents;

import model.visitor.atomic.TacArgComponentVisitor;

public class SubComponent extends TacArgComponent {
    @Override
    public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
        return tacArgComponentVisitor.visit(this,p);
    }
}
