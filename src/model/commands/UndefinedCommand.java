package model.commands;



import model.visitor.toplevel.CoqFragmentVisitor;

import java.util.List;
import java.util.Objects;

public class UndefinedCommand implements Command {
    private List<String> undefinedParts;

    public UndefinedCommand(List<String> undefinedParts) {
        this.undefinedParts = undefinedParts;
    }

    @Override
    public String toString() {
        String undefined = "";
        for (String undefinedPart : undefinedParts) {
            undefined += undefinedPart + " ";
        }
        return  undefined;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UndefinedCommand that = (UndefinedCommand) o;
        return Objects.equals(undefinedParts, that.undefinedParts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(undefinedParts);
    }

    @Override
    public <R, P> R accept(CoqFragmentVisitor<R,P> coqFragmentVisitor, P p) {
        return coqFragmentVisitor.visit(this,p);
    }
}
