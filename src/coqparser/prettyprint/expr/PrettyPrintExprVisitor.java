package coqparser.prettyprint.expr;

import coqparser.prettyprint.PrettyPrintConfiguration;
import coqparser.prettyprint.PrettyPrintContext;
import coqparser.prettyprint.term.PrettyPrintIdentVisitor;
import coqparser.prettyprint.term.PrettyPrintTermVisitor;
import model.tactics.atomic.applytheorem.*;
import model.tactics.atomic.automation.*;
import model.tactics.atomic.automatizing.*;
import model.tactics.atomic.caseanalysisind.*;
import model.tactics.atomic.checkingprops.*;
import model.tactics.atomic.classicaltac.Classical_Left;
import model.tactics.atomic.classicaltac.Classical_Right;
import model.tactics.atomic.controlproofflow.*;
import model.tactics.atomic.converstachypo.Conv_Tactic;
import model.tactics.atomic.decisionprocs.*;
import model.tactics.atomic.equalinducsets.*;
import model.tactics.atomic.equality.F_Equal;
import model.tactics.atomic.equality.Reflexivity;
import model.tactics.atomic.equality.Symmetry;
import model.tactics.atomic.equality.Transitivity;
import model.tactics.atomic.inversion.FunctionalInversion;
import model.tactics.atomic.inversion.Quote;
import model.tactics.atomic.manageloccont.*;
import model.tactics.atomic.nonlogical.*;
import model.tactics.atomic.performcompute.*;
import model.tactics.atomic.rewriteexpr.*;
import model.tactics.atomic.tacargcomponents.TacArgComponent;
import model.tactics.expr.*;
import model.tactics.expr.utilities.LetClause;
import model.tactics.expr.utilities.MessageToken;
import model.tactics.expr.utilities.TacArg;
import model.term.Number;
import model.term.utilities.Ident;
import model.term.utilities.Name;
import model.visitor.expr.ExprVisitor;

import java.util.List;

public class PrettyPrintExprVisitor implements ExprVisitor<String, PrettyPrintContext> {

    private final PrettyPrintConfiguration prettyPrintConfiguration;

    public PrettyPrintExprVisitor(PrettyPrintConfiguration prettyPrintConfiguration) {
        this.prettyPrintConfiguration = prettyPrintConfiguration;
    }

