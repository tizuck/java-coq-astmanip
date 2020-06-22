package antlr.visitor.atomicexpr.utilities;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.tactics.atomic.utilities.ActionIntroPattern;

public class ActionIntroPatternVisitor extends GenericVisitor<ActionIntroPattern> {
    @Override
    public ActionIntroPattern visitDisjConjActionIntroPattern(coqParser.DisjConjActionIntroPatternContext ctx) {
        return new DisjConjIntroPatternVisitor().visit(ctx.disj_conj_intro_pattern());
    }

    @Override
    public ActionIntroPattern visitEqualActionIntroPattern(coqParser.EqualActionIntroPatternContext ctx) {
        return new EqualIntroPatternVisitor().visit(ctx.equal_intro_pattern());
    }
}
