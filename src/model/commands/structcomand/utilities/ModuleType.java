package model.commands.structcomand.utilities;

import model.visitor.commands.ModuleTypeVisitor;

public interface ModuleType {
    <R,P> R accept(ModuleTypeVisitor<R,P> moduleTypeVisitor,P p);
}
