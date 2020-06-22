package antlr.visitor.atomicexpr.utilities;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.tactics.atomic.utilities.EqualIntroPattern;
import model.tactics.atomic.utilities.NamingIntroPatternEqualIntroPattern;
import model.tactics.atomic.utilities.OrEqualIntroPattern;

import java.util.stream.Collectors;

public class EqualIntroPatternVisitor extends GenericVisitor<EqualIntroPattern> {
    @Override
    public EqualIntroPattern visitEq(coqParser.EqContext ctx) {
        return new NamingIntroPatternEqualIntroPattern(
                ctx.naming_intro_pattern().stream()
                .map(naming_intro_patternContext -> new NamingIntroPatternVisitor().visit(naming_intro_patternContext))
                .collect(Collectors.toList())
        );
    }

    @Override
    public EqualIntroPattern visitOr(coqParser.OrContext ctx) {
        return new OrEqualIntroPattern();
    }
}
