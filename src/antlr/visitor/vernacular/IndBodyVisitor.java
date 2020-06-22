package antlr.visitor.vernacular;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.term.BindersVisitor;
import antlr.visitor.term.IdentVisitor;
import antlr.visitor.term.TermVisitor;
import model.term.Term;
import model.term.utilities.Binder;
import model.vernacular.utilities.IndBody;
import model.vernacular.utilities.IndBodyAlloc;

import java.util.List;
import java.util.Optional;

public class IndBodyVisitor extends GenericVisitor<IndBody> {
    @Override
    public IndBody visitInd_body(coqParser.Ind_bodyContext ctx) {
        Optional<List<Binder>> oBinders = Optional.empty();
        Optional<Term> oTerm = Optional.empty();
        Optional<IndBodyAlloc> optionalIndBodyAlloc = Optional.empty();

        if(ctx.term() != null){
            if(ctx.binders() != null){
                oBinders = Optional.of(new BindersVisitor(new TermVisitor()).visit(ctx.binders()));
                oTerm = Optional.of(new TermVisitor().visit(ctx.term()));
            }
            else {
                oTerm = Optional.of(new TermVisitor().visit(ctx.term()));
            }
        }

        if(ctx.ind_body_alloc() != null){
            optionalIndBodyAlloc = Optional.of(new IndBodyAllocVisitor().visit(ctx.ind_body_alloc()));
        }

        return new IndBody(new IdentVisitor().visit(ctx.ident()),
                oBinders,
                oTerm,
                optionalIndBodyAlloc);
    }
}
