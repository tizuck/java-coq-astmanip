package antlr.visitor.expr;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.term.IdentVisitor;
import antlr.visitor.term.TermVisitor;
import model.tactics.expr.utilities.ContextMatchRule;
import model.tactics.expr.utilities.MatchRule;
import model.tactics.expr.utilities.StdMatchRule;
import model.tactics.expr.utilities.UnderscoreMatchRule;

import java.util.Optional;

public class MatchRuleVisitor extends GenericVisitor<MatchRule> {

    private ExprVisitor exprVisitor;

    public MatchRuleVisitor(ExprVisitor exprVisitor) {
        this.exprVisitor = exprVisitor;
    }

    @Override
    public MatchRule visitStdMatchRule(coqParser.StdMatchRuleContext ctx) {
        return new StdMatchRule(exprVisitor.visit(ctx.expr()),
                new TermVisitor().visit(ctx.term()));
    }

    @Override
    public MatchRule visitContextMatchRule(coqParser.ContextMatchRuleContext ctx) {
        return new ContextMatchRule(exprVisitor.visit(ctx.expr()),
                ctx.ident() != null ? Optional.of(new IdentVisitor().visit(ctx.ident())) : Optional.empty(),
                new TermVisitor().visit(ctx.term()));
    }

    @Override
    public MatchRule visitUnderscoreMatchRule(coqParser.UnderscoreMatchRuleContext ctx) {
        return new UnderscoreMatchRule(exprVisitor.visit(ctx.expr()));
    }
}
