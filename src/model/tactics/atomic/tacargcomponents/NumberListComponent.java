package model.tactics.atomic.tacargcomponents;

import model.term.Number;
import model.visitor.atomic.TacArgComponentVisitor;

import java.util.List;
import java.util.Objects;

public class NumberListComponent extends TacArgComponent {
    List<Number> nums;

    public NumberListComponent(List<Number> nums) {
        this.nums = nums;
    }

    public NumberListComponent(ComponentType componentType, List<Number> nums) {
        super(componentType);
        this.nums = nums;
    }

    public List<Number> getNums() {
        return nums;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NumberListComponent that = (NumberListComponent) o;
        return Objects.equals(nums, that.nums);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nums);
    }

    @Override
    public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
        return tacArgComponentVisitor.visit(this,p);
    }
}
