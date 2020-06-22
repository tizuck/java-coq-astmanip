package model.visitor.expr;

import model.tactics.atomic.applytheorem.*;
import model.tactics.atomic.automation.*;
import model.tactics.atomic.automatizing.*;
import model.tactics.atomic.caseanalysisind.*;
import model.tactics.atomic.checkingprops.*;
import model.tactics.atomic.classicaltac.Classical_Left;
import model.tactics.atomic.classicaltac.Classical_Right;
import model.tactics.atomic.controlproofflow.*;
import model.tactics.atomic.converstachypo.Conv_Tactic;
import model.tactics.atomic.decisionprocs.*;
import model.tactics.atomic.equalinducsets.*;
import model.tactics.atomic.equality.F_Equal;
import model.tactics.atomic.equality.Reflexivity;
import model.tactics.atomic.equality.Symmetry;
import model.tactics.atomic.equality.Transitivity;
import model.tactics.atomic.inversion.FunctionalInversion;
import model.tactics.atomic.inversion.Quote;
import model.tactics.atomic.manageloccont.*;
import model.tactics.atomic.nonlogical.*;
import model.tactics.atomic.performcompute.*;
import model.tactics.atomic.rewriteexpr.*;
import model.tactics.expr.*;

public interface ExprVisitor<R,P> {

	R visit(AbstractExpr abstractExpr, P p);

	R visit(ApplicationExpr applicationExpr, P p);

	R visit(AtomExpr atomExpr, P p);

	R visit(BackTrackingExpr backTrackingExpr, P p);

	R visit(ContextExpr contextExpr, P p);

	R visit(DoIdentExpr doIdentExpr, P p);

	R visit(DoNumExpr doNumExpr, P p);

	R visit(ExactlyOnceExpr exactlyOnceExpr, P p);

	R visit(AssertFailsExpr failAssertExpr, P p);

	R visit(FailExpr failExpr, P p);

	R visit(FirstExpr firstExpr, P p);

	R visit(FunExpr funExpr, P p);

	R visit(GeneralizedBranchingExpr generalizedBranchingExpr, P p);

	R visit(GuardExpr guardExpr, P p);

	R visit(IdTacExpr idTacExpr, P p);

	R visit(LazyContextMatchExpr lazyContextMatchExpr, P p);

	R visit(LazyMatchMatchExpression lazyMatchMatchExpression, P p);

	R visit(LeftBiasedExpr leftBiasedExpr, P p);

	R visit(LetExpr letExpr, P p);

	R visit(LocalAppExpr localAppExpr, P p);

	R visit(MultiContextMatchExpr multiContextMatchExpr, P p);

	R visit(MultiMatchMatchExpression multiMatchMatchExpression, P p);

	R visit(NumGoalsExpr numGoalsExpr, P p);

	R visit(OnlyExpr onlyExpr, P p);

	R visit(OpsExpr opsExpr, P p);

	R visit(PairdSequenceLocalAppExpr pairdSequenceLocalAppExpr, P p);

	R visit(ProgressExpr progressExpr, P p);

	R visit(QualidFreshExpr qualidFreshExpr, P p);

	 R visit(RepeatExpr repeatExpr, P p);

	 R visit(SequenceExpr sequenceExpr, P p);

	 R visit(SimpleTermExpr simpleTermExpr, P p);

	 R visit(SoftCutExpr softCutExpr, P p);

	 R visit(SolveExpr solveExpr, P p);

	R visit(StdContextMatchExpr stdContextMatchExpr, P p);

	 R visit(StdMatchMatchExpression stdMatchMatchExpression, P p);

	 R visit(StringFreshExpr stringFreshExpr, P p);

	 R visit(SuccessAssertExpr successAssertExpr, P p);

	 R visit(TimeExpr timeExpr, P p);

	 R visit(TimeoutIdentExpr timeoutIdentExpr, P p);

	 R visit(TimeoutNumExpr timeoutNumExpr, P p);

	 R visit(TryExpr tryExpr, P p);

	R visit(Absurd absurd, P p);

	R visit(Admit admit, P p);

	R visit(Apply apply, P p);

	R visit(Assert _assert, P p);

	R visit(Assumption assumption, P p);

	R visit(Auto auto, P p);

	R visit(Autorewrite autorewrite, P p);

	R visit(Autounfold autounfold, P p);

	R visit(Btauto btauto, P p);

	R visit(Case _case, P p);

	R visit(Case_Eq case_Eq, P p);

	R visit(Cbn cbn, P p);

	R visit(Cbv cbv, P p);

	R visit(Change change, P p);

	R visit(Classical_Left classical_Left, P p);

	R visit(Classical_Right classical_Right, P p);

	R visit(Clear clear, P p);

	R visit(ClearBody clearBody, P p);

	R visit(ClearDependent clearDependent, P p);

	R visit(CoFix coFix, P p);

	R visit(Compare compare, P p);

	R visit(Compute compute, P p);

	R visit(Congruence congruence, P p);

	R visit(CongruenceN congruenceN, P p);

	R visit(Constructor constructor, P p);

	R visit(Constr_Eq constr_Eq, P p);

	R visit(Contradict contradict, P p);

	R visit(Contradiction contradiction, P p);

	R visit(Conv_Tactic conv_Tactic, P p);

	R visit(Cut cut, P p);

	R visit(Cycle cycle, P p);

	R visit(DebugAuto debugAuto, P p);

	R visit(DebugTrivial debugTrivial, P p);

	R visit(DecideEquality decideEquality, P p);

	R visit(Decompose decompose, P p);

