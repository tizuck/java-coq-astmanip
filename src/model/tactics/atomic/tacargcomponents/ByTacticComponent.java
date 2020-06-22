package model.tactics.atomic.tacargcomponents;

import model.visitor.atomic.TacArgComponentVisitor;

public class ByTacticComponent extends TacArgComponent {
    public ByTacticComponent() {
    }


    @Override
    public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
        return tacArgComponentVisitor.visit(this,p);
    }
}
