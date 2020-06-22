package model.visitor.term;

import model.term.utilities.MultipleFixBodies;
import model.term.utilities.SingleFixBody;

public interface FixBodiesVisitor<R,P> {
    R visit(SingleFixBody singleFixBody,P p);

    R visit(MultipleFixBodies multipleFixBodies,P p);
}
