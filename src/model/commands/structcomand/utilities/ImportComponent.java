package model.commands.structcomand.utilities;

import model.visitor.commands.ModuleComponentVisitor;

public class ImportComponent implements ModuleComponent {

    public ImportComponent() {
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof ImportComponent;
    }

    @Override
    public <R, P> R accept(ModuleComponentVisitor<R, P> moduleComponentVisitor, P p) {
        return moduleComponentVisitor.visit(this,p);
    }
}
