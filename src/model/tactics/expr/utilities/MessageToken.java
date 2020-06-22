package model.tactics.expr.utilities;

import model.visitor.expr.MessageTokenVisitor;

public interface MessageToken {
    <R,P> R accept(MessageTokenVisitor<R,P> messageTokenVisitor, P p);
}