	R visit(DecomposeRecord decomposeRecord, P p);

	R visit(DecomposeSum decomposeSum, P p);

	R visit(DependentDestruction dependentDestruction, P p);

	R visit(DependentInduction dependentInduction, P p);

	R visit(DependentInversion dependentInversion, P p);

	R visit(DependentInversion_Clear dependentInversion_Clear, P p);

	R visit(DependentRewrite dependentRewrite, P p);

	R visit(Destruct destruct, P p);

	R visit(Dintuition dintuition, P p);

	R visit(Discriminate discriminate, P p);

	R visit(DoubleInduction doubleInduction, P p);

	R visit(Dtauto dtauto, P p);

	R visit(EApply eApply, P p);

	R visit(EAssert eAssert, P p);

	R visit(EAssumption eAssumption, P p);

	R visit(Easy easy, P p);

	R visit(EAuto eAuto, P p);

	R visit(ECase eCase, P p);

	R visit(EConstructor eConstructor, P p);

	R visit(EDestruct eDestruct, P p);

	R visit(EDiscriminate eDiscriminate, P p);

	R visit(EElim eElim, P p);

	R visit(EEnough eEnough, P p);

	R visit(EExact eExact, P p);

	R visit(EExists eExists, P p);

	R visit(EInduction eInduction, P p);

	R visit(EInjection eInjection, P p);

	R visit(ELeft eLeft, P p);

	R visit(Elim elim, P p);

	R visit(ElimType elimType, P p);

	R visit(Enough enough, P p);

	R visit(EPose ePose, P p);

	R visit(EPoseProof ePoseProof, P p);

	R visit(ERemember eRemember, P p);

	R visit(ERight eRight, P p);

	R visit(ESet eSet, P p);

	R visit(ESimplify_Eq eSimplify_Eq, P p);

	R visit(Evar evar, P p);

	R visit(Exact exact, P p);

	R visit(ExFalso exFalso, P p);

	R visit(Exists exists, P p);

	R visit(Field field, P p);

	R visit(Field_Simplify field_Simplify, P p);

	R visit(Field_Simplify_Eq field_Simplify_Eq, P p);

	R visit(Firstorder firstorder, P p);

	R visit(Fix fix, P p);

	R visit(Fold fold, P p);

	R visit(Fourier fourier, P p);

	R visit(FunctionalInduction functionalInduction, P p);

	R visit(FunctionalInversion functionalInversion, P p);

	R visit(F_Equal f_Equal, P p);

	R visit(Generalize generalize, P p);

	R visit(Give_up give_up, P p);

	R visit(Has_Evar has_Evar, P p);

	R visit(Hnf hnf, P p);

	R visit(Induction induction, P p);

	R visit(Info_Auto info_Auto, P p);

	R visit(Info_Trivial info_Trivial, P p);

	R visit(Injection injection, P p);

	R visit(Instantiate instantiate, P p);

	R visit(Intro intro, P p);

	R visit(Intros intros, P p);

	R visit(Intuition intuition, P p);

	R visit(Inversion inversion, P p);

	R visit(Inversion_Clear inversion_Clear, P p);

	R visit(Inversion_Sigma inversion_Sigma, P p);

	R visit(Is_Evar is_Evar, P p);

	R visit(Is_Var is_Var, P p);

	R visit(LApply lApply, P p);

	R visit(Lazy lazy, P p);

	R visit(Left left, P p);

	R visit(Move move, P p);

	R visit(Native_Compute native_Compute, P p);

	R visit(NotTypeClassesRefine notTypeClassesRefine, P p);

	R visit(Now now, P p);

	R visit(Omega omega, P p);

	R visit(Pattern pattern, P p);

	R visit(Pose pose, P p);

	R visit(PoseProof poseProof, P p);

	R visit(Quote quote, P p);

	R visit(Red red, P p);

	R visit(Refine refine, P p);

	R visit(Reflexivity reflexivity, P p);

	R visit(Remember remember, P p);

	R visit(Rename rename, P p);

	R visit(Replace replace, P p);

	R visit(Revert revert, P p);

	R visit(RevertDependent revertDependent, P p);

	R visit(Revgoal revgoal, P p);

	R visit(Rewrite rewrite, P p);

	R visit(Right right, P p);

	R visit(Ring ring, P p);

	R visit(Ring_Simplify ring_Simplify, P p);

	R visit(Rtauto rtauto, P p);

	R visit(Set set, P p);

	R visit(Shelve shelve, P p);

	R visit(Shelve_Unifiable shelve_Unifiable, P p);

	R visit(Simpl simpl, P p);

	R visit(SimpleApply simpleApply, P p);

	R visit(SimpleDestruct simpleDestruct, P p);

	R visit(SimpleInduction simpleInduction, P p);

	R visit(SimpleInversion simpleInversion, P p);

	R visit(SimpleNotTypeClassesRefine simpleNotTypeClassesRefine, P p);

	R visit(SimpleRefine simpleRefine, P p);

	R visit(Simplify_Eq simplify_Eq, P p);

	R visit(Specialize specialize, P p);

	R visit(Split split, P p);

	R visit(Stepl stepl, P p);

	R visit(Subst subst, P p);

	R visit(Swap swap, P p);

	R visit(Symmetry symmetry, P p);

	R visit(Tauto tauto, P p);

	R visit(Transitivity transitivity, P p);

	R visit(Trivial trivial, P p);

	R visit(Unfold unfold, P p);

	R visit(Give_Up give_up,P p);

	R visit(Unify unify, P p);

	R visit(Vm_Compute vm_Compute, P p);

}
