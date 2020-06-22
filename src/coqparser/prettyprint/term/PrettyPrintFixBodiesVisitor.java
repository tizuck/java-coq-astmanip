package coqparser.prettyprint.term;

import coqparser.prettyprint.PrettyPrintConfiguration;
import coqparser.prettyprint.PrettyPrintContext;
import model.term.utilities.Binder;
import model.term.utilities.FixBody;
import model.term.utilities.MultipleFixBodies;
import model.term.utilities.SingleFixBody;
import model.visitor.term.FixBodiesVisitor;

import java.util.ArrayList;
import java.util.List;

public class PrettyPrintFixBodiesVisitor implements FixBodiesVisitor<String, PrettyPrintContext> {

    private PrettyPrintConfiguration prettyPrintConfiguration;

    public PrettyPrintFixBodiesVisitor(PrettyPrintConfiguration prettyPrintConfiguration) {
        this.prettyPrintConfiguration = prettyPrintConfiguration;
    }

    @Override
    public String visit(SingleFixBody singleFixBody, PrettyPrintContext ctx) {
        String ident = singleFixBody.getFixBody().getId().accept(new PrettyPrintIdentVisitor(),
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,ctx.getTreetype()));
        String strBinders = "";
        List<String> binders = new ArrayList<>();
        strBinders = defineFixBodiesBinders(ctx, singleFixBody.getFixBody(), strBinders, binders);
        String annotation = "";
        if(singleFixBody.getFixBody().getoAnnotation().isPresent()){
            annotation = " { struct " + singleFixBody.getFixBody().getoAnnotation().get().getAnnotation() + " }";
        }
        String oTerm = "";
        if(singleFixBody.getFixBody().getoTerm().isPresent()){
            oTerm = singleFixBody.getFixBody().getoTerm().get().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,ctx.getTreetype()));
        }
        String term = singleFixBody.getFixBody().getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,ctx.getTreetype()));

        return ident + " " +  strBinders + " " + annotation + (oTerm.equals("") ? "" : " : " + oTerm) + " := " + term;
    }

    @Override
    public
    String visit(MultipleFixBodies multipleFixBodies, PrettyPrintContext ctx) {
        List<String> fixBodies = new ArrayList<>();
        for (FixBody fixBody : multipleFixBodies.getFixBody()) {
            String ident = fixBody.getId().accept(new PrettyPrintIdentVisitor(),new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,ctx.getTreetype()));
            String strBinders = "";
            List<String> binders = new ArrayList<>();
            strBinders = defineFixBodiesBinders(ctx, fixBody, strBinders, binders);
            String annotation = "";
            if(fixBody.getoAnnotation().isPresent()){
                annotation = " { struct " + fixBody.getoAnnotation().get().getAnnotation() + " }";
            }
            String oTerm = "";
            if(fixBody.getoTerm().isPresent()){
                oTerm = fixBody.getoTerm().get().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,ctx.getTreetype()));
            }
            String term = fixBody.getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,ctx.getTreetype()));

            fixBodies.add(ident + " " +  strBinders + " " + annotation + (oTerm.equals("") ? "" : " : " + oTerm) + " := " + term);
        }
        String finalReturn = "";
        for (int i = 0; i < fixBodies.size(); i++) {
            if(i==0){
                finalReturn += fixBodies.get(i);
            }
            else {
                finalReturn += " with " + fixBodies.get(i);
            }
        }

        return finalReturn + " for " + multipleFixBodies.getId().toString();

    }

    private String defineFixBodiesBinders(PrettyPrintContext ctx, FixBody fixBody, String strBinders, List<String> binders) {
        for (Binder binder : fixBody.getBinders()) {
            binders.add(binder.accept(new PrettyPrintBinderVisitor(prettyPrintConfiguration),
                    new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.HIGHESTPREC, ctx.getTreetype())));
        }
        for (int i = 0; i < binders.size(); i++) {
            if (binders.contains(":=") || binders.contains(":")) {
                binders.set(i, "( " + binders.get(i) + " )");
            }
        }
        for (String binder : binders) {
            strBinders += binder + " ";
        }
        return strBinders;
    }
}
