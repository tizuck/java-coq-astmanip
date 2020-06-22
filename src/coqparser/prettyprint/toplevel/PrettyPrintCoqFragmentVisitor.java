package coqparser.prettyprint.toplevel;

import coqparser.prettyprint.PrettyPrintConfiguration;
import coqparser.prettyprint.PrettyPrintContext;
import coqparser.prettyprint.commands.PrettyPrintModuleComponentVisitor;
import coqparser.prettyprint.term.PrettyPrintBinderVisitor;
import coqparser.prettyprint.term.PrettyPrintIdentVisitor;
import coqparser.prettyprint.term.PrettyPrintTermVisitor;
import coqparser.prettyprint.vernacular.PrettyPrintFieldVisitor;
import coqparser.prettyprint.vernacular.PrettyPrintProofBodyVisitor;
import model.commands.UndefinedCommand;
import model.commands.structcomand.*;
import model.commands.structcomand.utilities.ModuleComponent;
import model.term.Qualid;
import model.term.utilities.*;
import model.toplevel.LtacCoqFragment;
import model.vernacular.*;
import model.vernacular.utilities.Assums;
import model.vernacular.utilities.IndBodyAllocElement;
import model.vernacular.utilities.ProofBody;
import model.visitor.toplevel.CoqFragmentVisitor;

import java.util.ArrayList;
import java.util.List;

public class PrettyPrintCoqFragmentVisitor implements CoqFragmentVisitor<String, PrettyPrintContext> {


    private final PrettyPrintConfiguration prettyPrintConfiguration;

    public PrettyPrintCoqFragmentVisitor(PrettyPrintConfiguration prettyPrintConfiguration) {
        this.prettyPrintConfiguration = prettyPrintConfiguration;
    }



    @Override
    public String visit(Assertion assertion, PrettyPrintContext prettyPrintContext) {
        String ident = assertion.getId().accept(new PrettyPrintIdentVisitor(),prettyPrintContext);
        String strBinders = "";
        List<String> binders = new ArrayList<>();
        List<Boolean> isBracedBinders = new ArrayList<>();
        strBinders = defineAssertionBinders(strBinders, new AssertionBindersHelper(assertion, prettyPrintContext, binders, isBracedBinders));
        String prefix = "";
        prefix = defineAssertionKeyword(assertion);
        String proof = "";
        proof = defineProof(assertion, prettyPrintContext, proof);

        return prettyPrintContext.indentExpression(prefix +
                " " +
                ident +
                " " +
                strBinders +
                ": " +
                prettyPrintConfiguration.getEOL(),prettyPrintConfiguration,0) +
                prettyPrintContext.indentExpression(assertion.getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation() + 1,PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                +
                " ." ,prettyPrintConfiguration,1) +
                (proof.equals("")?"":prettyPrintConfiguration.getEOL() +
                        proof);


    }

