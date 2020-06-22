package antlr.visitor.term;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.term.Term;
import model.term.utilities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BinderVisitor extends GenericVisitor<Binder> {

    private final NameVisitor nameVisitor;
    private final TermVisitor termVisitor;

    public BinderVisitor(TermVisitor termVisitor) {
        nameVisitor = new NameVisitor();
        this.termVisitor = termVisitor;
    }

    @Override
    public Binder visitSingleNameBinder(coqParser.SingleNameBinderContext ctx){
        return new SingleNameBinder(nameVisitor.visit(ctx.name()));
    }

    @Override
    public Binder visitMultipleNamesBinder(coqParser.MultipleNamesBinderContext ctx){
        Term term = termVisitor.visit(ctx.term());

        List<Name> names = new ArrayList<Name>();

        for(coqParser.NameContext nameContext : ctx.name()){
            names.add(nameVisitor.visit(nameContext));
        }

        return new NameBinder(names,term);

    }

    @Override
    public Binder visitBracedNameBinder(coqParser.BracedNameBinderContext ctx){
        Name name = nameVisitor.visit(ctx.name());

        Term term = termVisitor.visit(ctx.term());

        return new BracedNameBinder(name, Optional.empty(),term);
    }

    @Override
    public Binder visitBracedNameOptionalBinder(coqParser.BracedNameOptionalBinderContext ctx){
        Name name = nameVisitor.visit(ctx.name());

        Optional<Term> oTerm = Optional.of(termVisitor.visit(ctx.term(0)));

        Term term = termVisitor.visit(ctx.term(1));

        return new BracedNameBinder(name,oTerm,term);
    }

    @Override
    public Binder visitImplicitBinder(coqParser.ImplicitBinderContext ctx){
        return visit(ctx.implicitArgs());
    }

    @Override
    public Binder visitSingleBinderImplicit(coqParser.SingleBinderImplicitContext ctx){
        List<Binder> binders = new ArrayList<>();
        binders.add(new NameBinder(
                ctx.binders_with_one_param().name().stream()
                .map(nameContext -> new NameVisitor().visit(nameContext))
                .collect(Collectors.toList()),
                new TermVisitor().visit(ctx.binders_with_one_param().term())
        ));
        return new ImplicitBinder(binders);
    }

    @Override
    public Binder visitMultipleBindersImplicit(coqParser.MultipleBindersImplicitContext ctx){
        List<Binder> binders = new ArrayList<>();

        for(coqParser.BinderContext binderContext : ctx.binder()){
            binders.add(visit(binderContext));
        }

        return new ImplicitBinder(binders);
    }
}
