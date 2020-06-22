package model.visitor.term;

import model.term.utilities.MultipleCofixBodies;
import model.term.utilities.SingleCoFixBody;

public interface CoFixBodiesVisitor<R,P> {

    R visit(SingleCoFixBody singleCoFixBody,P p);

    R visit(MultipleCofixBodies multipleCofixBodies,P p);

}
