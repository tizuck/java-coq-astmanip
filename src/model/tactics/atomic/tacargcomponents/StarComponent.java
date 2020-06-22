package model.tactics.atomic.tacargcomponents;

import model.visitor.atomic.TacArgComponentVisitor;

public class StarComponent extends TacArgComponent{

    public StarComponent(ComponentType componentType) {
        super(componentType);
    }

    @Override
    public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
        return tacArgComponentVisitor.visit(this,p);
    }
}
