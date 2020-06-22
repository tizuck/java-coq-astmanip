package antlr.visitor.vernacular;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.term.BindersVisitor;
import antlr.visitor.term.IdentVisitor;
import antlr.visitor.term.TermVisitor;
import model.term.Term;
import model.term.utilities.Binder;
import model.vernacular.utilities.IndBodyAlloc;
import model.vernacular.utilities.IndBodyAllocElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class IndBodyAllocVisitor extends GenericVisitor<IndBodyAlloc> {
    @Override
    public IndBodyAlloc visitInd_body_alloc(coqParser.Ind_body_allocContext ctx) {
        Optional<Term> firstTerm = Optional.empty();
        Optional<List<Binder>> firstBinders = Optional.empty();

        if(ctx.binders() != null){
            firstBinders = Optional.of(new BindersVisitor(new TermVisitor()).visit(ctx.binders()));

        }

        if(ctx.term() != null){
            firstTerm = Optional.of(new TermVisitor().visit(ctx.term()));
        }

        IndBodyAllocElement firstElement = new IndBodyAllocElement(new IdentVisitor().visit(ctx.ident()),
                firstBinders,
                firstTerm);
        List<IndBodyAllocElement> indBodyAllocElements = new ArrayList<>();

        indBodyAllocElements.add(firstElement);

        for (coqParser.Ind_body_alloc_elementContext indbodyAllocElementContext : ctx.ind_body_alloc_element()) {
            Optional<Term> oTerm = Optional.empty();
            Optional<List<Binder>> oBinders = Optional.empty();

            if(indbodyAllocElementContext.term() != null){
                oTerm = Optional.of(new TermVisitor().visit(indbodyAllocElementContext.term()));
            }

            if(indbodyAllocElementContext.binders() != null){
                oBinders = Optional.of(new BindersVisitor(new TermVisitor()).visit(indbodyAllocElementContext.binders()));
            }

            indBodyAllocElements.add(new IndBodyAllocElement(new IdentVisitor().visit(indbodyAllocElementContext.ident()),
                    oBinders,
                    oTerm));
        }

        return new IndBodyAlloc(indBodyAllocElements);

    }
}
