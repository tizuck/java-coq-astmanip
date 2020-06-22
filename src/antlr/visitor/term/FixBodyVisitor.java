package antlr.visitor.term;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.term.Term;
import model.term.utilities.Annotation;
import model.term.utilities.FixBody;
import model.term.utilities.Ident;

import java.util.Optional;

public class FixBodyVisitor extends GenericVisitor<FixBody> {

    private final BindersVisitor bindersVisitor;
    private final TermVisitor termVisitor;
    private final IdentVisitor identVisitor;

    public FixBodyVisitor(TermVisitor termVisitor){
        bindersVisitor = new BindersVisitor(termVisitor);
        this.termVisitor = termVisitor;
        identVisitor = new IdentVisitor();
    }
    @Override
    public FixBody visitFix_body(coqParser.Fix_bodyContext ctx){
        Optional<Term> oTerm;
        Optional<Annotation> oAnnotation;

        if(ctx.annotation() != null) {
            oAnnotation = Optional.of(new Annotation(identVisitor.visit(ctx.annotation().ident()).getId()));
        }
        else {
            oAnnotation = Optional.empty();
        }
        if(ctx.term() != null){
            oTerm = Optional.of(termVisitor.visit(ctx.term()));
        }
        else {
            oTerm = Optional.empty();
        }

        return new FixBody(identVisitor.visit(ctx.ident()),
                bindersVisitor.visit(ctx.binders()),
                oAnnotation,
                oTerm,
                termVisitor.visit(ctx.fix_body_term()));
    }
}
