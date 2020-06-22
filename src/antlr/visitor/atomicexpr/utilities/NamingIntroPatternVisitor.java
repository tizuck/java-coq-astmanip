package antlr.visitor.atomicexpr.utilities;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.term.IdentVisitor;
import model.tactics.atomic.utilities.NamingIntroPattern;

import java.util.Optional;

public class NamingIntroPatternVisitor extends GenericVisitor<NamingIntroPattern> {

    @Override
    public NamingIntroPattern visitIdentNaming(coqParser.IdentNamingContext ctx) {
        return new NamingIntroPattern(false,
                Optional.of(new IdentVisitor().visit(ctx.ident())));
    }

    @Override
    public NamingIntroPattern visitQuestionIdentNaming(coqParser.QuestionIdentNamingContext ctx) {
        return new NamingIntroPattern(true,
                Optional.of(new IdentVisitor().visit(ctx.ident())));
    }

    @Override
    public NamingIntroPattern visitQuestionNaming(coqParser.QuestionNamingContext ctx) {
        return new NamingIntroPattern(true,
                Optional.empty());
    }
}

