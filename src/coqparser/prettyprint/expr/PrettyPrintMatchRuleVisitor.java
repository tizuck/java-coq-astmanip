package coqparser.prettyprint.expr;

import coqparser.prettyprint.PrettyPrintConfiguration;
import coqparser.prettyprint.PrettyPrintContext;
import coqparser.prettyprint.term.PrettyPrintIdentVisitor;
import coqparser.prettyprint.term.PrettyPrintTermVisitor;
import model.tactics.expr.utilities.ContextMatchRule;
import model.tactics.expr.utilities.StdMatchRule;
import model.tactics.expr.utilities.UnderscoreMatchRule;
import model.visitor.expr.MatchRuleVisitor;

public class PrettyPrintMatchRuleVisitor implements MatchRuleVisitor<String, PrettyPrintContext> {

    private final PrettyPrintConfiguration prettyPrintConfiguration;

    public PrettyPrintMatchRuleVisitor(PrettyPrintConfiguration prettyPrintConfiguration) {
        this.prettyPrintConfiguration = prettyPrintConfiguration;
    }

    @Override
    public String visit(StdMatchRule stdMatchRule, PrettyPrintContext prettyPrintContext) {
        return prettyPrintContext.indentExpression("| " +
                        stdMatchRule.getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                        " => " +
                        stdMatchRule.getExpr().accept(new PrettyPrintExprVisitor(prettyPrintConfiguration),
                                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                ,prettyPrintConfiguration,0);
    }

    @Override
    public String visit(ContextMatchRule contextMatchRule, PrettyPrintContext prettyPrintContext) {
        return prettyPrintContext.indentExpression("|"+
                        " context " +
                        (contextMatchRule.getoIdent().isPresent()?contextMatchRule.getoIdent().get().accept(new PrettyPrintIdentVisitor(),prettyPrintContext):"") +
                        " [ " +
                        contextMatchRule.getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                        " ] " +
                        "=> " +
                        contextMatchRule.getExpr().accept(new PrettyPrintExprVisitor(prettyPrintConfiguration),
                                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                ,prettyPrintConfiguration,0);
    }

    @Override
    public String visit(UnderscoreMatchRule underscoreMatchRule, PrettyPrintContext prettyPrintContext) {
        return prettyPrintContext.indentExpression("| " +
                        "_ " +
                        "=> " +
                        underscoreMatchRule.getExpr().accept(new PrettyPrintExprVisitor(prettyPrintConfiguration),
                                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)),
                prettyPrintConfiguration,0);
    }
}
