package coqparser.prettyprint.vernacular;

import coqparser.prettyprint.PrettyPrintConfiguration;
import coqparser.prettyprint.PrettyPrintContext;
import coqparser.prettyprint.expr.PrettyPrintExprVisitor;
import model.vernacular.utilities.BracedProofBody;
import model.vernacular.utilities.StdProofBody;
import model.visitor.vernacular.ProofBodyVisitor;

public class PrettyPrintProofBodyVisitor implements ProofBodyVisitor<String, PrettyPrintContext> {

    private final PrettyPrintConfiguration prettyPrintConfiguration;

    public PrettyPrintProofBodyVisitor(PrettyPrintConfiguration prettyPrintConfiguration) {
        this.prettyPrintConfiguration = prettyPrintConfiguration;
    }

    @Override
    public String visit(StdProofBody stdProofBody, PrettyPrintContext prettyPrintContext) {
        String bullet = "";
        if(stdProofBody.getOptionalBullettype().isPresent()){
            switch (stdProofBody.getOptionalBullettype().get()){
                case SUB: bullet = "-";break;
                case ADD: bullet = "+";break;
                case DOT: bullet = ".";break;
                case MUL: bullet = "*";break;
                case ADD2: bullet = "++";break;
                case ADD3: bullet = "+++";break;
                case MUL2: bullet = "**";break;
                case MUL3: bullet = "***";break;
                case SUB2: bullet = "--";break;
                case SUB3: bullet = "---";break;
                default: throw new IllegalStateException();
            }
        }
        return (bullet.equals("")?"":bullet + " ") +
                stdProofBody.getTacticInvocation().getExpr().accept(new PrettyPrintExprVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),
                                PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                ".";

    }

    @Override
    public String visit(BracedProofBody bracedProofBody, PrettyPrintContext prettyPrintContext) {
        String bullet = "";
        if(bracedProofBody.getOptionalBullettype().isPresent()){
            switch (bracedProofBody.getOptionalBullettype().get()){
                case SUB: bullet = "-";break;
                case ADD: bullet = "+";break;
                case DOT: bullet = ".";break;
                case MUL: bullet = "*";break;
                case ADD2: bullet = "++";break;
                case ADD3: bullet = "+++";break;
                case MUL2: bullet = "**";break;
                case MUL3: bullet = "***";break;
                case SUB2: bullet = "--";break;
                case SUB3: bullet = "---";break;
                default: throw new IllegalStateException();
            }
        }
        //Hier ist der Toplevel selector bewusst nicht mit eingebaut, da er in der INIT-Bibliothek nicht benutzt wird
        return"{ " +
                (bullet.equals("")?"":bullet + " ") +
                bracedProofBody.getTacticInvocation().getExpr().accept(new PrettyPrintExprVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),
                                PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                ". }"
                ;
    }
}
