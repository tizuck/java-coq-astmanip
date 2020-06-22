package antlr.visitor.atomicexpr;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.atomicexpr.utilities.BindingListVisitor;
import antlr.visitor.term.TermVisitor;
import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.applytheorem.*;
import model.tactics.atomic.tacargcomponents.*;
import model.term.Number;

import java.util.stream.Collectors;

public class ApplyingTheoremVisitor extends GenericVisitor<AtomicTacticExpr> {
    @Override
    public AtomicTacticExpr visitSplit(coqParser.SplitContext ctx) {
        return new Split();
    }

    @Override
    public AtomicTacticExpr visitAssumptionApplyingTheorem(coqParser.AssumptionApplyingTheoremContext ctx) {
        return new Assumption();
    }

    @Override
    public AtomicTacticExpr visitTermsApply(coqParser.TermsApplyContext ctx) {
        return new Apply(new TermListComponent(ctx.term().stream()
                                   .map(termContext -> new TermVisitor().visit(termContext))
                                   .collect(Collectors.toList())));
    }

    @Override
    public AtomicTacticExpr visitConstructor(coqParser.ConstructorContext ctx) {
        if(ctx.NUM() != null){
            if(ctx.binding_list() != null){
                return new Constructor(
                        new NumComponent(new Number(Integer.valueOf(ctx.NUM().getSymbol().getText()))),
                        new BindingListComponent(ComponentType.WITH,new BindingListVisitor().visit(ctx.binding_list())
                ));
            }
            return new Constructor(new NumComponent(new Number(Integer.valueOf(ctx.NUM().getSymbol().getText()))));
        }
        return new Constructor();
    }

    @Override
    public AtomicTacticExpr visitLeft(coqParser.LeftContext ctx) {
        if(ctx.binding_list() != null) {
            return new Left(new BindingListComponent(ComponentType.WITH,new BindingListVisitor().visit(ctx.binding_list())
            ));
        }
        else {
            return new Left();
        }
    }

    @Override
    public AtomicTacticExpr visitRight(coqParser.RightContext ctx) {
        if(ctx.binding_list() != null) {
            return new Right(new BindingListComponent(ComponentType.WITH,new BindingListVisitor().visit(ctx.binding_list())
            ));
        }
        else {
            return new Right();
        }
    }

    @Override
    public AtomicTacticExpr visitExact(coqParser.ExactContext ctx) {
        return new Exact(new TermComponent(new TermVisitor().visit(ctx.term())));
    }

    @Override
    public AtomicTacticExpr visitTermExists(coqParser.TermExistsContext ctx) {
        return new Exists(new TermComponent(new TermVisitor().visit(ctx.term())));
    }
}
