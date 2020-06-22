package model.term.utilities;

import model.visitor.term.BinderVisitor;

public interface Binder {

    <R,P> R accept(BinderVisitor<R,P> binderVisitor, P p);
}
