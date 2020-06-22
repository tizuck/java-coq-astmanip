package antlr.visitor.vernacular;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.term.BindersVisitor;
import antlr.visitor.term.NameVisitor;
import antlr.visitor.term.TermVisitor;
import model.term.Term;
import model.term.utilities.Binder;
import model.vernacular.utilities.DefField;
import model.vernacular.utilities.Field;
import model.vernacular.utilities.StdField;

import java.util.List;
import java.util.Optional;

public class FieldVisitor extends GenericVisitor<Field> {
    @Override
    public Field visitDefField(coqParser.DefFieldContext ctx) {
        Optional<List<Binder>> optionalBinders = Optional.empty();
        Optional<Term> optionalTerm = Optional.empty();

        if(ctx.binders() != null){
            optionalBinders = Optional.of(new BindersVisitor(new TermVisitor()).visit(ctx.binders()));
        }

        if(ctx.term() != null){
            optionalTerm = Optional.of(new TermVisitor().visit(ctx.term()));
        }

        return new DefField(new NameVisitor().visit(ctx.name()),
                optionalBinders,
                new TermVisitor().visit(ctx.field_term().term()),
               optionalTerm);
    }

    @Override
    public Field visitStdField(coqParser.StdFieldContext ctx) {
        Optional<List<Binder>> optionalBinders = Optional.empty();

        if(ctx.binders() != null){
            optionalBinders = Optional.of(new BindersVisitor(new TermVisitor()).visit(ctx.binders()));
        }

        return new StdField(new NameVisitor().visit(ctx.name()),
                optionalBinders,
                new TermVisitor().visit(ctx.field_term().term()));
    }
}
