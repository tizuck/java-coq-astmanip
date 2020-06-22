package model.visitor.atomic;

import model.tactics.atomic.tacargcomponents.*;

public interface TacArgComponentVisitor<R,P> {

	R visit(IdentTermComponent identTermComponent,P p);

	R visit(AtomicTermListComponent atomicTermListComponent,P p);

	R visit(BinderComponent binderComponent, P p);

	R visit(BindingListComponent bindingListComponent, P p); 

	R visit(BooleanComponent booleanComponent, P p); 

	R visit(ByTacticComponent byTacticComponent, P p); 

	R visit(DestructTermAsListBodyComponent destructTermAsListBodyComponent, P p); 

	R visit(DisjConjIntroPatternComponent disjConjIntroPatternComponent, P p); 

	R visit(ExprComponent exprComponent, P p); 

	R visit(FlagComponent flagComponent, P p); 

	R visit(GoalOccurencesComponent goalOccurencesComponent, P p); 

	R visit(IdentComponent identComponent, P p); 

	R visit(IdentListComponent identListComponent, P p); 

	R visit(IdentPairListComponent identPairListComponent, P p); 

	R visit(InClauseComponent inClauseComponent, P p); 

	R visit(IntroPatternComponent introPatternComponent, P p); 

	R visit(IntroPatternListComponent introPatternListComponent, P p); 

	R visit(ListOfIntroPatternComponent listOfIntroPatternComponent, P p); 

	R visit(NegativeNumComponent negativeNumComponent, P p); 

	R visit(NumberListComponent numberListComponent, P p); 

	R visit(NumComponent numComponent, P p); 

	R visit(QualidComponent qualidComponent, P p); 

	R visit(QualidNumsListComponent qualidNumsListComponent, P p); 

	R visit(RewPrefixComponent rewPrefixComponent, P p); 

	R visit(StarComponent starComponent, P p); 

	R visit(SubComponent subComponent, P p);

	R visit(TermComponent termComponent, P p); 

	R visit(TermDisjConjIntroPatternListComponent termDisjConjIntroPatternListComponent, P p); 

	R visit(TermListComponent termListComponent, P p);

	R visit(IdentTermBindComponent identTermBindComponent,P p);

}
