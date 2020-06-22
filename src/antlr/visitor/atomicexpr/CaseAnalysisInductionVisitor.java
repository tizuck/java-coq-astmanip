package antlr.visitor.atomicexpr;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.atomicexpr.utilities.BindingListVisitor;
import antlr.visitor.atomicexpr.utilities.DisjConjIntroPatternVisitor;
import antlr.visitor.atomicexpr.utilities.GoalOccurencesVisitor;
import antlr.visitor.atomicexpr.utilities.IntroPatternVisitor;
import antlr.visitor.term.IdentVisitor;
import antlr.visitor.term.TermVisitor;
import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.caseanalysisind.*;
import model.tactics.atomic.tacargcomponents.*;
import model.tactics.atomic.utilities.DisjConjIntroPattern;
import model.term.Number;
import model.term.Term;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CaseAnalysisInductionVisitor extends GenericVisitor<AtomicTacticExpr> {

    @Override
    public AtomicTacticExpr visitTermsDestruct(coqParser.TermsDestructContext ctx) {
        return Destruct.ofTerms(new TermListComponent(ctx.term().stream()
                .map(termContext ->  new TermVisitor().visit(termContext))
                .collect(Collectors.toList())));
    }

    @Override
    public AtomicTacticExpr visitTermDestruct(coqParser.TermDestructContext ctx) {
        return new Destruct(new TermComponent(new TermVisitor().visit(ctx.term())));
    }

    @Override
    public AtomicTacticExpr visitTermInDestruct(coqParser.TermInDestructContext ctx) {
        return new Destruct(new TermComponent(new TermVisitor().visit(ctx.term())),
                new GoalOccurencesComponent(ComponentType.IN,new GoalOccurencesVisitor().visit(ctx.goal_occurrences())));
    }

    @Override
    public AtomicTacticExpr visitDiscriminate(coqParser.DiscriminateContext ctx) {
        return new Discriminate();
    }

    @Override
    public AtomicTacticExpr visitIdentInversion_Clear(coqParser.IdentInversion_ClearContext ctx) {
        return new Inversion_Clear(new IdentComponent(new IdentVisitor().visit(ctx.ident())));
    }

    @Override
    public AtomicTacticExpr visitTermElim(coqParser.TermElimContext ctx) {
        return new Elim(new TermComponent(new TermVisitor().visit(ctx.term())));
    }

    @Override
    public AtomicTacticExpr visitTermWithElim(coqParser.TermWithElimContext ctx) {
        return new Elim(new TermComponent(new TermVisitor().visit(ctx.term())),
                new BindingListComponent(ComponentType.WITH,new BindingListVisitor().visit(ctx.binding_list())
                ));
    }

    @Override
    public AtomicTacticExpr visitTermAtDestruct(coqParser.TermAtDestructContext ctx) {
        return Destruct.ofNums(new TermComponent(new TermVisitor().visit(ctx.term())),
                new NumberListComponent(ComponentType.AT,ctx.NUM().stream()
                        .map(terminalNode -> new Number(Integer.valueOf(terminalNode.getSymbol().getText())))
                        .collect(Collectors.toList())));
    }

    @Override
    public AtomicTacticExpr visitTermWithAsDestruct(coqParser.TermWithAsDestructContext ctx) {
        return new Destruct(new TermComponent(new TermVisitor().visit(ctx.term())),
                new BindingListComponent(ComponentType.WITH,new BindingListVisitor().visit(ctx.binding_list())
                ),
                new DisjConjIntroPatternComponent(ComponentType.AS, new DisjConjIntroPatternVisitor().visit(ctx.disj_conj_intro_pattern())));
    }

    @Override
    public AtomicTacticExpr visitTermAsDestruct(coqParser.TermAsDestructContext ctx) {
        return new Destruct(new TermComponent(new TermVisitor().visit(ctx.term())),
                new DisjConjIntroPatternComponent(ComponentType.AS, new DisjConjIntroPatternVisitor().visit(ctx.disj_conj_intro_pattern())));
    }

    @Override
    public AtomicTacticExpr visitCase(coqParser.CaseContext ctx) {
        if(ctx.binding_list() != null){
            return new Case(new TermComponent(new TermVisitor().visit(ctx.term())),
                    new BindingListComponent(ComponentType.WITH,new BindingListVisitor().visit(ctx.binding_list())
                    ));
        }
        return new Case(new TermComponent(new TermVisitor().visit(ctx.term())));
    }

    @Override
    public AtomicTacticExpr visitTermInduction(coqParser.TermInductionContext ctx) {
        if(ctx.binding_list() != null){
            return new Induction(new TermComponent(new TermVisitor().visit(ctx.term())),
                    new BindingListComponent(ComponentType.WITH,new BindingListVisitor().visit(ctx.binding_list())
                    ));
        }
        return new Induction(new TermComponent(new TermVisitor().visit(ctx.term())));
    }

    @Override
    public AtomicTacticExpr visitTermAsInduction(coqParser.TermAsInductionContext ctx) {
        if(ctx.term().size() > 1) {
            return new Induction(new TermComponent(new TermVisitor().visit(ctx.term(0))),
                    new DisjConjIntroPatternComponent(ComponentType.AS,new DisjConjIntroPatternVisitor().visit(ctx.disj_conj_intro_pattern())),
                    new TermComponent(ComponentType.USING,new TermVisitor().visit(ctx.term(1))));
        }
        else {
            return new Induction(new TermComponent(new TermVisitor().visit(ctx.term(0))),
                    new DisjConjIntroPatternComponent(ComponentType.AS,new DisjConjIntroPatternVisitor().visit(ctx.disj_conj_intro_pattern())));
        }
    }

    @Override
    public AtomicTacticExpr visitNumInversion(coqParser.NumInversionContext ctx) {
        return new Inversion(new NumComponent(new Number(Integer.valueOf(ctx.NUM().getSymbol().getText()))));
    }

    @Override
    public AtomicTacticExpr visitTermAsListDestruct(coqParser.TermAsListDestructContext ctx) {
        List<DisjConjIntroPattern> disjConjIntroPatterns = new ArrayList<>();
        List<Term> terms = new ArrayList<>();
        for (int i = 0; i < ctx.term().size(); i++) {
            disjConjIntroPatterns.add(new DisjConjIntroPatternVisitor().visit(ctx.disj_conj_intro_pattern(i)));
            terms.add(new TermVisitor().visit(ctx.term(i)));
        }
        return Destruct.ofTermAsList(disjConjIntroPatterns,terms);
    }

    @Override
    public AtomicTacticExpr visitElimType(coqParser.ElimTypeContext ctx) {
        return new ElimType(new TermComponent(new TermVisitor().visit(ctx.term())));
    }

    @Override
    public AtomicTacticExpr visitTermDiscriminate(coqParser.TermDiscriminateContext ctx) {
        if(ctx.binding_list() != null){
            return new Discriminate(
                    new TermComponent(new TermVisitor().visit(ctx.term())),
                    new BindingListComponent(ComponentType.WITH,new BindingListVisitor().visit(ctx.binding_list())
                    ));
        }
        return new Discriminate(
                new TermComponent(new TermVisitor().visit(ctx.term()))
        );
    }

    @Override
    public AtomicTacticExpr visitTermAsInjection(coqParser.TermAsInjectionContext ctx) {
        if(ctx.binding_list() != null){
            return new Injection(
                    new TermComponent(new TermVisitor().visit(ctx.term())),
                    new ListOfIntroPatternComponent(ComponentType.AS,ctx.intro_pattern()
                    .stream()
                    .map(intro_patternContext -> new IntroPatternVisitor().visit(intro_patternContext))
                    .collect(Collectors.toList())),
                    new BindingListComponent(ComponentType.WITH,new BindingListVisitor().visit(ctx.binding_list())
                    ));
        }
        return new Injection(new TermComponent(new TermVisitor().visit(ctx.term())),
        new ListOfIntroPatternComponent(ComponentType.AS,ctx.intro_pattern()
                .stream()
                .map(intro_patternContext -> new IntroPatternVisitor().visit(intro_patternContext))
                .collect(Collectors.toList())));
    }

    @Override
    public AtomicTacticExpr visitIdentInversion(coqParser.IdentInversionContext ctx) {
        return new Inversion(
                new IdentComponent(new IdentVisitor().visit(ctx.ident()))
        );
    }

    @Override
    public AtomicTacticExpr visitTermUsingDestruct(coqParser.TermUsingDestructContext ctx) {
        return Destruct.ofTermUsing(
                new TermComponent(new TermVisitor().visit(ctx.term(0))),
                new TermComponent(ComponentType.USING,new TermVisitor().visit(ctx.term(1))),
                ctx.binding_list() != null ?
                        Optional.of(
                                new BindingListComponent(ComponentType.WITH,new BindingListVisitor().visit(ctx.binding_list())
                                )
                        )
                        : Optional.empty()
        );
    }
}
