package antlr.visitor.term;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.term.utilities.OrPattern;
import model.term.utilities.Pattern;

import java.util.ArrayList;
import java.util.List;

public class OrPatternVisitor extends GenericVisitor<OrPattern> {

    private final PatternVisitor patternVisitor;

    public  OrPatternVisitor(PatternVisitor patternVisitor){
        this.patternVisitor = patternVisitor;
    }
    @Override
    public OrPattern visitOr_pattern(coqParser.Or_patternContext ctx){
        List<Pattern> pattern = new ArrayList<>();

        ctx.pattern().forEach(patternContext -> {pattern.add(patternVisitor.visit(patternContext));});

        return new OrPattern(pattern);
    }
}
