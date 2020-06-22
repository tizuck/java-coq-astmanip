package antlr.visitor.commands.utilities;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.term.QualidVisitor;
import model.commands.structcomand.utilities.ModuleExpression;

import java.util.stream.Collectors;

public class ModuleExpressionVisitor extends GenericVisitor<ModuleExpression> {
    @Override
    public ModuleExpression visitStdModuleExpr(coqParser.StdModuleExprContext ctx) {
        return new ModuleExpression(false,
                ctx.qualid().stream()
                    .map(qualidContext ->
                        new QualidVisitor().visit(qualidContext)
                    )
                    .collect(Collectors.toList()));
    }

    @Override
    public ModuleExpression visitExclamationModuleExpr(coqParser.ExclamationModuleExprContext ctx) {
        return new ModuleExpression(true,
                ctx.qualid().stream()
                        .map(qualidContext ->
                                new QualidVisitor().visit(qualidContext)
                        )
                        .collect(Collectors.toList()));
    }
}
