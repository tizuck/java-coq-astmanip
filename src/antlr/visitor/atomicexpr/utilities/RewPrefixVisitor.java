package antlr.visitor.atomicexpr.utilities;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.tactics.atomic.utilities.ExclamationmarkRewPrefix;
import model.tactics.atomic.utilities.QuestionmarkRewPrefix;
import model.tactics.atomic.utilities.RewPrefix;

import java.util.Optional;

public class RewPrefixVisitor extends GenericVisitor<RewPrefix> {

    @Override
    public RewPrefix visitQuestion(coqParser.QuestionContext ctx) {
        return new QuestionmarkRewPrefix(ctx.NUM() != null ?
                Optional.of(Integer.valueOf(ctx.NUM().getSymbol().getText())) :
                Optional.empty());
    }

    @Override
    public RewPrefix visitExclamation(coqParser.ExclamationContext ctx) {
        return new ExclamationmarkRewPrefix(ctx.NUM() != null ?
                Optional.of(Integer.valueOf(ctx.NUM().getSymbol().getText())) :
                Optional.empty());
    }
}