    private String defineProof(Assertion assertion, PrettyPrintContext prettyPrintContext, String proof) {
        if(assertion.getoProof().isPresent()){
            proof =  prettyPrintContext.indentExpression("Proof." + prettyPrintConfiguration.getEOL(),prettyPrintConfiguration,0);
            for (ProofBody proofBody : assertion.getoProof().get().getProofBodies()) {
                proof += prettyPrintContext.indentExpression(proofBody.accept(new PrettyPrintProofBodyVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation() + 1,
                                PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                        prettyPrintConfiguration.getEOL()
                ,prettyPrintConfiguration,1);
            }
            proof += "Qed.";
        }
        return proof;
    }

    private String defineAssertionKeyword(Assertion assertion) {
        String prefix;
        switch(assertion.getAssertionKeyword()){
            case THEOREM : prefix = "Theorem";break;
            case FACT: prefix = "Fact";break;
            case LEMMA: prefix = "Lemma";break;
            case REMARK: prefix = "Remark";break;
            case EXAMPLE: prefix = "Example";break;
            case COROLLARY: prefix = "Corollary";break;
            case DEFINITION: prefix = "Definition";break;
            case PROPOSITION: prefix = "Proposition";break;
            default: throw new IllegalStateException();
        }
        return prefix;
    }

    private class AssertionBindersHelper {
        private Assertion assertion;
        private PrettyPrintContext prettyPrintContext;
        private List<String> binders;
        private List<Boolean> isBracedBinders;

        public AssertionBindersHelper(Assertion assertion, PrettyPrintContext prettyPrintContext, List<String> binders, List<Boolean> isBracedBinders) {
            this.assertion = assertion;
            this.prettyPrintContext = prettyPrintContext;
            this.binders = binders;
            this.isBracedBinders = isBracedBinders;
        }

        public Assertion getAssertion() {
            return assertion;
        }

        public PrettyPrintContext getPrettyPrintContext() {
            return prettyPrintContext;
        }

        public List<String> getBinders() {
            return binders;
        }

        public List<Boolean> getIsBracedBinders() {
            return isBracedBinders;
        }
    }
    private String defineAssertionBinders( String strBinders, AssertionBindersHelper assertionBindersHelper) {
        if(assertionBindersHelper.assertion.getoBinders().isPresent()){
            for (Binder binder : assertionBindersHelper.assertion.getoBinders().get()) {
                assertionBindersHelper.binders.add(binder.accept(new PrettyPrintBinderVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(assertionBindersHelper.prettyPrintContext.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)));
                if(binder instanceof SingleNameBinder || binder instanceof BracedNameBinder || binder instanceof ImplicitBinder){
                    assertionBindersHelper.isBracedBinders.add(false);
                }
                else{
                    assertionBindersHelper.isBracedBinders.add(true);
                }
            }
            for (int i = 0; i < assertionBindersHelper.binders.size(); i++) {
                if(assertionBindersHelper.isBracedBinders.get(i)) {
                    assertionBindersHelper.binders.set(i, "( " + assertionBindersHelper.binders.get(i) + " )");
                }
            }
            for (String binder : assertionBindersHelper.binders) {
                strBinders += binder + " ";
            }
        }
        return strBinders;
    }

    @Override
    public String visit(Assumption assumption, PrettyPrintContext prettyPrintContext) {
        String assumWithoutPrefix = "";
        assumWithoutPrefix = defineAssums(assumption, prettyPrintContext, assumWithoutPrefix);
        String prefix = "";
        prefix = defineAssumptionKeyword(assumption, prefix);
        return prettyPrintContext.indentExpression(prefix +
                " " +
                assumWithoutPrefix +
                " .",prettyPrintConfiguration,0);
    }

    private String defineAssumptionKeyword(Assumption assumption, String prefix) {
        switch(assumption.getAssumptionKeyword()){
            case AXIOM: prefix = "Axiom";break;
            case VARIABLE: prefix = "Variable";break;
            case PARAMETER: prefix = "Parameter";break;
            case VARIABLES: prefix = "Variables";break;
            case CONJECTURE: prefix = "Conjecture";break;
            case HYPOTHESES: prefix = "Hypotheses";break;
            case HYPOTHESIS: prefix = "Hypothesis";break;
            case PARAMETERS: prefix = "Parameters";break;
        }
        return prefix;
    }

    private String defineAssums(Assumption assumption, PrettyPrintContext prettyPrintContext, String assumWithoutPrefix) {
        if(assumption.getAssumsList().size() == 1){
            String ids = "";
            for (Ident id : assumption.getAssumsList().get(0).getIds()) {
                ids += id.accept(new PrettyPrintIdentVisitor(),prettyPrintContext) + " ";
            }
            assumWithoutPrefix = ids +
                    ": " +
                    assumption.getAssumsList().get(0).getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                            new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
        }
        else {
            for (Assums assums : assumption.getAssumsList()) {
                String ids = "";
                for (Ident id : assums.getIds()) {
                    ids += id.accept(new PrettyPrintIdentVisitor(),prettyPrintContext) + " ";
                }
                assumWithoutPrefix += "( " +
                        ids +
                        ": " +
                        assums.getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                        +
                        " )";
            }
        }
        return assumWithoutPrefix;
    }

    @Override
    public String visit(CoFixPoint coFixPoint, PrettyPrintContext prettyPrintContext) {
        String cofixbodies = "";
        for (int i = 0; i < coFixPoint.getCoFixBodies().size(); i++) {
                String ident = coFixPoint.getCoFixBodies().get(i).getId().accept(new PrettyPrintIdentVisitor(),prettyPrintContext);
                String strBinders = "";
                List<String> binders = new ArrayList<>();
            strBinders = defineCofixPointBinders( i, strBinders, new CofixPointBindersHelper( coFixPoint, prettyPrintContext,binders));
            String oTerm = "";
                if(coFixPoint.getCoFixBodies().get(i).getoTerm().isPresent()){
                    oTerm = coFixPoint.getCoFixBodies().get(i).getoTerm().get().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                            new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
                }
                String term = coFixPoint.getCoFixBodies().get(i).getAssocTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
            cofixbodies = defineCofixbodies(cofixbodies, i, new CofixBodiesHelper(ident, strBinders, oTerm, term));
        }
        return prettyPrintContext.indentExpression("CoFixpoint " +
                cofixbodies +
                (coFixPoint.getOptionalWhereClause().isPresent() ? "where " +
                        coFixPoint.getOptionalWhereClause().get().getName() +
                        " := " +
                        coFixPoint.getOptionalWhereClause().get().getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                        +
                        " : " +
                        coFixPoint.getOptionalWhereClause().get().getId().accept(new PrettyPrintIdentVisitor(),prettyPrintContext)
                : ""),prettyPrintConfiguration,0);
        }

        private class CofixPointBindersHelper {
            private CoFixPoint coFixPoint;
            private PrettyPrintContext prettyPrintContext;
            List<String> binders;

            public CofixPointBindersHelper(CoFixPoint coFixPoint, PrettyPrintContext prettyPrintContext, List<String> binders) {
                this.coFixPoint = coFixPoint;
                this.prettyPrintContext = prettyPrintContext;
                this.binders = binders;
            }
        }
    private String defineCofixPointBinders( int index, String strBinders, CofixPointBindersHelper cofixPointBindersHelper) {
        if(cofixPointBindersHelper.coFixPoint.getCoFixBodies().get(index).getoBinders().isPresent()){
            for (Binder binder : cofixPointBindersHelper.coFixPoint.getCoFixBodies().get(index).getoBinders().get()) {
                cofixPointBindersHelper.binders.add(binder.accept(new PrettyPrintBinderVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(cofixPointBindersHelper.prettyPrintContext.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)));
            }
            if(cofixPointBindersHelper.binders.size() != 1){
                for (int j = 0; j < cofixPointBindersHelper.binders.size(); j++) {
                    cofixPointBindersHelper.binders.set(j,"( " + cofixPointBindersHelper.binders.get(j) + " )");
                }
            }
            for (String binder : cofixPointBindersHelper.binders) {
                strBinders += binder + " ";
            }
        }
        return strBinders;
    }

    private class CofixBodiesHelper {
        private String ident;
        private String strBinders;
        private String oTerm;
        private String term;

        public CofixBodiesHelper(String ident, String strBinders, String oTerm, String term) {
            this.ident = ident;
            this.strBinders = strBinders;
            this.oTerm = oTerm;
            this.term = term;
        }

        public String getIdent() {
            return ident;
        }

        public String getStrBinders() {
            return strBinders;
        }

        public String getoTerm() {
            return oTerm;
        }

        public String getTerm() {
            return term;
        }
    }
    private String defineCofixbodies(String cofixbodies, int index, CofixBodiesHelper cofixBodiesHelper) {
        if(index == 0){
            cofixbodies += cofixBodiesHelper.ident +
                    " " +
                    cofixBodiesHelper.strBinders +
                    (cofixBodiesHelper.oTerm.equals("")?"":": " + cofixBodiesHelper.oTerm) +
                    " := " +
                    cofixBodiesHelper.term;
        }
        else {
            cofixbodies += " with " +
                    cofixBodiesHelper.ident +
                    " " +
                    cofixBodiesHelper.strBinders +
                    (cofixBodiesHelper.oTerm.equals("")?"":": " + cofixBodiesHelper.oTerm) +
                    " := " +
                    cofixBodiesHelper.term;
        }
        return cofixbodies;
    }

    @Override
    public String visit(CoInductive coInductive, PrettyPrintContext prettyPrintContext) {
        throw new UnsupportedOperationException();

    }

    @Override
    public String visit(Goal goal, PrettyPrintContext prettyPrintContext) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String visit(LetDefinition letDefinition, PrettyPrintContext prettyPrintContext) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String visit(Record record, PrettyPrintContext prettyPrintContext) {
        String strBinders = "";
        List<String> binders = new ArrayList<>();
        strBinders = defineRecordBinders(record, prettyPrintContext, strBinders, binders);
        String fields = "";
        fields = defineRecordFields(record, prettyPrintContext, fields);
        String prefix = "";
        prefix = defineRecordKeyword(record);

        return  prettyPrintContext.indentExpression(prefix +
                " " +
                record.getId().accept(new PrettyPrintIdentVisitor(),prettyPrintContext) +
                " " +
                strBinders +
                " " +
                (record.getoSort().isPresent()? ": "
                        + record.getoSort().get().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                        prettyPrintContext) +
                        " " : " ") +
                ":= " + prettyPrintConfiguration.getEOL(),prettyPrintConfiguration,0) +
                prettyPrintContext.indentExpression(
                (record.getoId().isPresent()? record.getoId().get().accept(
                        new PrettyPrintIdentVisitor(),prettyPrintContext)
                        : ""
                ) +
                " " +
                " { " +
                fields +
                " } " +
                "." ,prettyPrintConfiguration,1);
    }

