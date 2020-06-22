package model.visitor.expr;

import model.tactics.expr.utilities.*;

public interface TacArgVisitor<R,P> {

    R visit(QualidTacArg qualidTacArg,P p);

    R visit(UnitTacArg unitTacArg,P p);

    R visit(LtacTacArg ltacTacArg,P p);

    R visit(TermTacArg termTacArg,P p);

    R visit(StringTacArg stringTacArg,P p);
}
