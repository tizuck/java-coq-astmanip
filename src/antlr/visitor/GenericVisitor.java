package antlr.visitor;

import antlr.coqBaseVisitor;
import antlr.coqParser;

public class GenericVisitor<T> extends coqBaseVisitor<T> {
    @Override
    public T visitCoq_file(coqParser.Coq_fileContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSentenceFragment(coqParser.SentenceFragmentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitLtacFragment(coqParser.LtacFragmentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCommandFragment(coqParser.CommandFragmentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSub(coqParser.SubContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAdd(coqParser.AddContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitMul(coqParser.MulContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSub2(coqParser.Sub2Context ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAdd2(coqParser.Add2Context ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitMul2(coqParser.Mul2Context ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSub3(coqParser.Sub3Context ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAdd3(coqParser.Add3Context ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitMul3(coqParser.Mul3Context ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDot(coqParser.DotContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitStructCommand(coqParser.StructCommandContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitUndefinedCommand(coqParser.UndefinedCommandContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitUndefined_command(coqParser.Undefined_commandContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitStdRequire(coqParser.StdRequireContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitImportRequire(coqParser.ImportRequireContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitExportRequire(coqParser.ExportRequireContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitImportQualidsRequire(coqParser.ImportQualidsRequireContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitExportQualidsRequire(coqParser.ExportQualidsRequireContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitStdSection(coqParser.StdSectionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitStdEnd(coqParser.StdEndContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitStdModule(coqParser.StdModuleContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitModuleTypeModule(coqParser.ModuleTypeModuleContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitModuleTypeColonModule(coqParser.ModuleTypeColonModuleContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitModuleTypesLColonModule(coqParser.ModuleTypesLColonModuleContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitExportModule(coqParser.ExportModuleContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitImportModule(coqParser.ImportModuleContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitModuleExprDefModule(coqParser.ModuleExprDefModuleContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitModuletype(coqParser.ModuletypeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitModuleTypesLGrModule(coqParser.ModuleTypesLGrModuleContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitModuleExprLAddModule(coqParser.ModuleExprLAddModuleContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitStdInclude(coqParser.StdIncludeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitModuleTypesInclude(coqParser.ModuleTypesIncludeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitProof_command(coqParser.Proof_commandContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCollection(coqParser.CollectionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSection_subset_expr(coqParser.Section_subset_exprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTactic_invocation(coqParser.Tactic_invocationContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNumBinding(coqParser.NumBindingContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentBinding(coqParser.IdentBindingContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitBelowTerms(coqParser.BelowTermsContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNum_binding_list_body(coqParser.Num_binding_list_bodyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdent_binding_list_body(coqParser.Ident_binding_list_bodyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitApplying_theoremAtomic(coqParser.Applying_theoremAtomicContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitManaging_local_contextAtomic(coqParser.Managing_local_contextAtomicContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitControlling_proof_flowAtomic(coqParser.Controlling_proof_flowAtomicContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCase_analysis_inductionAtomic(coqParser.Case_analysis_inductionAtomicContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRewriting_expressionsAtomic(coqParser.Rewriting_expressionsAtomicContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitPerforming_computationAtomic(coqParser.Performing_computationAtomicContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitConversion_tactics_hypoAtomic(coqParser.Conversion_tactics_hypoAtomicContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAutomationAtomic(coqParser.AutomationAtomicContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDecision_proceduresAtomic(coqParser.Decision_proceduresAtomicContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitChecking_propertiesAtomic(coqParser.Checking_propertiesAtomicContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitEqualityAtomic(coqParser.EqualityAtomicContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitEquality_inductive_setsAtomic(coqParser.Equality_inductive_setsAtomicContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitInversionAtomic(coqParser.InversionAtomicContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitClassical_tacticsAtomic(coqParser.Classical_tacticsAtomicContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAutomatizingAtomic(coqParser.AutomatizingAtomicContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNon_logicalAtomic(coqParser.Non_logicalAtomicContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCycle(coqParser.CycleContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSwap(coqParser.SwapContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRevgoals(coqParser.RevgoalsContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitShelve(coqParser.ShelveContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitShelve_unifiable(coqParser.Shelve_unifiableContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitBtauto(coqParser.BtautoContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitOmega(coqParser.OmegaContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRing(coqParser.RingContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRing_simplify(coqParser.Ring_simplifyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitFieldAutomatizing(coqParser.FieldAutomatizingContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitField_simplify(coqParser.Field_simplifyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitField_simplify_eq(coqParser.Field_simplify_eqContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitFourier(coqParser.FourierContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitClassical_left(coqParser.Classical_leftContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitClassical_right(coqParser.Classical_rightContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentFunctionalInversion(coqParser.IdentFunctionalInversionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNumFunctionalInversion(coqParser.NumFunctionalInversionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitQuote(coqParser.QuoteContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDecideEquality(coqParser.DecideEqualityContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCompare(coqParser.CompareContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermSimplify_Eq(coqParser.TermSimplify_EqContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermESimplify_Eq(coqParser.TermESimplify_EqContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNumSimplify_Eq(coqParser.NumSimplify_EqContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNumESimplify_Eq(coqParser.NumESimplify_EqContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSimplify_Eq(coqParser.Simplify_EqContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDependentRewirte(coqParser.DependentRewirteContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitF_equals(coqParser.F_equalsContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitReflexivity(coqParser.ReflexivityContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSymmetry(coqParser.SymmetryContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTransitivity(coqParser.TransitivityContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitConstrEq(coqParser.ConstrEqContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitUnify(coqParser.UnifyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIs_Evar(coqParser.Is_EvarContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitHas_Evar(coqParser.Has_EvarContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIs_Var(coqParser.Is_VarContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTAuto(coqParser.TAutoContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDTAuto(coqParser.DTAutoContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitExprIntuition(coqParser.ExprIntuitionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIntuition(coqParser.IntuitionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDtintuition(coqParser.DtintuitionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRtAuto(coqParser.RtAutoContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitFirstorder(coqParser.FirstorderContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitUsingFirstorder(coqParser.UsingFirstorderContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitWithFirstorder(coqParser.WithFirstorderContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitUsingWithFirstorder(coqParser.UsingWithFirstorderContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCongruence(coqParser.CongruenceContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCongruenceN(coqParser.CongruenceNContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitWithCongruence(coqParser.WithCongruenceContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAuto(coqParser.AutoContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitEAuto(coqParser.EAutoContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNumAuto(coqParser.NumAutoContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNumEAuto(coqParser.NumEAutoContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitWithAuto(coqParser.WithAutoContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitWithEAuto(coqParser.WithEAutoContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitWithStarAuto(coqParser.WithStarAutoContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitWithStartEAuto(coqParser.WithStartEAutoContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitUsingAuto(coqParser.UsingAutoContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitUsingEAuto(coqParser.UsingEAutoContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNumUsingWithAuto(coqParser.NumUsingWithAutoContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNumUsingWithInfo_Auto(coqParser.NumUsingWithInfo_AutoContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitInfo_auto(coqParser.Info_autoContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDebugAuto(coqParser.DebugAutoContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTrivial(coqParser.TrivialContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitWithTrivial(coqParser.WithTrivialContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitWithStarTrivial(coqParser.WithStarTrivialContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitUsingTrivial(coqParser.UsingTrivialContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDebugTrivial(coqParser.DebugTrivialContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitInfo_trivial(coqParser.Info_trivialContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitWithAutounfold(coqParser.WithAutounfoldContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitWithStartAutounfold(coqParser.WithStartAutounfoldContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitWithAutorewrite(coqParser.WithAutorewriteContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitWithUsingAutoRewrite(coqParser.WithUsingAutoRewriteContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitWithInAutoRewrite(coqParser.WithInAutoRewriteContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitWithInUsingAutoRewrite(coqParser.WithInUsingAutoRewriteContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitWithInClauseAutorewrite(coqParser.WithInClauseAutorewriteContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitEasy(coqParser.EasyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNow(coqParser.NowContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitConversion_tactics_hypo(coqParser.Conversion_tactics_hypoContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCbv(coqParser.CbvContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitLazy(coqParser.LazyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCompute(coqParser.ComputeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCbvQualid(coqParser.CbvQualidContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitLazyQualid(coqParser.LazyQualidContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitVm_compute(coqParser.Vm_computeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNative_compute(coqParser.Native_computeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRed(coqParser.RedContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentRed(coqParser.IdentRedContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitHnf(coqParser.HnfContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCbnSingleCommand(coqParser.CbnSingleCommandContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCbn(coqParser.CbnContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSimpl(coqParser.SimplContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSimpleIn(coqParser.SimpleInContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSimpleStar(coqParser.SimpleStarContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSimplPattern(coqParser.SimplPatternContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSimpleQualid(coqParser.SimpleQualidContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSimplString(coqParser.SimplStringContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitUnfoldQualidIn(coqParser.UnfoldQualidInContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCommaUnfoldQualid(coqParser.CommaUnfoldQualidContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAtUnfoldQualid(coqParser.AtUnfoldQualidContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitUnfoldString(coqParser.UnfoldStringContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitPercUnfoldString(coqParser.PercUnfoldStringContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAtUnfoldString(coqParser.AtUnfoldStringContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitFold(coqParser.FoldContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitPerformingCompuationPattern(coqParser.PerformingCompuationPatternContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAtPattern(coqParser.AtPatternContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermsPattern(coqParser.TermsPatternContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAtTermsPattern(coqParser.AtTermsPatternContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermRewrite(coqParser.TermRewriteContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermERewrite(coqParser.TermERewriteContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRightArrowRewrite(coqParser.RightArrowRewriteContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitLeftArrowRewrite(coqParser.LeftArrowRewriteContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermInClauseRewrite(coqParser.TermInClauseRewriteContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermAtOccurencesRewrite(coqParser.TermAtOccurencesRewriteContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermByRewrite(coqParser.TermByRewriteContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAtomic_TermsRewrite(coqParser.Atomic_TermsRewriteContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermWithTacticReplace(coqParser.TermWithTacticReplaceContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermWithClauseReplace(coqParser.TermWithClauseReplaceContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermWithReplace(coqParser.TermWithReplaceContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRightArrowReplace(coqParser.RightArrowReplaceContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitLeftArrowReplace(coqParser.LeftArrowReplaceContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermClauseTacticReplace(coqParser.TermClauseTacticReplaceContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDoubleReplace(coqParser.DoubleReplaceContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitLeftArrowClauseReplace(coqParser.LeftArrowClauseReplaceContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentsSubst(coqParser.IdentsSubstContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSubst(coqParser.SubstContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermStepl(coqParser.TermSteplContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermByStepl(coqParser.TermBySteplContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermWithInChange(coqParser.TermWithInChangeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermWithChange(coqParser.TermWithChangeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermInChange(coqParser.TermInChangeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermAtWithChange(coqParser.TermAtWithChangeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitQuestion(coqParser.QuestionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitExclamation(coqParser.ExclamationContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermDestruct(coqParser.TermDestructContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermEDestruct(coqParser.TermEDestructContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermsDestruct(coqParser.TermsDestructContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermAsDestruct(coqParser.TermAsDestructContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermAsListDestruct(coqParser.TermAsListDestructContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermEqDestruct(coqParser.TermEqDestructContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermWithDestruct(coqParser.TermWithDestructContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermWithAsDestruct(coqParser.TermWithAsDestructContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermUsingDestruct(coqParser.TermUsingDestructContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermInDestruct(coqParser.TermInDestructContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermAtDestruct(coqParser.TermAtDestructContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCase(coqParser.CaseContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitEcase(coqParser.EcaseContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSimpleDestruct(coqParser.SimpleDestructContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCase_Eq(coqParser.Case_EqContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermInduction(coqParser.TermInductionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermAsInduction(coqParser.TermAsInductionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermUsingInduction(coqParser.TermUsingInductionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermsUsingInduction(coqParser.TermsUsingInductionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermInInduction(coqParser.TermInInductionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermEInduction(coqParser.TermEInductionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitWithAsUsingInduction(coqParser.WithAsUsingInductionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermElim(coqParser.TermElimContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermEElim(coqParser.TermEElimContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermWithElim(coqParser.TermWithElimContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermUsingElim(coqParser.TermUsingElimContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitWithUsingWithElim(coqParser.WithUsingWithElimContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitWithUsingWithEElim(coqParser.WithUsingWithEElimContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitElimType(coqParser.ElimTypeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentSimpleInducti(coqParser.IdentSimpleInductiContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNumSimpleInducti(coqParser.NumSimpleInductiContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentDoubleInduction(coqParser.IdentDoubleInductionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNumDoubleInduction(coqParser.NumDoubleInductionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDependentInduction(coqParser.DependentInductionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDependentDestruction(coqParser.DependentDestructionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitFunctionalInduction(coqParser.FunctionalInductionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermDiscriminate(coqParser.TermDiscriminateContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermEDiscriminate(coqParser.TermEDiscriminateContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNumDiscriminate(coqParser.NumDiscriminateContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNumEDiscriminate(coqParser.NumEDiscriminateContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDiscriminate(coqParser.DiscriminateContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermInjection(coqParser.TermInjectionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermEInjection(coqParser.TermEInjectionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNumEInjection(coqParser.NumEInjectionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNumInjection(coqParser.NumInjectionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitInjection(coqParser.InjectionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermAsInjection(coqParser.TermAsInjectionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermEInjectionAs(coqParser.TermEInjectionAsContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAsInjection(coqParser.AsInjectionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAsEInjection(coqParser.AsEInjectionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentInversion(coqParser.IdentInversionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNumInversion(coqParser.NumInversionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentInversion_Clear(coqParser.IdentInversion_ClearContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNumInversion_Clear(coqParser.NumInversion_ClearContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAsIdentInversion(coqParser.AsIdentInversionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAsNumInversion(coqParser.AsNumInversionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentAsInversion_Clear(coqParser.IdentAsInversion_ClearContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNumAsInversion_Clear(coqParser.NumAsInversion_ClearContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentInInversion_Clear(coqParser.IdentInInversion_ClearContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentInInversion(coqParser.IdentInInversionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAsInInversion(coqParser.AsInInversionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAsInInversion_Clear(coqParser.AsInInversion_ClearContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDependentInversion(coqParser.DependentInversionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDependentInversion_Clear(coqParser.DependentInversion_ClearContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSimpleInversion(coqParser.SimpleInversionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitInversionUsing(coqParser.InversionUsingContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitInversion_Sigma(coqParser.Inversion_SigmaContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitFixCaseAnalysisInduction(coqParser.FixCaseAnalysisInductionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCofixCaseAnalysisInduction(coqParser.CofixCaseAnalysisInductionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentAssert(coqParser.IdentAssertContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermAssert(coqParser.TermAssertContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitByAssert(coqParser.ByAssertContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAsAssert(coqParser.AsAssertContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAsByAssert(coqParser.AsByAssertContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAsByEAssert(coqParser.AsByEAssertContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentDefAssert(coqParser.IdentDefAssertContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitPoseProof(coqParser.PoseProofContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitEPoseProof(coqParser.EPoseProofContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentEnough(coqParser.IdentEnoughContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermEnough(coqParser.TermEnoughContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAsEnough(coqParser.AsEnoughContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentByEnough(coqParser.IdentByEnoughContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentByEEnough(coqParser.IdentByEEnoughContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermByEnough(coqParser.TermByEnoughContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermByEEnough(coqParser.TermByEEnoughContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAsByEnough(coqParser.AsByEnoughContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAsByEEnough(coqParser.AsByEEnoughContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCut(coqParser.CutContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSpecialize(coqParser.SpecializeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitWithSpecialize(coqParser.WithSpecializeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermGeneralize(coqParser.TermGeneralizeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermAtGeneralize(coqParser.TermAtGeneralizeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermAsGeneralize(coqParser.TermAsGeneralizeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermAtAsGeneralize(coqParser.TermAtAsGeneralizeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitGeneralizeDependent(coqParser.GeneralizeDependentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitEvar(coqParser.EvarContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentInstantiate(coqParser.IdentInstantiateContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNumInstantiate(coqParser.NumInstantiateContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNumInInstantiate(coqParser.NumInInstantiateContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitValueInstantiate(coqParser.ValueInstantiateContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTypeInstantiate(coqParser.TypeInstantiateContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitInstantiate(coqParser.InstantiateContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAdmit(coqParser.AdmitContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitGive_up(coqParser.Give_upContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAbsurd(coqParser.AbsurdContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitContradiction(coqParser.ContradictionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitContradict(coqParser.ContradictContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitExfalso(coqParser.ExfalsoContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIntro(coqParser.IntroContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIntros(coqParser.IntrosContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentIntros(coqParser.IdentIntrosContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentsIntros(coqParser.IdentsIntrosContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitUntilIdentIntros(coqParser.UntilIdentIntrosContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitUntilNumIntros(coqParser.UntilNumIntrosContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAfterIdentIntro(coqParser.AfterIdentIntroContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitBeforeIdentIntro(coqParser.BeforeIdentIntroContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAtTopIntro(coqParser.AtTopIntroContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAtBottomIntro(coqParser.AtBottomIntroContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentAfterIdentIntro(coqParser.IdentAfterIdentIntroContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentBeforeIdentIntro(coqParser.IdentBeforeIdentIntroContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentIntro(coqParser.IdentIntroContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIntroPatternListIntros(coqParser.IntroPatternListIntrosContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentsClear(coqParser.IdentsClearContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitClearbody(coqParser.ClearbodyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNegativIdentsClear(coqParser.NegativIdentsClearContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitClear(coqParser.ClearContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDependentClear(coqParser.DependentClearContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentsRevert(coqParser.IdentsRevertContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDependentRevert(coqParser.DependentRevertContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAfterMove(coqParser.AfterMoveContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitBeforeMove(coqParser.BeforeMoveContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTopMove(coqParser.TopMoveContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitBottomMove(coqParser.BottomMoveContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRename(coqParser.RenameContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentSet(coqParser.IdentSetContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentInSet(coqParser.IdentInSetContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentDefSet(coqParser.IdentDefSetContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermSet(coqParser.TermSetContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentDefInSet(coqParser.IdentDefInSetContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentDefInESet(coqParser.IdentDefInESetContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermInSet(coqParser.TermInSetContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermInESet(coqParser.TermInESetContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAsRemember(coqParser.AsRememberContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAsERemember(coqParser.AsERememberContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAsEqnRemember(coqParser.AsEqnRememberContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAsEqnERemember(coqParser.AsEqnERememberContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAsInRemember(coqParser.AsInRememberContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAsInERemember(coqParser.AsInERememberContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentDefPose(coqParser.IdentDefPoseContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentDefEPose(coqParser.IdentDefEPoseContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentBinderDefPose(coqParser.IdentBinderDefPoseContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentBinderDefEPose(coqParser.IdentBinderDefEPoseContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermPose(coqParser.TermPoseContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermEPose(coqParser.TermEPoseContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitQualidsDecompose(coqParser.QualidsDecomposeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSumDecompose(coqParser.SumDecomposeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRecordDecompose(coqParser.RecordDecomposeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitExact(coqParser.ExactContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitEexact(coqParser.EexactContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAssumptionApplyingTheorem(coqParser.AssumptionApplyingTheoremContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitEassumption(coqParser.EassumptionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRefine(coqParser.RefineContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitWithApply(coqParser.WithApplyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermsApply(coqParser.TermsApplyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermEApply(coqParser.TermEApplyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermSimpleApply(coqParser.TermSimpleApplyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermWithSimpleApply(coqParser.TermWithSimpleApplyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermWithSimpleEApply(coqParser.TermWithSimpleEApplyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermWithApply(coqParser.TermWithApplyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermWithEApply(coqParser.TermWithEApplyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitLApply(coqParser.LApplyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitInApply(coqParser.InApplyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitWithInSimpleApply(coqParser.WithInSimpleApplyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitWithInApply(coqParser.WithInApplyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitWithInEApply(coqParser.WithInEApplyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitWithInSimpleEApply(coqParser.WithInSimpleEApplyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermInSimpleApply(coqParser.TermInSimpleApplyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitConstructor(coqParser.ConstructorContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSplit(coqParser.SplitContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermExists(coqParser.TermExistsContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitBindingsExists(coqParser.BindingsExistsContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitLeft(coqParser.LeftContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRight(coqParser.RightContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitEconstructor(coqParser.EconstructorContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitEexists(coqParser.EexistsContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitEleft(coqParser.EleftContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitEright(coqParser.ErightContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitStdGoalOccurence(coqParser.StdGoalOccurenceContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitStarDerivedGoalOccurence(coqParser.StarDerivedGoalOccurenceContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitStar(coqParser.StarContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAt_occurences(coqParser.At_occurencesContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitOccurences(coqParser.OccurencesContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitFirst_goal_occurences_body(coqParser.First_goal_occurences_bodyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSecond_goal_occurences_body(coqParser.Second_goal_occurences_bodyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSecond_goal_occurences_body_body(coqParser.Second_goal_occurences_body_bodyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNamingIntroPattern(coqParser.NamingIntroPatternContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitPercIntroPattern(coqParser.PercIntroPatternContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitActionIntroPattern(coqParser.ActionIntroPatternContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitUnderscoreIntroPattern(coqParser.UnderscoreIntroPatternContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDisjConjActionIntroPattern(coqParser.DisjConjActionIntroPatternContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitEqualActionIntroPattern(coqParser.EqualActionIntroPatternContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIntroPatternListsDisjConjIntroPattern(coqParser.IntroPatternListsDisjConjIntroPatternContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIntroPatternsDisjConjIntroPattern(coqParser.IntroPatternsDisjConjIntroPatternContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAndIntroPatternDisjConjIntroPattern(coqParser.AndIntroPatternDisjConjIntroPatternContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitEq(coqParser.EqContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitOr(coqParser.OrContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentNaming(coqParser.IdentNamingContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitQuestionIdentNaming(coqParser.QuestionIdentNamingContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitQuestionNaming(coqParser.QuestionNamingContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIntro_pattern_list(coqParser.Intro_pattern_listContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIntro_pattern_list_body(coqParser.Intro_pattern_list_bodyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitFlag(coqParser.FlagContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitPattern2(coqParser.Pattern2Context ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitLemma(coqParser.LemmaContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitExpr2Expr(coqParser.Expr2ExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitLocalAppExpr(coqParser.LocalAppExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSequenceExpr(coqParser.SequenceExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTacarg3expr(coqParser.Tacarg3exprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitPairedSequenceLocalAppExpr(coqParser.PairedSequenceLocalAppExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitPairedSequenceLocalAppExprBody(coqParser.PairedSequenceLocalAppExprBodyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDoExpr(coqParser.DoExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitProgressExpr(coqParser.ProgressExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRepeatExpr(coqParser.RepeatExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTryExpr(coqParser.TryExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSoftCutExpr(coqParser.SoftCutExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitExactlyOnceExpr(coqParser.ExactlyOnceExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTimeoutExpr(coqParser.TimeoutExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTimeExpr(coqParser.TimeExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitOnlyExpr(coqParser.OnlyExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTacExpr2Expr(coqParser.TacExpr2ExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitLeftBiasedOpsExpr(coqParser.LeftBiasedOpsExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitBackTrackingExpr(coqParser.BackTrackingExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitGeneralizedBranchingExpr(coqParser.GeneralizedBranchingExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTacExpr1Expr(coqParser.TacExpr1ExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitFunExpr(coqParser.FunExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitLetExpr(coqParser.LetExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitContextMatchExpr(coqParser.ContextMatchExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitContextLazyMatchExpr(coqParser.ContextLazyMatchExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitContextMultitMatchExpr(coqParser.ContextMultitMatchExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitMatchMatchExpr(coqParser.MatchMatchExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitMatchLazyMatchExpr(coqParser.MatchLazyMatchExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitMatchMultiMatchExpr(coqParser.MatchMultiMatchExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAbstractExpr(coqParser.AbstractExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSolveExpr(coqParser.SolveExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitFirstExpr(coqParser.FirstExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdTacExpr(coqParser.IdTacExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentFailExpr(coqParser.IdentFailExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNumFailExpr(coqParser.NumFailExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitFailExpr(coqParser.FailExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitFreshStringExpr(coqParser.FreshStringExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitFreshQualidExpr(coqParser.FreshQualidExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitFreshExpr(coqParser.FreshExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitContextExpr(coqParser.ContextExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitContextExprBraceds(coqParser.ContextExprBracedsContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitEvalExpr(coqParser.EvalExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTypeExpr(coqParser.TypeExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitConstrExpr(coqParser.ConstrExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitUconstrExpr(coqParser.UconstrExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTypeTermExpr(coqParser.TypeTermExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNumgoals(coqParser.NumgoalsContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitGuardExpr(coqParser.GuardExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAssertFailsExpr(coqParser.AssertFailsExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAssertSucceedsExpr(coqParser.AssertSucceedsExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAtomicExpr(coqParser.AtomicExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitApplicationExpr(coqParser.ApplicationExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAtomExpr(coqParser.AtomExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitQualidAtom(coqParser.QualidAtomContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitUnitAtom(coqParser.UnitAtomContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIntAtom(coqParser.IntAtomContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitBracedExprAtom(coqParser.BracedExprAtomContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDotExprAtom(coqParser.DotExprAtomContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitStringMessageToken(coqParser.StringMessageTokenContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentMessageToken(coqParser.IdentMessageTokenContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIntMessageToken(coqParser.IntMessageTokenContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitQualidTacArg(coqParser.QualidTacArgContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitUnitTacArg(coqParser.UnitTacArgContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitLtacTacArg(coqParser.LtacTacArgContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitStringTacArg(coqParser.StringTacArgContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTermTacArg(coqParser.TermTacArgContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitLet_clause(coqParser.Let_clauseContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitContextHypContextRule(coqParser.ContextHypContextRuleContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitContextHypBracedContextRule(coqParser.ContextHypBracedContextRuleContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitStdContextRule(coqParser.StdContextRuleContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDerivedContextRule(coqParser.DerivedContextRuleContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitUnderscoreContextRule(coqParser.UnderscoreContextRuleContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitStdContextHyp(coqParser.StdContextHypContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitExprContextHyp(coqParser.ExprContextHypContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitStdMatchRule(coqParser.StdMatchRuleContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitContextMatchRule(coqParser.ContextMatchRuleContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitUnderscoreMatchRule(coqParser.UnderscoreMatchRuleContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTest(coqParser.TestContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentSelector(coqParser.IdentSelectorContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIntSelector(coqParser.IntSelectorContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitInteg(coqParser.IntegContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitInt_selector_body(coqParser.Int_selector_bodyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSelToplevelSelector(coqParser.SelToplevelSelectorContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAllToplevelSelector(coqParser.AllToplevelSelectorContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitParToplevelSelector(coqParser.ParToplevelSelectorContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentLtacDef(coqParser.IdentLtacDefContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitQualidLtacDef(coqParser.QualidLtacDefContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTerm(coqParser.TermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitOrOpsTerm(coqParser.OrOpsTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCofixLetTerm(coqParser.CofixLetTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTildeOpsTerm(coqParser.TildeOpsTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCompareOpsTerm(coqParser.CompareOpsTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNameAssignLetTerm(coqParser.NameAssignLetTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitMultTermProjectionTerm(coqParser.MultTermProjectionTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitFixTerm(coqParser.FixTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitFixLetTerm(coqParser.FixLetTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRecordTerm(coqParser.RecordTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentAssignLetTerm(coqParser.IdentAssignLetTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitForallTerm(coqParser.ForallTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitPrecBelow70Term(coqParser.PrecBelow70TermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitFunTerm(coqParser.FunTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitMultArgProjectionTerm(coqParser.MultArgProjectionTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRecordProjectionTerm(coqParser.RecordProjectionTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitImpliesOpsTerm(coqParser.ImpliesOpsTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitExistsExclamTerm(coqParser.ExistsExclamTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSumOrSpecif(coqParser.SumOrSpecifContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitExistsTerm(coqParser.ExistsTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitLColOpsTerm(coqParser.LColOpsTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAtTerm(coqParser.AtTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCofixTerm(coqParser.CofixTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitColonOpsTerm(coqParser.ColonOpsTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitEquivOpsTerm(coqParser.EquivOpsTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitColGOpsTerm(coqParser.ColGOpsTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIfThenElseTerm(coqParser.IfThenElseTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitExists2Term(coqParser.Exists2TermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitPatternAssignLetTerm(coqParser.PatternAssignLetTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAndOpsTerm(coqParser.AndOpsTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitLineCalcOpsTerm(coqParser.LineCalcOpsTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitPointCalcAppOpsTerm(coqParser.PointCalcAppOpsTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitBelowTerm(coqParser.BelowTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitArg_body(coqParser.Arg_bodyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNegOpsTerm(coqParser.NegOpsTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitBelowTermExMinus(coqParser.BelowTermExMinusContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAtomicTerm(coqParser.AtomicTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSig2Specif(coqParser.Sig2SpecifContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSigTSpecif(coqParser.SigTSpecifContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRewTerm(coqParser.RewTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitPowOpsTerm(coqParser.PowOpsTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTypeTerm(coqParser.TypeTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitMatchTerm(coqParser.MatchTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitListOpsTerm(coqParser.ListOpsTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSumBoolSpecif(coqParser.SumBoolSpecifContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSigT2Specif(coqParser.SigT2SpecifContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSigSpecif(coqParser.SigSpecifContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitQualidTerm(coqParser.QualidTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSortTerm(coqParser.SortTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitMetaVariableTerm(coqParser.MetaVariableTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNumTerm(coqParser.NumTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitUnderscoreTerm(coqParser.UnderscoreTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitBracedTerm(coqParser.BracedTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitPairTerm(coqParser.PairTermContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRew(coqParser.RewContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitBracedRew(coqParser.BracedRewContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitLeftArrowRew(coqParser.LeftArrowRewContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitLeftArrowBracedRew(coqParser.LeftArrowBracedRewContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRightArrowRew(coqParser.RightArrowRewContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRightArrowBracedRew(coqParser.RightArrowBracedRewContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRew2_term(coqParser.Rew2_termContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSingleTermArg(coqParser.SingleTermArgContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdentAssignArg(coqParser.IdentAssignArgContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSingleBinder(coqParser.SingleBinderContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitMultipleBinders(coqParser.MultipleBindersContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitBinders_with_one_param(coqParser.Binders_with_one_paramContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSingleNameBinder(coqParser.SingleNameBinderContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitMultipleNamesBinder(coqParser.MultipleNamesBinderContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitBracedNameBinder(coqParser.BracedNameBinderContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitBracedNameOptionalBinder(coqParser.BracedNameOptionalBinderContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitImplicitBinder(coqParser.ImplicitBinderContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSimpleName(coqParser.SimpleNameContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitUnderscoreName(coqParser.UnderscoreNameContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSingleQualidBinder(coqParser.SingleQualidBinderContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAccessQualidBinder(coqParser.AccessQualidBinderContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitMetavariable(coqParser.MetavariableContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSortProp(coqParser.SortPropContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSortSet(coqParser.SortSetContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSortType(coqParser.SortTypeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSingleFixBody(coqParser.SingleFixBodyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitMultipleFixBodies(coqParser.MultipleFixBodiesContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSingleCoFixBody(coqParser.SingleCoFixBodyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitMultipleCoFixBodies(coqParser.MultipleCoFixBodiesContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitFix_body(coqParser.Fix_bodyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCofix_body(coqParser.Cofix_bodyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAnnotation(coqParser.AnnotationContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitMatch_item(coqParser.Match_itemContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDep_ret_type(coqParser.Dep_ret_typeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitReturn_type(coqParser.Return_typeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitEquation(coqParser.EquationContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitMult_pattern(coqParser.Mult_patternContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitUnderscorePattern(coqParser.UnderscorePatternContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitQualidPattern(coqParser.QualidPatternContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNumPattern(coqParser.NumPatternContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitListOpsPattern(coqParser.ListOpsPatternContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDefMultiplePattern(coqParser.DefMultiplePatternContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitPercOpsPattern(coqParser.PercOpsPatternContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitOrMultiplePattern(coqParser.OrMultiplePatternContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAtDefMultiplePattern(coqParser.AtDefMultiplePatternContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAsOpsPattern(coqParser.AsOpsPatternContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAsOpsPatternImpl(coqParser.AsOpsPatternImplContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitPercOpsPatternImpl(coqParser.PercOpsPatternImplContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitQualidPatternImpl(coqParser.QualidPatternImplContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitUnderscorePatternImpl(coqParser.UnderscorePatternImplContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitNumPatternImpl(coqParser.NumPatternImplContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitBracedPattern(coqParser.BracedPatternContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitOrMultiplePatternImpl(coqParser.OrMultiplePatternImplContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitOr_pattern(coqParser.Or_patternContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitExists_term(coqParser.Exists_termContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitReturn_term(coqParser.Return_termContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitEquation_term(coqParser.Equation_termContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitForall_term(coqParser.Forall_termContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitFun_term(coqParser.Fun_termContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIdent_assign_term(coqParser.Ident_assign_termContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitFix_term(coqParser.Fix_termContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitFix_body_term(coqParser.Fix_body_termContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCofix_term(coqParser.Cofix_termContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitName_assign_term(coqParser.Name_assign_termContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitPattern_assign_term(coqParser.Pattern_assign_termContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIf_then_else_term(coqParser.If_then_else_termContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRecord(coqParser.RecordContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRecordRecord(coqParser.RecordRecordContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitInductiveRecord(coqParser.InductiveRecordContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCoinductiveRecord(coqParser.CoinductiveRecordContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDefField(coqParser.DefFieldContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitStdField(coqParser.StdFieldContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitField_term(coqParser.Field_termContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRecord_term(coqParser.Record_termContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitField_def(coqParser.Field_defContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitField_def_term(coqParser.Field_def_termContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitQualidModuleType(coqParser.QualidModuleTypeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitWithDefModuleType(coqParser.WithDefModuleTypeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitWithModuleModuleType(coqParser.WithModuleModuleTypeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitModuleExprModuleType(coqParser.ModuleExprModuleTypeContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitImportModuleBinding(coqParser.ImportModuleBindingContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitExportModuleBinding(coqParser.ExportModuleBindingContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitStdModuleBinding(coqParser.StdModuleBindingContext ctx) {
        throw new UnsupportedOperationException();
    }


    @Override
    public T visitModule_bindings(coqParser.Module_bindingsContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitStdModuleExpr(coqParser.StdModuleExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitExclamationModuleExpr(coqParser.ExclamationModuleExprContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAssumpt(coqParser.AssumptContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDef(coqParser.DefContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitInd(coqParser.IndContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitFix(coqParser.FixContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRec(coqParser.RecContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAssert(coqParser.AssertContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitGo(coqParser.GoContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSingleAssumption(coqParser.SingleAssumptionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitMultipleAssumption(coqParser.MultipleAssumptionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAxiom(coqParser.AxiomContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitConj(coqParser.ConjContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitParam(coqParser.ParamContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitParams(coqParser.ParamsContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitVar(coqParser.VarContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitVars(coqParser.VarsContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitHyp(coqParser.HypContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitHyps(coqParser.HypsContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAssums(coqParser.AssumsContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitStdDefinition(coqParser.StdDefinitionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitLetDefinition(coqParser.LetDefinitionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitStdInductive(coqParser.StdInductiveContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCoInductive(coqParser.CoInductiveContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitInd_body(coqParser.Ind_bodyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitInd_body_alloc(coqParser.Ind_body_allocContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitInd_body_alloc_element(coqParser.Ind_body_alloc_elementContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitStdFixPoint(coqParser.StdFixPointContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCoFixPoint(coqParser.CoFixPointContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSingleBinderImplicit(coqParser.SingleBinderImplicitContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitMultipleBindersImplicit(coqParser.MultipleBindersImplicitContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAssertion(coqParser.AssertionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTheo(coqParser.TheoContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitLem(coqParser.LemContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRema(coqParser.RemaContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitFac(coqParser.FacContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCol(coqParser.ColContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitProp(coqParser.PropContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDefAssert(coqParser.DefAssertContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitExam(coqParser.ExamContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitGoal(coqParser.GoalContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitProof(coqParser.ProofContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitStdProofBody(coqParser.StdProofBodyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitBracedProofBody(coqParser.BracedProofBodyContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSomeIdent(coqParser.SomeIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitEqIdent(coqParser.EqIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAllIdent(coqParser.AllIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAbsurdIdent(coqParser.AbsurdIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitEqualityIdent(coqParser.EqualityIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDoubleIdent(coqParser.DoubleIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitF_equalIdent(coqParser.F_equalIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitOrIdent(coqParser.OrIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitContradictIdent(coqParser.ContradictIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitFreshIdent(coqParser.FreshIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCase_eqIdent(coqParser.Case_eqIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitLemmaIdent(coqParser.LemmaIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitEasyIdent(coqParser.EasyIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRecIdent(coqParser.RecIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitChangeIdent(coqParser.ChangeIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDecideIdent(coqParser.DecideIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitLeftIdent(coqParser.LeftIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitRightIdent(coqParser.RightIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitInversion_sigmaIdent(coqParser.Inversion_sigmaIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitAssert_fialsIdent(coqParser.Assert_fialsIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitFailIdent(coqParser.FailIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDependentIdent(coqParser.DependentIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitSumIdent(coqParser.SumIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitCompareIdent(coqParser.CompareIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTAutoIdent(coqParser.TAutoIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDtAutoIdent(coqParser.DtAutoIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitIntuitionIdent(coqParser.IntuitionIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitDintuition(coqParser.DintuitionContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitTopIdent(coqParser.TopIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitBottomIdent(coqParser.BottomIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitExfalsoIdent(coqParser.ExfalsoIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T visitStdIdent(coqParser.StdIdentContext ctx) {
        throw new UnsupportedOperationException();
    }

}
