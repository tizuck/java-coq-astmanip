package model.vernacular.utilities;

import model.term.Term;
import model.term.utilities.Binder;
import model.term.utilities.Name;
import model.visitor.vernacular.FieldVisitor;

import java.util.List;
import java.util.Optional;

public class StdField extends Field {


    public StdField(Name name, Optional<List<Binder>> oBinders, Term term) {
        super(name, oBinders, term);
    }



    public <R,P> R accept(FieldVisitor<R,P> fieldVisitor,P p){
        return fieldVisitor.visit(this,p);
    }


}
