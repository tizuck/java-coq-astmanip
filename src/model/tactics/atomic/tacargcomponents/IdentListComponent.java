package model.tactics.atomic.tacargcomponents;

import model.term.utilities.Ident;
import model.visitor.atomic.TacArgComponentVisitor;

import java.util.List;
import java.util.Objects;

public class IdentListComponent extends TacArgComponent {
    List<Ident> ids;

    public IdentListComponent(List<Ident> ids) {
        this.ids = ids;
    }

    public IdentListComponent(ComponentType componentType, List<Ident> ids) {
        super(componentType);
        this.ids = ids;
    }

    public List<Ident> getIds() {
        return ids;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        IdentListComponent that = (IdentListComponent) o;
        return Objects.equals(ids, that.ids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ids);
    }

    @Override
    public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
        return tacArgComponentVisitor.visit(this,p);
    }
}
