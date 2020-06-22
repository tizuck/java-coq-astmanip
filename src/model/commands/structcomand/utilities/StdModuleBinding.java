package model.commands.structcomand.utilities;

import model.term.utilities.Ident;
import model.visitor.commands.ModuleBindingVisitor;

import java.util.List;
import java.util.Objects;

public class StdModuleBinding implements ModuleBinding {
    private List<Ident> ids;

    private ModuleType moduleType;


    public StdModuleBinding(List<Ident> ids, ModuleType moduleType) {
        this.ids = ids;
        this.moduleType = moduleType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StdModuleBinding that = (StdModuleBinding) o;
        return Objects.equals(ids, that.ids) &&
                Objects.equals(moduleType, that.moduleType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids, moduleType);
    }

    @Override
    public <R, P> R accept(ModuleBindingVisitor<R, P> moduleBindingVisitor, P p) {
        return moduleBindingVisitor.visit(this,p);
    }
}
