package coqparser.prettyprint.expr;

import coqparser.prettyprint.PrettyPrintConfiguration;
import coqparser.prettyprint.PrettyPrintContext;
import coqparser.prettyprint.term.PrettyPrintTermVisitor;
import model.tactics.expr.utilities.*;
import model.visitor.expr.AtomVisitor;

public class PrettyPrintAtomVisitor implements AtomVisitor<String, PrettyPrintContext> {

    private final PrettyPrintConfiguration prettyPrintConfiguration;

    public PrettyPrintAtomVisitor(PrettyPrintConfiguration prettyPrintConfiguration) {
        this.prettyPrintConfiguration = prettyPrintConfiguration;
    }

    @Override
    public String visit(UnitAtom unitAtom, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(IntAtom intAtom, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(QualidAtom qualidAtom, PrettyPrintContext prettyPrintContext) {
        return qualidAtom.getQualid().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
    }

    @Override
    public String visit(DotAtom dotAtom, PrettyPrintContext prettyPrintContext) {
        return "..";
    }

    @Override
    public String visit(ExprAtom exprAtom, PrettyPrintContext prettyPrintContext) {
        return "(" +
                exprAtom.getExpr().accept(
                        new PrettyPrintExprVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation()+1,PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                ")";
    }
}
