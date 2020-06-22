package antlr.visitor.atomicexpr.utilities;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.tactics.atomic.utilities.IntroPatternList;
import model.tactics.atomic.utilities.StarIntroPattern;
import model.tactics.atomic.utilities.StarStarIntroPattern;

import java.util.stream.Collectors;

public class IntroPatternListVisitor extends GenericVisitor<IntroPatternList> {
    @Override
    public IntroPatternList visitIntro_pattern_list(coqParser.Intro_pattern_listContext ctx) {
        return new IntroPatternList(ctx.intro_pattern_list_body().stream()
                .map(intro_pattern_list_bodyContext -> {
                    if(intro_pattern_list_bodyContext.intro_pattern() != null){
                        return new IntroPatternVisitor().visit(intro_pattern_list_bodyContext.intro_pattern());
                    }
                    else if(intro_pattern_list_bodyContext.KeySTARSTAR() != null){
                        return new StarStarIntroPattern();
                    }
                    else {
                        return new StarIntroPattern();
                    }
                })
                .collect(Collectors.toList()));
    }
}
