package coqparser.prettyprint.vernacular;

import coqparser.prettyprint.PrettyPrintConfiguration;
import coqparser.prettyprint.PrettyPrintContext;
import coqparser.prettyprint.term.PrettyPrintBinderVisitor;
import coqparser.prettyprint.term.PrettyPrintTermVisitor;
import model.term.utilities.Binder;
import model.vernacular.utilities.DefField;
import model.vernacular.utilities.StdField;
import model.visitor.vernacular.FieldVisitor;

import java.util.ArrayList;
import java.util.List;

public class PrettyPrintFieldVisitor implements FieldVisitor<String, PrettyPrintContext> {

    private final PrettyPrintConfiguration prettyPrintConfiguration;

    public PrettyPrintFieldVisitor(PrettyPrintConfiguration prettyPrintConfiguration) {
        this.prettyPrintConfiguration = prettyPrintConfiguration;
    }

    @Override
    public String visit(StdField stdField,PrettyPrintContext prettyPrintContext) {
        String strBinders = "";
        List<String> binders = new ArrayList<>();

        if(stdField.getoBinders().isPresent()){
            for (Binder binder : stdField.getoBinders().get()) {
                binders.add(binder.accept(new PrettyPrintBinderVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)));
            }
            if(binders.size() != 1){
                for (int j = 0; j < binders.size(); j++) {
                    binders.set(j,"( " + binders.get(j) + " )");
                }
            }
            for (String binder : binders) {
                strBinders += binder + " ";
            }
        }
        return stdField.getName().toString() +
                " " +
                strBinders +
                " : " +
                stdField.getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));


    }

    @Override
    public String visit(DefField defField,PrettyPrintContext prettyPrintContext) {
        String strBinders = "";
        List<String> binders = new ArrayList<>();

        if(defField.getoBinders().isPresent()){
            for (Binder binder : defField.getoBinders().get()) {
                binders.add(binder.accept(new PrettyPrintBinderVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)));
            }
            if(binders.size() != 1){
                for (int j = 0; j < binders.size(); j++) {
                    binders.set(j,"( " + binders.get(j) + " )");
                }
            }
            for (String binder : binders) {
                strBinders += binder + " ";
            }
        }

        return defField.getName().toString() +
                " " +
                strBinders +
                (defField.getoTerm().isPresent() ?
                        ": " +
                        defField.getoTerm().get().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                        :
                        ""
                        ) +
                " := " +
                defField.getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
    }
}
