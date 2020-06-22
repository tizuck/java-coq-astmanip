package antlr.visitor.expr;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.atomicexpr.AtomicExprVisitor;
import antlr.visitor.term.IdentVisitor;
import antlr.visitor.term.NameVisitor;
import antlr.visitor.term.QualidVisitor;
import antlr.visitor.term.TermVisitor;
import model.tactics.expr.*;
import model.tactics.expr.utilities.*;
import model.term.Number;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExprVisitor extends GenericVisitor<Expr> {

    @Override
    public Expr visitSequenceExpr(coqParser.SequenceExprContext ctx) {
        return new SequenceExpr(visit(ctx.expr(0)),
                visit(ctx.expr(1)));
    }

    @Override
    public Expr visitPairedSequenceLocalAppExpr(coqParser.PairedSequenceLocalAppExprContext ctx) {
        List<Optional<Expr>> exprs = new ArrayList<>();
        if(ctx.expr() != null){
            exprs.add(Optional.of(visit(ctx.expr())));
        }
        else {
            exprs.add(Optional.empty());
        }

        ctx.pairedSequenceLocalAppExprBody().forEach(pairedSequenceLocalAppExprBodyContext ->
        {
            if (pairedSequenceLocalAppExprBodyContext.expr() != null){
                exprs.add(Optional.of(visit(pairedSequenceLocalAppExprBodyContext.expr())));}
            else{
                exprs.add(Optional.empty());
            }
        });

        return new PairdSequenceLocalAppExpr(visit(ctx.expr2()),exprs.isEmpty() ? Optional.empty() : Optional.of(exprs));
    }

    @Override
    public Expr visitTacarg3expr(coqParser.Tacarg3exprContext ctx) {
        return visit(ctx.tacexpr3());
    }

    @Override
    public Expr visitDoExpr(coqParser.DoExprContext ctx) {
        if(ctx.NUM() != null){
            return new DoNumExpr(visit(ctx.tacexpr3()),
                    new Number(Integer.valueOf(ctx.NUM().getSymbol().getText())));
        }
        else {
            return new DoIdentExpr(visit(ctx.tacexpr3()),
                    new IdentVisitor().visit(ctx.ident()));
        }

    }

    @Override
    public Expr visitProgressExpr(coqParser.ProgressExprContext ctx) {
        return new ProgressExpr(visit(ctx.tacexpr3()));
    }

    @Override
    public Expr visitRepeatExpr(coqParser.RepeatExprContext ctx) {
        return new RepeatExpr(visit(ctx.tacexpr3()));
    }

    @Override
    public Expr visitTryExpr(coqParser.TryExprContext ctx) {
        return new TryExpr(visit(ctx.tacexpr3()));
    }

    @Override
    public Expr visitSoftCutExpr(coqParser.SoftCutExprContext ctx) {
        return new SoftCutExpr(visit(ctx.tacexpr3()));
    }

    @Override
    public Expr visitExactlyOnceExpr(coqParser.ExactlyOnceExprContext ctx) {
        return new ExactlyOnceExpr(visit(ctx.tacexpr3()));
    }

    @Override
    public Expr visitTimeoutExpr(coqParser.TimeoutExprContext ctx) {
        if(ctx.NUM() != null){
            return new TimeoutNumExpr(visit(ctx.tacexpr3()),
                    new Number(Integer.valueOf(ctx.NUM().getSymbol().getText())));
        }
        else {
            return new TimeoutIdentExpr(visit(ctx.tacexpr3()),
                    new IdentVisitor().visit(ctx.ident()));
        }
    }

    @Override
    public Expr visitTimeExpr(coqParser.TimeExprContext ctx) {
        Optional<String> oString = Optional.empty();
        if(ctx.STRING() != null){
            oString = Optional.of(ctx.STRING().getSymbol().getText());
        }

        return new TimeExpr(visit(ctx.tacexpr3()),
                oString);
    }

    @Override
    public Expr visitOnlyExpr(coqParser.OnlyExprContext ctx) {
        Optional<Selector> optionalSelector = Optional.empty();

        if(ctx.selector() != null){
            optionalSelector = Optional.of(new SelectorVisitor().visit(ctx.selector()));
        }
        return new OnlyExpr(visit(ctx.tacexpr3()),
                optionalSelector);
    }

    @Override
    public Expr visitTacExpr2Expr(coqParser.TacExpr2ExprContext ctx) {
        return visit(ctx.tacexpr2());
    }

    @Override
    public Expr visitLeftBiasedOpsExpr(coqParser.LeftBiasedOpsExprContext ctx) {
        return new LeftBiasedExpr(visit(ctx.tacexpr1()),
                visit(ctx.tacexpr3()));
    }

    @Override
    public Expr visitBackTrackingExpr(coqParser.BackTrackingExprContext ctx) {
        return new BackTrackingExpr(visit(ctx.tacexpr1()),
                visit(ctx.tacexpr3()));
    }

    @Override
    public Expr visitGeneralizedBranchingExpr(coqParser.GeneralizedBranchingExprContext ctx) {
        return new GeneralizedBranchingExpr(visit(ctx.tacexpr1(0)),
                visit(ctx.tacexpr1(1)),
                visit(ctx.tacexpr1(2)));
    }

    @Override
    public Expr visitTacExpr1Expr(coqParser.TacExpr1ExprContext ctx) {
        return visit(ctx.tacexpr1());
    }

    @Override
    public Expr visitFunExpr(coqParser.FunExprContext ctx) {

        return new FunExpr(ctx.name().stream()
                        .map(nameContext -> (new NameVisitor().visit(nameContext)))
                        .collect(Collectors.toList()),
                ctx.tacexpr1().stream()
                        .map(tacexpr1Context -> (visit(tacexpr1Context)))
                        .collect(Collectors.toList()));
    }

    @Override
    public Expr visitLetExpr(coqParser.LetExprContext ctx) {
        return new LetExpr(ctx.KeyREC() != null,
                ctx.let_clause().stream()
        .map(let_clauseContext -> new LetClauseVisitor(this).visit(let_clauseContext))
        .collect(Collectors.toList()),
                visit(ctx.expr()));
    }

    @Override
    public Expr visitContextMatchExpr(coqParser.ContextMatchExprContext ctx) {
        return new StdContextMatchExpr(ctx.KeyREVERSE() != null,
                ctx.context_rule().stream()
        .map(context_ruleContext -> new ContextRuleVisitor(this).visit(context_ruleContext))
        .collect(Collectors.toList()));
    }

    @Override
    public Expr visitContextLazyMatchExpr(coqParser.ContextLazyMatchExprContext ctx) {
        return new LazyContextMatchExpr(ctx.KeyREVERSE() != null,
                ctx.context_rule().stream()
                        .map(context_ruleContext -> new ContextRuleVisitor(this).visit(context_ruleContext))
                        .collect(Collectors.toList()));
    }

    @Override
    public Expr visitContextMultitMatchExpr(coqParser.ContextMultitMatchExprContext ctx) {
        return new MultiContextMatchExpr(ctx.KeyREVERSE() != null,
                ctx.context_rule().stream()
                        .map(context_ruleContext -> new ContextRuleVisitor(this).visit(context_ruleContext))
                        .collect(Collectors.toList()));
    }

    @Override
    public Expr visitMatchMatchExpr(coqParser.MatchMatchExprContext ctx) {
       return new StdMatchMatchExpression(ctx.match_rule().stream()
       .map(match_ruleContext -> new MatchRuleVisitor(this).visit(match_ruleContext))
       .collect(Collectors.toList()),
               visit(ctx.expr()));
    }

    @Override
    public Expr visitMatchLazyMatchExpr(coqParser.MatchLazyMatchExprContext ctx) {
        return new LazyMatchMatchExpression(ctx.match_rule().stream()
                .map(match_ruleContext -> new MatchRuleVisitor(this).visit(match_ruleContext))
                .collect(Collectors.toList()),
                visit(ctx.expr()));
    }

    @Override
    public Expr visitMatchMultiMatchExpr(coqParser.MatchMultiMatchExprContext ctx) {
        return new MultiMatchMatchExpression(ctx.match_rule().stream()
                .map(match_ruleContext -> new MatchRuleVisitor(this).visit(match_ruleContext))
                .collect(Collectors.toList()),
                visit(ctx.expr()));
    }

    @Override
    public Expr visitAbstractExpr(coqParser.AbstractExprContext ctx) {
        return new AbstractExpr(new AtomVisitor(this).visit(ctx.atom()),
                ctx.ident() != null ? Optional.of(new IdentVisitor().visit(ctx.ident())) : Optional.empty());
    }

    @Override
    public Expr visitSolveExpr(coqParser.SolveExprContext ctx) {
        return new SolveExpr(ctx.expr().stream()
        .map(exprContext -> visit(exprContext))
        .collect(Collectors.toList()));
    }

    @Override
    public Expr visitFirstExpr(coqParser.FirstExprContext ctx) {
        return new FirstExpr(ctx.expr().stream()
                .map(exprContext -> visit(exprContext))
                .collect(Collectors.toList()));
    }

    @Override
    public Expr visitIdTacExpr(coqParser.IdTacExprContext ctx) {
        return new IdTacExpr(ctx.message_token().stream()
        .map(message_tokenContext -> new MessageTokenVisitor().visit(message_tokenContext))
        .collect(Collectors.toList()));
    }

    @Override
    public Expr visitIdentFailExpr(coqParser.IdentFailExprContext ctx) {
        return new FailExpr(Optional.of(new IdentVisitor().visit(ctx.ident())),
                ctx.message_token() != null ? Optional.of(ctx.message_token().stream()
                .map(message_tokenContext -> new MessageTokenVisitor().visit(message_tokenContext))
                .collect(Collectors.toList()))
                    : Optional.empty());
    }

    @Override
    public Expr visitNumFailExpr(coqParser.NumFailExprContext ctx) {
        return new FailExpr(Optional.of(new Number(Integer.valueOf(ctx.NUM().getSymbol().getText()))),
                ctx.message_token() != null ? Optional.of(ctx.message_token().stream()
                        .map(message_tokenContext -> new MessageTokenVisitor().visit(message_tokenContext))
                        .collect(Collectors.toList()))
                        : Optional.empty());
    }

    @Override
    public Expr visitFailExpr(coqParser.FailExprContext ctx) {
        return new FailExpr(Optional.empty(),
                ctx.message_token() != null ? Optional.of(ctx.message_token().stream()
                        .map(message_tokenContext -> new MessageTokenVisitor().visit(message_tokenContext))
                        .collect(Collectors.toList()))
                        : Optional.empty());
    }

    @Override
    public Expr visitFreshStringExpr(coqParser.FreshStringExprContext ctx) {
        return new StringFreshExpr(Optional.of(ctx.STRING().getSymbol().getText()));
    }

    @Override
    public Expr visitFreshQualidExpr(coqParser.FreshQualidExprContext ctx) {
        return new QualidFreshExpr(Optional.of(new QualidVisitor().visit(ctx.qualid())));
    }

    @Override
    public Expr visitFreshExpr(coqParser.FreshExprContext ctx) {
        return new QualidFreshExpr(Optional.empty());
    }

    @Override
    public Expr visitContextExpr(coqParser.ContextExprContext ctx) {
        return new ContextExpr(new IdentVisitor().visit(ctx.ident()),
                ctx.term() != null ? Optional.of(new TermVisitor().visit(ctx.term())) : Optional.empty(),
                false);
    }

    @Override
    public Expr visitContextExprBraceds(coqParser.ContextExprBracedsContext ctx) {
        return new ContextExpr(new IdentVisitor().visit(ctx.ident()),
                ctx.term() != null ? Optional.of(new TermVisitor().visit(ctx.term())) : Optional.empty(),
                true);
    }

    @Override
    public Expr visitEvalExpr(coqParser.EvalExprContext ctx) {
        return new SimpleTermExpr(TermExprType.EVALRED,
                new TermVisitor().visit(ctx.term()));
    }

    @Override
    public Expr visitTypeExpr(coqParser.TypeExprContext ctx) {
        return new SimpleTermExpr(TermExprType.TYPE,
                new TermVisitor().visit(ctx.term()));
    }

    @Override
    public Expr visitConstrExpr(coqParser.ConstrExprContext ctx) {
        return new SimpleTermExpr(TermExprType.CONSTR,
                new TermVisitor().visit(ctx.term()));
    }

    @Override
    public Expr visitUconstrExpr(coqParser.UconstrExprContext ctx) {
        return new SimpleTermExpr(TermExprType.UCONSTR,
                new TermVisitor().visit(ctx.term()));
    }

    @Override
    public Expr visitTypeTermExpr(coqParser.TypeTermExprContext ctx) {
        return new SimpleTermExpr(TermExprType.TYPETERM,
                new TermVisitor().visit(ctx.term()));
    }

    @Override
    public Expr visitNumgoals(coqParser.NumgoalsContext ctx) {
        return new NumGoalsExpr();
    }

    @Override
    public Expr visitGuardExpr(coqParser.GuardExprContext ctx) {
        if(ctx.test().LESS() != null){
            return new GuardExpr(new Test(
            ctx.test().integ(0).SUB() != null ?
                    Integer.valueOf(ctx.test().integ(0).NUM().getSymbol().getText()) * (-1)
                : Integer.valueOf(ctx.test().integ(0).NUM().getSymbol().getText()),
            ctx.test().integ(1).SUB() != null ?
                    Integer.valueOf(ctx.test().integ(1).NUM().getSymbol().getText()) * (-1)
                : Integer.valueOf(ctx.test().integ(1).NUM().getSymbol().getText()),
            TestOperatorType.LESS));
        }

        if(ctx.test().GREATER() != null){
            return new GuardExpr(new Test(
                    ctx.test().integ(0).SUB() != null ?
                            Integer.valueOf(ctx.test().integ(0).NUM().getSymbol().getText()) * (-1)
                            : Integer.valueOf(ctx.test().integ(0).NUM().getSymbol().getText()),
                    ctx.test().integ(1).SUB() != null ?
                            Integer.valueOf(ctx.test().integ(1).NUM().getSymbol().getText()) * (-1)
                            : Integer.valueOf(ctx.test().integ(1).NUM().getSymbol().getText()),
                    TestOperatorType.GREATER));
        }

        if(ctx.test().EQUAL() != null){
            return new GuardExpr(new Test(
                    ctx.test().integ(0).SUB() != null ?
                            Integer.valueOf(ctx.test().integ(0).NUM().getSymbol().getText()) * (-1)
                            : Integer.valueOf(ctx.test().integ(0).NUM().getSymbol().getText()),
                    ctx.test().integ(1).SUB() != null ?
                            Integer.valueOf(ctx.test().integ(1).NUM().getSymbol().getText()) * (-1)
                            : Integer.valueOf(ctx.test().integ(1).NUM().getSymbol().getText()),
                    TestOperatorType.EQ));
        }

        if(ctx.test().LOEQ() != null){
            return new GuardExpr(new Test(
                    ctx.test().integ(0).SUB() != null ?
                            Integer.valueOf(ctx.test().integ(0).NUM().getSymbol().getText()) * (-1)
                            : Integer.valueOf(ctx.test().integ(0).NUM().getSymbol().getText()),
                    ctx.test().integ(1).SUB() != null ?
                            Integer.valueOf(ctx.test().integ(1).NUM().getSymbol().getText()) * (-1)
                            : Integer.valueOf(ctx.test().integ(1).NUM().getSymbol().getText()),
                    TestOperatorType.LEQ));
        }
        else{
            return new GuardExpr(new Test(
                    ctx.test().integ(0).SUB() != null ?
                            Integer.valueOf(ctx.test().integ(0).NUM().getSymbol().getText()) * (-1)
                            : Integer.valueOf(ctx.test().integ(0).NUM().getSymbol().getText()),
                    ctx.test().integ(1).SUB() != null ?
                            Integer.valueOf(ctx.test().integ(1).NUM().getSymbol().getText()) * (-1)
                            : Integer.valueOf(ctx.test().integ(1).NUM().getSymbol().getText()),
                    TestOperatorType.GEQ));
        }
    }

    @Override
    public Expr visitAssertFailsExpr(coqParser.AssertFailsExprContext ctx) {
        return new AssertFailsExpr(visit(ctx.tacexpr3()));
    }

    @Override
    public Expr visitAssertSucceedsExpr(coqParser.AssertSucceedsExprContext ctx) {
        return new SuccessAssertExpr(visit(ctx.tacexpr3()));
    }

    @Override
    public Expr visitAtomicExpr(coqParser.AtomicExprContext ctx) {
        return new AtomicExprVisitor().visit(ctx.atomic_tactic());
    }

    @Override
    public Expr visitApplicationExpr(coqParser.ApplicationExprContext ctx) {
        return new ApplicationExpr(new QualidVisitor().visit(ctx.qualid()),
                ctx.tacarg().stream()
        .map(tacargContext -> new TacArgVisitor().visit(tacargContext))
        .collect(Collectors.toList()));
    }

    @Override
    public Expr visitAtomExpr(coqParser.AtomExprContext ctx) {
        return new AtomExpr(new AtomVisitor(this).visit(ctx.atom()));
    }

    @Override
    public Expr visitExpr2Expr(coqParser.Expr2ExprContext ctx) {
        return visit(ctx.expr2());
    }

}
