package antlr.visitor.atomicexpr;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.expr.ExprVisitor;
import antlr.visitor.term.IdentVisitor;
import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.automation.Auto;
import model.tactics.atomic.automation.Easy;
import model.tactics.atomic.automation.Now;
import model.tactics.atomic.automation.Trivial;
import model.tactics.atomic.tacargcomponents.*;

import java.util.stream.Collectors;

public class AutomationVisitor extends GenericVisitor<AtomicTacticExpr> {

    @Override
    public AtomicTacticExpr visitAuto(coqParser.AutoContext ctx) {
        return new Auto();
    }

    @Override
    public AtomicTacticExpr visitTrivial(coqParser.TrivialContext ctx) {
        return new Trivial();
    }

    @Override
    public AtomicTacticExpr visitWithTrivial(coqParser.WithTrivialContext ctx) {
        return new Trivial(new IdentListComponent(ComponentType.WITH,
                ctx.ident()
                .stream()
                .map(
                        identContext -> new IdentVisitor().visit(identContext)
                )
                .collect(Collectors.toList()))
        );
    }

    @Override
    public AtomicTacticExpr visitEasy(coqParser.EasyContext ctx) {
        return new Easy();
    }

    @Override
    public AtomicTacticExpr visitNow(coqParser.NowContext ctx) {
        return new Now(new ExprComponent(new ExprVisitor().visit(ctx.expr())));
    }

    @Override
    public AtomicTacticExpr visitWithStarAuto(coqParser.WithStarAutoContext ctx) {
        return new Auto(new StarComponent(ComponentType.WITH));
    }
}
