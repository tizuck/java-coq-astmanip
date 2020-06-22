package coqparser.prettyprint.toplevel;

import coqparser.prettyprint.PrettyPrintConfiguration;
import coqparser.prettyprint.PrettyPrintContext;
import coqparser.prettyprint.expr.PrettyPrintExprVisitor;
import coqparser.prettyprint.term.PrettyPrintIdentVisitor;
import coqparser.prettyprint.term.PrettyPrintTermVisitor;
import model.term.utilities.Ident;
import model.toplevel.utilities.IdentLtacDef;
import model.toplevel.utilities.QualidLtacDef;
import model.visitor.toplevel.LtacDefVisitor;

public class PrettyPrintLtacDefVisitor implements LtacDefVisitor<String, PrettyPrintContext> {

    private final PrettyPrintConfiguration prettyPrintConfiguration;

    public PrettyPrintLtacDefVisitor(PrettyPrintConfiguration prettyPrintConfiguration) {
        this.prettyPrintConfiguration = prettyPrintConfiguration;
    }

    @Override
    public String visit(QualidLtacDef qualidLtacDef, PrettyPrintContext prettyPrintContext) {
        String oIdents = "";
        if(qualidLtacDef.getoIds().isPresent()){
            for (Ident ident : qualidLtacDef.getoIds().get()) {
                oIdents += ident.accept(new PrettyPrintIdentVisitor(),
                        prettyPrintContext) + " ";
            }
        }
        return qualidLtacDef.getQualid().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                prettyPrintContext) +
                oIdents +
                ":= " +
                prettyPrintContext.indentExpression(qualidLtacDef.getExpr().accept(new PrettyPrintExprVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation() + 1,
                                PrettyPrintConfiguration.HIGHESTPREC,
                                PrettyPrintContext.TREETYPE.MULTI)),prettyPrintConfiguration,1);


    }

    @Override
    public String visit(IdentLtacDef identLtacDef, PrettyPrintContext prettyPrintContext) {
        String oIdents = "";
        for (Ident ident : identLtacDef.getIds()) {
            oIdents += ident.accept(new PrettyPrintIdentVisitor(),
                        prettyPrintContext) + " ";
        }
        return oIdents +
                ":= " +
                prettyPrintConfiguration.getEOL() +
                prettyPrintContext.indentExpression(identLtacDef.getExpr().accept(new PrettyPrintExprVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation() + 1,
                                PrettyPrintConfiguration.HIGHESTPREC,
                                PrettyPrintContext.TREETYPE.MULTI)),prettyPrintConfiguration,1);


    }
}
