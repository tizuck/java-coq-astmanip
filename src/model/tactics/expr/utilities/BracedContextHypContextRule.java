package model.tactics.expr.utilities;

import model.tactics.expr.Expr;
import model.term.Term;
import model.term.utilities.Ident;
import model.visitor.expr.ContextRuleVisitor;

import java.util.List;
import java.util.Optional;

public class BracedContextHypContextRule extends ContextHypContextRule {
    public BracedContextHypContextRule(Expr expr, Optional<Ident> optionalIdent, List<ContextHyp> contextHyps, Term term) {
        super(expr, optionalIdent, contextHyps, term);
    }

    @Override
    public <R, P> R accept(ContextRuleVisitor<R, P> contextRuleVisitor, P p) {
        return contextRuleVisitor.visit(this,p);
    }
}
