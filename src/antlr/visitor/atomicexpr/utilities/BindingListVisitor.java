package antlr.visitor.atomicexpr.utilities;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.term.IdentVisitor;
import antlr.visitor.term.TermVisitor;
import model.tactics.atomic.utilities.BindingListBody;
import model.tactics.atomic.utilities.RefBindingListBody;
import model.tactics.atomic.utilities.TermBindingListBody;
import model.term.Number;

import java.util.List;
import java.util.stream.Collectors;

public class BindingListVisitor extends GenericVisitor<List<BindingListBody>> {
    @Override
    public List<BindingListBody> visitNumBinding(coqParser.NumBindingContext ctx) {
        return ctx.num_binding_list_body().stream()
                .map(num_binding_list_bodyContext ->
                    new RefBindingListBody(new Number(Integer.valueOf(num_binding_list_bodyContext.NUM().getSymbol().getText())),
                           new TermVisitor().visit(num_binding_list_bodyContext.term()))
                )
                .collect(Collectors.toList());
    }

    @Override
    public List<BindingListBody> visitIdentBinding(coqParser.IdentBindingContext ctx) {
       return ctx.ident_binding_list_body().stream()
                .map(ident_binding_list_bodyContext ->
                        new RefBindingListBody(new IdentVisitor().visit(ident_binding_list_bodyContext.ident()),
                                new TermVisitor().visit(ident_binding_list_bodyContext.term()))
                )
                .collect(Collectors.toList());
    }

    @Override
    public List<BindingListBody> visitBelowTerms(coqParser.BelowTermsContext ctx) {
        return ctx.below_term_ex_minus().stream()
                .map(below_term_ex_minusContext -> new TermBindingListBody(new TermVisitor().visit(below_term_ex_minusContext)))
                .collect(Collectors.toList());
    }
}
