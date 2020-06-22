package antlr.visitor.atomicexpr;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.atomicexpr.utilities.IntroPatternVisitor;
import antlr.visitor.expr.ExprVisitor;
import antlr.visitor.term.IdentVisitor;
import antlr.visitor.term.TermVisitor;
import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.controlproofflow.*;
import model.tactics.atomic.tacargcomponents.*;

import java.util.stream.Collectors;

public class ControllingProofFlowVisitor extends GenericVisitor<AtomicTacticExpr> {
    @Override
    public AtomicTacticExpr visitByAssert(coqParser.ByAssertContext ctx) {
        return new Assert(new TermComponent(new TermVisitor().visit(ctx.term())),
                new ExprComponent(ComponentType.BY,new ExprVisitor().visit(ctx.expr())));
    }

    @Override
    public AtomicTacticExpr visitSpecialize(coqParser.SpecializeContext ctx) {
        if(ctx.intro_pattern() != null ){
            if(ctx.atomic_term().size() > 0){
                return new Specialize(new IdentComponent(new IdentVisitor().visit(ctx.ident())),
                        new AtomicTermListComponent(ctx.atomic_term()
                                .stream()
                                .map(
                                        atomic_termContext -> new TermVisitor().visit(atomic_termContext)
                                ).collect(Collectors.toList())),
                        new IntroPatternComponent(ComponentType.AS,new IntroPatternVisitor().visit(ctx.intro_pattern())));
            }
            else {
                return new Specialize(new IdentComponent(new IdentVisitor().visit(ctx.ident())),
                        new IntroPatternComponent(ComponentType.AS,new IntroPatternVisitor().visit(ctx.intro_pattern())));
            }
        }

        if(ctx.atomic_term().size() > 0) {
            return new Specialize(new IdentComponent(new IdentVisitor().visit(ctx.ident())),
                    new AtomicTermListComponent(ctx.atomic_term()
                            .stream()
                            .map(
                                    atomic_termContext -> new TermVisitor().visit(atomic_termContext)
                            ).collect(Collectors.toList())));
        }

        return new Specialize(new IdentComponent(new IdentVisitor().visit(ctx.ident())));
    }

    @Override
    public AtomicTacticExpr visitContradiction(coqParser.ContradictionContext ctx) {
        if(ctx.ident() != null){
            return new Contradiction(new IdentComponent(new IdentVisitor().visit(ctx.ident())));
        }
        return new Contradiction();
    }

    @Override
    public AtomicTacticExpr visitExfalso(coqParser.ExfalsoContext ctx) {
        return new ExFalso();
    }

    @Override
    public AtomicTacticExpr visitAbsurd(coqParser.AbsurdContext ctx) {
        return new Absurd(new TermComponent(
                new TermVisitor().visit(ctx.term())
        ));
    }

    @Override
    public AtomicTacticExpr visitTermGeneralize(coqParser.TermGeneralizeContext ctx) {
        return new Generalize(
                new TermListComponent(ctx.atomic_term()
                        .stream()
                        .map(
                                atomic_termContext -> new TermVisitor().visit(atomic_termContext)
                        ).collect(Collectors.toList())));
    }

    @Override
    public AtomicTacticExpr visitPoseProof(coqParser.PoseProofContext ctx) {
        if(ctx.intro_pattern() != null){
            return new PoseProof(
                    new TermComponent(new TermVisitor().visit(ctx.term())),
                    new IntroPatternComponent(ComponentType.AS,new IntroPatternVisitor().visit(ctx.intro_pattern()))
            );
        }
        return new PoseProof(
                new TermComponent(new TermVisitor().visit(ctx.term()))
                );
    }

    @Override
    public AtomicTacticExpr visitCut(coqParser.CutContext ctx) {
        return new Cut(new TermComponent(new TermVisitor().visit(ctx.term())));
    }

    @Override
    public AtomicTacticExpr visitEvar(coqParser.EvarContext ctx) {
        return new Evar(
                new IdentTermComponent(new IdentVisitor().visit(ctx.ident()),
               new TermVisitor().visit(ctx.term())));
    }

    @Override
    public AtomicTacticExpr visitTermAssert(coqParser.TermAssertContext ctx) {
        return new Assert(new TermComponent(new TermVisitor().visit(ctx.term())));
    }
}
