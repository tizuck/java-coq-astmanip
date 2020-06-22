package model.term.utilities;

import model.visitor.term.CoFixBodiesVisitor;

public interface CoFixBodies {
    <R,P> R accept(CoFixBodiesVisitor<R,P> coFixBodiesVisitor,P p);
}
