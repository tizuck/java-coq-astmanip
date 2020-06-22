package antlr.visitor.commands.utilities;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.term.IdentVisitor;
import model.commands.structcomand.utilities.ModuleBinding;
import model.commands.structcomand.utilities.StdModuleBinding;

import java.util.stream.Collectors;

public class ModuleBindingVisitor extends GenericVisitor<ModuleBinding> {
    @Override
    public ModuleBinding visitStdModuleBinding(coqParser.StdModuleBindingContext ctx) {
        return new StdModuleBinding(ctx.ident().stream()
                                        .map(identContext -> new IdentVisitor().visit(identContext))
                                        .collect(Collectors.toList()),
               new ModuleTypeVisitor().visit(ctx.module_type()));
    }
}
