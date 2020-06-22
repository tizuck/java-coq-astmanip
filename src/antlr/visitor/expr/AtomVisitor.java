package antlr.visitor.expr;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.term.QualidVisitor;
import model.tactics.expr.utilities.*;

public class AtomVisitor extends GenericVisitor<Atom> {

    private ExprVisitor exprVisitor;

    public AtomVisitor(ExprVisitor exprVisitor) {
        this.exprVisitor = exprVisitor;
    }


    @Override
    public Atom visitQualidAtom(coqParser.QualidAtomContext ctx) {
        return new QualidAtom(new QualidVisitor().visit(ctx.qualid()));
    }

    @Override
    public Atom visitUnitAtom(coqParser.UnitAtomContext ctx) {
        return new UnitAtom();
    }

    @Override
    public Atom visitIntAtom(coqParser.IntAtomContext ctx) {
        if(ctx.integ().SUB() != null) {
            return new IntAtom(Integer.valueOf(ctx.integ().NUM().getSymbol().getText()) * (-1));
        }
        else {
            return new IntAtom(Integer.valueOf(ctx.integ().NUM().getSymbol().getText()));
        }
    }

    @Override
    public Atom visitBracedExprAtom(coqParser.BracedExprAtomContext ctx) {
        return new ExprAtom(exprVisitor.visit(ctx.expr()));
    }

    @Override
    public Atom visitDotExprAtom(coqParser.DotExprAtomContext ctx) {
        return new DotAtom();
    }
}
