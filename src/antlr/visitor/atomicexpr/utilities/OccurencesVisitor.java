package antlr.visitor.atomicexpr.utilities;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.tactics.atomic.utilities.Occurences;
import model.term.Number;

import java.util.stream.Collectors;

public class OccurencesVisitor extends GenericVisitor<Occurences> {

    @Override
    public Occurences visitOccurences(coqParser.OccurencesContext ctx) {
        return new Occurences(ctx.SUB() != null,
                ctx.NUM().stream().map(
                   terminalNode -> new Number(Integer.valueOf(terminalNode.getSymbol().getText())
                   ))
        .collect(Collectors.toList()));
    }
}
