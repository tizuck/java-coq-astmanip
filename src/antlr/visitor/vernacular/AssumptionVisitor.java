package antlr.visitor.vernacular;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.vernacular.Assumption;
import model.vernacular.utilities.Assums;

import java.util.ArrayList;
import java.util.List;

public class AssumptionVisitor extends GenericVisitor<Assumption> {
    private final AssumsVisitor assumsVisitor;
    private final AssumptionKeywordVisitor assumptionKeywordVisitor;

    public AssumptionVisitor() {
        assumsVisitor = new AssumsVisitor();
        assumptionKeywordVisitor = new AssumptionKeywordVisitor();
    }

    @Override
    public Assumption visitSingleAssumption(coqParser.SingleAssumptionContext ctx) {
        List<Assums> assumss = new ArrayList<>();
        assumss.add(assumsVisitor.visit(ctx.assums()));
        return new Assumption(assumptionKeywordVisitor.visit(ctx.assumption_keyword()),
                assumss);
    }

    @Override
    public Assumption visitMultipleAssumption(coqParser.MultipleAssumptionContext ctx){
        List<Assums> assumss = new ArrayList<>();
        ctx.assums().forEach(assumsContext -> {assumss.add(assumsVisitor.visit(assumsContext));});
        return new Assumption(assumptionKeywordVisitor.visit(ctx.assumption_keyword()),
                assumss);
    }
}
