package model.tactics.atomic.tacargcomponents;

import model.tactics.atomic.utilities.RewPrefix;
import model.visitor.atomic.TacArgComponentVisitor;

import java.util.Objects;

public class RewPrefixComponent extends TacArgComponent{

    private RewPrefix rewPrefix;

    public RewPrefixComponent(RewPrefix rewPrefix) {
        this.rewPrefix = rewPrefix;
    }

    public RewPrefixComponent(ComponentType componentType, RewPrefix rewPrefix) {
        super(componentType);
        this.rewPrefix = rewPrefix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RewPrefixComponent that = (RewPrefixComponent) o;
        return Objects.equals(rewPrefix, that.rewPrefix);
    }

    public RewPrefix getRewPrefix() {
        return rewPrefix;
    }

    public void setRewPrefix(RewPrefix rewPrefix) {
        this.rewPrefix = rewPrefix;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rewPrefix);
    }



    @Override
    public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
        return tacArgComponentVisitor.visit(this,p);
    }
}
