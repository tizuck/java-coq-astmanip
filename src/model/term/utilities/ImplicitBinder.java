package model.term.utilities;

import model.visitor.term.BinderVisitor;

import java.util.List;
import java.util.Objects;

public class ImplicitBinder implements Binder {

    private List<Binder> binders;

    public ImplicitBinder(List<Binder> binders) {
        this.binders = binders;
    }

    public List<Binder> getBinders() {
        return binders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImplicitBinder that = (ImplicitBinder) o;
        return Objects.equals(binders, that.binders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(binders);
    }

    @Override
    public <R, P> R accept(BinderVisitor<R,P> binderVisitor, P p) {
        return binderVisitor.visit(this,p);
    }
}
