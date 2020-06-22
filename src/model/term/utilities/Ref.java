package model.term.utilities;

import model.visitor.term.RefVisitor;

public interface Ref {
    <R,P> R accept(RefVisitor<R,P> refVisitor,P p);
}
