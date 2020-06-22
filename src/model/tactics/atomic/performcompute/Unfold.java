package model.tactics.atomic.performcompute;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.ComponentType;
import model.tactics.atomic.tacargcomponents.IdentComponent;
import model.tactics.atomic.tacargcomponents.QualidComponent;
import model.tactics.atomic.tacargcomponents.QualidNumsListComponent;
import model.term.Number;
import model.term.Qualid;
import model.visitor.expr.ExprVisitor;

import java.util.List;

public class Unfold  extends AtomicTacticExpr {

    public Unfold(QualidComponent qualid) {
        tacArgs.add(qualid);
    }

    public Unfold(QualidComponent qualidComponent, IdentComponent identComponent){
        tacArgs.add(qualidComponent);
        tacArgs.add(identComponent);
    }

    public Unfold(List<Qualid> qualids, List<List<Number>> qualidNumsAt){
        tacArgs.add(new QualidNumsListComponent(qualids,qualidNumsAt));
    }

    public Unfold(ComponentType componenttype, List<Qualid> qualids, List<List<Number>> qualidNumsAt){
        tacArgs.add(new QualidNumsListComponent(componenttype,qualids,qualidNumsAt));
    }

    @Override
    public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
        return exprVisitor.visit(this,p);
    }

}
