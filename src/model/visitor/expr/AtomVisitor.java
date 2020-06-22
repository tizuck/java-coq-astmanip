package model.visitor.expr;

import model.tactics.expr.utilities.*;

public interface AtomVisitor<R,P> {

    R visit(UnitAtom unitAtom,P p);

    R visit(IntAtom intAtom,P p);

    R visit(QualidAtom qualidAtom,P p);

    R visit(DotAtom dotAtom,P p);

    R visit(ExprAtom exprAtom,P p);

}
