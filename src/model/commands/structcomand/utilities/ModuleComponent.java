package model.commands.structcomand.utilities;

import model.visitor.commands.ModuleComponentVisitor;

public interface ModuleComponent {
    <R,P> R accept(ModuleComponentVisitor<R,P> moduleComponentVisitor,P p);
}
