package antlr.visitor.atomicexpr.utilities;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.tactics.atomic.utilities.AndPatternDisjConjIntroPattern;
import model.tactics.atomic.utilities.DisjConjIntroPattern;
import model.tactics.atomic.utilities.PatternDisjConjIntroPattern;
import model.tactics.atomic.utilities.PatternListsDisjConjIntroPattern;

import java.util.Optional;
import java.util.stream.Collectors;

public class DisjConjIntroPatternVisitor extends GenericVisitor<DisjConjIntroPattern> {

    @Override
    public DisjConjIntroPattern visitIntroPatternListsDisjConjIntroPattern(coqParser.IntroPatternListsDisjConjIntroPatternContext ctx) {
        return new PatternListsDisjConjIntroPattern(
                ctx.intro_pattern_list().size() > 0 ? Optional.of(
                        ctx.intro_pattern_list().stream()
                                .map(intro_pattern_listContext -> new IntroPatternListVisitor().visit(intro_pattern_listContext))
                                .collect(Collectors.toList()))
                        :
                        Optional.empty()
        );
    }

    @Override
    public DisjConjIntroPattern visitIntroPatternsDisjConjIntroPattern(coqParser.IntroPatternsDisjConjIntroPatternContext ctx) {
        return new PatternDisjConjIntroPattern(ctx.intro_pattern().stream()
        .map(intro_patternContext -> new IntroPatternVisitor().visit(intro_patternContext))
        .collect(Collectors.toList()));
    }

    @Override
    public DisjConjIntroPattern visitAndIntroPatternDisjConjIntroPattern(coqParser.AndIntroPatternDisjConjIntroPatternContext ctx) {
        return new AndPatternDisjConjIntroPattern(ctx.intro_pattern().stream()
                .map(intro_patternContext -> new IntroPatternVisitor().visit(intro_patternContext))
                .collect(Collectors.toList()));
    }
}
