package model.tactics.expr.utilities;

import model.visitor.expr.TacArgVisitor;

import java.util.Objects;

public class StringTacArg implements  TacArg {
    private String str;

    public StringTacArg(String str) {
        this.str = str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringTacArg that = (StringTacArg) o;
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
    public <R, P> R accept(TacArgVisitor<R, P> tacArgVisitor, P p) {
        return tacArgVisitor.visit(this,p);
    }
}
