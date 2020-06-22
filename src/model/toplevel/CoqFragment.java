package model.toplevel;

import model.visitor.toplevel.CoqFragmentVisitor;

public interface CoqFragment {
    <R,P> R accept(CoqFragmentVisitor<R,P> coqFragmentVisitor, P p);
}
