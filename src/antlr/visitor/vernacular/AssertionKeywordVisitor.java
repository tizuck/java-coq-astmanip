package antlr.visitor.vernacular;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.vernacular.utilities.AssertionKeywordType;

public class AssertionKeywordVisitor extends GenericVisitor<AssertionKeywordType> {

    @Override
    public AssertionKeywordType visitTheo(coqParser.TheoContext ctx) {
        return AssertionKeywordType.THEOREM;
    }

    @Override
    public AssertionKeywordType visitLem(coqParser.LemContext ctx) {
        return AssertionKeywordType.LEMMA;
    }

    @Override
    public AssertionKeywordType visitRema(coqParser.RemaContext ctx) {
        return AssertionKeywordType.REMARK;
    }

    @Override
    public AssertionKeywordType visitFac(coqParser.FacContext ctx) {
        return AssertionKeywordType.FACT;
    }

    @Override
    public AssertionKeywordType visitCol(coqParser.ColContext ctx) {
        return AssertionKeywordType.COROLLARY;
    }

    @Override
    public AssertionKeywordType visitProp(coqParser.PropContext ctx) {
        return AssertionKeywordType.PROPOSITION;
    }

    @Override
    public AssertionKeywordType visitDefAssert(coqParser.DefAssertContext ctx) {
        return AssertionKeywordType.DEFINITION;
    }

    @Override
    public AssertionKeywordType visitExam(coqParser.ExamContext ctx) {
        return AssertionKeywordType.EXAMPLE;
    }
}
