package antlr.visitor.expr;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.term.IdentVisitor;
import model.tactics.expr.utilities.IdMessageToken;
import model.tactics.expr.utilities.IntMessageToken;
import model.tactics.expr.utilities.MessageToken;
import model.tactics.expr.utilities.StringMessageToken;

public class MessageTokenVisitor extends GenericVisitor<MessageToken> {

    @Override
    public MessageToken visitStringMessageToken(coqParser.StringMessageTokenContext ctx) {
        return new StringMessageToken(ctx.STRING().getSymbol().getText());
    }

    @Override
    public MessageToken visitIdentMessageToken(coqParser.IdentMessageTokenContext ctx) {
        return new IdMessageToken(new IdentVisitor().visit(ctx.ident()));
    }

    @Override
    public MessageToken visitIntMessageToken(coqParser.IntMessageTokenContext ctx) {
        return new IntMessageToken(
                ctx.integ().SUB() != null ? Integer.valueOf(ctx.integ().NUM().getSymbol().getText()) * (-1)
                        : Integer.valueOf(ctx.integ().NUM().getSymbol().getText()));
    }
}
