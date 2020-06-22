package coqparser.prettyprint.term;

import coqparser.prettyprint.PrettyPrintConfiguration;
import coqparser.prettyprint.PrettyPrintContext;
import model.term.utilities.*;
import model.visitor.term.PatternVisitor;

public class PrettyPrintPatternVisitor implements PatternVisitor<String, PrettyPrintContext> {

    private final PrettyPrintConfiguration prettyPrintConfiguration;

    public PrettyPrintPatternVisitor(PrettyPrintConfiguration prettyPrintConfiguration) {
        this.prettyPrintConfiguration = prettyPrintConfiguration;
    }

    @Override
    public String visit(AtDefMultiplePattern atDefMultiplePattern, PrettyPrintContext prettyPrintContext) {
        String pattern = "";
        for (Pattern pattern1 : atDefMultiplePattern.getPattern()) {
            pattern += " " + pattern1.accept(this,
                    new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),prettyPrintContext.getPrecedence(), PrettyPrintContext.TREETYPE.MULTI));
        }
        return " @ " +
                atDefMultiplePattern.getQualid().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),prettyPrintContext) +
                pattern;

    }

    @Override
    public String visit(DefMultiplePattern defMultiplePattern, PrettyPrintContext prettyPrintContext) {
        String pattern = "";
        for (Pattern pattern1 : defMultiplePattern.getPattern()) {
            pattern += " " + pattern1.accept(this,
                    new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),prettyPrintContext.getPrecedence(), PrettyPrintContext.TREETYPE.MULTI));
        }

        return defMultiplePattern.getQualid().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),prettyPrintContext) +
                pattern;
    }

    @Override
    public String visit(OrMultiplePattern orMultiplePattern, PrettyPrintContext prettyPrintContext) {
        String orPatterns = "";
        for (int i = 0; i < orMultiplePattern.getOrPattern().size(); i++) {
            if(i == 0){
                String orPattern = "";
                for (int j = 0; j < orMultiplePattern.getOrPattern().get(i).getPattern().size(); j++) {
                    if(j == 0){
                        orPattern += " " + orMultiplePattern.getOrPattern().get(i).getPattern().get(j).accept(this,
                                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),prettyPrintContext.getPrecedence(), PrettyPrintContext.TREETYPE.MULTI));
                    } else {
                        orPattern += " | " + orMultiplePattern.getOrPattern().get(i).getPattern().get(j).accept(this,
                                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),prettyPrintContext.getPrecedence(), PrettyPrintContext.TREETYPE.MULTI));
                    }
                }
                orPatterns += orPattern;
            }else {
                String orPattern = "";
                for (int j = 0; j < orMultiplePattern.getOrPattern().get(i).getPattern().size(); j++) {
                    if(j == 0){
                        orPattern += " " + orMultiplePattern.getOrPattern().get(i).getPattern().get(j).accept(this,
                                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),prettyPrintContext.getPrecedence(), PrettyPrintContext.TREETYPE.MULTI));
                    } else {
                        orPattern += " | " + orMultiplePattern.getOrPattern().get(i).getPattern().get(j).accept(this,
                                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),prettyPrintContext.getPrecedence(), PrettyPrintContext.TREETYPE.MULTI));
                    }
                }
                orPatterns += " , " + orPattern;
            }
        }
        return "( " + orPatterns + " )";

    }

    @Override
    public String visit(BracedPattern bracedPattern, PrettyPrintContext prettyPrintContext) {
        return "( " + bracedPattern.getPattern().accept(this,
                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),prettyPrintContext.getPrecedence(), PrettyPrintContext.TREETYPE.MULTI)) +
                " )";
    }

    @Override
    public String visit(NumPattern numPattern, PrettyPrintContext prettyPrintContext) {
        return numPattern.getNum().toString();
    }

    @Override
    public String visit(OpsPattern opsPattern, PrettyPrintContext prettyPrintContext) {
        switch(opsPattern.getPatternOps()){
            case AS : {
                return opsPattern.getPattern().accept(this,
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),prettyPrintContext.getPrecedence(), PrettyPrintContext.TREETYPE.MULTI)) +
                        " as " +
                        opsPattern.getId().accept(new PrettyPrintIdentVisitor(),prettyPrintContext);
            }
            case PERC : {
                return opsPattern.getPattern().accept(this,
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),prettyPrintContext.getPrecedence(), PrettyPrintContext.TREETYPE.MULTI)) +
                        " % " +
                        opsPattern.getId().accept(new PrettyPrintIdentVisitor(),prettyPrintContext);
            }
            case LIST : {
                return opsPattern.getPattern().accept(this,
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),prettyPrintContext.getPrecedence(), PrettyPrintContext.TREETYPE.MULTI)) +
                        " :: " +
                        opsPattern.getId().accept(new PrettyPrintIdentVisitor(),prettyPrintContext);
            }
            default : {
                throw new IllegalStateException("A Pattern was not saved correctly");
            }
        }
    }

    @Override
    public String visit(QualidPattern qualidPattern, PrettyPrintContext prettyPrintContext) {
        return qualidPattern.getQualid().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                prettyPrintContext);
    }

    @Override
    public String visit(UnderscorePattern underscorePattern, PrettyPrintContext prettyPrintContext) {
        return "_";
    }
}
