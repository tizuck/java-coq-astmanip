package antlr.visitor.commands.utilities;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.term.QualidVisitor;
import antlr.visitor.term.TermVisitor;
import model.commands.structcomand.utilities.*;

public class ModuleTypeVisitor extends GenericVisitor<ModuleType> {
    @Override
    public ModuleType visitQualidModuleType(coqParser.QualidModuleTypeContext ctx) {
        return new QualidModuleType(
                new QualidVisitor().visit(ctx.qualid())
        );
    }

    @Override
    public ModuleType visitWithDefModuleType(coqParser.WithDefModuleTypeContext ctx) {
        return new DefinitionModuleType(visit(ctx.module_type()),
                new QualidVisitor().visit(ctx.qualid()),
                new TermVisitor().visit(ctx.term()));
    }

    @Override
    public ModuleType visitWithModuleModuleType(coqParser.WithModuleModuleTypeContext ctx) {
        return new ModuleModuleType(visit(ctx.module_type()),
                new QualidVisitor().visit(ctx.qualid().get(0)),
                new QualidVisitor().visit(ctx.qualid().get(1)));
    }

    @Override
    public ModuleType visitModuleExprModuleType(coqParser.ModuleExprModuleTypeContext ctx) {
        return new ModuleExpressionModuleType(new ModuleExpressionVisitor().visit(ctx.module_expression()));
    }
}
