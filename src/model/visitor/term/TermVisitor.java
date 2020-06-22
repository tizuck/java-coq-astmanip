package model.visitor.term;

import model.term.*;
import model.term.Boolean;
import model.term.Number;


public interface TermVisitor<R,P>  {

	 R visit(AccessQualid accessQualid, P p);

	 R visit(ArgTerm argTerm, P p);

	 R visit(AtTerm atTerm, P p);

	 R visit(Boolean bool, P p);

	 R visit(BracedRewTerm bracedRewTerm, P p);

	 R visit(CofixLet cofixLet, P p);

	 R visit(CofixTerm cofixTerm, P p);

	 R visit(Exists2Term exists2Term, P p);

	 R visit(ExistsExclamTerm existsExclamTerm, P p);

	 R visit(ExistsTerm existsTerm, P p);

	 R visit(FixLet fixLet, P p);

	 R visit(FixTerm fixTerm, P p);

	 R visit(ForallTerm forallTerm, P p);

	 R visit(FunTerm funTerm, P p);

	 R visit(IdentAssignLet identAssignLet, P p);

	 R visit(IfThenElseTerm ifThenElseTerm, P p);

	 R visit(LeftArrowBracedRewTerm leftArrowBracedRewTerm, P p);

	 R visit(LeftArrowRewTerm leftArrowRewTerm, P p);

	 R visit(MatchTerm matchTerm, P p);

	 R visit(MetaVariable metaVariable, P p);

	 R visit(MultArgProjectionTerm multArgProjectionTerm, P p);

	 R visit(MultTermProjectionTerm multTermProjectionTerm, P p);

	 R visit(NameAssignLet nameAssignLet, P p);

	 R visit(Number number, P p);

	 R visit(OpsTerm opsTerm, P p);

	 R visit(Pair pair, P p);

	 R visit(PatternAssignLet patternAssignLet, P p);

	 R visit(RecordProjectionTerm recordProjectionTerm, P p);

	 R visit(RecordTerm recordTerm, P p);

	 R visit(RewTerm rewTerm, P p);

	 R visit(RightArrowBracedRewTerm rightArrowBracedRewTerm, P p);

	 R visit(RightArrowRewTerm rightArrowRewTerm, P p);

	 R visit(Sig2Specif sig2Specif, P p);

	 R visit(SigSpecif sigSpecif, P p);

	 R visit(SigT2Specif sigT2Specif, P p);

	 R visit(SigTSpecif sigTSpecif, P p);

	 R visit(SimpleQualid simpleQualid, P p);

	 R visit(SingleOpsTerm singleOpsTerm, P p);

	 R visit(Sort sort, P p);

	 R visit(SumBoolSpecif sumBoolSpecif, P p);

	 R visit(SumOrSpecif sumOrSpecif, P p);

	 R visit(TwoOpsTerm twoOpsTerm, P p);

	 R visit(TypeTerm typeTerm, P p);

	 R visit(Underscore underscore, P p);

}
