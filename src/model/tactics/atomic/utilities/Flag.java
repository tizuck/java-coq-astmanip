package model.tactics.atomic.utilities;

import model.visitor.atomic.FlagVisitor;

public abstract class Flag {
    public Flag() {
    }

   abstract <R,P> R accept(FlagVisitor<R,P> flagVisitor,P p);
}
