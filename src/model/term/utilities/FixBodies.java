package model.term.utilities;

import model.visitor.term.FixBodiesVisitor;

public interface FixBodies {
    <R,P> R accept(FixBodiesVisitor<R,P> fixBodiesVisitor,P p);
}
