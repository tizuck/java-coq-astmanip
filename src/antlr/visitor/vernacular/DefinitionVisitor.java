package antlr.visitor.vernacular;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.term.BindersVisitor;
import antlr.visitor.term.IdentVisitor;
import antlr.visitor.term.TermVisitor;
import model.term.Term;
import model.term.utilities.Binder;
import model.vernacular.Definition;
import model.vernacular.LetDefinition;
import model.vernacular.StdDefinition;

import java.util.List;
import java.util.Optional;

public class DefinitionVisitor extends GenericVisitor<Definition> {
    private final IdentVisitor identVisitor;
    private final TermVisitor termVisitor;
    private final BindersVisitor bindersVisitor;

    public DefinitionVisitor(){
        identVisitor = new IdentVisitor();
        termVisitor = new TermVisitor();
        bindersVisitor = new BindersVisitor(termVisitor);
    }
    @Override
    public Definition visitStdDefinition(coqParser.StdDefinitionContext ctx){
        Optional<List<Binder>> oBinders = Optional.empty();
        Optional<Term> oTerm = Optional.empty();
        Term term;
        boolean isLocal = false;

        if(ctx.KeyLOCAL() != null){
            isLocal = true;
        }

        if(ctx.term().size() > 1){
            oTerm = Optional.of(termVisitor.visit(ctx.term(0)));
            term = termVisitor.visit(ctx.term(1));
        }
        else {
            term = termVisitor.visit(ctx.term(0));
        }

        if(ctx.binders() != null){
            oBinders = Optional.of(bindersVisitor.visit(ctx.binders()));
        }

        return new StdDefinition(identVisitor.visit(ctx.ident()),
                oBinders,
                oTerm,
                term,
                isLocal);
    }

    @Override
    public Definition visitLetDefinition(coqParser.LetDefinitionContext ctx) {
        Optional<List<Binder>> oBinders = Optional.empty();
        Optional<Term> oTerm = Optional.empty();
        Term term;

        if(ctx.term().size() > 1){
            oTerm = Optional.of(termVisitor.visit(ctx.term(0)));
            term = termVisitor.visit(ctx.term(1));
        }
        else {
            term = termVisitor.visit(ctx.term(0));
        }

        if(ctx.binders() != null){
            oBinders = Optional.of(bindersVisitor.visit(ctx.binders()));
        }

        return new LetDefinition(identVisitor.visit(ctx.ident()),
                oBinders,
                oTerm,
                term);
    }
}
