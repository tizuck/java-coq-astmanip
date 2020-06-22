package coqparser.prettyprint.commands;


import coqparser.prettyprint.PrettyPrintContext;
import model.commands.structcomand.utilities.ExportModuleBinding;
import model.commands.structcomand.utilities.ImportModuleBinding;
import model.commands.structcomand.utilities.StdModuleBinding;
import model.visitor.commands.ModuleBindingVisitor;

public class PrettyPrintModuleBindingVisitor implements ModuleBindingVisitor<String, PrettyPrintContext> {

    @Override
    public String visit(ExportModuleBinding exportModuleBinding, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(ImportModuleBinding importModuleBinding, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(StdModuleBinding stdModuleBinding, PrettyPrintContext prettyPrintContext) {
        return null;
    }
}
