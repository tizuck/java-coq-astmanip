package antlr.visitor.toplevel;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.expr.ExprVisitor;
import antlr.visitor.term.IdentVisitor;
import antlr.visitor.term.QualidVisitor;
import model.toplevel.utilities.IdentLtacDef;
import model.toplevel.utilities.LtacDef;
import model.toplevel.utilities.QualidLtacDef;

import java.util.Optional;
import java.util.stream.Collectors;

public class LtacDefVisitor extends GenericVisitor<LtacDef> {
    @Override
    public LtacDef visitIdentLtacDef(coqParser.IdentLtacDefContext ctx) {
        return new IdentLtacDef(new ExprVisitor().visit(ctx.expr()),
                ctx.ident()
                        .stream()
                        .map(identContext -> new IdentVisitor().visit(identContext))
                        .collect(Collectors.toList()));
    }

    @Override
    public LtacDef visitQualidLtacDef(coqParser.QualidLtacDefContext ctx) {
        return new QualidLtacDef(new ExprVisitor().visit(ctx.expr()),
                new QualidVisitor().visit(ctx.qualid()),
                ctx.ident() != null ? Optional.of(ctx.ident()
                        .stream()
                        .map(identContext -> new IdentVisitor().visit(identContext))
                        .collect(Collectors.toList()))
                                    : Optional.empty());
    }
}
