package antlr.visitor.vernacular;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.vernacular.utilities.AssumptionKeywordType;

public class AssumptionKeywordVisitor extends GenericVisitor<AssumptionKeywordType> {

    @Override
    public AssumptionKeywordType visitAxiom(coqParser.AxiomContext ctx) {
        return AssumptionKeywordType.AXIOM;
    }

    @Override
    public AssumptionKeywordType visitConj(coqParser.ConjContext ctx) {
        return AssumptionKeywordType.CONJECTURE;
    }

    @Override
    public AssumptionKeywordType visitParam(coqParser.ParamContext ctx) {
        return AssumptionKeywordType.PARAMETER;
    }

    @Override
    public AssumptionKeywordType visitParams(coqParser.ParamsContext ctx) {
        return AssumptionKeywordType.PARAMETERS;
    }

    @Override
    public AssumptionKeywordType visitVar(coqParser.VarContext ctx) {
        return AssumptionKeywordType.VARIABLE;
    }

    @Override
    public AssumptionKeywordType visitVars(coqParser.VarsContext ctx) {
        return AssumptionKeywordType.VARIABLES;
    }

    @Override
    public AssumptionKeywordType visitHyp(coqParser.HypContext ctx) {
        return AssumptionKeywordType.HYPOTHESIS;
    }

    @Override
    public AssumptionKeywordType visitHyps(coqParser.HypsContext ctx) {
        return AssumptionKeywordType.HYPOTHESES;
    }
}
