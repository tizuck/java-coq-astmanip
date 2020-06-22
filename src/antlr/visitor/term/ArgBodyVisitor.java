package antlr.visitor.term;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.term.Operatortype;
import model.term.SingleOpsTerm;

public class ArgBodyVisitor extends GenericVisitor<SingleOpsTerm> {

    TermVisitor termVisitor;

    public ArgBodyVisitor(TermVisitor termVisitor){
        this.termVisitor = termVisitor;
    }

    @Override
    public SingleOpsTerm visitArg_body(coqParser.Arg_bodyContext ctx){
        if(ctx.arg() != null){
            return new SingleOpsTerm(termVisitor.visit(ctx.arg()),
                    Operatortype.APP);
        }
        else {
            if(ctx.op.getType() == coqParser.MUL){
                return new SingleOpsTerm(termVisitor.visit(ctx.below_term()),
                        Operatortype.MUL);
            }
            else if(ctx.op.getType() == coqParser.DIV){
                return new SingleOpsTerm(termVisitor.visit(ctx.below_term()),
                        Operatortype.DIV);
            }
            else if(ctx.op.getType() == coqParser.MOD){
                return new SingleOpsTerm(termVisitor.visit(ctx.below_term()),
                        Operatortype.MOD);
            }
            else {
                return new SingleOpsTerm(termVisitor.visit(ctx.below_term()),
                        Operatortype.MOD2);
            }
        }
    }
}
