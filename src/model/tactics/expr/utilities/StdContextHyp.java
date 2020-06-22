package model.tactics.expr.utilities;

import model.term.Term;
import model.term.utilities.Name;
import model.visitor.expr.ContextHypVisitor;

public class StdContextHyp extends ContextHyp {

    public StdContextHyp(Name name, Term term) {
        super(name, term);
    }



    @Override
    public <R, P> R accept(ContextHypVisitor<R, P> contextHypVisitor, P p) {
        return contextHypVisitor.visit(this,p);
    }
}
