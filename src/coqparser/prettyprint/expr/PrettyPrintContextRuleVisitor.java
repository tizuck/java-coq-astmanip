package coqparser.prettyprint.expr;

import coqparser.prettyprint.PrettyPrintConfiguration;
import coqparser.prettyprint.PrettyPrintContext;
import coqparser.prettyprint.term.PrettyPrintIdentVisitor;
import coqparser.prettyprint.term.PrettyPrintTermVisitor;
import model.tactics.expr.utilities.*;
import model.visitor.expr.ContextRuleVisitor;

public class PrettyPrintContextRuleVisitor implements ContextRuleVisitor<String, PrettyPrintContext> {
    private final PrettyPrintConfiguration prettyPrintConfiguration;

    public PrettyPrintContextRuleVisitor(PrettyPrintConfiguration prettyPrintConfiguration) {
        this.prettyPrintConfiguration = prettyPrintConfiguration;
    }

    @Override
    public String visit(ContextHypContextRule contextHypContextRule, PrettyPrintContext prettyPrintContext) {
        String contextHyps = "";
        for (int i = 0; i < contextHypContextRule.getContextHyps().size(); i++) {
            if(i == 0){
                contextHyps += contextHypContextRule.getContextHyps().get(i).accept(
                        new PrettyPrintContextHypVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),
                                PrettyPrintConfiguration.HIGHESTPREC,
                                PrettyPrintContext.TREETYPE.MULTI)
                ) + " ";
            }
            else {
                contextHyps += ", " + contextHypContextRule.getContextHyps().get(i).accept(
                        new PrettyPrintContextHypVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),
                                PrettyPrintConfiguration.HIGHESTPREC,
                                PrettyPrintContext.TREETYPE.MULTI)
                ) + " ";
            }
        }

        return prettyPrintContext.indentExpression(contextHyps +
                "|- " +
                contextHypContextRule.getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                " => " +
                contextHypContextRule.getExpr().accept(new PrettyPrintExprVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                        (contextHypContextRule.getOptionalIdent().isPresent()?"@ " + contextHypContextRule.getOptionalIdent().get().accept(new PrettyPrintIdentVisitor(),prettyPrintContext)
                                :"")
                ,prettyPrintConfiguration,0);

    }

    @Override
    public String visit(UnderscoreContextRule underscoreContextRule, PrettyPrintContext prettyPrintContext) {
        return prettyPrintContext.indentExpression("_ " +
                "=> " +
                underscoreContextRule.getExpr().accept(new PrettyPrintExprVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                (underscoreContextRule.getOptionalIdent().isPresent()?"@ " + underscoreContextRule.getOptionalIdent().get().accept(new PrettyPrintIdentVisitor(),prettyPrintContext)
                        :""),prettyPrintConfiguration,0);
    }

    @Override
    public String visit(StdContextRule stdContextRule, PrettyPrintContext prettyPrintContext) {
        return  prettyPrintContext.indentExpression(stdContextRule.getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                " => " +
                stdContextRule.getExpr().accept(new PrettyPrintExprVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                (stdContextRule.getOptionalIdent().isPresent()?"@ " + stdContextRule.getOptionalIdent().get().accept(new PrettyPrintIdentVisitor(),prettyPrintContext)
                :""),prettyPrintConfiguration,0);
    }

    @Override
    public String visit(DerivedContextRule derivedContextRule, PrettyPrintContext prettyPrintContext) {
        return prettyPrintContext.indentExpression("|- " +
               derivedContextRule.getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                       new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                " => " +
                derivedContextRule.getExpr().accept(new PrettyPrintExprVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                (derivedContextRule.getOptionalIdent().isPresent()?"@ " + derivedContextRule.getOptionalIdent().get().accept(new PrettyPrintIdentVisitor(),prettyPrintContext)
                        :""),prettyPrintConfiguration,0);

    }

    @Override
    public String visit(BracedContextHypContextRule bracedContextHypContextRule, PrettyPrintContext prettyPrintContext) {
        String contextHyps = "";
        for (int i = 0; i < bracedContextHypContextRule.getContextHyps().size(); i++) {
            if(i == 0){
                contextHyps += bracedContextHypContextRule.getContextHyps().get(i).accept(
                        new PrettyPrintContextHypVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),
                                PrettyPrintConfiguration.HIGHESTPREC,
                                PrettyPrintContext.TREETYPE.MULTI)
                ) + " ";
            }
            else {
                contextHyps += ", " + bracedContextHypContextRule.getContextHyps().get(i).accept(
                        new PrettyPrintContextHypVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),
                                PrettyPrintConfiguration.HIGHESTPREC,
                                PrettyPrintContext.TREETYPE.MULTI)
                ) + " ";
            }
        }

        return prettyPrintContext.indentExpression("[ " +
                        contextHyps +
                        "|- " +
                        bracedContextHypContextRule.getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                        " ]" +
                        " => " +
                        bracedContextHypContextRule.getExpr().accept(new PrettyPrintExprVisitor(prettyPrintConfiguration),
                                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                        (bracedContextHypContextRule.getOptionalIdent().isPresent()?"@ " + bracedContextHypContextRule.getOptionalIdent().get().accept(new PrettyPrintIdentVisitor(),prettyPrintContext)
                                :"")
                ,prettyPrintConfiguration,0);
    }
}
