package model.vernacular;

import model.vernacular.utilities.IndBody;
import model.vernacular.utilities.WhereClause;
import model.visitor.toplevel.CoqFragmentVisitor;

import java.util.List;
import java.util.Optional;

public class StdInductive extends Inductive {


    public StdInductive(List<IndBody> indBodys, Optional<WhereClause> whereClause) {
        super(indBodys, whereClause);
    }


    @Override
    public <R, P> R accept(CoqFragmentVisitor<R,P> coqFragmentVisitor, P p) {
        return coqFragmentVisitor.visit(this,p);
    }
}
