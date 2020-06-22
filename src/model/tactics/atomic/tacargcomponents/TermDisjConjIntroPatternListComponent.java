package model.tactics.atomic.tacargcomponents;

import model.tactics.atomic.utilities.DisjConjIntroPattern;
import model.term.Term;
import model.visitor.atomic.TacArgComponentVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TermDisjConjIntroPatternListComponent extends TacArgComponent {

    public class TermDisjConjIntroPattern {
        private DisjConjIntroPattern disjConjIntroPattern;

        private Term term;


        public TermDisjConjIntroPattern(DisjConjIntroPattern disjConjIntroPattern, Term term) {
            this.disjConjIntroPattern = disjConjIntroPattern;
            this.term = term;
        }

        public DisjConjIntroPattern getDisjConjIntroPattern() {
            return disjConjIntroPattern;
        }

        public Term getTerm() {
            return term;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TermDisjConjIntroPattern that = (TermDisjConjIntroPattern) o;
            return Objects.equals(disjConjIntroPattern, that.disjConjIntroPattern) &&
                    Objects.equals(term, that.term);
        }

        @Override
        public int hashCode() {
            return Objects.hash(disjConjIntroPattern, term);
        }
    }

    private List<TermDisjConjIntroPattern> termDisjConjIntroPatterns;

    public TermDisjConjIntroPatternListComponent(List<DisjConjIntroPattern> disjConjIntroPatterns, List<Term> terms) {

       termDisjConjIntroPatterns = new ArrayList<>();
        for (int i = 0; i < disjConjIntroPatterns.size(); i++) {
            termDisjConjIntroPatterns.add(new TermDisjConjIntroPattern(disjConjIntroPatterns.get(i),terms.get(i)));
        }
    }

    public TermDisjConjIntroPatternListComponent(ComponentType componentType, List<DisjConjIntroPattern> disjConjIntroPatterns, List<Term> terms) {
        super(componentType);
        termDisjConjIntroPatterns = new ArrayList<>();
        for (int i = 0; i < disjConjIntroPatterns.size(); i++) {
            termDisjConjIntroPatterns.add(new TermDisjConjIntroPattern(disjConjIntroPatterns.get(i),terms.get(i)));
        }
    }

    public List<TermDisjConjIntroPattern> getTermDisjConjIntroPatterns() {
        return termDisjConjIntroPatterns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TermDisjConjIntroPatternListComponent that = (TermDisjConjIntroPatternListComponent) o;
        return Objects.equals(termDisjConjIntroPatterns, that.termDisjConjIntroPatterns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), termDisjConjIntroPatterns);
    }

    @Override
    public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
        return tacArgComponentVisitor.visit(this,p);
    }



}