    private String defineRecordKeyword(Record record) {
        String prefix;
        switch(record.getRecordKeyword()){
            case RECORD: prefix = "Record";break;
            case INDUCTIVE: prefix = "Inductive";break;
            case COINDUCTIVE: prefix = "CoInductive";break;
            default:throw new IllegalStateException();
        }
        return prefix;
    }

    private String defineRecordFields(Record record, PrettyPrintContext prettyPrintContext, String fields) {
        if(record.getFieldList().isPresent()){
            for (int i = 0; i < record.getFieldList().get().size(); i++) {
                if(i == 0){
                    fields += record.getFieldList().get().get(i).accept(new PrettyPrintFieldVisitor(prettyPrintConfiguration),
                            prettyPrintContext);
                }
                else {
                    fields += " ; " + record.getFieldList().get().get(i).accept(new PrettyPrintFieldVisitor(prettyPrintConfiguration),
                            prettyPrintContext);
                }
            }
        }
        return fields;
    }

    private String defineRecordBinders(Record record, PrettyPrintContext prettyPrintContext, String strBinders, List<String> binders) {
        if(record.getoBinders().isPresent()){
            for (Binder binder : record.getoBinders().get()) {
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
        return strBinders;
    }

    @Override
    public String visit(StdDefinition stdDefinition, PrettyPrintContext prettyPrintContext) {
        String strBinders = "";
        List<String> binders = new ArrayList<>();
        strBinders = defineStdDefinitionBinders(stdDefinition, prettyPrintContext, strBinders, binders);
        return  prettyPrintContext.indentExpression(
                (stdDefinition.isLocal() ? "Local " : "") +
                "Definition " +
                stdDefinition.getId().accept(new PrettyPrintIdentVisitor(),prettyPrintContext) +
                strBinders +
                (stdDefinition.getoBindTerm().isPresent() ? " : " +
                        stdDefinition.getoBindTerm().get().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                        :
                        " ") +
                " := " +
                prettyPrintConfiguration.getEOL(),prettyPrintConfiguration,0) +
                prettyPrintContext.indentExpression(
                stdDefinition.getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                ".",prettyPrintConfiguration,1);
    }

    private String defineStdDefinitionBinders(StdDefinition stdDefinition, PrettyPrintContext prettyPrintContext, String strBinders, List<String> binders) {
        if(stdDefinition.getoBinders().isPresent()){
            List<Boolean> isBracedBinders = new ArrayList<>();
            for (Binder binder : stdDefinition.getoBinders().get()) {
                binders.add(binder.accept(new PrettyPrintBinderVisitor(prettyPrintConfiguration),prettyPrintContext));
                if(binder instanceof SingleNameBinder || binder instanceof BracedNameBinder || binder instanceof ImplicitBinder){
                    isBracedBinders.add(false);
                }
                else{
                    isBracedBinders.add(true);
                }
            }
            for (int i = 0; i < binders.size(); i++) {
                if(isBracedBinders.get(i)) {
                    binders.set(i, "( " + binders.get(i) + " )");
                }
            }
            for (String binder : binders) {
                strBinders += " " + binder;
            }
        }
        return strBinders;
    }

    @Override
    public String visit(StdFixPoint stdFixPoint, PrettyPrintContext prettyPrintContext) {
        String fixBodies = "";
        for (int i = 0; i < stdFixPoint.getFixBodies().size(); i++) {
            String ident = stdFixPoint.getFixBodies().get(i).getId().accept(
                    new PrettyPrintIdentVisitor(),prettyPrintContext);

            List<String> binders = new ArrayList<>();
            String strBinders = "";
            strBinders = defineStdFixPointBinders(i, strBinders,new StdFixPointBindersHelper(stdFixPoint, prettyPrintContext, binders));
            String annotation = "";
            if(stdFixPoint.getFixBodies().get(i).getoAnnotation().isPresent()){
                annotation = " { struct " + stdFixPoint.getFixBodies().get(i).getoAnnotation().get().getAnnotation() + " }";
            }
            String oTerm = "";
            if(stdFixPoint.getFixBodies().get(i).getoTerm().isPresent()){
                oTerm = stdFixPoint.getFixBodies().get(i).getoTerm().get().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI));
            }
            String term = stdFixPoint.getFixBodies().get(i).getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                    new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation() + 1,PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI));

