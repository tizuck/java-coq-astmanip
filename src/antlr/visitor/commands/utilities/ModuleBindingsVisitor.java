package antlr.visitor.commands.utilities;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.commands.structcomand.utilities.ModuleBindingsComponent;

import java.util.stream.Collectors;

public class ModuleBindingsVisitor extends GenericVisitor<ModuleBindingsComponent> {
    @Override
    public ModuleBindingsComponent visitModule_bindings(coqParser.Module_bindingsContext ctx) {
        return new ModuleBindingsComponent(ctx.module_binding().stream()
                .map(module_bindingContext ->
                    new ModuleBindingVisitor().visit(module_bindingContext)
                )
                .collect(Collectors.toList()));
    }
}
