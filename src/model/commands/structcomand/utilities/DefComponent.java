package model.commands.structcomand.utilities;

import model.visitor.commands.ModuleComponentVisitor;

public class DefComponent implements ModuleComponent {

    public DefComponent() {
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof DefComponent;
    }

    @Override
    public <R, P> R accept(ModuleComponentVisitor<R, P> moduleComponentVisitor, P p) {
        return moduleComponentVisitor.visit(this,p);
    }
}
