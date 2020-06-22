package antlr.visitor.commands;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.commands.utilities.ModuleBindingsVisitor;
import antlr.visitor.term.IdentVisitor;
import antlr.visitor.term.QualidVisitor;
import model.commands.Command;
import model.commands.structcomand.*;
import model.commands.structcomand.utilities.IdentComponent;
import model.term.Qualid;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StructCommandVisitor extends GenericVisitor<Command> {

    @Override
    public Command visitImportRequire(coqParser.ImportRequireContext ctx) {
        List<Qualid> qualids = new ArrayList<>();
        qualids.add(new QualidVisitor().visit(ctx.qualid()));
        return new RequireImport(qualids);
    }

    @Override
    public Command visitStdSection(coqParser.StdSectionContext ctx) {
        return new Section(new IdentVisitor().visit(ctx.ident()));
    }

    @Override
    public Command visitStdEnd(coqParser.StdEndContext ctx) {
        return new End(new IdentVisitor().visit(ctx.ident()));
    }

    @Override
    public Command visitStdModule(coqParser.StdModuleContext ctx) {
        if(ctx.module_bindings() != null) {
            return new Module(new IdentComponent(new IdentVisitor().visit(ctx.ident())),
                    new ModuleBindingsVisitor().visit(ctx.module_bindings())
            );
        }

        return new Module(new IdentComponent(new IdentVisitor().visit(ctx.ident())));
    }

    @Override
    public Command visitExportRequire(coqParser.ExportRequireContext ctx) {
        List<Qualid> qualids = new ArrayList<>();
        qualids.add(new QualidVisitor().visit(ctx.qualid()));
        return new RequireExport(qualids);
    }

    @Override
    public Command visitImportQualidsRequire(coqParser.ImportQualidsRequireContext ctx) {
        return new RequireImport(
                ctx.qualid()
                    .stream()
                    .map(qualidContext -> new QualidVisitor().visit(qualidContext))
                    .collect(Collectors.toList()));
    }

    @Override
    public Command visitStdRequire(coqParser.StdRequireContext ctx) {
        return new Require(new QualidVisitor().visit(ctx.qualid()),
                ctx.STRING() != null ? Optional.of(ctx.STRING().getSymbol().getText()) : Optional.empty());
    }
}
