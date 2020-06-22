package model.tactics.expr.utilities;

import model.term.utilities.Ident;
import model.visitor.expr.MessageTokenVisitor;

import java.util.Objects;

public class IdMessageToken implements MessageToken {

    private Ident value;

    public IdMessageToken(Ident value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdMessageToken that = (IdMessageToken) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public Ident getValue() {
        return value;
    }

    @Override
    public <R, P> R accept(MessageTokenVisitor<R, P> messageTokenVisitor, P p) {
        return messageTokenVisitor.visit(this,p);
    }
}
