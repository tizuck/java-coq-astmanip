package antlr.visitor.term;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.term.Number;
import model.term.utilities.*;

import java.util.ArrayList;
import java.util.List;

public class PatternVisitor extends GenericVisitor<Pattern> {

    private final QualidVisitor qualidVisitor;
    private final OrPatternVisitor orPatternVisitor;
    private final IdentVisitor identVisitor;

    public PatternVisitor(){
        qualidVisitor = new QualidVisitor();
        orPatternVisitor = new OrPatternVisitor(this);
        identVisitor = new IdentVisitor();

    }
    @Override
    public Pattern visitDefMultiplePattern(coqParser.DefMultiplePatternContext ctx){
        List<Pattern> pattern = new ArrayList<>();
        ctx.pattern_without_implicits().forEach(pattern_without_implicitsContext -> {pattern.add(visit(pattern_without_implicitsContext));});
        return new DefMultiplePattern(qualidVisitor.visit(ctx.qualid()),
                pattern);
    }

    @Override
    public Pattern visitAtDefMultiplePattern(coqParser.AtDefMultiplePatternContext ctx){
        List<Pattern> pattern = new ArrayList<>();
        ctx.pattern_without_implicits().forEach(pattern_without_implicitsContext -> {pattern.add(visit(pattern_without_implicitsContext));});
        return new AtDefMultiplePattern(qualidVisitor.visit(ctx.qualid()),
                pattern);
    }

    @Override
    public Pattern visitAsOpsPatternImpl(coqParser.AsOpsPatternImplContext ctx){
        return new OpsPattern(PatternOps.AS,
                visit(ctx.pattern()),
                identVisitor.visit(ctx.ident()));
    }

    @Override
    public Pattern visitAsOpsPattern(coqParser.AsOpsPatternContext ctx){
        return new OpsPattern(PatternOps.AS,
                visit(ctx.pattern()),
                identVisitor.visit(ctx.ident()));
    }

    @Override
    public Pattern visitPercOpsPatternImpl(coqParser.PercOpsPatternImplContext ctx){
        return new OpsPattern(PatternOps.PERC,
                visit(ctx.pattern()),
                identVisitor.visit(ctx.ident()));
    }

    @Override
    public Pattern visitPercOpsPattern(coqParser.PercOpsPatternContext ctx){
        return new OpsPattern(PatternOps.PERC,
                visit(ctx.pattern()),
                identVisitor.visit(ctx.ident()));
    }

    @Override
    public Pattern visitQualidPatternImpl(coqParser.QualidPatternImplContext ctx){
        return new QualidPattern(qualidVisitor.visit(ctx.qualid()));
    }

    @Override
    public Pattern visitQualidPattern(coqParser.QualidPatternContext ctx){
        return new QualidPattern(qualidVisitor.visit(ctx.qualid()));
    }

    @Override
    public Pattern visitUnderscorePatternImpl(coqParser.UnderscorePatternImplContext ctx){
        return new UnderscorePattern();
    }

    @Override
    public Pattern visitUnderscorePattern(coqParser.UnderscorePatternContext ctx){
        return new UnderscorePattern();
    }

    @Override
    public Pattern visitNumPatternImpl(coqParser.NumPatternImplContext ctx){
        return new NumPattern(new Number(Integer.valueOf(ctx.NUM().getSymbol().getText())));
    }

    @Override
    public Pattern visitNumPattern(coqParser.NumPatternContext ctx){
        return new NumPattern(new Number(Integer.valueOf(ctx.NUM().getSymbol().getText())));
    }

    @Override
    public Pattern visitBracedPattern(coqParser.BracedPatternContext ctx){
        return new BracedPattern(visit(ctx.pattern()));
    }

    @Override
    public Pattern visitOrMultiplePatternImpl(coqParser.OrMultiplePatternImplContext ctx){
        List<OrPattern> orPattern = new ArrayList<>();
        ctx.or_pattern().forEach(or_patternContext -> {orPattern.add(orPatternVisitor.visit(or_patternContext));});
        return new OrMultiplePattern(orPattern);
    }

    @Override
    public Pattern visitOrMultiplePattern(coqParser.OrMultiplePatternContext ctx){
        List<OrPattern> orPattern = new ArrayList<>();
        ctx.or_pattern().forEach(or_patternContext -> {orPattern.add(orPatternVisitor.visit(or_patternContext));});
        return new OrMultiplePattern(orPattern);
    }

    @Override
    public Pattern visitListOpsPattern(coqParser.ListOpsPatternContext ctx) {
        return new OpsPattern(PatternOps.LIST,
                visit(ctx.pattern()),
                identVisitor.visit(ctx.ident()));
    }
}
