package antlr.visitor.expr;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.term.IdentVisitor;
import model.tactics.expr.utilities.*;

import java.util.ArrayList;
import java.util.List;

public class SelectorVisitor extends GenericVisitor<Selector> {
    @Override
    public Selector visitIdentSelector(coqParser.IdentSelectorContext ctx) {
        return new IdentSelector(new IdentVisitor().visit(ctx.ident()));
    }

    @Override
    public Selector visitIntSelector(coqParser.IntSelectorContext ctx) {
        List<SelectorBody> selectorBodies = new ArrayList<>();
        for (coqParser.Int_selector_bodyContext intSelectorBodyContext : ctx.int_selector_body()) {
            if(intSelectorBodyContext.integ().size() > 1){
                if(intSelectorBodyContext.integ(0).SUB() != null){
                    if(intSelectorBodyContext.integ(1).SUB() != null){
                        selectorBodies.add(new MinusSelectorBody(Integer.valueOf(intSelectorBodyContext.integ(0).NUM().getSymbol().getText()) * (-1) ,
                                Integer.valueOf(intSelectorBodyContext.integ(1).NUM().getSymbol().getText()) * (-1)));
                    }
                    else {
                        selectorBodies.add(new MinusSelectorBody(Integer.valueOf(intSelectorBodyContext.integ(0).NUM().getSymbol().getText()) * (-1) ,
                                Integer.valueOf(intSelectorBodyContext.integ(1).NUM().getSymbol().getText())));
                    }
                }
                else {
                    if(intSelectorBodyContext.integ(1).SUB() != null){
                        selectorBodies.add(new MinusSelectorBody(Integer.valueOf(intSelectorBodyContext.integ(0).NUM().getSymbol().getText()) ,
                                Integer.valueOf(intSelectorBodyContext.integ(1).NUM().getSymbol().getText()) * (-1)));
                    }
                    else {
                        selectorBodies.add(new MinusSelectorBody(Integer.valueOf(intSelectorBodyContext.integ(0).NUM().getSymbol().getText()) ,
                                Integer.valueOf(intSelectorBodyContext.integ(1).NUM().getSymbol().getText())));
                    }
                }
            }
            else {
                if(intSelectorBodyContext.integ(0).SUB() != null) {
                    selectorBodies.add(new SingleSelectorBody(Integer.valueOf(intSelectorBodyContext.integ(0).NUM().getSymbol().getText()) * (-1)));
                }
                else {
                    selectorBodies.add(new SingleSelectorBody(Integer.valueOf(intSelectorBodyContext.integ(0).NUM().getSymbol().getText()) * (-1)));
                }
            }
        }

        return new SelectorBodySelector(selectorBodies);
    }
}
