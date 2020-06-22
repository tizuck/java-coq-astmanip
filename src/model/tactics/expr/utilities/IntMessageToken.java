package model.tactics.expr.utilities;

import model.visitor.expr.MessageTokenVisitor;

import java.util.Objects;

public class IntMessageToken implements MessageToken {
    private int value;

    public IntMessageToken(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntMessageToken that = (IntMessageToken) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public int getValue() {
        return value;
    }

    @Override
    public <R, P> R accept(MessageTokenVisitor<R, P> messageTokenVisitor, P p) {
        return messageTokenVisitor.visit(this,p);
    }
}
