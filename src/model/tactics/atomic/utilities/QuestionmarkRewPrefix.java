package model.tactics.atomic.utilities;

import model.visitor.atomic.RewPrefixVisitor;

import java.util.Optional;

public class QuestionmarkRewPrefix extends RewPrefix {


    public QuestionmarkRewPrefix(Optional<Number> oNum) {
        super(oNum);
    }

    @Override
    public <R, P> R accept(RewPrefixVisitor<R, P> rewPrefixVisitor, P p) {
        return rewPrefixVisitor.visit(this,p);
    }
}
