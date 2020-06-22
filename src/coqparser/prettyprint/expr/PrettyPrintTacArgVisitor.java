package coqparser.prettyprint.expr;

import coqparser.prettyprint.PrettyPrintConfiguration;
import coqparser.prettyprint.PrettyPrintContext;
import coqparser.prettyprint.term.PrettyPrintTermVisitor;
import model.tactics.expr.utilities.*;
import model.visitor.expr.TacArgVisitor;

public class PrettyPrintTacArgVisitor implements TacArgVisitor<String, PrettyPrintContext> {

    private final PrettyPrintConfiguration prettyPrintConfiguration;

    public PrettyPrintTacArgVisitor(PrettyPrintConfiguration prettyPrintConfiguration) {
        this.prettyPrintConfiguration = prettyPrintConfiguration;
    }

    @Override
    public String visit(QualidTacArg qualidTacArg, PrettyPrintContext prettyPrintContext) {
        return qualidTacArg.getQualid().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                prettyPrintContext);
    }

    @Override
    public String visit(UnitTacArg unitTacArg, PrettyPrintContext prettyPrintContext) {
        return "()";
    }

    @Override
    public String visit(LtacTacArg ltacTacArg, PrettyPrintContext prettyPrintContext) {
        return "ltac : " +
                ltacTacArg.getAtom().accept(new PrettyPrintAtomVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),
                                PrettyPrintConfiguration.HIGHESTPREC,
                                PrettyPrintContext.TREETYPE.MULTI));
    }

    @Override
    public String visit(TermTacArg termTacArg, PrettyPrintContext prettyPrintContext) {
        return termTacArg.getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),
                        PrettyPrintConfiguration.HIGHESTPREC,
                        PrettyPrintContext.TREETYPE.MULTI));
    }

    @Override
    public String visit(StringTacArg stringTacArg, PrettyPrintContext prettyPrintContext) {
        return "( " +
                stringTacArg.getStr() +
                " )";
    }
}
