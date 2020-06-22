package antlr.visitor.commands;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.commands.Command;
import model.commands.UndefinedCommand;

import java.util.stream.Collectors;

public class CommandVisitor extends GenericVisitor<Command> {
    @Override
    public Command visitStructCommand(coqParser.StructCommandContext ctx) {
        return new StructCommandVisitor().visit(ctx.structural_command());
    }

    @Override
    public Command visitUndefinedCommand(coqParser.UndefinedCommandContext ctx) {
        return new UndefinedCommand(ctx.undefined_command().children.stream().map(
                parseTree ->  parseTree.getText()
        ).collect(Collectors.toList()));
    }
}
