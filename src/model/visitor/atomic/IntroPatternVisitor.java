package model.visitor.atomic;

import model.tactics.atomic.utilities.*;

public interface IntroPatternVisitor<R,P> {

    R visit(NamingIntroPattern namingIntroPattern, P p);

    R visit(AndPatternDisjConjIntroPattern andPatternDisjConjIntroPattern,P p);

    R visit(NamingIntroPatternEqualIntroPattern namingIntroPatternEqualIntroPattern,P p);

    R visit(OrEqualIntroPattern orEqualIntroPattern,P p);

    R visit(PatternDisjConjIntroPattern patternDisjConjIntroPattern,P p);

    R visit(PatternListsDisjConjIntroPattern patternListsDisjConjIntroPattern,P p);

    R visit(UnderscoreIntroPattern underscoreIntroPattern,P p);

    R visit(PercIntroPattern percIntroPattern,P p);

    R visit(StarIntroPattern starIntroPattern,P p);

    R visit(StarStarIntroPattern starStarIntroPattern,P p);
}
