package model.visitor.atomic;

import model.tactics.atomic.utilities.ExclamationmarkRewPrefix;
import model.tactics.atomic.utilities.QuestionmarkRewPrefix;

public interface RewPrefixVisitor<R,P> {
    R visit(QuestionmarkRewPrefix questionmarkRewPrefix,P p);
    R visit(ExclamationmarkRewPrefix exclamationmarkRewPrefix,P p);
}
