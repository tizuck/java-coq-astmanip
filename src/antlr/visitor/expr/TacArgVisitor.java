package antlr.visitor.expr;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.term.QualidVisitor;
import antlr.visitor.term.TermVisitor;
import model.tactics.expr.utilities.*;

public class TacArgVisitor extends GenericVisitor<TacArg> {

    @Override
    public TacArg visitQualidTacArg(coqParser.QualidTacArgContext ctx) {
        return new QualidTacArg(new QualidVisitor().visit(ctx.qualid()));
    }

    @Override
    public TacArg visitUnitTacArg(coqParser.UnitTacArgContext ctx) {
        return new UnitTacArg();
    }

    @Override
    public TacArg visitLtacTacArg(coqParser.LtacTacArgContext ctx) {
        return new LtacTacArg(new AtomVisitor(new ExprVisitor()).visit(ctx.atom()));
    }

    @Override
    public TacArg visitStringTacArg(coqParser.StringTacArgContext ctx) {
        return new StringTacArg(ctx.STRING().getSymbol().getText());
    }

    @Override
    public TacArg visitTermTacArg(coqParser.TermTacArgContext ctx) {
        return new TermTacArg(new TermVisitor().visit(ctx.below_term_ex_minus()));
    }
}
