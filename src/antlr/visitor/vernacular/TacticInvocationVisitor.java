package antlr.visitor.vernacular;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.expr.ExprVisitor;
import model.toplevel.utilities.TacticInvocation;

import java.util.Optional;

public class TacticInvocationVisitor extends GenericVisitor<TacticInvocation> {
    @Override
    public TacticInvocation visitTactic_invocation(coqParser.Tactic_invocationContext ctx) {
        return new TacticInvocation(ctx.toplevel_selector() != null ? Optional.of(new TopLevelSelectorVisitor().visit(ctx.toplevel_selector()))
                                                                    : Optional.empty(),
                new ExprVisitor().visit(ctx.expr()));
    }
}
