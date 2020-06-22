package antlr.visitor.atomicexpr.utilities;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.term.TermVisitor;
import model.tactics.atomic.utilities.IntroPattern;
import model.tactics.atomic.utilities.PercIntroPattern;
import model.tactics.atomic.utilities.UnderscoreIntroPattern;

import java.util.stream.Collectors;

public class IntroPatternVisitor extends GenericVisitor<IntroPattern> {

    @Override
    public IntroPattern visitNamingIntroPattern(coqParser.NamingIntroPatternContext ctx) {
        return new NamingIntroPatternVisitor().visit(ctx.naming_intro_pattern());
    }

    @Override
    public IntroPattern visitActionIntroPattern(coqParser.ActionIntroPatternContext ctx) {
        return new ActionIntroPatternVisitor().visit(ctx.action_intro_pattern());
    }

    @Override
    public IntroPattern visitPercIntroPattern(coqParser.PercIntroPatternContext ctx) {
        return new PercIntroPattern(visit(ctx.intro_pattern()),
                ctx.atomic_term().stream()
                .map(atomic_termContext -> new TermVisitor().visit(atomic_termContext))
                .collect(Collectors.toList())
        );
    }

    @Override
    public IntroPattern visitUnderscoreIntroPattern(coqParser.UnderscoreIntroPatternContext ctx) {
        return new UnderscoreIntroPattern();
    }
}
