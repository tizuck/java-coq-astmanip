package antlr.visitor.term;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.term.utilities.Ident;

public class IdentVisitor extends GenericVisitor<Ident> {


    @Override
    public Ident visitSomeIdent(coqParser.SomeIdentContext ctx) {
        return new Ident("Some");
    }

    @Override
    public Ident visitEqIdent(coqParser.EqIdentContext ctx) {
        return new Ident("eq");
    }

    @Override
    public Ident visitAllIdent(coqParser.AllIdentContext ctx) {
        return new Ident("all");
    }

    @Override
    public Ident visitAbsurdIdent(coqParser.AbsurdIdentContext ctx) {
        return new Ident("absurd");
    }

    @Override
    public Ident visitEqualityIdent(coqParser.EqualityIdentContext ctx) {
        return new Ident("equality");
    }

    @Override
    public Ident visitDoubleIdent(coqParser.DoubleIdentContext ctx) {
        return new Ident("double");
    }

    @Override
    public Ident visitF_equalIdent(coqParser.F_equalIdentContext ctx) {
        return new Ident("f_equal");
    }

    @Override
    public Ident visitOrIdent(coqParser.OrIdentContext ctx) {
        return new Ident("or");
    }

    @Override
    public Ident visitContradictIdent(coqParser.ContradictIdentContext ctx) {
        return new Ident("contradict");
    }

    @Override
    public Ident visitFreshIdent(coqParser.FreshIdentContext ctx) {
        return new Ident("fresh");
    }

    @Override
    public Ident visitCase_eqIdent(coqParser.Case_eqIdentContext ctx) {
        return new Ident("case_eq");
    }

    @Override
    public Ident visitLemmaIdent(coqParser.LemmaIdentContext ctx) {
        return new Ident("lemma");
    }

    @Override
    public Ident visitEasyIdent(coqParser.EasyIdentContext ctx) {
        return new Ident("easy");
    }

    @Override
    public Ident visitRecIdent(coqParser.RecIdentContext ctx) {
        return new Ident("rec");
    }

    @Override
    public Ident visitChangeIdent(coqParser.ChangeIdentContext ctx) {
        return new Ident("change");
    }

    @Override
    public Ident visitDecideIdent(coqParser.DecideIdentContext ctx) {
        return new Ident("decide");
    }

    @Override
    public Ident visitLeftIdent(coqParser.LeftIdentContext ctx) {
        return new Ident("left");
    }

    @Override
    public Ident visitRightIdent(coqParser.RightIdentContext ctx) {
        return new Ident("right");
    }

    @Override
    public Ident visitInversion_sigmaIdent(coqParser.Inversion_sigmaIdentContext ctx) {
        return new Ident("inversion_sigma");
    }

    @Override
    public Ident visitAssert_fialsIdent(coqParser.Assert_fialsIdentContext ctx) {
        return new Ident("assert_fails");
    }

    @Override
    public Ident visitFailIdent(coqParser.FailIdentContext ctx) {
        return new Ident("fail");
    }

    @Override
    public Ident visitDependentIdent(coqParser.DependentIdentContext ctx) {
        return new Ident("dependent");
    }

    @Override
    public Ident visitSumIdent(coqParser.SumIdentContext ctx) {
        return new Ident("sum");
    }

    @Override
    public Ident visitCompareIdent(coqParser.CompareIdentContext ctx) {
        return new Ident("compare");
    }

    @Override
    public Ident visitTAutoIdent(coqParser.TAutoIdentContext ctx) {
        return new Ident("tauto");
    }

    @Override
    public Ident visitDtAutoIdent(coqParser.DtAutoIdentContext ctx) {
        return new Ident("dtauto");
    }

    @Override
    public Ident visitIntuitionIdent(coqParser.IntuitionIdentContext ctx) {
        return new Ident("intuition");
    }

    @Override
    public Ident visitDintuition(coqParser.DintuitionContext ctx) {
        return new Ident("dintuition");
    }

    @Override
    public Ident visitTopIdent(coqParser.TopIdentContext ctx) {
        return new Ident("top");
    }

    @Override
    public Ident visitBottomIdent(coqParser.BottomIdentContext ctx) {
        return new Ident("bottom");
    }

    @Override
    public Ident visitExfalsoIdent(coqParser.ExfalsoIdentContext ctx) {
        return new Ident("exfalso");
    }

    @Override
    public Ident visitStdIdent(coqParser.StdIdentContext ctx) {
        return new Ident(ctx.IDENT().getSymbol().getText());
    }
}
