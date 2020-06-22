package antlr.visitor.atomicexpr;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.atomicexpr.utilities.RewPrefixVisitor;
import antlr.visitor.term.IdentVisitor;
import antlr.visitor.term.TermVisitor;
import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.rewriteexpr.Change;
import model.tactics.atomic.rewriteexpr.Rewrite;
import model.tactics.atomic.rewriteexpr.Subst;
import model.tactics.atomic.tacargcomponents.*;

public class RewritingExpressionsVisitor extends GenericVisitor<AtomicTacticExpr> {
    @Override
    public AtomicTacticExpr visitTermRewrite(coqParser.TermRewriteContext ctx) {

        return (ctx.rew_prefix() != null ?
                new Rewrite(new RewPrefixComponent(new RewPrefixVisitor().visit(ctx.rew_prefix())),
                        new TermComponent(new TermVisitor().visit(ctx.term()))) :
                new Rewrite(new TermComponent(new TermVisitor().visit(ctx.term()))));
    }

    @Override
    public AtomicTacticExpr visitLeftArrowRewrite(coqParser.LeftArrowRewriteContext ctx) {
        if(ctx.rew_prefix() != null) {
            return new Rewrite( new RewPrefixComponent(ComponentType.LEFTARROW,new RewPrefixVisitor().visit(ctx.rew_prefix())),
                    new TermComponent(new TermVisitor().visit(ctx.term())));
        } else {
            return new Rewrite(
                    new TermComponent(ComponentType.LEFTARROW,new TermVisitor().visit(ctx.term())));
        }
    }

    @Override
    public AtomicTacticExpr visitTermWithChange(coqParser.TermWithChangeContext ctx) {
        return new Change(new TermComponent(new TermVisitor().visit(ctx.term(0))),
        new TermComponent(ComponentType.WITH,new TermVisitor().visit(ctx.term(1))));
    }

    @Override
    public AtomicTacticExpr visitSubst(coqParser.SubstContext ctx) {
        return new Subst();
    }

    @Override
    public AtomicTacticExpr visitTermInChange(coqParser.TermInChangeContext ctx) {
        return new Change(
                new TermComponent(new TermVisitor().visit(ctx.term())),
                new IdentComponent(ComponentType.IN,new IdentVisitor().visit(ctx.ident())));
    }
}
