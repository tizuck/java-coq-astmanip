package model.tactics.expr.utilities;

import model.tactics.expr.Expr;
import model.term.utilities.Ident;
import model.visitor.expr.ContextRuleVisitor;

import java.util.Optional;

public class UnderscoreContextRule extends ContextRule {

    public UnderscoreContextRule(Expr expr, Optional<Ident> optionalIdent) {
        super(expr, optionalIdent);
    }

    @Override
    public <R, P> R accept(ContextRuleVisitor<R, P> contextRuleVisitor, P p) {
        return contextRuleVisitor.visit(this,p);
    }
}