            fixBodies = defineFixBodies( fixBodies, i, new FixBodiesHelper(prettyPrintContext, ident, strBinders, annotation, oTerm, term));
        }
        String whereClause = "";
        whereClause = defineWhereClause(stdFixPoint, prettyPrintContext, whereClause);
        return "Fixpoint " + fixBodies + whereClause + ".";

    }

    private class StdFixPointBindersHelper {
        private StdFixPoint stdFixPoint;
        private PrettyPrintContext prettyPrintContext;
        private List<String> binders;

        public StdFixPointBindersHelper(StdFixPoint stdFixPoint, PrettyPrintContext prettyPrintContext, List<String> binders) {
            this.stdFixPoint = stdFixPoint;
            this.prettyPrintContext = prettyPrintContext;
            this.binders = binders;
        }
    }
    private String defineStdFixPointBinders( int index, String strBinders,StdFixPointBindersHelper stdFixPointBindersHelper) {
        for (Binder binder : stdFixPointBindersHelper.stdFixPoint.getFixBodies().get(index).getBinders()) {
            stdFixPointBindersHelper.binders.add(binder.accept(new PrettyPrintBinderVisitor(prettyPrintConfiguration),
                    new PrettyPrintContext(stdFixPointBindersHelper.prettyPrintContext.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI)));
        }
        if(stdFixPointBindersHelper.binders.size() != 1){
            for (int j = 0; j < stdFixPointBindersHelper.binders.size(); j++) {
                if(stdFixPointBindersHelper.binders.get(j).contains(":=") || stdFixPointBindersHelper.binders.get(j).contains(":") || stdFixPointBindersHelper.binders.get(j).contains("{")) {
                    stdFixPointBindersHelper.binders.set(j, "(" + stdFixPointBindersHelper.binders.get(j) + ")");
                }
            }
        }
        for (String binder : stdFixPointBindersHelper.binders) {
            strBinders += " " + binder;
        }
        return strBinders;
    }

    private class FixBodiesHelper {
        private PrettyPrintContext prettyPrintContext;
        private String ident, strBinders,  annotation,  oTerm,  term;

        public FixBodiesHelper(PrettyPrintContext prettyPrintContext, String ident, String strBinders, String annotation, String oTerm, String term) {
            this.prettyPrintContext = prettyPrintContext;
            this.ident = ident;
            this.strBinders = strBinders;
            this.annotation = annotation;
            this.oTerm = oTerm;
            this.term = term;
        }
    }
    private String defineFixBodies( String fixBodies, int index, FixBodiesHelper fixBodiesHelper) {
        if(index == 0) {
            fixBodies += fixBodiesHelper.prettyPrintContext.indentExpression(fixBodiesHelper.ident +
                    " " +
                    fixBodiesHelper.strBinders +
                    " " +
                    (fixBodiesHelper.annotation.equals("") ? "" : fixBodiesHelper.annotation + " ") +
                    (fixBodiesHelper.oTerm.equals("") ? "" : ": " + fixBodiesHelper.oTerm + " ") +
                    ":= " + prettyPrintConfiguration.getEOL(),prettyPrintConfiguration,0) +
                    fixBodiesHelper.prettyPrintContext.indentExpression(fixBodiesHelper.term + prettyPrintConfiguration.getEOL(),prettyPrintConfiguration,1);
        } else {
            fixBodies += fixBodiesHelper.prettyPrintContext.indentExpression(" with " +
                    fixBodiesHelper.ident +
                    " " +
                    fixBodiesHelper.strBinders +
                    " " +
                    (fixBodiesHelper.annotation.equals("") ? "" : fixBodiesHelper.annotation + " ") +
                    (fixBodiesHelper.oTerm.equals("") ? "" : ": " + fixBodiesHelper.oTerm + " ") +
                    ":= " + prettyPrintConfiguration.getEOL(),prettyPrintConfiguration,0) +
                    fixBodiesHelper.prettyPrintContext.indentExpression(fixBodiesHelper.term + prettyPrintConfiguration.getEOL(),prettyPrintConfiguration,1);
        }
        return fixBodies;
    }

    private String defineWhereClause(StdFixPoint stdFixPoint, PrettyPrintContext prettyPrintContext, String whereClause) {
        if(stdFixPoint.getOptionalWhereClause().isPresent()){
            whereClause = prettyPrintConfiguration.getEOL() +
                    prettyPrintConfiguration.getEOL() +
                    "where " +
                    stdFixPoint.getOptionalWhereClause().get().getName() +
                    " " +
                    ":= " +
                    stdFixPoint.getOptionalWhereClause().get().getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                            new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation() + 1, PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                    " : " +
                    stdFixPoint.getOptionalWhereClause().get().getId().accept(
                            new PrettyPrintIdentVisitor(),prettyPrintContext);
        }
        return whereClause;
    }

    @Override
    public String visit(StdInductive stdInductive, PrettyPrintContext prettyPrintContext) {
        String indBodies = "";
        for (int i = 0; i < stdInductive.getIndBodys().size(); i++) {
            String ident = stdInductive.getIndBodys().get(i).getId().accept(new PrettyPrintIdentVisitor(),prettyPrintContext);
            String strBinders = "";
            List<String> binders = new ArrayList<>();
            strBinders = defineStdInductiveBinders( i, strBinders,new StdInductiveBindersHelper(stdInductive, prettyPrintContext, binders));
            String oTerm = "";
            if(stdInductive.getIndBodys().get(i).getoTerm().isPresent()) {
                oTerm = stdInductive.getIndBodys().get(i).getoTerm().get().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
            }
            String indBodyAlocElements = "";
            indBodyAlocElements = defineIndBodyAlocElements( i, indBodyAlocElements,new IndBodyAlocElementsHelper(stdInductive, prettyPrintContext,oTerm));
            indBodies = defineIndBodies(indBodies, i,new IndBodiesHelper( ident, strBinders, oTerm, indBodyAlocElements));
        }
        return prettyPrintContext.indentExpression("Inductive " +
                indBodies +
                (stdInductive.getWhereClause().isPresent() ? prettyPrintConfiguration.getEOL() +
                        prettyPrintContext.indentExpression("where " +
                        stdInductive.getWhereClause().get().getName() +
                        " := " + prettyPrintConfiguration.getEOL(),prettyPrintConfiguration,0) +
                        prettyPrintContext.indentExpression(stdInductive.getWhereClause().get().getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                        +
                        " : " +
                        stdInductive.getWhereClause().get().getId().accept(new PrettyPrintIdentVisitor(),prettyPrintContext) +
                        prettyPrintConfiguration.getEOL(),prettyPrintConfiguration,0)
                        : "") +
                " .",prettyPrintConfiguration,0);


    }

    private class IndBodiesHelper {
        String ident, strBinders,  oTerm,  indBodyAlocElements;

        public IndBodiesHelper(String ident, String strBinders, String oTerm, String indBodyAlocElements) {
            this.ident = ident;
            this.strBinders = strBinders;
            this.oTerm = oTerm;
            this.indBodyAlocElements = indBodyAlocElements;
        }
    }

    private String defineIndBodies(String indBodies, int index, IndBodiesHelper indBodiesHelper) {
        if(index == 0) {
            indBodies += indBodiesHelper.ident +
                    " " +
                    indBodiesHelper.strBinders +
                    " " +
                    (indBodiesHelper.oTerm.equals("")?"":": " + indBodiesHelper.oTerm) +
                    " := " +
                    prettyPrintConfiguration.getEOL() +
                    indBodiesHelper.indBodyAlocElements;
        }
        else {
            indBodies += "with " +
                    indBodiesHelper.ident +
                    " " +
                    indBodiesHelper.strBinders +
                    " " +
                    (indBodiesHelper.oTerm.equals("")?"":": " + indBodiesHelper.oTerm) +
                    " := " +
                    prettyPrintConfiguration.getEOL() +
                    indBodiesHelper.indBodyAlocElements;
        }
        return indBodies;
    }


    private class IndBodyAlocElementsHelper {
        private StdInductive stdInductive;
        private PrettyPrintContext prettyPrintContext;
        private String oTerm;

        public IndBodyAlocElementsHelper(StdInductive stdInductive, PrettyPrintContext prettyPrintContext, String oTerm) {
            this.stdInductive = stdInductive;
            this.prettyPrintContext = prettyPrintContext;
            this.oTerm = oTerm;
        }
    }
    private String defineIndBodyAlocElements( int index, String indBodyAlocElements, IndBodyAlocElementsHelper indBodyAlocElementsHelper) {
        if(indBodyAlocElementsHelper.stdInductive.getIndBodys().get(index).getOptionalIndBodyAlloc().isPresent()) {
            for (IndBodyAllocElement indBodyAllocElement : indBodyAlocElementsHelper.stdInductive.getIndBodys().get(index).getOptionalIndBodyAlloc().get().getIndBodyAllocElementList()) {
                String allocIdent = indBodyAllocElement.getId().accept(new PrettyPrintIdentVisitor(),indBodyAlocElementsHelper.prettyPrintContext);
                String strAllocBinders = "";
                List<String> allocBinders = new ArrayList<>();
                if(indBodyAllocElement.getoBinders().isPresent()) {
                    for (Binder binder : indBodyAllocElement.getoBinders().get()) {
                       allocBinders.add("( " + binder.accept(new PrettyPrintBinderVisitor(prettyPrintConfiguration),indBodyAlocElementsHelper.prettyPrintContext) + " )");
                    }
                    for (String binder : allocBinders) {
                        strAllocBinders += " " + binder;
                    }
                }
                String oAllocTerm = "";
                if(indBodyAllocElement.getoTerm().isPresent()) {
                    oAllocTerm = indBodyAllocElement.getoTerm().get().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                            new PrettyPrintContext(indBodyAlocElementsHelper.prettyPrintContext.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
                }
                indBodyAlocElements += indBodyAlocElementsHelper.prettyPrintContext.indentExpression(
                        "| " +
                        allocIdent +
                        " " +
                        strAllocBinders +
                        " " +
                        (indBodyAlocElementsHelper.oTerm.equals("")?"":": " + oAllocTerm) +
                        prettyPrintConfiguration.getEOL(),prettyPrintConfiguration,1);
            }
        }
        return indBodyAlocElements;
    }

    private class StdInductiveBindersHelper {
        private StdInductive stdInductive;
        private PrettyPrintContext prettyPrintContext;
        List<String> binders;

        public StdInductiveBindersHelper(StdInductive stdInductive, PrettyPrintContext prettyPrintContext, List<String> binders) {
            this.stdInductive = stdInductive;
            this.prettyPrintContext = prettyPrintContext;
            this.binders = binders;
        }
    }
    private String defineStdInductiveBinders( int index, String strBinders, StdInductiveBindersHelper stdInductiveBindersHelper) {
        if(stdInductiveBindersHelper.stdInductive.getIndBodys().get(index).getoBinders().isPresent()){
            for (Binder binder : stdInductiveBindersHelper.stdInductive.getIndBodys().get(index).getoBinders().get()) {
                stdInductiveBindersHelper.binders.add(binder.accept(new PrettyPrintBinderVisitor(prettyPrintConfiguration),stdInductiveBindersHelper.prettyPrintContext));
            }
            if(stdInductiveBindersHelper.binders.size() != 1){
                for (int j = 0; j < stdInductiveBindersHelper.binders.size(); j++) {
                    stdInductiveBindersHelper.binders.set(j,"( " + stdInductiveBindersHelper.binders.get(j) + " )");
                }
            }
            for (String binder : stdInductiveBindersHelper.binders) {
                strBinders += " " + binder;
            }
        }
        return strBinders;
    }

    @Override
    public String visit(LtacCoqFragment ltacCoqFragment, PrettyPrintContext prettyPrintContext) {
        String ltacDefs = "";
        for (int i = 0; i < ltacCoqFragment.getLtac().getLtacDefs().size(); i++) {
            if( i == 0) {
                ltacDefs += ltacCoqFragment.getLtac().getLtacDefs().get(i).accept(
                        new PrettyPrintLtacDefVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),
                                PrettyPrintConfiguration.HIGHESTPREC,
                                PrettyPrintContext.TREETYPE.MULTI));
            }
            else {
                ltacDefs += "with " +
                        ltacCoqFragment.getLtac().getLtacDefs().get(i).accept(
                        new PrettyPrintLtacDefVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),
                                PrettyPrintConfiguration.HIGHESTPREC,
                                PrettyPrintContext.TREETYPE.MULTI));
            }
        }
        return (ltacCoqFragment.getLtac().isLocal()?"Local ":"") +
                "Ltac " +
                ltacDefs +
                ".";

    }

    @Override
    public String visit(End end, PrettyPrintContext prettyPrintContext) {
        return prettyPrintContext.indentExpression("End " +
                end.getId().accept(new PrettyPrintIdentVisitor(),prettyPrintContext),prettyPrintConfiguration,0) +
                ".";
    }

    @Override
    public String visit(Include include, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Module module, PrettyPrintContext prettyPrintContext) {
        String moduleComponents = "";
        for (ModuleComponent moduleComponent : module.getModuleComponents()) {
            moduleComponents += moduleComponent.accept(new PrettyPrintModuleComponentVisitor(),prettyPrintContext) + " ";
        }
        return prettyPrintContext.indentExpression("Module " +
                moduleComponents +
                ".",prettyPrintConfiguration,0);

    }

    @Override
    public String visit(Require require, PrettyPrintContext prettyPrintContext) {

        return prettyPrintContext.indentExpression((require.getoFrom().isPresent() ? "From " + require.getoFrom().get() : "") +
                " Require " +
                require.getQualid().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),
                                PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                "." ,prettyPrintConfiguration,0);

    }

    @Override
    public String visit(RequireExport requireExport, PrettyPrintContext prettyPrintContext){
        String qualids = "";
        for (Qualid qualid : requireExport.getQualids()) {
            qualids += qualid.accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                    new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),
                            PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) + " ";
        }
        return prettyPrintContext.indentExpression("Require Export" +
                " " +
                qualids +
                ".",prettyPrintConfiguration,0);
    }

    @Override
    public String visit(RequireImport requireImport, PrettyPrintContext prettyPrintContext) {

        String qualids = "";
        for (Qualid qualid : requireImport.getQualids()) {
            qualids += qualid.accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                    new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),
                            PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) + " ";
        }
        return prettyPrintContext.indentExpression("Require Import" +
               " " +
                qualids +
                ".",prettyPrintConfiguration,0);
    }

    @Override
    public String visit(Section section, PrettyPrintContext prettyPrintContext) {
        return prettyPrintContext.indentExpression("Section " +
                section.getId().accept(new PrettyPrintIdentVisitor(),prettyPrintContext) +
                ".",prettyPrintConfiguration,0);

    }

    @Override
    public String visit(UndefinedCommand undefinedCommand, PrettyPrintContext prettyPrintContext) {
        return prettyPrintContext.indentExpression(undefinedCommand.toString() + "."
                ,prettyPrintConfiguration,0);
    }
}
