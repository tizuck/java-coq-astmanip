package model.vernacular;

import model.term.Term;
import model.term.utilities.Binder;
import model.term.utilities.Ident;
import model.visitor.toplevel.CoqFragmentVisitor;

import java.util.List;
import java.util.Optional;

public class LetDefinition extends Definition {

    public LetDefinition(Ident id, Optional<List<Binder>> oBinders, Optional<Term> oBindTerm, Term term) {
        super(id, oBinders, oBindTerm, term);
    }


    @Override
    public <R, P> R accept(CoqFragmentVisitor<R,P> coqFragmentVisitor, P p) {
        return coqFragmentVisitor.visit(this,p);
    }
}
