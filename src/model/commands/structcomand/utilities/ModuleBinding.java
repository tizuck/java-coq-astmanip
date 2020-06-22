package model.commands.structcomand.utilities;

import model.visitor.commands.ModuleBindingVisitor;

public interface ModuleBinding {
    <R,P> R accept(ModuleBindingVisitor<R,P> moduleBindingVisitor,P p);
}
