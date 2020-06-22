package antlr.visitor.term;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.term.Term;
import model.term.utilities.Binder;
import model.term.utilities.CoFixBody;

import java.util.List;
import java.util.Optional;

public class CofixBodyVisitor extends GenericVisitor<CoFixBody> {

    private final BindersVisitor bindersVisitor;
    private final TermVisitor termVisitor;
    private final IdentVisitor identVisitor;

    public CofixBodyVisitor(TermVisitor termVisitor){
        bindersVisitor = new BindersVisitor(termVisitor);
        this.termVisitor = termVisitor;
        identVisitor = new IdentVisitor();
    }
    @Override
    public CoFixBody visitCofix_body(coqParser.Cofix_bodyContext ctx){
        Optional<List<Binder>> oBinders;
        Optional<Term> oTerm;
        Term term;

        if(ctx.binders() != null){
            oBinders = Optional.of(bindersVisitor.visit(ctx.binders()));
        }
        else {
            oBinders = Optional.empty();
        }

        if(ctx.term().size() > 1){
            oTerm = Optional.of(termVisitor.visit(ctx.term(0)));
            term = termVisitor.visit(ctx.term(1));
        }
        else {
            oTerm = Optional.empty();
            term = termVisitor.visit(ctx.term(0));
        }

        return new CoFixBody( identVisitor.visit(ctx.ident()),
                oBinders,
                oTerm,
                term);
    }
}
