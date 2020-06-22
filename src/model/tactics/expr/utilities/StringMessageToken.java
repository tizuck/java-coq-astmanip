package model.tactics.expr.utilities;

import model.visitor.expr.MessageTokenVisitor;

import java.util.Objects;

public class StringMessageToken implements MessageToken {

    private String str;

    public StringMessageToken(String str) {
        this.str = str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringMessageToken that = (StringMessageToken) o;
        return Objects.equals(str, that.str);
    }

    @Override
    public int hashCode() {
        return Objects.hash(str);
    }

    public String getStr() {
        return str;
    }

    @Override
    public <R, P> R accept(MessageTokenVisitor<R, P> messageTokenVisitor, P p) {
        return messageTokenVisitor.visit(this,p);
    }
}
