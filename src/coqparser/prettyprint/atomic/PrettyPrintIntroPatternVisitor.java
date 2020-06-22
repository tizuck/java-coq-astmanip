package coqparser.prettyprint.atomic;

import coqparser.prettyprint.PrettyPrintConfiguration;
import coqparser.prettyprint.PrettyPrintContext;
import coqparser.prettyprint.term.PrettyPrintIdentVisitor;
import model.tactics.atomic.utilities.*;
import model.visitor.atomic.IntroPatternVisitor;

public class PrettyPrintIntroPatternVisitor implements IntroPatternVisitor<String, PrettyPrintContext> {

    private final PrettyPrintConfiguration prettyPrintConfiguration;

    public PrettyPrintIntroPatternVisitor(PrettyPrintConfiguration prettyPrintConfiguration) {
        this.prettyPrintConfiguration = prettyPrintConfiguration;
    }

    @Override
    public String visit(NamingIntroPattern namingIntroPattern, PrettyPrintContext prettyPrintContext) {
        return (namingIntroPattern.isQuestionmark()?"?":"") +
                (namingIntroPattern.getoIdent().isPresent()? " " +namingIntroPattern.getoIdent().get().accept(
                        new PrettyPrintIdentVisitor(),prettyPrintContext
                ):"");
    }

    @Override
    public String visit(AndPatternDisjConjIntroPattern andPatternDisjConjIntroPattern, PrettyPrintContext prettyPrintContext) {
        String disj = "";
        for (int i = 0; i < andPatternDisjConjIntroPattern.getIntroPatterns().size(); i++) {
            if(i == 0){
                disj += andPatternDisjConjIntroPattern.getIntroPatterns().get(i).accept(
                        new PrettyPrintIntroPatternVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation() + 1,PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)
                );
            }
            else {
                disj += " & " +
                        andPatternDisjConjIntroPattern.getIntroPatterns().get(i).accept(
                                new PrettyPrintIntroPatternVisitor(prettyPrintConfiguration),
                                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation() + 1,PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
            }
        }

        return "( " +
                disj +
                " )";
    }

    @Override
    public String visit(NamingIntroPatternEqualIntroPattern namingIntroPatternEqualIntroPattern, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(OrEqualIntroPattern orEqualIntroPattern, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(PatternDisjConjIntroPattern patternDisjConjIntroPattern, PrettyPrintContext prettyPrintContext) {
        String disj = "";
        for (int i = 0; i < patternDisjConjIntroPattern.getIntroPatterns().size(); i++) {
            if(i == 0){
                disj += patternDisjConjIntroPattern.getIntroPatterns().get(i).accept(
                        new PrettyPrintIntroPatternVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation() + 1,PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)
                );
            }
            else {
                disj += ", " +
                        patternDisjConjIntroPattern.getIntroPatterns().get(i).accept(
                            new PrettyPrintIntroPatternVisitor(prettyPrintConfiguration),
                            new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation() + 1,PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
            }
        }

        return "( " +
                disj +
                " )";
    }

    @Override
    public String visit(PatternListsDisjConjIntroPattern patternListsDisjConjIntroPattern, PrettyPrintContext prettyPrintContext) {

        String introPatternLists = "";
        if(patternListsDisjConjIntroPattern.getOptionalIntroPatternLists().isPresent()){
            for (int i = 0; i < patternListsDisjConjIntroPattern.getOptionalIntroPatternLists().get().size(); i++) {
                String introPatterns = "";
                for (IntroPattern introPattern : patternListsDisjConjIntroPattern.getOptionalIntroPatternLists().get().get(i).getIntroPatterns()){
                    introPatterns += introPattern.accept(this,
                            new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(), PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) + " ";
                }
                if(i == 0) {
                    introPatternLists += introPatterns;
                }
                else {
                    introPatternLists += "|" + introPatterns;
                }
            }

        }
        return "[" +
                introPatternLists +
                "]";
    }

    @Override
    public String visit(UnderscoreIntroPattern underscoreIntroPattern, PrettyPrintContext prettyPrintContext) {
        return "_";
    }

    @Override
    public String visit(PercIntroPattern percIntroPattern, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(StarIntroPattern starIntroPattern, PrettyPrintContext prettyPrintContext) {
        return null;
    }

    @Override
    public String visit(StarStarIntroPattern starStarIntroPattern, PrettyPrintContext prettyPrintContext) {
        return null;
    }
}
