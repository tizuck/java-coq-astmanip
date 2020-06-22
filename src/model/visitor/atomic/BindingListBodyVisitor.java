package model.visitor.atomic;

import model.tactics.atomic.utilities.RefBindingListBody;
import model.tactics.atomic.utilities.TermBindingListBody;

public interface BindingListBodyVisitor<R,P> {

    R visit(RefBindingListBody refBindingListBody, P p);

    R visit(TermBindingListBody termBindingListBody, P p);
}
