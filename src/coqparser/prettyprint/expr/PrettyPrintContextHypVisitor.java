package coqparser.prettyprint.expr;

import coqparser.prettyprint.PrettyPrintConfiguration;
import coqparser.prettyprint.PrettyPrintContext;
import coqparser.prettyprint.term.PrettyPrintTermVisitor;
import model.tactics.expr.utilities.ExprContextHyp;
import model.tactics.expr.utilities.StdContextHyp;
import model.visitor.expr.ContextHypVisitor;

public class PrettyPrintContextHypVisitor implements ContextHypVisitor<String, PrettyPrintContext> {

    private final PrettyPrintConfiguration prettyPrintConfiguration;

    public PrettyPrintContextHypVisitor(PrettyPrintConfiguration prettyPrintConfiguration) {
        this.prettyPrintConfiguration = prettyPrintConfiguration;
    }

    @Override
    public String visit(StdContextHyp stdContextHyp, PrettyPrintContext prettyPrintContext) {
        return stdContextHyp.getName().toString() +
                " : " +
                stdContextHyp.getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));

    }

    @Override
    public String visit(ExprContextHyp exprContextHyp, PrettyPrintContext prettyPrintContext) {
        String oTerm = "";
        if(exprContextHyp.getoTerm().isPresent()){
            oTerm = exprContextHyp.getoTerm().get().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                    new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
        }
        return exprContextHyp.getName().toString() +
                " := " +
                exprContextHyp.getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                " " +
                (oTerm.equals("")?"":": " + oTerm + " ") +
                "=> " +
                exprContextHyp.getExpr().accept(new PrettyPrintExprVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
    }
}
