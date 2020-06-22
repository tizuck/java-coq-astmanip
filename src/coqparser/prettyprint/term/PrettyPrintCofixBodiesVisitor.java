package coqparser.prettyprint.term;

import coqparser.prettyprint.PrettyPrintConfiguration;
import coqparser.prettyprint.PrettyPrintContext;
import model.term.utilities.Binder;
import model.term.utilities.CoFixBody;
import model.term.utilities.MultipleCofixBodies;
import model.term.utilities.SingleCoFixBody;
import model.visitor.term.CoFixBodiesVisitor;

import java.util.ArrayList;
import java.util.List;

public class PrettyPrintCofixBodiesVisitor implements CoFixBodiesVisitor<String, PrettyPrintContext> {

    private final PrettyPrintConfiguration prettyPrintConfiguration;

    public PrettyPrintCofixBodiesVisitor(PrettyPrintConfiguration prettyPrintConfiguration) {
        this.prettyPrintConfiguration = prettyPrintConfiguration;
    }

    @Override
    public String visit(SingleCoFixBody singleCoFixBody, PrettyPrintContext ctx) {
        String cofixBodyIdent = singleCoFixBody.getCoFixBody().getId().accept(new PrettyPrintIdentVisitor(),new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,ctx.getTreetype()));
        String cofixBodyBinders = "";
        if(singleCoFixBody.getCoFixBody().getoBinders().isPresent()){
            for (Binder binder : singleCoFixBody.getCoFixBody().getoBinders().get()) {
                cofixBodyBinders += " " + binder.accept(new PrettyPrintBinderVisitor(this.prettyPrintConfiguration),ctx);
            }
        }
        String cofixBodyOTerm = "";
        if(singleCoFixBody.getCoFixBody().getoTerm().isPresent()){
            cofixBodyOTerm = singleCoFixBody.getCoFixBody().getoTerm().get().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                    new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,ctx.getTreetype()));
        }

        String cofixBodyTerm = singleCoFixBody.getCoFixBody().getAssocTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,ctx.getTreetype()));

        return cofixBodyIdent + " " + cofixBodyBinders + " " + cofixBodyOTerm + " := " + cofixBodyTerm;
    }

    @Override
    public String visit(MultipleCofixBodies multipleCofixBodies, PrettyPrintContext ctx) {
        List<String> cofixBodies = new ArrayList<>();
        for (CoFixBody coFixBody : multipleCofixBodies.getCoFixBody()) {
            String cofixBodyIdent = coFixBody.getId().accept(new PrettyPrintIdentVisitor(),new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,ctx.getTreetype()));
            String cofixBodyBinders = "";
            if(coFixBody.getoBinders().isPresent()){
                for (Binder binder : coFixBody.getoBinders().get()) {
                    cofixBodyBinders += " " + binder.accept(new PrettyPrintBinderVisitor(this.prettyPrintConfiguration),ctx);
                }
            }
            String cofixBodyOTerm = "";
            if(coFixBody.getoTerm().isPresent()){
                cofixBodyOTerm = coFixBody.getoTerm().get().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,ctx.getTreetype()));
            }

            String cofixBodyTerm = coFixBody.getAssocTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                    new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,ctx.getTreetype()));

            cofixBodies.add(cofixBodyIdent + " " + cofixBodyBinders + " " + cofixBodyOTerm + " := " + cofixBodyTerm);
        }
        String allBodies = "";
        for (int i = 0; i < cofixBodies.size(); i++) {
            if(i==0){
                allBodies += " " + cofixBodies.get(i);
            }
            else{
                allBodies += " with " + cofixBodies.get(i);
            }
        }

        return allBodies + " for " + multipleCofixBodies.getId().toString();
    }
}
