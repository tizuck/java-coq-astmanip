package coqparser.prettyprint.term;

import coqparser.prettyprint.PrettyPrintConfiguration;
import coqparser.prettyprint.PrettyPrintContext;
import model.term.*;
import model.term.Boolean;
import model.term.Number;
import model.term.utilities.*;
import model.visitor.term.TermVisitor;

import java.util.ArrayList;
import java.util.List;

public class PrettyPrintTermVisitor implements TermVisitor<String, PrettyPrintContext> {

    private final PrettyPrintConfiguration prettyPrintConfiguration;

    public PrettyPrintTermVisitor(PrettyPrintConfiguration configuration){
        this.prettyPrintConfiguration = configuration;
    }

    @Override
    public String visit(AccessQualid accessQualid, PrettyPrintContext ctx) {
        String prefix = accessQualid.getQualid().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),ctx.getPrecedence(),PrettyPrintContext.TREETYPE.MULTI));
        return prefix + accessQualid.getAcId().accept(new PrettyPrintIdentVisitor(),
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),ctx.getPrecedence(), PrettyPrintContext.TREETYPE.MULTI));
    }

    @Override
    public String visit(ArgTerm argTerm, PrettyPrintContext ctx) {
        return "( " +
                argTerm.getId().accept(new PrettyPrintIdentVisitor(),
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),ctx.getPrecedence(),PrettyPrintContext.TREETYPE.MULTI)) +
                " := " +
                argTerm.getTerm().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),ctx.getPrecedence(),PrettyPrintContext.TREETYPE.MULTI)) +
                " )";
    }

    @Override
    public String visit(AtTerm atTerm, PrettyPrintContext ctx) {
            String prefix = "@ ";
            String qualid = atTerm.getQualid().accept(this,  new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),ctx.getPrecedence(),PrettyPrintContext.TREETYPE.MULTI));
            String terms = "";
            if (atTerm.getTerms().isPresent()) {
                for (Term term : atTerm.getTerms().get()) {
                    terms += " " + term.accept(this,
                            new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.LOWESTPREC,PrettyPrintContext.TREETYPE.MULTI));
                }
            }

            return ctx.parenthesizeExpression(prefix +
                    qualid +
                    " " +
                    terms,PrettyPrintConfiguration.ATPREC, PrettyPrintContext.AssocType.ASSOCLESS);
    }

    @Override
    public String visit(Boolean bool, PrettyPrintContext ctx) {
        if(bool.isValue()){
            return "True";
        }
        return "False";
    }

    @Override
    public String visit(BracedRewTerm bracedRewTerm, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression("rew " +
                "[ " +
                bracedRewTerm.getTerm1().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation() + 1,PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                " ] " +
                bracedRewTerm.getTerm2().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation() + 1,PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                " in " +
                bracedRewTerm.getTerm3().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation() + 1,PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)),
                PrettyPrintConfiguration.REWPREC, PrettyPrintContext.AssocType.NONE);


    }

    @Override
    public String visit(CofixLet cofixLet, PrettyPrintContext ctx) {
        String prefix = "let cofix ";
        String cofixBodyIdent = cofixLet.getCoFixBody().getId().accept(new PrettyPrintIdentVisitor(),
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI));
        String strBinders = "";
        List<String> cofixBodyBinders = new ArrayList<>();
        defineCofixBinders(cofixLet, ctx, cofixBodyBinders);
        strBinders = setBinders(strBinders, cofixBodyBinders);
        String cofixBodyOTerm = "";
        if(cofixLet.getCoFixBody().getoTerm().isPresent()){
            cofixBodyOTerm = cofixLet.getCoFixBody().getoTerm().get().accept(this,
                    new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI));
        }

        String cofixBodyTerm = cofixLet.getCoFixBody().getAssocTerm().accept(this,
             new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI));

        String term = cofixLet.getTerm().accept(this,new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI));

            return ctx.parenthesizeExpression(prefix +
                    " " +
                    cofixBodyIdent +
                    " " +
                    strBinders +
                    " " +
                    cofixBodyOTerm +
                    " := " +
                    cofixBodyTerm +
                    " in " +
                    term,PrettyPrintConfiguration.LETPREC, PrettyPrintContext.AssocType.ASSOCLESS);
    }

    private String setBinders(String strBinders, List<String> cofixBodyBinders) {
        if (cofixBodyBinders.size() != 1) {
            for (int i = 0; i < cofixBodyBinders.size(); i++) {
                cofixBodyBinders.set(i, "(" + cofixBodyBinders.get(i) + ")");
            }
        }
        for (String binder : cofixBodyBinders) {
            strBinders += " " + binder;
        }
        return strBinders;
    }

    private void defineCofixBinders(CofixLet cofixLet, PrettyPrintContext ctx, List<String> cofixBodyBinders) {
        if(cofixLet.getCoFixBody().getoBinders().isPresent()){
            for (Binder binder : cofixLet.getCoFixBody().getoBinders().get()) {
                cofixBodyBinders.add(binder.accept(new PrettyPrintBinderVisitor(this.prettyPrintConfiguration),ctx));
            }
        }
    }

    @Override
    public String visit(CofixTerm cofixTerm, PrettyPrintContext ctx) {
        String prefix = "cofix";
        String cofixBodies = cofixTerm.getCoFixBodies().accept(new PrettyPrintCofixBodiesVisitor(prettyPrintConfiguration)
                ,new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI));

        return ctx.parenthesizeExpression(prefix +
                " " +
                cofixBodies,PrettyPrintConfiguration.COFIXPREC, PrettyPrintContext.AssocType.ASSOCLESS);
    }

    @Override
    public String visit(Exists2Term exists2Term, PrettyPrintContext ctx) {
        String prefix = " exists2";
        String ident = exists2Term.getId().accept(new PrettyPrintIdentVisitor(),
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI));
        String oTerm = "";
        if(exists2Term.getoBindTerm().isPresent()){
            oTerm = exists2Term.getoBindTerm().get().accept(this,new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI));
        }

        String term = exists2Term.getTerm().accept(this,new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI));
        String term2 = exists2Term.getTerm2().accept(this,new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI));

        if(oTerm.equals("")){
            return ctx.parenthesizeExpression(prefix +
                    " " +
                    ident  +
                    " , " +
                    term +
                    " & " +
                    term2,PrettyPrintConfiguration.EXISTS2PREC, PrettyPrintContext.AssocType.ASSOCLESS);
        }
        return ctx.parenthesizeExpression(prefix +
                " " +
                ident +
                " : " +
                oTerm +
                " , " +
                term +
                " & " +
                term2 ,PrettyPrintConfiguration.EXISTS2PREC, PrettyPrintContext.AssocType.ASSOCLESS);
    }

    @Override
    public String visit(ExistsExclamTerm existsExclamTerm, PrettyPrintContext ctx) {
        String prefix = " exists!";
        String idents = "";
        for (Ident id : existsExclamTerm.getIds()) {
            idents += " " + id.accept(new PrettyPrintIdentVisitor(),
                    new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI));
        }
        String term = existsExclamTerm.getTerm().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI));

        return ctx.parenthesizeExpression(prefix +
                idents +
                " , " +
                term ,PrettyPrintConfiguration.EXISTSEXCLAMPREC, PrettyPrintContext.AssocType.ASSOCLESS);
    }

    @Override
    public String visit(ExistsTerm existsTerm, PrettyPrintContext ctx) {
        String prefix = "exists ";
        String oTerm = "";
        if(existsTerm.getoBindTerm().isPresent()){
            oTerm = existsTerm.getoBindTerm().get().accept(this,
                    new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI));
        }
        String term = existsTerm.getTerm().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI));

        if(oTerm.equals("")){
            return ctx.parenthesizeExpression(prefix +
                    existsTerm.getId().accept(new PrettyPrintIdentVisitor(),ctx) +
                    " , " +
                    term ,PrettyPrintConfiguration.EXISTSPREC, PrettyPrintContext.AssocType.ASSOCLESS);
        }
        return ctx.parenthesizeExpression(prefix +
                existsTerm.getId().accept(new PrettyPrintIdentVisitor(),ctx) +
                " : " +
                oTerm +
                " , " +
                term ,PrettyPrintConfiguration.EXISTSPREC, PrettyPrintContext.AssocType.ASSOCLESS);
    }

    @Override
    public String visit(FixLet fixLet, PrettyPrintContext ctx) {
        String ident = fixLet.getFixBody().getId().accept(new PrettyPrintIdentVisitor(),
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI));
        List<String> binders = new ArrayList<>();
        String strBinders = "";
        for (Binder binder : fixLet.getFixBody().getBinders()) {
            binders.add(binder.accept(new PrettyPrintBinderVisitor(prettyPrintConfiguration),
                    new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI)));
        }
        strBinders = setBinders(strBinders, binders);
        String annotation = "";
        if(fixLet.getFixBody().getoAnnotation().isPresent()){
            annotation = " { struct " + fixLet.getFixBody().getoAnnotation().get().getAnnotation() + " }";
        }
        String oTerm = "";
        if(fixLet.getFixBody().getoTerm().isPresent()){
            oTerm = fixLet.getFixBody().getoTerm().get().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                    new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI));
        }
        String term = fixLet.getFixBody().getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI));

        String fixBody = ident + " " +  strBinders + " " + annotation + (oTerm.equals("") ? "" : " : " + oTerm) + " := " + term;

        String prefix = " let fix ";

        return ctx.parenthesizeExpression(prefix +
                " " +
                fixBody +
                " " +
                " in " +
                fixLet.getTerm().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI)),
                PrettyPrintConfiguration.LETPREC, PrettyPrintContext.AssocType.ASSOCLESS);
    }

    @Override
    public String visit(FixTerm fixTerm, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression(" fix " +
                fixTerm.getFixbodies().accept(
                    new PrettyPrintFixBodiesVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI)),
                PrettyPrintConfiguration.FIXPREC, PrettyPrintContext.AssocType.ASSOCLESS);
    }

    @Override
    public String visit(ForallTerm forallTerm, PrettyPrintContext ctx) {
        String strBinders = "";
        List<String> binders = new ArrayList<>();
        for (Binder binder : forallTerm.getBinders()) {
            binders.add(binder.accept(new PrettyPrintBinderVisitor(prettyPrintConfiguration),
                    new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI)));
        }
        if(binders.size() != 1){
            for (int i = 0; i < binders.size(); i++) {
                if(binders.get(i).contains(":=") || binders.get(i).contains(":")) {
                    binders.set(i, "(" + binders.get(i) + ")");
                }
            }
        }
        for (String binder : binders) {
            strBinders += " " + binder;
        }
        return ctx.parenthesizeExpression(" forall " +
                strBinders +
                " , " +
                forallTerm.getTerm().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI))
                ,PrettyPrintConfiguration.FORALLPREC, PrettyPrintContext.AssocType.ASSOCLESS);
    }

    @Override
    public String visit(FunTerm funTerm, PrettyPrintContext ctx) {
        String strBinders = "";
        List<String> binders = new ArrayList<>();
        for (Binder binder : funTerm.getBinders()) {
            binders.add(binder.accept(new PrettyPrintBinderVisitor(prettyPrintConfiguration),
                    new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI)));
        }
        if(binders.size() != 1){
            for (int i = 0; i < binders.size(); i++) {
                if(binders.get(i).contains(":=") || binders.get(i).contains(":")) {
                    binders.set(i, "(" + binders.get(i) + ")");
                }
            }
        }
        for (String binder : binders) {
            strBinders += " " + binder;
        }
        return ctx.parenthesizeExpression(
                " fun " +
                strBinders +
                " => " +
                funTerm.getTerm().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI)),
                PrettyPrintConfiguration.FUNPREC, PrettyPrintContext.AssocType.ASSOCLESS);
    }

    @Override
    public String visit(IdentAssignLet identAssignLet, PrettyPrintContext ctx) {

        String ident = identAssignLet.getId().accept(new PrettyPrintIdentVisitor(),
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI));
        String strBinders = "";
        List<String> binders = new ArrayList<>();
        if(identAssignLet.getoBinders().isPresent()){
            for (Binder binder : identAssignLet.getoBinders().get()) {
                binders.add(binder.accept(new PrettyPrintBinderVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI)));
            }
        }
        strBinders = setBinders(strBinders, binders);
        String oTerm = "";
        if(identAssignLet.getoTerm().isPresent()){
            oTerm = identAssignLet.getoTerm().get().accept(this,
                    new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI));
        }
        String term1 = identAssignLet.getTerm().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI));
        String term2 = identAssignLet.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI));

        return ctx.parenthesizeExpression(
                " let " +
                ident +
                " " +
                (binders.equals("") ? "" : strBinders + " ") +
                (oTerm.equals("") ? "" : oTerm + " ") +
                ":= " +
                term1 +
                " in " +
                term2,PrettyPrintConfiguration.LETPREC, PrettyPrintContext.AssocType.ASSOCLESS);
    }

    @Override
    public String visit(IfThenElseTerm ifThenElseTerm, PrettyPrintContext ctx) {
        String depRetType = "";
        if(ifThenElseTerm.getoDepRetType().isPresent()){
            depRetType = (ifThenElseTerm.getoDepRetType().get().getoName().isPresent() ?
                          " as " + ifThenElseTerm.getoDepRetType().get().getoName().get().toString() +
                    " return " + ifThenElseTerm.getoDepRetType().get().getReturnType().getTerm().accept(this,
                                  new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI))
                    :
                    "");
        }
        return ctx.parenthesizeExpression(" if " +
                ifThenElseTerm.getTerm1().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI)) +
                depRetType +
                " then " +
                ifThenElseTerm.getTerm2().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI)) +
                " else " +
                ifThenElseTerm.getTerm3().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI)),
                 PrettyPrintConfiguration.IFPREC, PrettyPrintContext.AssocType.ASSOCLESS);
    }

    @Override
    public String visit(LeftArrowBracedRewTerm leftArrowBracedRewTerm, PrettyPrintContext ctx) {
        return " rew <- [ " +
                leftArrowBracedRewTerm.getTerm1().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI)) +
                " ] " +
                leftArrowBracedRewTerm.getTerm2().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI)) +
                " in " +
                leftArrowBracedRewTerm.getTerm3().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.REWPREC,PrettyPrintContext.TREETYPE.MULTI));
    }

    @Override
    public String visit(LeftArrowRewTerm leftArrowRewTerm, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression(" rew <- " +
                leftArrowRewTerm.getTerm1().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC,PrettyPrintContext.TREETYPE.MULTI)) +
                " in " +
                leftArrowRewTerm.getTerm2().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.REWPREC,PrettyPrintContext.TREETYPE.MULTI))
                ,PrettyPrintConfiguration.REWPREC, PrettyPrintContext.AssocType.ASSOCLESS);
    }

    @Override
    public String visit(MatchTerm matchTerm, PrettyPrintContext ctx) {
        String matchItems = "";
        matchItems = defineMatchItems(matchTerm, ctx, matchItems);
        String equations = "";
        equations = defineEquations(matchTerm, ctx, equations);
        return "match " + matchItems +
                (matchTerm.getoReturnType().isPresent() ? " return " +
                        matchTerm.getoReturnType().get().getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),
                                        PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) :
                        "") +
                " with " +
                prettyPrintConfiguration.getEOL() +
                equations +
                ctx.indentExpression("end " +
                prettyPrintConfiguration.getEOL(),prettyPrintConfiguration,0);


    }

    private String defineEquations(MatchTerm matchTerm, PrettyPrintContext ctx, String equations) {
        if(matchTerm.getoEquations().isPresent()){
            for (Equation equation : matchTerm.getoEquations().get()) {
                String multPatterns = "";
                // mult_pattern ('|' mult_pattern)* '=>' equation_term
                for (int i = 0; i < equation.getPattern().size(); i++) {
                    if(i == 0){
                        multPatterns = defineFirstMultPattern(ctx, equation, multPatterns, i);
                    }
                    else {
                        multPatterns = defineFollowingMultPattern(ctx, equation, multPatterns, i);
                    }
                }
                equations += prettyPrintConfiguration.getIndent(ctx.getIndentationLevel().getIndentation() + 1) +
                        "| " +
                        multPatterns +
                        " => " +
                        equation.getTerm().accept(this,
                                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation()+1, PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                        prettyPrintConfiguration.getEOL();
            }
        }
        return equations;
    }

    private String defineFollowingMultPattern(PrettyPrintContext ctx, Equation equation, String multPatterns, int index) {
        String multPattern = "";
        // pattern (',' pattern)*
        for (int j = 0; j < equation.getPattern().get(index).size(); j++) {
            if(j == 0){
                multPattern += equation.getPattern().get(index).get(j).accept(
                        new PrettyPrintPatternVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),ctx.getPrecedence(), PrettyPrintContext.TREETYPE.MULTI));
            }
            else {
                multPattern += " , " + equation.getPattern().get(index).get(j).accept(
                        new PrettyPrintPatternVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),ctx.getPrecedence(), PrettyPrintContext.TREETYPE.MULTI));
            }
        }
        multPatterns += " | " + multPattern;
        return multPatterns;
    }

    private String defineFirstMultPattern(PrettyPrintContext ctx, Equation equation, String multPatterns, int index) {
        String multPattern = "";
        // pattern (',' pattern)*
        for (int j = 0; j < equation.getPattern().get(index).size(); j++) {
            if(j == 0){
                multPattern += equation.getPattern().get(index).get(j).accept(
                        new PrettyPrintPatternVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),ctx.getPrecedence(), PrettyPrintContext.TREETYPE.MULTI));
            }
            else {
                multPattern += " , " + equation.getPattern().get(index).get(j).accept(
                        new PrettyPrintPatternVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),ctx.getPrecedence(), PrettyPrintContext.TREETYPE.MULTI));
            }
        }
        multPatterns += multPattern;
        return multPatterns;
    }

    private String defineMatchItems(MatchTerm matchTerm, PrettyPrintContext ctx, String matchItems) {
        for (int i = 0; i < matchTerm.getMatchItems().size();i++) {
            String term = matchTerm.getMatchItems().get(i).getTerm().accept(this,
                    new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),ctx.getPrecedence(), PrettyPrintContext.TREETYPE.MULTI));
            String name = "";
            if(matchTerm.getMatchItems().get(i).getoName().isPresent()){
                name = matchTerm.getMatchItems().get(i).getoName().toString();
            }
            String qualid = "";
            if(matchTerm.getMatchItems().get(i).getoQualid().isPresent()){
                qualid = matchTerm.getMatchItems().get(i).getoQualid().get().accept(this,ctx);
            }
            String patterns = "";
            if(matchTerm.getMatchItems().get(i).getPattern().isPresent()){
                for (Pattern pattern : matchTerm.getMatchItems().get(i).getPattern().get()) {
                    patterns += pattern.accept(new PrettyPrintPatternVisitor(prettyPrintConfiguration),
                            new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),ctx.getPrecedence(), PrettyPrintContext.TREETYPE.MULTI));
                }
            }
            matchItems = defineMatchItem(matchItems, i, new MatchItemHelper( term, name, qualid, patterns));
        }
        return matchItems;
    }

    private class MatchItemHelper {
        private String term;
        private String name;
        private String qualid;
        private String patterns;

        public MatchItemHelper(String term, String name, String qualid, String patterns) {
            this.term = term;
            this.name = name;
            this.qualid = qualid;
            this.patterns = patterns;
        }

        public String getTerm() {
            return term;
        }

        public String getName() {
            return name;
        }

        public String getQualid() {
            return qualid;
        }

        public String getPatterns() {
            return patterns;
        }
    }

    private String defineMatchItem(String matchItems, int index, MatchItemHelper matchItemHelper) {
        if(index == 0){
            matchItems += matchItemHelper.term +
                    (matchItemHelper.name.equals("") ? "" : " as " + matchItemHelper.name) +
                    " " +
                    (matchItemHelper.qualid.equals("") ? "" :matchItemHelper. qualid + (matchItemHelper.patterns.equals("") ? "" : " " + matchItemHelper.patterns));
        } else {
            matchItems += ", " +
                    matchItemHelper.term +
                    (matchItemHelper.name.equals("") ? "" : " as " + matchItemHelper.name) +
                    " " +
                    (matchItemHelper.qualid.equals("") ? "" : matchItemHelper.qualid + (matchItemHelper.patterns.equals("") ? "" : " " + matchItemHelper.patterns));
        }
        return matchItems;
    }

    @Override
    public String visit(MetaVariable metaVariable, PrettyPrintContext ctx) {
        return "? " + metaVariable.getId().accept(new PrettyPrintIdentVisitor(),ctx);
    }

    @Override
    public String visit(MultArgProjectionTerm multArgProjectionTerm, PrettyPrintContext ctx) {
        String args = "";
        for (Term arg : multArgProjectionTerm.getArgs()) {
            args += " " + arg.accept(this,new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.LOWESTPREC, PrettyPrintContext.TREETYPE.MULTI));
        }
        return ctx.parenthesizeExpression(multArgProjectionTerm.getTerm().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                " . " +
                "( " +
                multArgProjectionTerm.getQualid().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                args +
                " )",PrettyPrintConfiguration.PROJECTIONPREC, PrettyPrintContext.AssocType.ASSOCLESS);
    }

    @Override
    public String visit(MultTermProjectionTerm multTermProjectionTerm, PrettyPrintContext ctx) {
        String terms = "";
        for (Term term : multTermProjectionTerm.getTerms()) {
            terms += " " + term.accept(this,new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.LOWESTPREC, PrettyPrintContext.TREETYPE.MULTI));
        }
        return ctx.parenthesizeExpression(multTermProjectionTerm.getTerm().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                " . " +
                "( " +
                "@ " +
                multTermProjectionTerm.getQualid().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                terms +
                " )",PrettyPrintConfiguration.PROJECTIONPREC, PrettyPrintContext.AssocType.ASSOCLESS);
    }

    @Override
    public String visit(NameAssignLet nameAssignLet, PrettyPrintContext ctx) {
        String names = "";
        if(nameAssignLet.getoNames().isPresent()){
            for (int i = 0; i < nameAssignLet.getoNames().get().size(); i++) {
                if(i == 0){
                    names += nameAssignLet.getoNames().get().get(i).toString();
                }
                else {
                    names += " , " + nameAssignLet.getoNames().get().get(i).toString();
                }
            }
        }
        String depRetType = "";
        if(nameAssignLet.getoDepRetType().isPresent()){
            depRetType = (nameAssignLet.getoDepRetType().get().getoName().isPresent()?
                    "as " + nameAssignLet.getoDepRetType().get().getoName().get().toString() +
                    " return " + nameAssignLet.getoDepRetType().get().getReturnType().getTerm().accept(this,
                            new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)):
                    "return "+ nameAssignLet.getoDepRetType().get().getReturnType().getTerm().accept(this,
                            new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
            );
        }
        return ctx.parenthesizeExpression("let " +
                "(" +
                (names.equals("")? "":names + " ") +
                ") " +
                        depRetType +
                " := " +
                nameAssignLet.getTerm1().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                " in " +
                nameAssignLet.getTerm().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                ,PrettyPrintConfiguration.LETPREC, PrettyPrintContext.AssocType.ASSOCLESS);

    }

    @Override
    public String visit(Number number, PrettyPrintContext ctx) {
        return number.toString();
    }

    @Override
    public String visit(OpsTerm opsTerm, PrettyPrintContext ctx) {
        switch (opsTerm.getOperator()){
            case GOEQ : return buildGOEQ(opsTerm, ctx);
            case LESS : return buildLESS(opsTerm, ctx);
            case LOEQ: return buildLOEQ(opsTerm, ctx);
            case GREATER : return buildGREATER(opsTerm, ctx);
            case EQUAL : return buildEQUAL(opsTerm, ctx);
            case GUILL : return buildGUILL(opsTerm, ctx);
            case COLON : return buildCOLON(opsTerm, ctx);
            case LCOL : return buildLCOL(opsTerm, ctx);
            case AND : return buildAND(opsTerm, ctx);
            case OR : return buildOR(opsTerm, ctx);
            case EQUIV : return buildEQUIV(opsTerm, ctx);
            case IMPLIES : return buildIMPLIES(opsTerm, ctx);
            case APP : return buildAPP(opsTerm, ctx);
            case MUL: return buildMUL(opsTerm, ctx);
            case DIV: return buildDIV(opsTerm, ctx);
            case ADD: return buildADD(opsTerm, ctx);
            case SUB : return buildSUB(opsTerm, ctx);
            case ORB : return buildORB(opsTerm, ctx);
            case LISTADD : return buildLISTADD(opsTerm, ctx);
            case LISTCONC : return buildLISTCONC(opsTerm, ctx);
            case POW: return buildPOW(opsTerm, ctx);
            case MOD2: return buildMOD2(opsTerm, ctx);
            default : throw new UnsupportedOperationException("Not yet implemented");
        }
    }

    private String buildMOD2(OpsTerm opsTerm, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression(opsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.MULTDIVAPPPREC, PrettyPrintContext.TREETYPE.LEFT)) +
                        " mod " +
                        opsTerm.getTerm2().accept(this,
                                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.MULTDIVAPPPREC, PrettyPrintContext.TREETYPE.RIGHT))
                ,PrettyPrintConfiguration.MULTDIVAPPPREC, PrettyPrintContext.AssocType.LEFT);
    }

    private String buildPOW(OpsTerm opsTerm, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression(opsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.POWPREC, PrettyPrintContext.TREETYPE.LEFT)) +
                        " ^ " +
                        opsTerm.getTerm2().accept(this,
                                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.POWPREC, PrettyPrintContext.TREETYPE.RIGHT))
                ,PrettyPrintConfiguration.POWPREC, PrettyPrintContext.AssocType.LEFT);
    }

    private String buildLISTCONC(OpsTerm opsTerm, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression(opsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.LISTPREC, PrettyPrintContext.TREETYPE.LEFT)) +
                        " :: " +
                        opsTerm.getTerm2().accept(this,
                                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.LISTPREC, PrettyPrintContext.TREETYPE.RIGHT))
                ,PrettyPrintConfiguration.LISTPREC, PrettyPrintContext.AssocType.LEFT);
    }

    private String buildLISTADD(OpsTerm opsTerm, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression(opsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.LISTPREC, PrettyPrintContext.TREETYPE.LEFT)) +
                        " ++ " +
                        opsTerm.getTerm2().accept(this,
                                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.LISTPREC, PrettyPrintContext.TREETYPE.RIGHT))
                ,PrettyPrintConfiguration.LISTPREC, PrettyPrintContext.AssocType.LEFT);
    }

    private String buildORB(OpsTerm opsTerm, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression(opsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.ADDSUBMODPREC, PrettyPrintContext.TREETYPE.LEFT)) +
                        " || " +
                        opsTerm.getTerm2().accept(this,
                                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.ADDSUBMODPREC, PrettyPrintContext.TREETYPE.RIGHT))
                ,PrettyPrintConfiguration.ADDSUBMODPREC, PrettyPrintContext.AssocType.LEFT);
    }

    private String buildSUB(OpsTerm opsTerm, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression(opsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.ADDSUBMODPREC, PrettyPrintContext.TREETYPE.LEFT)) +
                        " - " +
                        opsTerm.getTerm2().accept(this,
                                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.ADDSUBMODPREC, PrettyPrintContext.TREETYPE.RIGHT))
                ,PrettyPrintConfiguration.ADDSUBMODPREC, PrettyPrintContext.AssocType.LEFT);
    }

    private String buildADD(OpsTerm opsTerm, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression(opsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.ADDSUBMODPREC, PrettyPrintContext.TREETYPE.LEFT)) +
                        " + " +
                        opsTerm.getTerm2().accept(this,
                                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.ADDSUBMODPREC, PrettyPrintContext.TREETYPE.RIGHT))
                ,PrettyPrintConfiguration.ADDSUBMODPREC, PrettyPrintContext.AssocType.LEFT);
    }

    private String buildDIV(OpsTerm opsTerm, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression(opsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.MULTDIVAPPPREC, PrettyPrintContext.TREETYPE.LEFT)) +
                        " / " +
                        opsTerm.getTerm2().accept(this,
                                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.MULTDIVAPPPREC, PrettyPrintContext.TREETYPE.RIGHT))
                ,PrettyPrintConfiguration.MULTDIVAPPPREC, PrettyPrintContext.AssocType.LEFT);
    }

    private String buildMUL(OpsTerm opsTerm, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression(opsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.MULTDIVAPPPREC, PrettyPrintContext.TREETYPE.LEFT)) +
                        " * " +
                        opsTerm.getTerm2().accept(this,
                                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.MULTDIVAPPPREC, PrettyPrintContext.TREETYPE.RIGHT))
                ,PrettyPrintConfiguration.MULTDIVAPPPREC, PrettyPrintContext.AssocType.LEFT);
    }

    private String buildAPP(OpsTerm opsTerm, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression(opsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.MULTDIVAPPPREC, PrettyPrintContext.TREETYPE.LEFT)) +
                        " " +
                        opsTerm.getTerm2().accept(this,
                                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.MULTDIVAPPPREC, PrettyPrintContext.TREETYPE.RIGHT))
                ,PrettyPrintConfiguration.MULTDIVAPPPREC, PrettyPrintContext.AssocType.LEFT);
    }

    private String buildIMPLIES(OpsTerm opsTerm, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression(opsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.IMPLIESPREC, PrettyPrintContext.TREETYPE.LEFT)) +
                        " -> " +
                        opsTerm.getTerm2().accept(this,
                                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.IMPLIESPREC, PrettyPrintContext.TREETYPE.RIGHT))
                ,PrettyPrintConfiguration.IMPLIESPREC, PrettyPrintContext.AssocType.RIGHT);
    }

    private String buildEQUIV(OpsTerm opsTerm, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression(opsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.EQUIVPREC, PrettyPrintContext.TREETYPE.LEFT)) +
                        " <-> " +
                        opsTerm.getTerm2().accept(this,
                                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.EQUIVPREC, PrettyPrintContext.TREETYPE.RIGHT))
                ,PrettyPrintConfiguration.EQUIVPREC, PrettyPrintContext.AssocType.LEFT);
    }

    private String buildOR(OpsTerm opsTerm, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression(opsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.ORPREC, PrettyPrintContext.TREETYPE.LEFT)) +
                        " \\/ " +
                        opsTerm.getTerm2().accept(this,
                                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.ORPREC, PrettyPrintContext.TREETYPE.RIGHT))
                ,PrettyPrintConfiguration.ORPREC, PrettyPrintContext.AssocType.RIGHT);
    }

    private String buildAND(OpsTerm opsTerm, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression(opsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.ANDPREC, PrettyPrintContext.TREETYPE.LEFT)) +
                        " /\\ " +
                        opsTerm.getTerm2().accept(this,
                                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.ANDPREC, PrettyPrintContext.TREETYPE.RIGHT))
                ,PrettyPrintConfiguration.ANDPREC, PrettyPrintContext.AssocType.RIGHT);
    }

    private String buildLCOL(OpsTerm opsTerm, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression(opsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.LCOLPREC, PrettyPrintContext.TREETYPE.LEFT)) +
                        " <: " +
                        opsTerm.getTerm2().accept(this,
                                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.LCOLPREC, PrettyPrintContext.TREETYPE.RIGHT))
                ,PrettyPrintConfiguration.LCOLPREC, PrettyPrintContext.AssocType.RIGHT);
    }

    private String buildCOLON(OpsTerm opsTerm, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression(opsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.COLONPREC, PrettyPrintContext.TREETYPE.LEFT)) +
                        " : " +
                        opsTerm.getTerm2().accept(this,
                                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.COLONPREC, PrettyPrintContext.TREETYPE.RIGHT))
                ,PrettyPrintConfiguration.COLONPREC, PrettyPrintContext.AssocType.RIGHT);
    }

    private String buildGUILL(OpsTerm opsTerm, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression(opsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.NONE)) +
                        " <> " +
                        opsTerm.getTerm2().accept(this,
                                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.NONE))
                ,PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.AssocType.NONE);
    }

    private String buildEQUAL(OpsTerm opsTerm, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression(opsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.NONE)) +
                        " = " +
                        opsTerm.getTerm2().accept(this,
                                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.NONE))
                ,PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.AssocType.NONE);
    }

    private String buildGREATER(OpsTerm opsTerm, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression(opsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.NONE)) +
                        " > " +
                        opsTerm.getTerm2().accept(this,
                                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.NONE))
                ,PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.AssocType.NONE);
    }

    private String buildLOEQ(OpsTerm opsTerm, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression(opsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.NONE)) +
                " <= " +
                opsTerm.getTerm2().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.NONE))
                ,PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.AssocType.NONE);
    }

    private String buildLESS(OpsTerm opsTerm, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression(opsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.NONE)) +
                " < " +
                opsTerm.getTerm2().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.NONE))
                ,PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.AssocType.NONE);
    }

    private String buildGOEQ(OpsTerm opsTerm, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression(opsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.NONE)) +
                " >= " +
                opsTerm.getTerm2().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.NONE))
                ,PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.AssocType.NONE);
    }

    @Override
    public String visit(Pair pair, PrettyPrintContext ctx) {
        return "(" + pair.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                " , " +
                pair.getTerm2().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                ")";

    }

    @Override
    public String visit(PatternAssignLet patternAssignLet, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression("let \\ " +
                patternAssignLet.getPattern().accept(
                        new PrettyPrintPatternVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.LETPREC, PrettyPrintContext.TREETYPE.MULTI))
                +
                (patternAssignLet.getoTerm().isPresent()?
                        " in " + patternAssignLet.getoTerm().get().accept(this,
                                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                        : "")
                +
                " := " +
                patternAssignLet.getTerm1().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                +
                " in " +
                patternAssignLet.getTerm().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)),
                PrettyPrintConfiguration.LETPREC, PrettyPrintContext.AssocType.ASSOCLESS);
    }

    @Override
    public String visit(RecordProjectionTerm recordProjectionTerm, PrettyPrintContext ctx) {
        return ctx.parenthesizeExpression(recordProjectionTerm.getTerm().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                +
                " . " +
                " (" +
                recordProjectionTerm.getQualid().accept(this,ctx) +
                ")",
                PrettyPrintConfiguration.PROJECTIONPREC, PrettyPrintContext.AssocType.ASSOCLESS);

    }

    @Override
    public String visit(RecordTerm recordTerm, PrettyPrintContext ctx) {
        throw new UnsupportedOperationException("not yet implemented");

    }

    @Override
    public String visit(RewTerm rewTerm, PrettyPrintContext ctx) {
        return  ctx.parenthesizeExpression("rew " +
                rewTerm.getTerm1().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                +
                " in " +
                rewTerm.getTerm2().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.REWPREC, PrettyPrintContext.TREETYPE.MULTI)),
                PrettyPrintConfiguration.REWPREC, PrettyPrintContext.AssocType.NONE);
    }

    @Override
    public String visit(RightArrowBracedRewTerm rightArrowBracedRewTerm, PrettyPrintContext ctx){
         return  "rew " +
                 "-> " +
                 "[" +
                 rightArrowBracedRewTerm.getTerm1().accept(this,
                         new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                 +
                 "] " +
                 rightArrowBracedRewTerm.getTerm2().accept(this,
                         new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                 +
                 " in " +
                 rightArrowBracedRewTerm.getTerm3().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.REWPREC, PrettyPrintContext.TREETYPE.MULTI));
    }

    @Override
    public String visit(RightArrowRewTerm rightArrowRewTerm, PrettyPrintContext ctx) {
        return "rew " +
                "-> " +
                rightArrowRewTerm.getTerm1().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                +
                " in " +
                rightArrowRewTerm.getTerm2().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.REWPREC, PrettyPrintContext.TREETYPE.MULTI));

    }

    @Override
    public String visit(Sig2Specif sig2Specif, PrettyPrintContext ctx) {
        return "{ " +
                sig2Specif.getIdent().accept(new PrettyPrintIdentVisitor(),ctx) +
                " : " +
                sig2Specif.getTerm1().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                +
                " | " +
                sig2Specif.getTerm2().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                +
                " & " +
                sig2Specif.getTerm3().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                +
                " }";
    }

    @Override
    public String visit(SigSpecif sigSpecif, PrettyPrintContext ctx){
        return "{ " +
                sigSpecif.getIdent().accept(new PrettyPrintIdentVisitor(),ctx) +
                (sigSpecif.getoTerm().isPresent() ? " : " + sigSpecif.getoTerm().get().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),ctx.getPrecedence(), PrettyPrintContext.TREETYPE.MULTI))
                        :
                        "") +
                " | " +
                sigSpecif.getTerm1().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                " }";
    }

    @Override
    public String visit(SigT2Specif sigT2Specif, PrettyPrintContext ctx) {

        return "{ " +
                sigT2Specif.getIdent().accept(new PrettyPrintIdentVisitor(),ctx) +
                " : " +
                sigT2Specif.getTerm1().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                +
                " & " +
                sigT2Specif.getTerm2().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                +
                " & " +
                sigT2Specif.getTerm3().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                +
                "}";
    }

    @Override
    public String visit(SigTSpecif sigTSpecif, PrettyPrintContext ctx) {
        return " { " +
                sigTSpecif.getIdent().accept(new PrettyPrintIdentVisitor(),ctx) +
                " : " +
                sigTSpecif.getTerm1().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                +
                " & " +
                sigTSpecif.getTerm2().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                +
                "}";
    }

    @Override
    public String visit(SimpleQualid simpleQualid, PrettyPrintContext ctx) {
        return simpleQualid.getId().accept(new PrettyPrintIdentVisitor(),ctx);
    }

    @Override
    public String visit(SingleOpsTerm singleOpsTerm, PrettyPrintContext ctx) {
        switch (singleOpsTerm.getOperator()){
            case TILDE : {
                return ctx.parenthesizeExpression("~" +
                        singleOpsTerm.getTerm().accept(this,
                                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.TILDEPREC, PrettyPrintContext.TREETYPE.RIGHT)),
                        PrettyPrintConfiguration.TILDEPREC, PrettyPrintContext.AssocType.RIGHT);
            }
            case SUB : {
                return ctx.parenthesizeExpression("-" +
                                singleOpsTerm.getTerm().accept(this,
                                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.NEGPREC, PrettyPrintContext.TREETYPE.RIGHT)),
                        PrettyPrintConfiguration.NEGPREC, PrettyPrintContext.AssocType.LEFT);
            }
            default: {
                throw new UnsupportedOperationException();
            }
        }
    }

    @Override
    public String visit(Sort sort, PrettyPrintContext ctx) {
        switch(sort.getSortType()){
            case SET: return "Set";
            case PROP: return "Prop";
            case TYPE: return "Type";
            default:throw new UnsupportedOperationException();
        }
    }

    @Override
    public String visit(SumBoolSpecif sumBoolSpecif, PrettyPrintContext ctx) {
        return "{" +
                sumBoolSpecif.getTerm1().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                +
                "}" +
                " + " +
                "{" +
                sumBoolSpecif.getTerm2().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                +
                "}";
    }

    @Override
    public String visit(SumOrSpecif sumOrSpecif, PrettyPrintContext ctx) {

        return sumOrSpecif.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                +
                " + " +
                "{" +
                sumOrSpecif.getTerm2().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                +
                "}";
    }

    @Override
    public String visit(TwoOpsTerm twoOpsTerm, PrettyPrintContext ctx) {
        String firstOp = "";
        firstOp = defineFirstOp(twoOpsTerm, ctx);
        String secondOp = "";
        secondOp = defineSecondOp(twoOpsTerm, ctx);

        return ctx.parenthesizeExpression(firstOp + secondOp,PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.AssocType.NONE);
    }

    private String defineSecondOp(TwoOpsTerm twoOpsTerm, PrettyPrintContext ctx) {
        String secondOp;
        switch (twoOpsTerm.getOperator2()){
            case LESS:{
                secondOp = " < " + twoOpsTerm.getTerm3().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.MULTI));break;
            }
            case GREATER: {
                secondOp = " > " + twoOpsTerm.getTerm3().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.MULTI));break;
            }
            case LOEQ: {
                secondOp = " <= " + twoOpsTerm.getTerm3().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.MULTI));break;
            }
            case GOEQ: {
                secondOp = " >= " + twoOpsTerm.getTerm3().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.MULTI));break;
            }
            case COLG : {
                secondOp = " :> " + twoOpsTerm.getTerm3().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.MULTI));break;
            }
            case EQUAL: {
                secondOp = " = " + twoOpsTerm.getTerm3().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.MULTI));break;
            }
            default : throw new UnsupportedOperationException();
        }
        return secondOp;
    }

    private String defineFirstOp(TwoOpsTerm twoOpsTerm, PrettyPrintContext ctx) {
        String firstOp;
        switch(twoOpsTerm.getOperator()){
            case LESS: {
                firstOp = buildFirstOpLESS(twoOpsTerm, ctx);
                break;
            }
            case GREATER: {
                firstOp = buildFirstOpGREATER(twoOpsTerm, ctx);
                break;
            }
            case LOEQ: {
                firstOp = buildFirstOpLOEQ(twoOpsTerm, ctx);
                break;
            }
            case GOEQ: {
                firstOp = buildFirstOpGOEQ(twoOpsTerm, ctx);
                break;
            }
            case EQUAL: {
                firstOp = buildFirstOpEQUAL(twoOpsTerm, ctx);
                break;
            }
            case GUILL : {
                firstOp = buildFirstOpGUILL(twoOpsTerm, ctx);
                break;
            }
            default:throw new UnsupportedOperationException();
        }
        return firstOp;
    }

    private String buildFirstOpGUILL(TwoOpsTerm twoOpsTerm, PrettyPrintContext ctx) {
        String firstOp;
        firstOp = twoOpsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),
                        PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                " <> " +
                twoOpsTerm.getTerm2().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),
                                PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.MULTI));
        return firstOp;
    }

    private String buildFirstOpEQUAL(TwoOpsTerm twoOpsTerm, PrettyPrintContext ctx) {
        String firstOp;
        firstOp = twoOpsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),
                        PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                " = " +
                twoOpsTerm.getTerm2().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),
                                PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.MULTI));
        return firstOp;
    }

    private String buildFirstOpGOEQ(TwoOpsTerm twoOpsTerm, PrettyPrintContext ctx) {
        String firstOp;
        firstOp = twoOpsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),
                        PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.MULTI))
                +
                " >= " +
                twoOpsTerm.getTerm2().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),
                                PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.MULTI));
        return firstOp;
    }

    private String buildFirstOpLOEQ(TwoOpsTerm twoOpsTerm, PrettyPrintContext ctx) {
        String firstOp;
        firstOp = twoOpsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),
                        PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                " <= " +
                twoOpsTerm.getTerm2().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),
                                PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.MULTI));
        return firstOp;
    }

    private String buildFirstOpGREATER(TwoOpsTerm twoOpsTerm, PrettyPrintContext ctx) {
        String firstOp;
        firstOp =twoOpsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),
                        PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                " > " +
               twoOpsTerm.getTerm2().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),
                                PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.MULTI));
        return firstOp;
    }

    private String buildFirstOpLESS(TwoOpsTerm twoOpsTerm, PrettyPrintContext ctx) {
        String firstOp;
        firstOp = twoOpsTerm.getTerm1().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),
                        PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                " < " +
                twoOpsTerm.getTerm2().accept(this,
                        new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),
                                PrettyPrintConfiguration.COMPAREPREC, PrettyPrintContext.TREETYPE.MULTI));
        return firstOp;
    }

    @Override
    public String visit(TypeTerm typeTerm, PrettyPrintContext ctx) {
        return typeTerm.getTerm().accept(this,
                new PrettyPrintContext(ctx.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.LOWESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                " % " +
                typeTerm.getId().accept(new PrettyPrintIdentVisitor(),ctx);

    }

    @Override
    public String visit(Underscore underscore, PrettyPrintContext ctx) {
        return "_";
    }
}
