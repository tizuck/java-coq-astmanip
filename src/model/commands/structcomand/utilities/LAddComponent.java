package model.commands.structcomand.utilities;

import model.visitor.commands.ModuleComponentVisitor;

public class LAddComponent implements ModuleComponent {

    public LAddComponent() {
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof LAddComponent;
    }

    @Override
    public <R, P> R accept(ModuleComponentVisitor<R, P> moduleComponentVisitor, P p) {
        return moduleComponentVisitor.visit(this,p);
    }
}
