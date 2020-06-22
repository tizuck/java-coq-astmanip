package antlr.visitor.term;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.term.Term;
import model.term.utilities.Binder;
import model.term.utilities.Name;
import model.term.utilities.NameBinder;

import java.util.ArrayList;
import java.util.List;

public class BindersVisitor extends GenericVisitor<List<Binder>> {


    private final NameVisitor nameVisitor;
    private final TermVisitor termVisitor;
    private final BinderVisitor binderVisitor;

    public BindersVisitor(TermVisitor termVisitor) {
        nameVisitor = new NameVisitor();
        this.termVisitor = termVisitor;
        binderVisitor = new BinderVisitor(termVisitor);
    }

    @Override
    public List<Binder> visitSingleBinder(coqParser.SingleBinderContext ctx){

        List<Name> names = new ArrayList<Name>();


        for(coqParser.NameContext name : ctx.binders_with_one_param().name()){
            names.add(nameVisitor.visit(name));
        }

        Term term = (termVisitor.visit(ctx.binders_with_one_param().term()));

        List<Binder> binders = new ArrayList<Binder>();
        binders.add(new NameBinder(names,term));

        return binders;
    }

    @Override
    public List<Binder> visitMultipleBinders(coqParser.MultipleBindersContext ctx){
        List<Binder> binders = new ArrayList<>();
        for(coqParser.BinderContext binderContext : ctx.binder()){
            binders.add(binderVisitor.visit(binderContext));
        }

        return binders;
    }
}
