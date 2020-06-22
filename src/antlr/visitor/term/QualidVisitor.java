package antlr.visitor.term;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.term.AccessQualid;
import model.term.Qualid;
import model.term.SimpleQualid;
import model.term.utilities.AccessIdent;

public class QualidVisitor extends GenericVisitor<Qualid> {

    private final IdentVisitor identVisitor;

    public QualidVisitor(){
        identVisitor = new IdentVisitor();
    }
    @Override
    public Qualid visitSingleQualidBinder(coqParser.SingleQualidBinderContext ctx){
        return new SimpleQualid(identVisitor.visit(ctx.ident()));
    }

    @Override
    public Qualid visitAccessQualidBinder(coqParser.AccessQualidBinderContext ctx) {
        return new AccessQualid(visit(ctx.qualid()),
                new AccessIdent(ctx.ACCESS_IDENT().getSymbol().getText()));
    }

}
