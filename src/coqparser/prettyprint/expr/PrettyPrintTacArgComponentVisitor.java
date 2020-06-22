package coqparser.prettyprint.expr;

import coqparser.prettyprint.PrettyPrintConfiguration;
import coqparser.prettyprint.PrettyPrintContext;
import coqparser.prettyprint.atomic.PrettyPrintBindingListBodyVisitor;
import coqparser.prettyprint.atomic.PrettyPrintIntroPatternVisitor;
import coqparser.prettyprint.atomic.PrettyPrintRewPrefixVisitor;
import coqparser.prettyprint.term.PrettyPrintIdentVisitor;
import coqparser.prettyprint.term.PrettyPrintTermVisitor;
import model.tactics.atomic.tacargcomponents.*;
import model.tactics.atomic.utilities.BindingListBody;
import model.tactics.atomic.utilities.IntroPattern;
import model.term.Number;
import model.term.Term;
import model.visitor.atomic.TacArgComponentVisitor;
import sun.plugin.dom.exception.InvalidStateException;

import java.util.List;

public class PrettyPrintTacArgComponentVisitor implements TacArgComponentVisitor<String, PrettyPrintContext> {

    private final PrettyPrintConfiguration prettyPrintConfiguration;

    public PrettyPrintTacArgComponentVisitor(PrettyPrintConfiguration prettyPrintConfiguration) {
        this.prettyPrintConfiguration = prettyPrintConfiguration;
    }