    @Override
    public String visit(AbstractExpr abstractExpr, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(ApplicationExpr applicationExpr, PrettyPrintContext prettyPrintContext) {
        String tacArgs = "";
        for (TacArg tacArg : applicationExpr.getTacArgs()) {
            tacArgs += tacArg.accept(new PrettyPrintTacArgVisitor(prettyPrintConfiguration),prettyPrintContext) +
                    " ";
        }
        return applicationExpr.getQualid().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),
                        PrettyPrintConfiguration.HIGHESTPREC,
                        PrettyPrintContext.TREETYPE.MULTI)) +
                " " +
                tacArgs;
    }

    @Override
    public String visit(AtomExpr atomExpr, PrettyPrintContext prettyPrintContext) {
        return atomExpr.getAtom().accept(new PrettyPrintAtomVisitor(prettyPrintConfiguration),
                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
    }

    @Override
    public String visit(BackTrackingExpr backTrackingExpr, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(ContextExpr contextExpr, PrettyPrintContext prettyPrintContext) {
        return "context " +
                contextExpr.getId().accept(new PrettyPrintIdentVisitor(),prettyPrintContext) +
                " " +
                (contextExpr.isBraced()?"[ ":"") +
                (contextExpr.getoTerm().isPresent()?contextExpr.getoTerm().get().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                        :"") +
                (contextExpr.isBraced()?" ]":"");

    }

    @Override
    public String visit(DoIdentExpr doIdentExpr, PrettyPrintContext prettyPrintContext) {
        return "do " +
                doIdentExpr.getId().accept(new PrettyPrintIdentVisitor(),prettyPrintContext) +
                " " +
                doIdentExpr.getExpr().accept(this,
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));

    }

    @Override
    public String visit(DoNumExpr doNumExpr, PrettyPrintContext prettyPrintContext) {
        return "do " +
                doNumExpr.getNum().toString() +
                " " +
                doNumExpr.getExpr().accept(this,
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
    }

    @Override
    public String visit(ExactlyOnceExpr exactlyOnceExpr, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(AssertFailsExpr failAssertExpr, PrettyPrintContext prettyPrintContext) {
        return "assert_fails " +
                failAssertExpr.getExpr().accept(new PrettyPrintExprVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
    }

    @Override
    public String visit(FailExpr failExpr, PrettyPrintContext prettyPrintContext) {
        String natural = "";
        if(failExpr.getoNatural().isPresent()){
            if(failExpr.getoNatural().get() instanceof Ident){
                Ident castIdent = (Ident)failExpr.getoNatural().get();
                natural = castIdent.accept(new PrettyPrintIdentVisitor(),prettyPrintContext);
            }
            else {
                Number castNumber = (Number)failExpr.getoNatural().get();
                natural = castNumber.toString();
            }
        }
        String messageTokens = "";
        if(failExpr.getoMessageTokens().isPresent()){
            List<MessageToken> messageTokenList = failExpr.getoMessageTokens().get();
            for (MessageToken messageToken : messageTokenList) {
                messageTokens += messageToken.accept(new PrettyPrintMessageTokenVisitor(),prettyPrintContext) + " ";
            }
        }
        return "fail " +
                natural +
                " " +
                messageTokens;

    }

    @Override
    public String visit(FirstExpr firstExpr, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(FunExpr funExpr, PrettyPrintContext prettyPrintContext) {
        String names = "";
        for (Name name : funExpr.getNames()) {
            names += name.toString() + " ";
        }
        String exprs = "";
        for (Expr expr : funExpr.getExprs()) {
            exprs += expr.accept(this,
                    new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                    " ";
        }
        return "fun " +
                names +
                "=> " +
                exprs;
    }

    @Override
    public String visit(GeneralizedBranchingExpr generalizedBranchingExpr, PrettyPrintContext prettyPrintContext) {
        return "tryif " + generalizedBranchingExpr.getExpr1().accept(new PrettyPrintExprVisitor(prettyPrintConfiguration),
                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                " then " +
                generalizedBranchingExpr.getExpr2().accept(new PrettyPrintExprVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                " else " +
                generalizedBranchingExpr.getExpr3().accept(new PrettyPrintExprVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
    }

    @Override
    public String visit(GuardExpr guardExpr, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(IdTacExpr idTacExpr, PrettyPrintContext prettyPrintContext) {
        String messageTokens = "";
        for (MessageToken messageToken : idTacExpr.getMessageTokens()) {
            messageTokens += messageToken.accept(new PrettyPrintMessageTokenVisitor(),prettyPrintContext) + " ";
        }
        return "idtac " +
                messageTokens;
    }

    @Override
    public String visit(LazyContextMatchExpr lazyContextMatchExpr, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(LazyMatchMatchExpression lazyMatchMatchExpression, PrettyPrintContext prettyPrintContext) {
        String match = "";
        for (int i = 0; i < lazyMatchMatchExpression.getMatchRules().size(); i++) {

            match += lazyMatchMatchExpression.getMatchRules().get(i).accept(
                    new PrettyPrintMatchRuleVisitor(prettyPrintConfiguration),
                    new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation() + 1,
                            PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                    prettyPrintConfiguration.getEOL();
        }
        return prettyPrintContext.indentExpression("lazymatch " +
                        lazyMatchMatchExpression.getExpr().accept(this,
                                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                        " with " +
                        prettyPrintConfiguration.getEOL() +
                        match +
                        " end",
                prettyPrintConfiguration,0);
    }

    @Override
    public String visit(LeftBiasedExpr leftBiasedExpr, PrettyPrintContext prettyPrintContext) {
        return leftBiasedExpr.getExpr1().accept(this,
                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                " || " +
                leftBiasedExpr.getExpr2().accept(this,
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
    }

    @Override
    public String visit(LetExpr letExpr, PrettyPrintContext prettyPrintContext) {
        String letClauses = "";
        for (int i = 0; i < letExpr.getLetClauses().size(); i++) {
            LetClause current = letExpr.getLetClauses().get(i);
            String letIdent = current.getId().accept(new PrettyPrintIdentVisitor(),prettyPrintContext);

            String oLetNames = getLetNames(current);
            if(i == 0) {
                letClauses = getFirstLetClause(new LetClauseContext(prettyPrintContext, current, letIdent, oLetNames),letClauses);
            }
            else {
                letClauses = getFollowingLetClauses(new LetClauseContext(prettyPrintContext, current, letIdent, oLetNames),letClauses);
            }

        }
        return prettyPrintContext.indentExpression("let " + (letExpr.isRec()?"Rec ":" ") +
                        letClauses +
                        prettyPrintConfiguration.getEOL(),prettyPrintConfiguration,0) +
                prettyPrintContext.indentExpression("in " + prettyPrintConfiguration.getEOL(),prettyPrintConfiguration,0) +
                prettyPrintContext.indentExpression(letExpr.getExpr().accept(new PrettyPrintExprVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)),
                        prettyPrintConfiguration,0);



    }

    private class LetClauseContext {
        private PrettyPrintContext prettyPrintContext;
        private LetClause current;
        private String letIdent;
        private String oLetNames;

        public LetClauseContext(PrettyPrintContext prettyPrintContext, LetClause current, String letIdent, String oLetNames) {
            this.prettyPrintContext = prettyPrintContext;
            this.current = current;
            this.letIdent = letIdent;
            this.oLetNames = oLetNames;
        }

        public PrettyPrintContext getPrettyPrintContext() {
            return prettyPrintContext;
        }

        public LetClause getCurrent() {
            return current;
        }

        public String getLetIdent() {
            return letIdent;
        }

        public String getoLetNames() {
            return oLetNames;
        }
    }

    private String getFollowingLetClauses(LetClauseContext letClauseContext,String letClauses) {
        letClauses += "with " + letClauseContext.getLetIdent() +
                " " +
                letClauseContext.getoLetNames() +
                " := " +
                prettyPrintConfiguration.getEOL() +
                letClauseContext.getPrettyPrintContext().indentExpression(letClauseContext.getCurrent().getExpr().accept(new PrettyPrintExprVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(letClauseContext.getPrettyPrintContext().getIndentationLevel().getIndentation() + 1, PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                                prettyPrintConfiguration.getEOL(),
                        prettyPrintConfiguration
                        , 1);
        return letClauses;
    }

    private String getFirstLetClause(LetClauseContext letClauseContext,String letClauses) {
        letClauses += letClauseContext.getLetIdent() +
                " " +
                letClauseContext.getoLetNames() +
                " := " +
                prettyPrintConfiguration.getEOL() +
                letClauseContext.getPrettyPrintContext().indentExpression(letClauseContext.getCurrent().getExpr().accept(new PrettyPrintExprVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(letClauseContext.getPrettyPrintContext().getIndentationLevel().getIndentation() + 1, PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                                prettyPrintConfiguration.getEOL(),
                        prettyPrintConfiguration
                        , 1);
        return letClauses;
    }

    private String getLetNames(LetClause current) {
        String oLetNames = "";
        if(current.getoNames().isPresent()){
            for (Name name : current.getoNames().get()) {
                oLetNames += name.toString() + " ";
            }
        }
        return oLetNames;
    }

    @Override
    public String visit(LocalAppExpr localAppExpr, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(MultiContextMatchExpr multiContextMatchExpr, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(MultiMatchMatchExpression multiMatchMatchExpression, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(NumGoalsExpr numGoalsExpr, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(OnlyExpr onlyExpr, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(OpsExpr opsExpr, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(PairdSequenceLocalAppExpr pairdSequenceLocalAppExpr, PrettyPrintContext prettyPrintContext) {
        String pairedBodies = "";
        if(pairdSequenceLocalAppExpr.getoExprs().isPresent()){
            for (int i = 0; i < pairdSequenceLocalAppExpr.getoExprs().get().size(); i++) {
                String expr = "";
                if(pairdSequenceLocalAppExpr.getoExprs().get().get(i).isPresent()){
                    expr = pairdSequenceLocalAppExpr.getoExprs().get().get(i).get().accept(this,
                            new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation() + 1,
                                    PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.LEFT));
                }
                if(i == 0){
                    pairedBodies +=  expr;
                }
                else {
                    pairedBodies += " | " + expr;
                }
            }
        }
        return pairdSequenceLocalAppExpr.getExpr().accept(this,
                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation() + 1,
                        PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.LEFT)) +
                " ; " +
                "[ " +
                pairedBodies +
                " ]";
    }

    @Override
    public String visit(ProgressExpr progressExpr, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(QualidFreshExpr qualidFreshExpr, PrettyPrintContext prettyPrintContext) {

        return "fresh" +
                (qualidFreshExpr.getoQualid().isPresent()?" " + qualidFreshExpr.getoQualid().get().accept(
                        new PrettyPrintTermVisitor(prettyPrintConfiguration),
                        prettyPrintContext
                ):"");
    }

    @Override
    public String visit(RepeatExpr repeatExpr, PrettyPrintContext prettyPrintContext) {
        return "repeat " +
                repeatExpr.getExpr().accept(this,
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
    }

    @Override
    public String visit(SequenceExpr sequenceExpr, PrettyPrintContext prettyPrintContext) {
        return sequenceExpr.getExpr1().accept(this,prettyPrintContext) +
                " ; " +
                sequenceExpr.getExpr2().accept(this,prettyPrintContext);
    }

    @Override
    public String visit(SimpleTermExpr simpleTermExpr, PrettyPrintContext prettyPrintContext) {
        String prefix = "";
        switch(simpleTermExpr.getTermExprType()){
            case TYPETERM: prefix = "type_term ";break;
            case TYPE: prefix = "type of ";break;
            case CONSTR: prefix = "constr : ";break;
            case UCONSTR: prefix = "uconstr : ";break;
            case EVALRED: prefix = "eval redexpr in ";break;
            default:throw new IllegalStateException();
        }
        return prefix +
                simpleTermExpr.getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),
                                PrettyPrintConfiguration.HIGHESTPREC,
                                PrettyPrintContext.TREETYPE.MULTI));
    }

    @Override
    public String visit(SoftCutExpr softCutExpr, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(SolveExpr solveExpr, PrettyPrintContext prettyPrintContext) {
        String exprs = "";
        for (int i = 0; i < solveExpr.getExprs().size(); i++) {
            if(i == 0){
                exprs += solveExpr.getExprs().get(i).accept(new PrettyPrintExprVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
            }else {
                exprs += " |" +
                        solveExpr.getExprs().get(i).accept(new PrettyPrintExprVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
            }
        }
        return "solve " +
                "[ " +
                exprs +
                " ]";

    }

    @Override
    public String visit(StdContextMatchExpr stdContextMatchExpr, PrettyPrintContext prettyPrintContext) {
        String match = "";
        for (int i = 0; i < stdContextMatchExpr.getContextRules().size(); i++) {
            if(i == 0) {
                match += stdContextMatchExpr.getContextRules().get(i).accept(
                        new PrettyPrintContextRuleVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation() + 1,
                                PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                prettyPrintConfiguration.getEOL();
            } else {
                match += "| " + stdContextMatchExpr.getContextRules().get(i).accept(
                        new PrettyPrintContextRuleVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation() + 1,
                                PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                        prettyPrintConfiguration.getEOL();
            }
        }
        return prettyPrintContext.indentExpression("match " +
                (stdContextMatchExpr.isReverse()?"reverse ":"") +
                "goal " +
                "with " +
                prettyPrintConfiguration.getEOL() +
                match +
                "end",prettyPrintConfiguration,0);
    }

    @Override
    public String visit(StdMatchMatchExpression stdMatchMatchExpression, PrettyPrintContext prettyPrintContext) {
        String match = "";
        for (int i = 0; i < stdMatchMatchExpression.getMatchRules().size(); i++) {

            match += stdMatchMatchExpression.getMatchRules().get(i).accept(
                    new PrettyPrintMatchRuleVisitor(prettyPrintConfiguration),
                    new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation() + 1,
                            PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                    prettyPrintConfiguration.getEOL();
        }
        return prettyPrintContext.indentExpression("match " +
                stdMatchMatchExpression.getExpr().accept(this,
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                " with " +
                prettyPrintConfiguration.getEOL() +
                match +
                " end",
                prettyPrintConfiguration,0);

    }

    @Override
    public String visit(StringFreshExpr stringFreshExpr, PrettyPrintContext prettyPrintContext) {
        return "fresh " +
                (stringFreshExpr.getoString().isPresent()?stringFreshExpr.getoString().get():"");
    }

    @Override
    public String visit(SuccessAssertExpr successAssertExpr, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(TimeExpr timeExpr, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(TimeoutIdentExpr timeoutIdentExpr, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(TimeoutNumExpr timeoutNumExpr, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(TryExpr tryExpr, PrettyPrintContext prettyPrintContext) {
        return "try " +
                tryExpr.getExpr().accept(new PrettyPrintExprVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),
                                PrettyPrintConfiguration.HIGHESTPREC,
                                PrettyPrintContext.TREETYPE.MULTI));

    }

    @Override
    public String visit(Absurd absurd, PrettyPrintContext prettyPrintContext) {
        return "absurd " + printComponents(absurd.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Admit admit, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Apply apply, PrettyPrintContext prettyPrintContext) {
        return "apply " + printComponents(apply.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Assert anAssert, PrettyPrintContext prettyPrintContext) {
        return "assert " + printComponents(anAssert.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Assumption assumption, PrettyPrintContext prettyPrintContext) {
        return "assumption " + printComponents(assumption.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Auto auto, PrettyPrintContext prettyPrintContext) {
        return "auto " + printComponents(auto.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Autorewrite autorewrite, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Autounfold autounfold, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Btauto btauto, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Case aCase, PrettyPrintContext prettyPrintContext) {
        return "case " + printComponents(aCase.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Case_Eq caseEq, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Cbn cbn, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Cbv cbv, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Change change, PrettyPrintContext prettyPrintContext) {
        return "change " + printComponents(change.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Classical_Left classicalLeft, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Classical_Right classicalRight, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Clear clear, PrettyPrintContext prettyPrintContext) {
        return "clear " + printComponents(clear.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(ClearBody clearBody, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(ClearDependent clearDependent, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(CoFix coFix, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Compare compare, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Compute compute, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Congruence congruence, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(CongruenceN congruenceN, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Constructor constructor, PrettyPrintContext prettyPrintContext) {
        return "constructor " + printComponents(constructor.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Constr_Eq constrEq, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Contradict contradict, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Contradiction contradiction, PrettyPrintContext prettyPrintContext) {
        return "contradiction " + printComponents(contradiction.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Conv_Tactic convTactic, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Cut cut, PrettyPrintContext prettyPrintContext) {
        return "cut " + printComponents(cut.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Cycle cycle, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(DebugAuto debugAuto, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(DebugTrivial debugTrivial, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(DecideEquality decideEquality, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Decompose decompose, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(DecomposeRecord decomposeRecord, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(DecomposeSum decomposeSum, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(DependentDestruction dependentDestruction, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(DependentInduction dependentInduction, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(DependentInversion dependentInversion, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(DependentInversion_Clear dependentInversionClear, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(DependentRewrite dependentRewrite, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Destruct destruct, PrettyPrintContext prettyPrintContext) {
        return "destruct " + this.printComponents(destruct.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Dintuition dintuition, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Discriminate discriminate, PrettyPrintContext prettyPrintContext) {
        return "discriminate " + printComponents(discriminate.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(DoubleInduction doubleInduction, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Dtauto dtauto, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(EApply eApply, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(EAssert eAssert, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(EAssumption eAssumption, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Easy easy, PrettyPrintContext prettyPrintContext) {
        return "easy " + printComponents(easy.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(EAuto eAuto, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(ECase eCase, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(EConstructor eConstructor, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(EDestruct eDestruct, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(EDiscriminate eDiscriminate, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(EElim eElim, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(EEnough eEnough, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(EExact eExact, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(EExists eExists, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(EInduction eInduction, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(EInjection eInjection, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(ELeft eLeft, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Elim elim, PrettyPrintContext prettyPrintContext) {
        return "elim " + printComponents(elim.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(ElimType elimType, PrettyPrintContext prettyPrintContext) {
        return "elimtype " + printComponents(elimType.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Enough enough, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(EPose ePose, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(EPoseProof ePoseProof, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(ERemember eRemember, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(ERight eRight, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(ESet eSet, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(ESimplify_Eq eSimplifyEq, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Evar evar, PrettyPrintContext prettyPrintContext) {
        return "evar " + printComponents(evar.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Exact exact, PrettyPrintContext prettyPrintContext) {
        return "exact " + printComponents(exact.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(ExFalso exFalso, PrettyPrintContext prettyPrintContext) {
        return "exfalso " + printComponents(exFalso.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Exists exists, PrettyPrintContext prettyPrintContext) {
        return "exists " + printComponents(exists.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Field field, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Field_Simplify fieldSimplify, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Field_Simplify_Eq fieldSimplifyEq, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Firstorder firstorder, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Fix fix, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Fold fold, PrettyPrintContext prettyPrintContext) {
        return "fold " + printComponents(fold.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Fourier fourier, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(FunctionalInduction functionalInduction, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(FunctionalInversion functionalInversion, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(F_Equal fEqual, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Generalize generalize, PrettyPrintContext prettyPrintContext) {
        return "generalize " + printComponents(generalize.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Give_up giveUp, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Has_Evar hasEvar, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Hnf hnf, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Induction induction, PrettyPrintContext prettyPrintContext) {
        return "induction "+ printComponents(induction.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Info_Auto infoAuto, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Info_Trivial infoTrivial, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Injection injection, PrettyPrintContext prettyPrintContext) {
        return "injection " + printComponents(injection.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Instantiate instantiate, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Intro intro, PrettyPrintContext prettyPrintContext) {
        return "intro " + printComponents(intro.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Intros intros, PrettyPrintContext prettyPrintContext){
        return "intros " + printComponents(intros.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Intuition intuition, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Inversion inversion, PrettyPrintContext prettyPrintContext) {
        return "inversion " + printComponents(inversion.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Inversion_Clear inversionClear, PrettyPrintContext prettyPrintContext) {
        return "inversion_clear " + printComponents(inversionClear.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Inversion_Sigma inversionSigma, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Is_Evar isEvar, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Is_Var isVar, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(LApply lApply, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Lazy lazy, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Left left, PrettyPrintContext prettyPrintContext) {
        return "left " + printComponents(left.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Move move, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Native_Compute nativeCompute, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(NotTypeClassesRefine notTypeClassesRefine, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Now now, PrettyPrintContext prettyPrintContext) {
        return "now " + printComponents(now.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Omega omega, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Pattern pattern, PrettyPrintContext prettyPrintContext) {
        return "pattern " + printComponents(pattern.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Pose pose, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(PoseProof poseProof, PrettyPrintContext prettyPrintContext) {
        return "pose proof " + printComponents(poseProof.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Quote quote, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Red red, PrettyPrintContext prettyPrintContext) {
        return "red " + printComponents(red.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Refine refine, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Reflexivity reflexivity, PrettyPrintContext prettyPrintContext) {
        return "reflexivity " + printComponents(reflexivity.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Remember remember, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Rename rename, PrettyPrintContext prettyPrintContext) {
        return "rename " + printComponents(rename.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Replace replace, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Revert revert, PrettyPrintContext prettyPrintContext) {
        return "revert " + printComponents(revert.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(RevertDependent revertDependent, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Revgoal revgoal, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Rewrite rewrite, PrettyPrintContext prettyPrintContext) {
        return "rewrite " + printComponents(rewrite.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Right right, PrettyPrintContext prettyPrintContext) {
        return "right " + printComponents(right.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Ring ring, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Ring_Simplify ringSimplify, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Rtauto rtauto, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Set set, PrettyPrintContext prettyPrintContext) {
        return "set " + printComponents(set.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Shelve shelve, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Shelve_Unifiable shelveUnifiable, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Simpl simpl, PrettyPrintContext prettyPrintContext) {
        return "simpl " + printComponents(simpl.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(SimpleApply simpleApply, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(SimpleDestruct simpleDestruct, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(SimpleInduction simpleInduction, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(SimpleInversion simpleInversion, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(SimpleNotTypeClassesRefine simpleNotTypeClassesRefine, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(SimpleRefine simpleRefine, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Simplify_Eq simplifyEq, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Specialize specialize, PrettyPrintContext prettyPrintContext) {
        return "specialize " + "( " + printComponents(specialize.getTacArgs(),prettyPrintContext) + ") ";
    }

    @Override
    public String visit(Split split, PrettyPrintContext prettyPrintContext) {
        return "split " + printComponents(split.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Stepl stepl, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Subst subst, PrettyPrintContext prettyPrintContext) {
        return "subst " + printComponents(subst.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Swap swap, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Symmetry symmetry, PrettyPrintContext prettyPrintContext) {
        return "symmetry " + printComponents(symmetry.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Tauto tauto, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Transitivity transitivity, PrettyPrintContext prettyPrintContext) {
        return "transitivity " + printComponents(transitivity.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Trivial trivial, PrettyPrintContext prettyPrintContext) {
        return "trivial " + printComponents(trivial.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Unfold unfold, PrettyPrintContext prettyPrintContext) {
        return "unfold " + printComponents(unfold.getTacArgs(),prettyPrintContext);
    }

    @Override
    public String visit(Give_Up giveUp, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Unify unify, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(Vm_Compute vmCompute, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    private String printComponents(List<TacArgComponent> tacArgComponents,PrettyPrintContext prettyPrintContext){
        String comps = "";
        for (TacArgComponent tacArg : tacArgComponents) {
            comps += tacArg.accept(new PrettyPrintTacArgComponentVisitor(prettyPrintConfiguration),
                    prettyPrintContext) + " ";
        }
        return comps;
    }
}
