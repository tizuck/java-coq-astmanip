package model.tactics.atomic.tacargcomponents;

import model.tactics.atomic.utilities.BindingListBody;
import model.visitor.atomic.TacArgComponentVisitor;

import java.util.List;
import java.util.Objects;

public class BindingListComponent extends TacArgComponent {

    private List<BindingListBody> bindingListBodies;

    public BindingListComponent(ComponentType componentType, List<BindingListBody> bindingListBodies) {
        super(componentType);
        this.bindingListBodies = bindingListBodies;
    }

    public BindingListComponent(List<BindingListBody> bindingListBodies) {

        this.bindingListBodies = bindingListBodies;
    }

    public List<BindingListBody> getBindingListBodies() {
        return bindingListBodies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BindingListComponent that = (BindingListComponent) o;
        return Objects.equals(bindingListBodies, that.bindingListBodies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bindingListBodies);
    }

    @Override
    public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
        return tacArgComponentVisitor.visit(this,p);
    }
}