    @Override
    public String visit(AtomicTermListComponent atomicTermListComponent, PrettyPrintContext prettyPrintContext) {
        String terms = "";
        for (Term term : atomicTermListComponent.getTerms()) {
            terms += term.accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                    new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),
                            PrettyPrintConfiguration.LOWESTPREC,
                            PrettyPrintContext.TREETYPE.MULTI)) + " ";
        }
        return terms;
    }

    @Override
    public String visit(BinderComponent binderComponent, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(BindingListComponent bindingListComponent, PrettyPrintContext prettyPrintContext) {
        String bindingList = "";
        for (BindingListBody bindingListBody : bindingListComponent.getBindingListBodies()) {
            bindingList += " " + bindingListBody.accept(new PrettyPrintBindingListBodyVisitor(prettyPrintConfiguration),prettyPrintContext);
        }
        return printComponentTypeString(bindingListComponent.getComponentType()) +
                bindingList;
    }

    @Override
    public String visit(BooleanComponent booleanComponent, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(ByTacticComponent byTacticComponent, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(DestructTermAsListBodyComponent destructTermAsListBodyComponent, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(DisjConjIntroPatternComponent disjConjIntroPatternComponent, PrettyPrintContext prettyPrintContext) {
        return printComponentTypeString(disjConjIntroPatternComponent.getComponentType()) +
                disjConjIntroPatternComponent.getDisjConjIntroPattern().accept(new PrettyPrintIntroPatternVisitor(prettyPrintConfiguration),
                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation() + 1,PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
    }

    @Override
    public String visit(ExprComponent exprComponent, PrettyPrintContext prettyPrintContext) {
        return printComponentTypeString(exprComponent.getComponentType()) +
                exprComponent.getExpr().accept(new PrettyPrintExprVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation() + 1,PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));

    }

    @Override
    public String visit(FlagComponent flagComponent, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(GoalOccurencesComponent goalOccurencesComponent, PrettyPrintContext prettyPrintContext) {
        return printComponentTypeString(goalOccurencesComponent.getComponentType()) +
                goalOccurencesComponent.getGoalOccurences().getId().accept(
                new PrettyPrintIdentVisitor(),prettyPrintContext);
    }

    @Override
    public String visit(IdentComponent identComponent, PrettyPrintContext prettyPrintContext) {
        return printComponentTypeString(identComponent.getComponentType()) +
                identComponent.getId().accept(new PrettyPrintIdentVisitor(),prettyPrintContext);
    }

    @Override
    public String visit(IdentListComponent identListComponent, PrettyPrintContext prettyPrintContext) {
        String idents = "";
        for (int i = 0; i < identListComponent.getIds().size(); i++) {
            if(i == identListComponent.getIds().size() - 1){
                idents += identListComponent.getIds().get(i).accept(new PrettyPrintIdentVisitor(),prettyPrintContext);
            }
            else {
                idents += identListComponent.getIds().get(i).accept(new PrettyPrintIdentVisitor(),prettyPrintContext) +
                        " ";
            }
        }
        return printComponentTypeString(identListComponent.getComponentType()) +
                idents;
    }

    @Override
    public String visit(IdentPairListComponent identPairListComponent, PrettyPrintContext prettyPrintContext) {
        String identPairs = "";
        for (int i = 0; i < identPairListComponent.getIdentPairs().size(); i++) {
            if(i == 0) {
                identPairs += identPairListComponent.getIdentPairs().get(i).getId1().accept(new PrettyPrintIdentVisitor(), prettyPrintContext) +
                        " into " +
                        identPairListComponent.getIdentPairs().get(i).getId2().accept(new PrettyPrintIdentVisitor(),prettyPrintContext);
            } else {
                identPairs += " ," + identPairListComponent.getIdentPairs().get(i).getId1().accept(new PrettyPrintIdentVisitor(), prettyPrintContext) +
                        " into " +
                        identPairListComponent.getIdentPairs().get(i).getId2().accept(new PrettyPrintIdentVisitor(),prettyPrintContext);
            }
        }

        return printComponentTypeString(identPairListComponent.getComponentType()) + identPairs;

    }

    @Override
    public String visit(IdentTermComponent identTermComponent, PrettyPrintContext prettyPrintContext) {
        return "( " +
                identTermComponent.getIdent().accept(new PrettyPrintIdentVisitor(),prettyPrintContext) +
                " : " +
                identTermComponent.getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                " )";
    }

    @Override
    public String visit(InClauseComponent inClauseComponent, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(IntroPatternComponent introPatternComponent, PrettyPrintContext prettyPrintContext) {
        return printComponentTypeString(introPatternComponent.getComponentType()) +
                introPatternComponent.getIntroPattern().accept(new PrettyPrintIntroPatternVisitor(prettyPrintConfiguration),
                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
    }

    @Override
    public String visit(IntroPatternListComponent introPatternListComponent, PrettyPrintContext prettyPrintContext) {
        String introPatterns = "";
        for (IntroPattern introPattern : introPatternListComponent.getIntroPatternList().getIntroPatterns()) {
            introPatterns += introPattern.accept(new PrettyPrintIntroPatternVisitor(prettyPrintConfiguration),
                    new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) + " ";
        }
        return printComponentTypeString(introPatternListComponent.getComponentType()) +
                introPatterns;
    }

    @Override
    public String visit(ListOfIntroPatternComponent listOfIntroPatternComponent, PrettyPrintContext prettyPrintContext) {
        String introPatterns = "";
        for (IntroPattern introPattern : listOfIntroPatternComponent.getIntroPatterns()) {
            introPatterns += introPattern.accept(new PrettyPrintIntroPatternVisitor(prettyPrintConfiguration),
                    new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
            " ";
        }
        return printComponentTypeString(listOfIntroPatternComponent.getComponentType()) +
                introPatterns;

    }

    @Override
    public String visit(NegativeNumComponent negativeNumComponent, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(NumberListComponent numberListComponent, PrettyPrintContext prettyPrintContext) {
        String numbers = "";
        for (Number num : numberListComponent.getNums()) {
            numbers += num.toString() + " ";
        }
        return printComponentTypeString(numberListComponent.getComponentType()) +
                numbers;
    }

    @Override
    public String visit(NumComponent numComponent, PrettyPrintContext prettyPrintContext) {
        return printComponentTypeString(numComponent.getComponentType()) + numComponent.getNum();
    }

    @Override
    public String visit(QualidComponent qualidComponent, PrettyPrintContext prettyPrintContext) {
        return qualidComponent.getQualid().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation()+1,
                        PrettyPrintConfiguration.HIGHESTPREC,
                        PrettyPrintContext.TREETYPE.MULTI));
    }

    @Override
    public String visit(QualidNumsListComponent qualidNumsListComponent, PrettyPrintContext prettyPrintContext) {
        String qulidNumAts = "";
        for (int i = 0; i < qualidNumsListComponent.getQualidNums().size(); i++) {
            String qualid = qualidNumsListComponent.getQualidNums().get(i).getQualid().accept(
                    new PrettyPrintTermVisitor(prettyPrintConfiguration),prettyPrintContext);
            String nums = "";
            List<Number> numbers =  qualidNumsListComponent.getQualidNums().get(i).getNums();
            for (int i1 = 0; i1 < numbers.size(); i1++) {
                if(i1 == 0){
                    nums += numbers.get(i1).toString();
                }
                else {
                    nums += "," + numbers.get(i1).toString();
                }
            }

            if(i == 0){
                qulidNumAts += qualid +
                        " at " +
                        nums;
            }
            else {
                qulidNumAts += ", " +
                        qualid +
                        " at " +
                        nums;
            }

        }
        return qulidNumAts;
    }

    @Override
    public String visit(RewPrefixComponent rewPrefixComponent, PrettyPrintContext prettyPrintContext) {
        return printComponentTypeString(rewPrefixComponent.getComponentType()) +
                rewPrefixComponent.getRewPrefix().accept(new PrettyPrintRewPrefixVisitor(),prettyPrintContext);

    }

    @Override
    public String visit(StarComponent starComponent, PrettyPrintContext prettyPrintContext) {
        return printComponentTypeString(starComponent.getComponentType()) + "*";
    }

    @Override
    public String visit(SubComponent subComponent, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(TermComponent termComponent, PrettyPrintContext prettyPrintContext) {
        return printComponentTypeString(termComponent.getComponentType()) +
                        "( " +
                        termComponent.getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),
                                        PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                " )";
    }

    @Override
    public String visit(TermDisjConjIntroPatternListComponent termDisjConjIntroPatternListComponent, PrettyPrintContext prettyPrintContext) {
        String termIntroPatternList = "";
        for (int i = 0; i < termDisjConjIntroPatternListComponent.getTermDisjConjIntroPatterns().size(); i++) {
            TermDisjConjIntroPatternListComponent.TermDisjConjIntroPattern current = termDisjConjIntroPatternListComponent.getTermDisjConjIntroPatterns().get(i);
            String term = current.getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                    new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));

            String introPattern = current.getDisjConjIntroPattern().accept(new PrettyPrintIntroPatternVisitor(prettyPrintConfiguration),
                    prettyPrintContext);

            if(i==0){
                termIntroPatternList += "(" + term + ")" + " as " + introPattern;
            }else {
                termIntroPatternList += ", " + "(" + term + ")" + " as " + introPattern;
            }
        }

        return termIntroPatternList;
    }

    @Override
    public String visit(TermListComponent termListComponent, PrettyPrintContext prettyPrintContext) {
        String terms = "";
        for (int i = 0; i < termListComponent.getTerms().size(); i++) {
            if(i == 0){
                terms += termListComponent.getTerms().get(i).accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.LOWESTPREC, PrettyPrintContext.TREETYPE.MULTI));
            }
            else {
                terms += "," +
                        termListComponent.getTerms().get(i).accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.LOWESTPREC, PrettyPrintContext.TREETYPE.MULTI));
            }
        }
        return printComponentTypeString(termListComponent.getComponentType()) + terms;
    }

    @Override
    public String visit(IdentTermBindComponent identTermBindComponent, PrettyPrintContext prettyPrintContext) {
        return "( " + identTermBindComponent.getIdent().accept(new PrettyPrintIdentVisitor(),prettyPrintContext) +
                " := " +
                identTermBindComponent.getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation() + 1,PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                +
                " )";
    }

    private String printComponentTypeString(ComponentType componenttype){
        switch(componenttype){
            case WITH : return "with ";
            case AS: return "as ";
            case IN: return "in ";
            case LEFTARROW: return "<- ";
            case AT: return "at ";
            case BY: return "by ";
            case SUB: return "sub ";
            case USING: return "using ";
            case UNTIL: return "until ";
            case RIGHTARROW: return "-> ";
            case NOTYPE: return "";
            default: throw new InvalidStateException("a return type is required");
        }
    }
}
