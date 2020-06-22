package antlr.visitor.term;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.term.utilities.Equation;
import model.term.utilities.Pattern;

import java.util.ArrayList;
import java.util.List;

public class EquationVisitor extends GenericVisitor<Equation> {
    private final PatternVisitor patternVisitor;
    private final TermVisitor termVisitor;

    public EquationVisitor(TermVisitor termVisitor){
        patternVisitor = new PatternVisitor();
        this.termVisitor = termVisitor;
    }
    @Override
    public Equation visitEquation(coqParser.EquationContext ctx){
        List<List<Pattern>> multPattern = new ArrayList<>();
        for (coqParser.Mult_patternContext multPatternContext : ctx.mult_pattern()) {
            List<Pattern> pattern = new ArrayList<>();
            for (coqParser.PatternContext patternContext : multPatternContext.pattern()) {
                pattern.add(patternVisitor.visit(patternContext));
            }
            multPattern.add(pattern);
        }

        return new Equation(multPattern,
                termVisitor.visit(ctx.equation_term()));

    }
}
