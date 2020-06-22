package model.tactics.atomic.tacargcomponents;

import model.visitor.atomic.TacArgComponentVisitor;

import java.util.Objects;

public abstract class TacArgComponent {

    private ComponentType componentType;

    public TacArgComponent(){
        componentType = ComponentType.NOTYPE;
    }

    public TacArgComponent(ComponentType componentType){
        this.componentType = componentType;
    }

    public ComponentType getComponentType() {
        return componentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TacArgComponent that = (TacArgComponent) o;
        return componentType == that.componentType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentType);
    }

    public abstract <R,P> R accept(TacArgComponentVisitor<R,P> tacArgComponentVisitor, P p);

}
