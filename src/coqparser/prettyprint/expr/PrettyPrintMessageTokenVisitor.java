package coqparser.prettyprint.expr;

import coqparser.prettyprint.PrettyPrintContext;
import coqparser.prettyprint.term.PrettyPrintIdentVisitor;
import model.tactics.expr.utilities.IdMessageToken;
import model.tactics.expr.utilities.IntMessageToken;
import model.tactics.expr.utilities.StringMessageToken;
import model.visitor.expr.MessageTokenVisitor;

public class PrettyPrintMessageTokenVisitor implements MessageTokenVisitor<String, PrettyPrintContext> {

    @Override
    public String visit(StringMessageToken stringMessageToken, PrettyPrintContext prettyPrintContext) {
        return stringMessageToken.getStr();
    }

    @Override
    public String visit(IdMessageToken idMessageToken, PrettyPrintContext prettyPrintContext) {
        return idMessageToken.getValue().accept(new PrettyPrintIdentVisitor(),prettyPrintContext);
    }

    @Override
    public String visit(IntMessageToken intMessageToken, PrettyPrintContext prettyPrintContext) {
        return String.valueOf(intMessageToken.getValue());
    }
}
