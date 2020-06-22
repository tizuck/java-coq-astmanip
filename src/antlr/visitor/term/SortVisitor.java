package antlr.visitor.term;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.term.Sorttype;
import model.term.Sort;

public class SortVisitor extends GenericVisitor<Sort> {
    @Override
    public Sort visitSortProp(coqParser.SortPropContext ctx){
        return new Sort(Sorttype.PROP);
    }

    @Override
    public Sort visitSortSet(coqParser.SortSetContext ctx){
        return new Sort(Sorttype.SET);
    }

    @Override
    public Sort visitSortType(coqParser.SortTypeContext ctx){
        return new Sort(Sorttype.TYPE);
    }
}
