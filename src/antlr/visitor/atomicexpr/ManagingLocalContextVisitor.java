package antlr.visitor.atomicexpr;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.atomicexpr.utilities.IntroPatternListVisitor;
import antlr.visitor.term.IdentVisitor;
import antlr.visitor.term.TermVisitor;
import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.manageloccont.*;
import model.tactics.atomic.tacargcomponents.*;
import model.term.utilities.Ident;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagingLocalContextVisitor extends GenericVisitor<AtomicTacticExpr> {
    @Override
    public AtomicTacticExpr visitIntroPatternListIntros(coqParser.IntroPatternListIntrosContext ctx) {
        return new Intros(new IntroPatternListComponent(new IntroPatternListVisitor().visit(ctx.intro_pattern_list())));
    }

    @Override
    public AtomicTacticExpr visitIdentIntros(coqParser.IdentIntrosContext ctx) {
        return new Intros(new IdentComponent(new IdentVisitor().visit(ctx.ident())));
    }

    @Override
    public AtomicTacticExpr visitIdentsIntros(coqParser.IdentsIntrosContext ctx) {
        return new Intros(new IdentListComponent(ctx.ident().stream()
        .map(identContext -> new IdentVisitor().visit(identContext))
        .collect(Collectors.toList())));
    }

    @Override
    public AtomicTacticExpr visitIntros(coqParser.IntrosContext ctx) {
        return new Intros();
    }

    @Override
    public AtomicTacticExpr visitIdentIntro(coqParser.IdentIntroContext ctx) {
        return new Intro(new IdentComponent(new IdentVisitor().visit(ctx.ident())));
    }

    @Override
    public AtomicTacticExpr visitIdentSet(coqParser.IdentSetContext ctx) {
        return new Set(new IdentTermBindComponent(new IdentVisitor().visit(ctx.ident()),new TermVisitor().visit(ctx.term())));
    }

    @Override
    public AtomicTacticExpr visitIntro(coqParser.IntroContext ctx) {
        return new Intro();
    }

    @Override
    public AtomicTacticExpr visitIdentsRevert(coqParser.IdentsRevertContext ctx) {
        return new Revert(
                new IdentListComponent(ctx.ident().stream()
                        .map(identContext -> new IdentVisitor().visit(identContext))
                        .collect(Collectors.toList())));
    }

    @Override
    public AtomicTacticExpr visitRename(coqParser.RenameContext ctx) {
        List<Ident> ids1 = new ArrayList<>();
        List<Ident> ids2 = new ArrayList<>();
        for (int i = 0; i < ctx.ident().size() - 1; i++) {
           ids1.add(new IdentVisitor().visit(ctx.ident(i)));
           ids2.add(new IdentVisitor().visit(ctx.ident(i+1)));
        }
        return new Rename(new IdentPairListComponent(ids1,ids2));
    }

    @Override
    public AtomicTacticExpr visitIdentsClear(coqParser.IdentsClearContext ctx) {
        return new Clear(
                new IdentListComponent(ctx.ident()
                .stream()
                .map(
                        identContext -> new IdentVisitor().visit(identContext)
                )
                .collect(Collectors.toList()))
        );
    }
}
