package coqparser.prettyprint.atomic;

import coqparser.prettyprint.PrettyPrintConfiguration;
import coqparser.prettyprint.PrettyPrintContext;
import coqparser.prettyprint.term.PrettyPrintRefVisitor;
import coqparser.prettyprint.term.PrettyPrintTermVisitor;
import model.tactics.atomic.utilities.RefBindingListBody;
import model.tactics.atomic.utilities.TermBindingListBody;
import model.visitor.atomic.BindingListBodyVisitor;

public class PrettyPrintBindingListBodyVisitor implements BindingListBodyVisitor<String, PrettyPrintContext> {

    private final PrettyPrintConfiguration prettyPrintConfiguration;

    public PrettyPrintBindingListBodyVisitor(PrettyPrintConfiguration prettyPrintConfiguration) {
        this.prettyPrintConfiguration = prettyPrintConfiguration;
    }

    @Override
    public String visit(RefBindingListBody refBindingListBody, PrettyPrintContext prettyPrintContext) {
        return "( " +
                refBindingListBody.getRef().accept(new PrettyPrintRefVisitor(),prettyPrintContext) +
                " := " +
                refBindingListBody.getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation()+1,
                                PrettyPrintConfiguration.HIGHESTPREC,
                                PrettyPrintContext.TREETYPE.MULTI)) +
                " )";
    }

    @Override
    public String visit(TermBindingListBody termBindingListBody, PrettyPrintContext prettyPrintContext) {
        return null;
    }
}
