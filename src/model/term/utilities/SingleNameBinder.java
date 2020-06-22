package model.term.utilities;

import model.visitor.term.BinderVisitor;

import java.util.Objects;

public class SingleNameBinder implements Binder {
    Name name;

    public SingleNameBinder(Name name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SingleNameBinder that = (SingleNameBinder) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public <R, P> R accept(BinderVisitor<R,P> binderVisitor, P p) {
        return binderVisitor.visit(this,p);
    }
}
