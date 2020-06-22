package antlr.visitor.atomicexpr;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.term.IdentVisitor;
import antlr.visitor.term.TermVisitor;
import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.equality.Reflexivity;
import model.tactics.atomic.equality.Symmetry;
import model.tactics.atomic.equality.Transitivity;
import model.tactics.atomic.tacargcomponents.IdentComponent;
import model.tactics.atomic.tacargcomponents.TermComponent;

public class EqualityVisitor extends GenericVisitor<AtomicTacticExpr> {
    @Override
    public AtomicTacticExpr visitReflexivity(coqParser.ReflexivityContext ctx) {
        return new Reflexivity();
    }

    @Override
    public AtomicTacticExpr visitTransitivity(coqParser.TransitivityContext ctx) {
        return new Transitivity(new TermComponent(new TermVisitor().visit(ctx.term())));
    }

    @Override
    public AtomicTacticExpr visitSymmetry(coqParser.SymmetryContext ctx) {
        if(ctx.ident() != null){
            return new Symmetry(new IdentComponent(new IdentVisitor().visit(ctx.ident())));
        }
        return new Symmetry();
    }
}
