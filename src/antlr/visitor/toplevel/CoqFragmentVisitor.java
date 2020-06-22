package antlr.visitor.toplevel;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.commands.CommandVisitor;
import antlr.visitor.vernacular.VernacularVisitor;
import model.toplevel.CoqFragment;
import model.toplevel.LtacCoqFragment;
import model.toplevel.utilities.Ltac;

import java.util.stream.Collectors;

public class CoqFragmentVisitor extends GenericVisitor<CoqFragment> {
    @Override
    public CoqFragment visitSentenceFragment(coqParser.SentenceFragmentContext ctx) {
        return new VernacularVisitor().visit(ctx.sentence());
    }

    @Override
    public CoqFragment visitLtacFragment(coqParser.LtacFragmentContext ctx) {
        return new LtacCoqFragment(new Ltac(ctx.ltac().KeyLOCAL() != null,
                ctx.ltac().ltac_def()
                        .stream()
                        .map(ltac_defContext -> new LtacDefVisitor().visit(ltac_defContext))
                        .collect(Collectors.toList())));
    }

    @Override
    public CoqFragment visitCommandFragment(coqParser.CommandFragmentContext ctx) {
        return new CommandVisitor().visit(ctx.command());
    }
}
