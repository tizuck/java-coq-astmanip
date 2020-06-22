package antlr.visitor.vernacular;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.expr.SelectorVisitor;
import model.toplevel.utilities.AllToplevelSelector;
import model.toplevel.utilities.ParToplevelSelector;
import model.toplevel.utilities.SelectorToplevelSelector;
import model.toplevel.utilities.ToplevelSelector;

public class TopLevelSelectorVisitor extends GenericVisitor<ToplevelSelector> {
    @Override
    public ToplevelSelector visitSelToplevelSelector(coqParser.SelToplevelSelectorContext ctx) {
        return new SelectorToplevelSelector(new SelectorVisitor().visit(ctx.selector()));
    }

    @Override
    public ToplevelSelector visitAllToplevelSelector(coqParser.AllToplevelSelectorContext ctx) {
        return new AllToplevelSelector();
    }

    @Override
    public ToplevelSelector visitParToplevelSelector(coqParser.ParToplevelSelectorContext ctx) {
        return new ParToplevelSelector();
    }
}
