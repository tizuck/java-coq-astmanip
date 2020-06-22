package model.commands.structcomand;


import model.commands.Command;
import model.commands.structcomand.utilities.ModuleType;
import model.visitor.toplevel.CoqFragmentVisitor;

import java.util.List;
import java.util.Objects;

public class Include implements Command {

    private List<ModuleType> moduleTypes;

    public Include(List<ModuleType> moduleTypes) {
        this.moduleTypes = moduleTypes;
    }

    public List<ModuleType> getModuleTypes() {
        return moduleTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Include include = (Include) o;
        return Objects.equals(moduleTypes, include.moduleTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moduleTypes);
    }

    @Override
    public <R, P> R accept(CoqFragmentVisitor<R,P> coqFragmentVisitor, P p) {
        return coqFragmentVisitor.visit(this,p);
    }
}
