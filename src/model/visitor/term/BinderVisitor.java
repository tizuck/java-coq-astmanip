package model.visitor.term;

import model.term.utilities.BracedNameBinder;
import model.term.utilities.ImplicitBinder;
import model.term.utilities.NameBinder;
import model.term.utilities.SingleNameBinder;

public interface BinderVisitor <R,P> {
    R visit(SingleNameBinder singleNameBinder, P p);

    R visit(NameBinder nameBinder, P p);

    R visit(BracedNameBinder bracedNameBinder, P p);

    R visit(ImplicitBinder implicitBinder, P p);
}
