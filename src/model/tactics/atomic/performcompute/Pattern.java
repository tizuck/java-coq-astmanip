package model.tactics.atomic.performcompute;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.NumberListComponent;
import model.tactics.atomic.tacargcomponents.SubComponent;
import model.tactics.atomic.tacargcomponents.TermComponent;
import model.visitor.expr.ExprVisitor;

public class Pattern  extends AtomicTacticExpr {

    public Pattern(TermComponent term) {
        tacArgs.add(term);
    }

    public Pattern(TermComponent term, NumberListComponent nums){
        tacArgs.add(term);
        tacArgs.add(nums);
    }

    public Pattern(TermComponent term,NumberListComponent nums, SubComponent sub){
        tacArgs.add(term);
        tacArgs.add(sub);
        tacArgs.add(nums);
    }

    @Override
    public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
        return exprVisitor.visit(this,p);
    }

}
