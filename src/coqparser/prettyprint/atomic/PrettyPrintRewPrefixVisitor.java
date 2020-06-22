package coqparser.prettyprint.atomic;

import coqparser.prettyprint.PrettyPrintContext;
import model.tactics.atomic.utilities.ExclamationmarkRewPrefix;
import model.tactics.atomic.utilities.QuestionmarkRewPrefix;
import model.visitor.atomic.RewPrefixVisitor;

public class PrettyPrintRewPrefixVisitor implements RewPrefixVisitor<String, PrettyPrintContext> {
    @Override
    public String visit(QuestionmarkRewPrefix questionmarkRewPrefix, PrettyPrintContext prettyPrintContext) {

        return "?" +
                (questionmarkRewPrefix.getoNum().isPresent()? questionmarkRewPrefix.getoNum().get().toString():"");

    }

    @Override
    public String visit(ExclamationmarkRewPrefix exclamationmarkRewPrefix, PrettyPrintContext prettyPrintContext) {
        return "?" +
                (exclamationmarkRewPrefix.getoNum().isPresent()? exclamationmarkRewPrefix.getoNum().get().toString():"");
    }
}
