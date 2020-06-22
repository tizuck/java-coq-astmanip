package antlr.visitor.expr;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.term.IdentVisitor;
import antlr.visitor.term.TermVisitor;
import model.tactics.expr.utilities.*;

import java.util.Optional;
import java.util.stream.Collectors;

public class ContextRuleVisitor extends GenericVisitor<ContextRule> {
    private ExprVisitor exprVisitor;

    public ContextRuleVisitor(ExprVisitor exprVisitor) {
        this.exprVisitor = exprVisitor;
    }

    @Override
    public ContextRule visitContextHypContextRule(coqParser.ContextHypContextRuleContext ctx) {
        return new ContextHypContextRule(exprVisitor.visit(ctx.expr()),
                ctx.ident() != null ? Optional.of(new IdentVisitor().visit(ctx.ident())) : Optional.empty(),
                ctx.context_hyp().stream()
        .map(context_hypContext -> new ContextHypVisitor(exprVisitor).visit(context_hypContext))
        .collect(Collectors.toList()),
                new TermVisitor().visit(ctx.term()));
    }

    @Override
    public ContextRule visitContextHypBracedContextRule(coqParser.ContextHypBracedContextRuleContext ctx) {
        return new BracedContextHypContextRule(exprVisitor.visit(ctx.expr()),
                ctx.ident() != null ? Optional.of(new IdentVisitor().visit(ctx.ident())) : Optional.empty(),
                ctx.context_hyp().stream()
                        .map(context_hypContext -> new ContextHypVisitor(exprVisitor).visit(context_hypContext))
                        .collect(Collectors.toList()),
                new TermVisitor().visit(ctx.term()));
    }

    @Override
    public ContextRule visitStdContextRule(coqParser.StdContextRuleContext ctx) {
        return new StdContextRule(exprVisitor.visit(ctx.expr()),
                ctx.ident() != null ? Optional.of(new IdentVisitor().visit(ctx.ident())) : Optional.empty(),
                new TermVisitor().visit(ctx.term()));
    }

    @Override
    public ContextRule visitDerivedContextRule(coqParser.DerivedContextRuleContext ctx) {
        return new DerivedContextRule(exprVisitor.visit(ctx.expr()),
                ctx.ident() != null ? Optional.of(new IdentVisitor().visit(ctx.ident())) : Optional.empty(),
                new TermVisitor().visit(ctx.term()));
    }

    @Override
    public ContextRule visitUnderscoreContextRule(coqParser.UnderscoreContextRuleContext ctx) {
        return new UnderscoreContextRule(exprVisitor.visit(ctx.expr()),
                ctx.ident() != null ? Optional.of(new IdentVisitor().visit(ctx.ident())) : Optional.empty());
    }
}
