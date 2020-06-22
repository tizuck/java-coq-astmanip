package model.tactics.atomic.utilities;

import model.visitor.atomic.BindingListBodyVisitor;

public interface BindingListBody {
    <R,P> R accept(BindingListBodyVisitor<R,P> bindingListBodyVisitor,P p);
}
