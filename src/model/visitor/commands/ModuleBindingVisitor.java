package model.visitor.commands;

import model.commands.structcomand.utilities.ExportModuleBinding;
import model.commands.structcomand.utilities.ImportModuleBinding;
import model.commands.structcomand.utilities.StdModuleBinding;

public interface ModuleBindingVisitor<R,P> {

    R visit(ExportModuleBinding exportModuleBinding,P p);

    R visit(ImportModuleBinding importModuleBinding,P p);

    R visit(StdModuleBinding stdModuleBinding, P p);
}
