package model.commands.structcomand.utilities;

import model.visitor.commands.ModuleComponentVisitor;

public class LColonComponent implements ModuleComponent {

    public LColonComponent() {
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof LColonComponent;
    }

    @Override
    public <R, P> R accept(ModuleComponentVisitor<R, P> moduleComponentVisitor, P p) {
        return moduleComponentVisitor.visit(this,p);
    }
}
