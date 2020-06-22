package model.visitor.expr;

import model.tactics.expr.utilities.*;

public interface ContextRuleVisitor<R,P> {

    R visit(ContextHypContextRule contextHypContextRule,P p);

    R visit(UnderscoreContextRule underscoreContextRule,P p);

    R visit(StdContextRule stdContextRule,P p);

    R visit(DerivedContextRule derivedContextRule,P p);

    R visit(BracedContextHypContextRule bracedContextHypContextRule,P p);

}
