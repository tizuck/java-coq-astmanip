package antlr.visitor.atomicexpr;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.term.IdentVisitor;
import antlr.visitor.term.QualidVisitor;
import antlr.visitor.term.TermVisitor;
import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.performcompute.*;
import model.tactics.atomic.tacargcomponents.*;
import model.term.Number;
import model.term.Qualid;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PerformingComputationVisitor extends GenericVisitor<AtomicTacticExpr> {

    @Override
    public AtomicTacticExpr visitSimpl(coqParser.SimplContext ctx) {
        return new Simpl();
    }

    @Override
    public AtomicTacticExpr visitUnfoldQualidIn(coqParser.UnfoldQualidInContext ctx) {
        if(ctx.ident() != null){
            return new Unfold(new QualidComponent(new QualidVisitor().visit(ctx.qualid())),
                    new IdentComponent(ComponentType.IN,new IdentVisitor().visit(ctx.ident())));
        }
        else {
            return new Unfold(new QualidComponent(new QualidVisitor().visit(ctx.qualid())));
        }
    }

    @Override
    public AtomicTacticExpr visitRed(coqParser.RedContext ctx) {
        return new Red();
    }

    @Override
    public AtomicTacticExpr visitPerformingCompuationPattern(coqParser.PerformingCompuationPatternContext ctx) {
        return new Pattern(new TermComponent(new TermVisitor().visit(ctx.term())));
    }

    @Override
    public AtomicTacticExpr visitSimpleStar(coqParser.SimpleStarContext ctx) {
        return Simpl.ofStar();
    }

    @Override
    public AtomicTacticExpr visitAtPattern(coqParser.AtPatternContext ctx) {
        if(ctx.SUB() != null){
            return new Pattern(new TermComponent(new TermVisitor().visit(ctx.term())),
                    new NumberListComponent(ComponentType.AT,ctx.NUM()
                            .stream()
                            .map(terminalNode -> new Number(Integer.valueOf(terminalNode.getSymbol().getText())))
                            .collect(Collectors.toList())));
        }
        return new Pattern(new TermComponent(new TermVisitor().visit(ctx.term())),
                new NumberListComponent(ComponentType.AT,ctx.NUM()
                        .stream()
                        .map(terminalNode -> new Number(Integer.valueOf(terminalNode.getSymbol().getText())))
                        .collect(Collectors.toList())));
    }

    @Override
    public AtomicTacticExpr visitFold(coqParser.FoldContext ctx) {
        return new Fold(
                new AtomicTermListComponent(ctx.term()
                .stream()
                .map(termContext -> new TermVisitor().visit(termContext))
                .collect(Collectors.toList()))
        );
    }

    @Override
    public AtomicTacticExpr visitAtUnfoldQualid(coqParser.AtUnfoldQualidContext ctx) {
        List<Qualid> qualids = new ArrayList<>();
        List<List<Number>> numberss = new ArrayList<>();

        ctx.qualidNumAt().forEach(qualidNumAtContext -> {
            qualids.add(new QualidVisitor().visit(qualidNumAtContext.qualid()));
            numberss.add(
                    qualidNumAtContext
                    .NUM()
                    .stream()
                    .map(
                            terminalNode -> new Number(Integer.valueOf(terminalNode.getSymbol().getText()))
                    )
                    .collect(Collectors.toList())
            );
        });

        return new Unfold(qualids,numberss);
    }

    @Override
    public AtomicTacticExpr visitIdentRed(coqParser.IdentRedContext ctx) {
        return new Red(new IdentComponent(ComponentType.IN,new IdentVisitor().visit(ctx.ident())));
    }
}
