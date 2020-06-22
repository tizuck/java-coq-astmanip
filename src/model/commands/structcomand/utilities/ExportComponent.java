package model.commands.structcomand.utilities;

import model.visitor.commands.ModuleComponentVisitor;

public class ExportComponent implements ModuleComponent {

    public ExportComponent() {
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof ExportComponent;
    }

    @Override
    public <R, P> R accept(ModuleComponentVisitor<R, P> moduleComponentVisitor, P p) {
        return moduleComponentVisitor.visit(this,p);
    }
}
