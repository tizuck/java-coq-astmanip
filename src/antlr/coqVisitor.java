// Generated from coq.g4 by ANTLR 4.7.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link coqParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface coqVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link coqParser#coq_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoq_file(coqParser.Coq_fileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sentenceFragment}
	 * labeled alternative in {@link coqParser#coq_fragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenceFragment(coqParser.SentenceFragmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ltacFragment}
	 * labeled alternative in {@link coqParser#coq_fragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtacFragment(coqParser.LtacFragmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commandFragment}
	 * labeled alternative in {@link coqParser#coq_fragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandFragment(coqParser.CommandFragmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(coqParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(coqParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(coqParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub2}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub2(coqParser.Sub2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code add2}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd2(coqParser.Add2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code mul2}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul2(coqParser.Mul2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code sub3}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub3(coqParser.Sub3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code add3}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd3(coqParser.Add3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code mul3}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul3(coqParser.Mul3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code dot}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot(coqParser.DotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structCommand}
	 * labeled alternative in {@link coqParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructCommand(coqParser.StructCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code undefinedCommand}
	 * labeled alternative in {@link coqParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndefinedCommand(coqParser.UndefinedCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#undefined_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndefined_command(coqParser.Undefined_commandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stdRequire}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdRequire(coqParser.StdRequireContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importRequire}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportRequire(coqParser.ImportRequireContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exportRequire}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportRequire(coqParser.ExportRequireContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importQualidsRequire}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportQualidsRequire(coqParser.ImportQualidsRequireContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exportQualidsRequire}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportQualidsRequire(coqParser.ExportQualidsRequireContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stdSection}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdSection(coqParser.StdSectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stdEnd}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdEnd(coqParser.StdEndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stdModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdModule(coqParser.StdModuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moduleTypeModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleTypeModule(coqParser.ModuleTypeModuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moduleTypeColonModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleTypeColonModule(coqParser.ModuleTypeColonModuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moduleTypesLColonModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleTypesLColonModule(coqParser.ModuleTypesLColonModuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exportModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportModule(coqParser.ExportModuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportModule(coqParser.ImportModuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moduleExprDefModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleExprDefModule(coqParser.ModuleExprDefModuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moduletype}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuletype(coqParser.ModuletypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moduleTypesLGrModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleTypesLGrModule(coqParser.ModuleTypesLGrModuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moduleExprLAddModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleExprLAddModule(coqParser.ModuleExprLAddModuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stdInclude}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdInclude(coqParser.StdIncludeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moduleTypesInclude}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleTypesInclude(coqParser.ModuleTypesIncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#proof_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProof_command(coqParser.Proof_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection(coqParser.CollectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#section_subset_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection_subset_expr(coqParser.Section_subset_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#tactic_invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTactic_invocation(coqParser.Tactic_invocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numBinding}
	 * labeled alternative in {@link coqParser#binding_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumBinding(coqParser.NumBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identBinding}
	 * labeled alternative in {@link coqParser#binding_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentBinding(coqParser.IdentBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code belowTerms}
	 * labeled alternative in {@link coqParser#binding_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBelowTerms(coqParser.BelowTermsContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#num_binding_list_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_binding_list_body(coqParser.Num_binding_list_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#ident_binding_list_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent_binding_list_body(coqParser.Ident_binding_list_bodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code applying_theoremAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplying_theoremAtomic(coqParser.Applying_theoremAtomicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code managing_local_contextAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManaging_local_contextAtomic(coqParser.Managing_local_contextAtomicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code controlling_proof_flowAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlling_proof_flowAtomic(coqParser.Controlling_proof_flowAtomicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code case_analysis_inductionAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_analysis_inductionAtomic(coqParser.Case_analysis_inductionAtomicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rewriting_expressionsAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRewriting_expressionsAtomic(coqParser.Rewriting_expressionsAtomicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code performing_computationAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerforming_computationAtomic(coqParser.Performing_computationAtomicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conversion_tactics_hypoAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversion_tactics_hypoAtomic(coqParser.Conversion_tactics_hypoAtomicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code automationAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutomationAtomic(coqParser.AutomationAtomicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decision_proceduresAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecision_proceduresAtomic(coqParser.Decision_proceduresAtomicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checking_propertiesAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecking_propertiesAtomic(coqParser.Checking_propertiesAtomicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityAtomic(coqParser.EqualityAtomicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equality_inductive_setsAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_inductive_setsAtomic(coqParser.Equality_inductive_setsAtomicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inversionAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInversionAtomic(coqParser.InversionAtomicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classical_tacticsAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassical_tacticsAtomic(coqParser.Classical_tacticsAtomicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code automatizingAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutomatizingAtomic(coqParser.AutomatizingAtomicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code non_logicalAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_logicalAtomic(coqParser.Non_logicalAtomicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cycle}
	 * labeled alternative in {@link coqParser#non_logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle(coqParser.CycleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code swap}
	 * labeled alternative in {@link coqParser#non_logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwap(coqParser.SwapContext ctx);
	/**
	 * Visit a parse tree produced by the {@code revgoals}
	 * labeled alternative in {@link coqParser#non_logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevgoals(coqParser.RevgoalsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shelve}
	 * labeled alternative in {@link coqParser#non_logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShelve(coqParser.ShelveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shelve_unifiable}
	 * labeled alternative in {@link coqParser#non_logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShelve_unifiable(coqParser.Shelve_unifiableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code btauto}
	 * labeled alternative in {@link coqParser#automatizing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBtauto(coqParser.BtautoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code omega}
	 * labeled alternative in {@link coqParser#automatizing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmega(coqParser.OmegaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ring}
	 * labeled alternative in {@link coqParser#automatizing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRing(coqParser.RingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ring_simplify}
	 * labeled alternative in {@link coqParser#automatizing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRing_simplify(coqParser.Ring_simplifyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldAutomatizing}
	 * labeled alternative in {@link coqParser#automatizing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAutomatizing(coqParser.FieldAutomatizingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code field_simplify}
	 * labeled alternative in {@link coqParser#automatizing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_simplify(coqParser.Field_simplifyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code field_simplify_eq}
	 * labeled alternative in {@link coqParser#automatizing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_simplify_eq(coqParser.Field_simplify_eqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fourier}
	 * labeled alternative in {@link coqParser#automatizing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFourier(coqParser.FourierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classical_left}
	 * labeled alternative in {@link coqParser#classical_tactics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassical_left(coqParser.Classical_leftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classical_right}
	 * labeled alternative in {@link coqParser#classical_tactics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassical_right(coqParser.Classical_rightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identFunctionalInversion}
	 * labeled alternative in {@link coqParser#inversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentFunctionalInversion(coqParser.IdentFunctionalInversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numFunctionalInversion}
	 * labeled alternative in {@link coqParser#inversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumFunctionalInversion(coqParser.NumFunctionalInversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quote}
	 * labeled alternative in {@link coqParser#inversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuote(coqParser.QuoteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decideEquality}
	 * labeled alternative in {@link coqParser#equality_inductive_sets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecideEquality(coqParser.DecideEqualityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link coqParser#equality_inductive_sets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(coqParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termSimplify_Eq}
	 * labeled alternative in {@link coqParser#equality_inductive_sets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermSimplify_Eq(coqParser.TermSimplify_EqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termESimplify_Eq}
	 * labeled alternative in {@link coqParser#equality_inductive_sets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermESimplify_Eq(coqParser.TermESimplify_EqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numSimplify_Eq}
	 * labeled alternative in {@link coqParser#equality_inductive_sets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumSimplify_Eq(coqParser.NumSimplify_EqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numESimplify_Eq}
	 * labeled alternative in {@link coqParser#equality_inductive_sets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumESimplify_Eq(coqParser.NumESimplify_EqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simplify_Eq}
	 * labeled alternative in {@link coqParser#equality_inductive_sets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplify_Eq(coqParser.Simplify_EqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dependentRewirte}
	 * labeled alternative in {@link coqParser#equality_inductive_sets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependentRewirte(coqParser.DependentRewirteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code f_equals}
	 * labeled alternative in {@link coqParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF_equals(coqParser.F_equalsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code reflexivity}
	 * labeled alternative in {@link coqParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReflexivity(coqParser.ReflexivityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symmetry}
	 * labeled alternative in {@link coqParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymmetry(coqParser.SymmetryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code transitivity}
	 * labeled alternative in {@link coqParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitivity(coqParser.TransitivityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constrEq}
	 * labeled alternative in {@link coqParser#checking_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrEq(coqParser.ConstrEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unify}
	 * labeled alternative in {@link coqParser#checking_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnify(coqParser.UnifyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code is_Evar}
	 * labeled alternative in {@link coqParser#checking_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_Evar(coqParser.Is_EvarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code has_Evar}
	 * labeled alternative in {@link coqParser#checking_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHas_Evar(coqParser.Has_EvarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code is_Var}
	 * labeled alternative in {@link coqParser#checking_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_Var(coqParser.Is_VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tAuto}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTAuto(coqParser.TAutoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dTAuto}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDTAuto(coqParser.DTAutoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprIntuition}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIntuition(coqParser.ExprIntuitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intuition}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntuition(coqParser.IntuitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dtintuition}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtintuition(coqParser.DtintuitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rtAuto}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRtAuto(coqParser.RtAutoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code firstorder}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstorder(coqParser.FirstorderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code usingFirstorder}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingFirstorder(coqParser.UsingFirstorderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withFirstorder}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithFirstorder(coqParser.WithFirstorderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code usingWithFirstorder}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingWithFirstorder(coqParser.UsingWithFirstorderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code congruence}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCongruence(coqParser.CongruenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code congruenceN}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCongruenceN(coqParser.CongruenceNContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withCongruence}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithCongruence(coqParser.WithCongruenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code auto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto(coqParser.AutoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEAuto(coqParser.EAutoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumAuto(coqParser.NumAutoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numEAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumEAuto(coqParser.NumEAutoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withStarAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStarAuto(coqParser.WithStarAutoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithAuto(coqParser.WithAutoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withEAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithEAuto(coqParser.WithEAutoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withStartEAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStartEAuto(coqParser.WithStartEAutoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code usingAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingAuto(coqParser.UsingAutoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code usingEAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingEAuto(coqParser.UsingEAutoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numUsingWithAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumUsingWithAuto(coqParser.NumUsingWithAutoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numUsingWithInfo_Auto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumUsingWithInfo_Auto(coqParser.NumUsingWithInfo_AutoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code info_auto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfo_auto(coqParser.Info_autoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code debugAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebugAuto(coqParser.DebugAutoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trivial}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrivial(coqParser.TrivialContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withTrivial}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithTrivial(coqParser.WithTrivialContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withStarTrivial}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStarTrivial(coqParser.WithStarTrivialContext ctx);
	/**
	 * Visit a parse tree produced by the {@code usingTrivial}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingTrivial(coqParser.UsingTrivialContext ctx);
	/**
	 * Visit a parse tree produced by the {@code debugTrivial}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebugTrivial(coqParser.DebugTrivialContext ctx);
	/**
	 * Visit a parse tree produced by the {@code info_trivial}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfo_trivial(coqParser.Info_trivialContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withAutounfold}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithAutounfold(coqParser.WithAutounfoldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withStartAutounfold}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStartAutounfold(coqParser.WithStartAutounfoldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withAutorewrite}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithAutorewrite(coqParser.WithAutorewriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withUsingAutoRewrite}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithUsingAutoRewrite(coqParser.WithUsingAutoRewriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withInAutoRewrite}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithInAutoRewrite(coqParser.WithInAutoRewriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withInUsingAutoRewrite}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithInUsingAutoRewrite(coqParser.WithInUsingAutoRewriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withInClauseAutorewrite}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithInClauseAutorewrite(coqParser.WithInClauseAutorewriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code easy}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEasy(coqParser.EasyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code now}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNow(coqParser.NowContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#conversion_tactics_hypo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversion_tactics_hypo(coqParser.Conversion_tactics_hypoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cbv}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCbv(coqParser.CbvContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lazy}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLazy(coqParser.LazyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compute}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompute(coqParser.ComputeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cbvQualid}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCbvQualid(coqParser.CbvQualidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lazyQualid}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLazyQualid(coqParser.LazyQualidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vm_compute}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVm_compute(coqParser.Vm_computeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code native_compute}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNative_compute(coqParser.Native_computeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code red}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRed(coqParser.RedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identRed}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentRed(coqParser.IdentRedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hnf}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHnf(coqParser.HnfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cbnSingleCommand}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCbnSingleCommand(coqParser.CbnSingleCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cbn}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCbn(coqParser.CbnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpl}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpl(coqParser.SimplContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleIn}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleIn(coqParser.SimpleInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleStar}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStar(coqParser.SimpleStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simplPattern}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplPattern(coqParser.SimplPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleQualid}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleQualid(coqParser.SimpleQualidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simplString}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplString(coqParser.SimplStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unfoldQualidIn}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnfoldQualidIn(coqParser.UnfoldQualidInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commaUnfoldQualid}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaUnfoldQualid(coqParser.CommaUnfoldQualidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atUnfoldQualid}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtUnfoldQualid(coqParser.AtUnfoldQualidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unfoldString}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnfoldString(coqParser.UnfoldStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code percUnfoldString}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercUnfoldString(coqParser.PercUnfoldStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atUnfoldString}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtUnfoldString(coqParser.AtUnfoldStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fold}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFold(coqParser.FoldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code performingCompuationPattern}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformingCompuationPattern(coqParser.PerformingCompuationPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atPattern}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtPattern(coqParser.AtPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termsPattern}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermsPattern(coqParser.TermsPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atTermsPattern}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtTermsPattern(coqParser.AtTermsPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#qualidNumAt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualidNumAt(coqParser.QualidNumAtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termRewrite}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermRewrite(coqParser.TermRewriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termERewrite}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermERewrite(coqParser.TermERewriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rightArrowRewrite}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightArrowRewrite(coqParser.RightArrowRewriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftArrowRewrite}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftArrowRewrite(coqParser.LeftArrowRewriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termInClauseRewrite}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermInClauseRewrite(coqParser.TermInClauseRewriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termAtOccurencesRewrite}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermAtOccurencesRewrite(coqParser.TermAtOccurencesRewriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termByRewrite}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermByRewrite(coqParser.TermByRewriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomic_TermsRewrite}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomic_TermsRewrite(coqParser.Atomic_TermsRewriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termWithTacticReplace}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermWithTacticReplace(coqParser.TermWithTacticReplaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termWithClauseReplace}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermWithClauseReplace(coqParser.TermWithClauseReplaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termWithReplace}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermWithReplace(coqParser.TermWithReplaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rightArrowReplace}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightArrowReplace(coqParser.RightArrowReplaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftArrowReplace}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftArrowReplace(coqParser.LeftArrowReplaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termClauseTacticReplace}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermClauseTacticReplace(coqParser.TermClauseTacticReplaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleReplace}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleReplace(coqParser.DoubleReplaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftArrowClauseReplace}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftArrowClauseReplace(coqParser.LeftArrowClauseReplaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identsSubst}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentsSubst(coqParser.IdentsSubstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subst}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubst(coqParser.SubstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termStepl}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermStepl(coqParser.TermSteplContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termByStepl}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermByStepl(coqParser.TermBySteplContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termWithInChange}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermWithInChange(coqParser.TermWithInChangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termWithChange}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermWithChange(coqParser.TermWithChangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termInChange}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermInChange(coqParser.TermInChangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termAtWithChange}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermAtWithChange(coqParser.TermAtWithChangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code question}
	 * labeled alternative in {@link coqParser#rew_prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(coqParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exclamation}
	 * labeled alternative in {@link coqParser#rew_prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclamation(coqParser.ExclamationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermDestruct(coqParser.TermDestructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termEDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermEDestruct(coqParser.TermEDestructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termsDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermsDestruct(coqParser.TermsDestructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termAsDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermAsDestruct(coqParser.TermAsDestructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termAsListDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermAsListDestruct(coqParser.TermAsListDestructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termEqDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermEqDestruct(coqParser.TermEqDestructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termWithDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermWithDestruct(coqParser.TermWithDestructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termWithAsDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermWithAsDestruct(coqParser.TermWithAsDestructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termUsingDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermUsingDestruct(coqParser.TermUsingDestructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termInDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermInDestruct(coqParser.TermInDestructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termAtDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermAtDestruct(coqParser.TermAtDestructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code case}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase(coqParser.CaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ecase}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEcase(coqParser.EcaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDestruct(coqParser.SimpleDestructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code case_Eq}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_Eq(coqParser.Case_EqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermInduction(coqParser.TermInductionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termAsInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermAsInduction(coqParser.TermAsInductionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termUsingInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermUsingInduction(coqParser.TermUsingInductionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termsUsingInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermsUsingInduction(coqParser.TermsUsingInductionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termInInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermInInduction(coqParser.TermInInductionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termEInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermEInduction(coqParser.TermEInductionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withAsUsingInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithAsUsingInduction(coqParser.WithAsUsingInductionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termElim}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermElim(coqParser.TermElimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termEElim}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermEElim(coqParser.TermEElimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termWithElim}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermWithElim(coqParser.TermWithElimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termUsingElim}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermUsingElim(coqParser.TermUsingElimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withUsingWithElim}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithUsingWithElim(coqParser.WithUsingWithElimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withUsingWithEElim}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithUsingWithEElim(coqParser.WithUsingWithEElimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elimType}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElimType(coqParser.ElimTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identSimpleInducti}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentSimpleInducti(coqParser.IdentSimpleInductiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numSimpleInducti}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumSimpleInducti(coqParser.NumSimpleInductiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identDoubleInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentDoubleInduction(coqParser.IdentDoubleInductionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numDoubleInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumDoubleInduction(coqParser.NumDoubleInductionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dependentInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependentInduction(coqParser.DependentInductionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dependentDestruction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependentDestruction(coqParser.DependentDestructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionalInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionalInduction(coqParser.FunctionalInductionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termDiscriminate}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermDiscriminate(coqParser.TermDiscriminateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termEDiscriminate}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermEDiscriminate(coqParser.TermEDiscriminateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numDiscriminate}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumDiscriminate(coqParser.NumDiscriminateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numEDiscriminate}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumEDiscriminate(coqParser.NumEDiscriminateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code discriminate}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscriminate(coqParser.DiscriminateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termInjection}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermInjection(coqParser.TermInjectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termEInjection}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermEInjection(coqParser.TermEInjectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numEInjection}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumEInjection(coqParser.NumEInjectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numInjection}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumInjection(coqParser.NumInjectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code injection}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjection(coqParser.InjectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termAsInjection}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermAsInjection(coqParser.TermAsInjectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termEInjectionAs}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermEInjectionAs(coqParser.TermEInjectionAsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asInjection}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsInjection(coqParser.AsInjectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asEInjection}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsEInjection(coqParser.AsEInjectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identInversion}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentInversion(coqParser.IdentInversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numInversion}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumInversion(coqParser.NumInversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identInversion_Clear}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentInversion_Clear(coqParser.IdentInversion_ClearContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numInversion_Clear}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumInversion_Clear(coqParser.NumInversion_ClearContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asIdentInversion}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsIdentInversion(coqParser.AsIdentInversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asNumInversion}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsNumInversion(coqParser.AsNumInversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identAsInversion_Clear}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentAsInversion_Clear(coqParser.IdentAsInversion_ClearContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numAsInversion_Clear}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumAsInversion_Clear(coqParser.NumAsInversion_ClearContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identInInversion_Clear}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentInInversion_Clear(coqParser.IdentInInversion_ClearContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identInInversion}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentInInversion(coqParser.IdentInInversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asInInversion}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsInInversion(coqParser.AsInInversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asInInversion_Clear}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsInInversion_Clear(coqParser.AsInInversion_ClearContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dependentInversion}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependentInversion(coqParser.DependentInversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dependentInversion_Clear}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependentInversion_Clear(coqParser.DependentInversion_ClearContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleInversion}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleInversion(coqParser.SimpleInversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inversionUsing}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInversionUsing(coqParser.InversionUsingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inversion_Sigma}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInversion_Sigma(coqParser.Inversion_SigmaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fixCaseAnalysisInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixCaseAnalysisInduction(coqParser.FixCaseAnalysisInductionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cofixCaseAnalysisInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCofixCaseAnalysisInduction(coqParser.CofixCaseAnalysisInductionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identAssert}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentAssert(coqParser.IdentAssertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termAssert}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermAssert(coqParser.TermAssertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code byAssert}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByAssert(coqParser.ByAssertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asAssert}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsAssert(coqParser.AsAssertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asByAssert}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsByAssert(coqParser.AsByAssertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asByEAssert}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsByEAssert(coqParser.AsByEAssertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identDefAssert}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentDefAssert(coqParser.IdentDefAssertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code poseProof}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoseProof(coqParser.PoseProofContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ePoseProof}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEPoseProof(coqParser.EPoseProofContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentEnough(coqParser.IdentEnoughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermEnough(coqParser.TermEnoughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsEnough(coqParser.AsEnoughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identByEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentByEnough(coqParser.IdentByEnoughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identByEEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentByEEnough(coqParser.IdentByEEnoughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termByEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermByEnough(coqParser.TermByEnoughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termByEEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermByEEnough(coqParser.TermByEEnoughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asByEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsByEnough(coqParser.AsByEnoughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asByEEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsByEEnough(coqParser.AsByEEnoughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cut}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCut(coqParser.CutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specialize}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialize(coqParser.SpecializeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withSpecialize}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithSpecialize(coqParser.WithSpecializeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termGeneralize}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermGeneralize(coqParser.TermGeneralizeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termAtGeneralize}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermAtGeneralize(coqParser.TermAtGeneralizeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termAsGeneralize}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermAsGeneralize(coqParser.TermAsGeneralizeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termAtAsGeneralize}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermAtAsGeneralize(coqParser.TermAtAsGeneralizeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code generalizeDependent}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralizeDependent(coqParser.GeneralizeDependentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code evar}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvar(coqParser.EvarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identInstantiate}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentInstantiate(coqParser.IdentInstantiateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numInstantiate}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumInstantiate(coqParser.NumInstantiateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numInInstantiate}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumInInstantiate(coqParser.NumInInstantiateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueInstantiate}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueInstantiate(coqParser.ValueInstantiateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeInstantiate}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInstantiate(coqParser.TypeInstantiateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instantiate}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstantiate(coqParser.InstantiateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code admit}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdmit(coqParser.AdmitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code give_up}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGive_up(coqParser.Give_upContext ctx);
	/**
	 * Visit a parse tree produced by the {@code absurd}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsurd(coqParser.AbsurdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code contradiction}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContradiction(coqParser.ContradictionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code contradict}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContradict(coqParser.ContradictContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exfalso}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExfalso(coqParser.ExfalsoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intro}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntro(coqParser.IntroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intros}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntros(coqParser.IntrosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identIntros}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentIntros(coqParser.IdentIntrosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identsIntros}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentsIntros(coqParser.IdentsIntrosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code untilIdentIntros}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntilIdentIntros(coqParser.UntilIdentIntrosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code untilNumIntros}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntilNumIntros(coqParser.UntilNumIntrosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code afterIdentIntro}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfterIdentIntro(coqParser.AfterIdentIntroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code beforeIdentIntro}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeforeIdentIntro(coqParser.BeforeIdentIntroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atTopIntro}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtTopIntro(coqParser.AtTopIntroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atBottomIntro}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtBottomIntro(coqParser.AtBottomIntroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identAfterIdentIntro}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentAfterIdentIntro(coqParser.IdentAfterIdentIntroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identBeforeIdentIntro}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentBeforeIdentIntro(coqParser.IdentBeforeIdentIntroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identIntro}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentIntro(coqParser.IdentIntroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code introPatternListIntros}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntroPatternListIntros(coqParser.IntroPatternListIntrosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identsClear}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentsClear(coqParser.IdentsClearContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clearbody}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearbody(coqParser.ClearbodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negativIdentsClear}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativIdentsClear(coqParser.NegativIdentsClearContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clear}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClear(coqParser.ClearContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dependentClear}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependentClear(coqParser.DependentClearContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identsRevert}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentsRevert(coqParser.IdentsRevertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dependentRevert}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependentRevert(coqParser.DependentRevertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code afterMove}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfterMove(coqParser.AfterMoveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code beforeMove}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeforeMove(coqParser.BeforeMoveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code topMove}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopMove(coqParser.TopMoveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bottomMove}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBottomMove(coqParser.BottomMoveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rename}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRename(coqParser.RenameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identSet}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentSet(coqParser.IdentSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identInSet}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentInSet(coqParser.IdentInSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identDefSet}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentDefSet(coqParser.IdentDefSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termSet}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermSet(coqParser.TermSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identDefInSet}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentDefInSet(coqParser.IdentDefInSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identDefInESet}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentDefInESet(coqParser.IdentDefInESetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termInSet}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermInSet(coqParser.TermInSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termInESet}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermInESet(coqParser.TermInESetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asRemember}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsRemember(coqParser.AsRememberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asERemember}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsERemember(coqParser.AsERememberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asEqnRemember}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsEqnRemember(coqParser.AsEqnRememberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asEqnERemember}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsEqnERemember(coqParser.AsEqnERememberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asInRemember}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsInRemember(coqParser.AsInRememberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asInERemember}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsInERemember(coqParser.AsInERememberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identDefPose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentDefPose(coqParser.IdentDefPoseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identDefEPose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentDefEPose(coqParser.IdentDefEPoseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identBinderDefPose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentBinderDefPose(coqParser.IdentBinderDefPoseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identBinderDefEPose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentBinderDefEPose(coqParser.IdentBinderDefEPoseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termPose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermPose(coqParser.TermPoseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termEPose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermEPose(coqParser.TermEPoseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code qualidsDecompose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualidsDecompose(coqParser.QualidsDecomposeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumDecompose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumDecompose(coqParser.SumDecomposeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code recordDecompose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordDecompose(coqParser.RecordDecomposeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exact}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExact(coqParser.ExactContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eexact}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEexact(coqParser.EexactContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assumptionApplyingTheorem}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssumptionApplyingTheorem(coqParser.AssumptionApplyingTheoremContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eassumption}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEassumption(coqParser.EassumptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refine}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefine(coqParser.RefineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithApply(coqParser.WithApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termsApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermsApply(coqParser.TermsApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termEApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermEApply(coqParser.TermEApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termSimpleApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermSimpleApply(coqParser.TermSimpleApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termWithSimpleApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermWithSimpleApply(coqParser.TermWithSimpleApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termWithSimpleEApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermWithSimpleEApply(coqParser.TermWithSimpleEApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termWithApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermWithApply(coqParser.TermWithApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termWithEApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermWithEApply(coqParser.TermWithEApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLApply(coqParser.LApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInApply(coqParser.InApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withInSimpleApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithInSimpleApply(coqParser.WithInSimpleApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withInApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithInApply(coqParser.WithInApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withInEApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithInEApply(coqParser.WithInEApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withInSimpleEApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithInSimpleEApply(coqParser.WithInSimpleEApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termInSimpleApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermInSimpleApply(coqParser.TermInSimpleApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constructor}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(coqParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code split}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSplit(coqParser.SplitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termExists}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermExists(coqParser.TermExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bindingsExists}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingsExists(coqParser.BindingsExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code left}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft(coqParser.LeftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code right}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight(coqParser.RightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code econstructor}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEconstructor(coqParser.EconstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eexists}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEexists(coqParser.EexistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eleft}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEleft(coqParser.EleftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eright}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEright(coqParser.ErightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stdGoalOccurence}
	 * labeled alternative in {@link coqParser#goal_occurrences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdGoalOccurence(coqParser.StdGoalOccurenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code starDerivedGoalOccurence}
	 * labeled alternative in {@link coqParser#goal_occurrences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarDerivedGoalOccurence(coqParser.StarDerivedGoalOccurenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code star}
	 * labeled alternative in {@link coqParser#goal_occurrences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(coqParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#at_occurences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAt_occurences(coqParser.At_occurencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#occurences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOccurences(coqParser.OccurencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#first_goal_occurences_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst_goal_occurences_body(coqParser.First_goal_occurences_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#second_goal_occurences_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecond_goal_occurences_body(coqParser.Second_goal_occurences_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#second_goal_occurences_body_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecond_goal_occurences_body_body(coqParser.Second_goal_occurences_body_bodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code namingIntroPattern}
	 * labeled alternative in {@link coqParser#intro_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamingIntroPattern(coqParser.NamingIntroPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code percIntroPattern}
	 * labeled alternative in {@link coqParser#intro_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercIntroPattern(coqParser.PercIntroPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actionIntroPattern}
	 * labeled alternative in {@link coqParser#intro_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionIntroPattern(coqParser.ActionIntroPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code underscoreIntroPattern}
	 * labeled alternative in {@link coqParser#intro_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnderscoreIntroPattern(coqParser.UnderscoreIntroPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code disjConjActionIntroPattern}
	 * labeled alternative in {@link coqParser#action_intro_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjConjActionIntroPattern(coqParser.DisjConjActionIntroPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalActionIntroPattern}
	 * labeled alternative in {@link coqParser#action_intro_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualActionIntroPattern(coqParser.EqualActionIntroPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code introPatternListsDisjConjIntroPattern}
	 * labeled alternative in {@link coqParser#disj_conj_intro_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntroPatternListsDisjConjIntroPattern(coqParser.IntroPatternListsDisjConjIntroPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code introPatternsDisjConjIntroPattern}
	 * labeled alternative in {@link coqParser#disj_conj_intro_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntroPatternsDisjConjIntroPattern(coqParser.IntroPatternsDisjConjIntroPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andIntroPatternDisjConjIntroPattern}
	 * labeled alternative in {@link coqParser#disj_conj_intro_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndIntroPatternDisjConjIntroPattern(coqParser.AndIntroPatternDisjConjIntroPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eq}
	 * labeled alternative in {@link coqParser#equal_intro_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(coqParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link coqParser#equal_intro_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(coqParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identNaming}
	 * labeled alternative in {@link coqParser#naming_intro_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentNaming(coqParser.IdentNamingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code questionIdentNaming}
	 * labeled alternative in {@link coqParser#naming_intro_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionIdentNaming(coqParser.QuestionIdentNamingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code questionNaming}
	 * labeled alternative in {@link coqParser#naming_intro_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionNaming(coqParser.QuestionNamingContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#intro_pattern_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntro_pattern_list(coqParser.Intro_pattern_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#intro_pattern_list_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntro_pattern_list_body(coqParser.Intro_pattern_list_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#flag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlag(coqParser.FlagContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#pattern2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern2(coqParser.Pattern2Context ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#lemma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLemma(coqParser.LemmaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr2Expr}
	 * labeled alternative in {@link coqParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2Expr(coqParser.Expr2ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code localAppExpr}
	 * labeled alternative in {@link coqParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalAppExpr(coqParser.LocalAppExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sequenceExpr}
	 * labeled alternative in {@link coqParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceExpr(coqParser.SequenceExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tacarg3expr}
	 * labeled alternative in {@link coqParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTacarg3expr(coqParser.Tacarg3exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pairedSequenceLocalAppExpr}
	 * labeled alternative in {@link coqParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairedSequenceLocalAppExpr(coqParser.PairedSequenceLocalAppExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#pairedSequenceLocalAppExprBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairedSequenceLocalAppExprBody(coqParser.PairedSequenceLocalAppExprBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoExpr(coqParser.DoExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code progressExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgressExpr(coqParser.ProgressExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repeatExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatExpr(coqParser.RepeatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tryExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryExpr(coqParser.TryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code softCutExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoftCutExpr(coqParser.SoftCutExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exactlyOnceExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExactlyOnceExpr(coqParser.ExactlyOnceExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timeoutExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeoutExpr(coqParser.TimeoutExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timeExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeExpr(coqParser.TimeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code onlyExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyExpr(coqParser.OnlyExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tacExpr2Expr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTacExpr2Expr(coqParser.TacExpr2ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftBiasedOpsExpr}
	 * labeled alternative in {@link coqParser#tacexpr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftBiasedOpsExpr(coqParser.LeftBiasedOpsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code backTrackingExpr}
	 * labeled alternative in {@link coqParser#tacexpr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackTrackingExpr(coqParser.BackTrackingExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code generalizedBranchingExpr}
	 * labeled alternative in {@link coqParser#tacexpr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralizedBranchingExpr(coqParser.GeneralizedBranchingExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tacExpr1Expr}
	 * labeled alternative in {@link coqParser#tacexpr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTacExpr1Expr(coqParser.TacExpr1ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunExpr(coqParser.FunExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetExpr(coqParser.LetExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code contextMatchExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContextMatchExpr(coqParser.ContextMatchExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code contextLazyMatchExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContextLazyMatchExpr(coqParser.ContextLazyMatchExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code contextMultitMatchExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContextMultitMatchExpr(coqParser.ContextMultitMatchExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code matchMatchExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchMatchExpr(coqParser.MatchMatchExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code matchLazyMatchExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchLazyMatchExpr(coqParser.MatchLazyMatchExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code matchMultiMatchExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchMultiMatchExpr(coqParser.MatchMultiMatchExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code abstractExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractExpr(coqParser.AbstractExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code solveExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSolveExpr(coqParser.SolveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code firstExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstExpr(coqParser.FirstExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idTacExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdTacExpr(coqParser.IdTacExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identFailExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentFailExpr(coqParser.IdentFailExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numFailExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumFailExpr(coqParser.NumFailExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code failExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFailExpr(coqParser.FailExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code freshStringExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreshStringExpr(coqParser.FreshStringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code freshQualidExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreshQualidExpr(coqParser.FreshQualidExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code freshExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreshExpr(coqParser.FreshExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code contextExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContextExpr(coqParser.ContextExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code contextExprBraceds}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContextExprBraceds(coqParser.ContextExprBracedsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code evalExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvalExpr(coqParser.EvalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeExpr(coqParser.TypeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constrExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrExpr(coqParser.ConstrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uconstrExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUconstrExpr(coqParser.UconstrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeTermExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTermExpr(coqParser.TypeTermExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numgoals}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumgoals(coqParser.NumgoalsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code guardExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuardExpr(coqParser.GuardExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assertFailsExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertFailsExpr(coqParser.AssertFailsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assertSucceedsExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertSucceedsExpr(coqParser.AssertSucceedsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomicExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicExpr(coqParser.AtomicExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code applicationExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplicationExpr(coqParser.ApplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(coqParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code qualidAtom}
	 * labeled alternative in {@link coqParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualidAtom(coqParser.QualidAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unitAtom}
	 * labeled alternative in {@link coqParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitAtom(coqParser.UnitAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intAtom}
	 * labeled alternative in {@link coqParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAtom(coqParser.IntAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracedExprAtom}
	 * labeled alternative in {@link coqParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedExprAtom(coqParser.BracedExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dotExprAtom}
	 * labeled alternative in {@link coqParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotExprAtom(coqParser.DotExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringMessageToken}
	 * labeled alternative in {@link coqParser#message_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringMessageToken(coqParser.StringMessageTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identMessageToken}
	 * labeled alternative in {@link coqParser#message_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentMessageToken(coqParser.IdentMessageTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intMessageToken}
	 * labeled alternative in {@link coqParser#message_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntMessageToken(coqParser.IntMessageTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code qualidTacArg}
	 * labeled alternative in {@link coqParser#tacarg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualidTacArg(coqParser.QualidTacArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unitTacArg}
	 * labeled alternative in {@link coqParser#tacarg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitTacArg(coqParser.UnitTacArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ltacTacArg}
	 * labeled alternative in {@link coqParser#tacarg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtacTacArg(coqParser.LtacTacArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringTacArg}
	 * labeled alternative in {@link coqParser#tacarg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringTacArg(coqParser.StringTacArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termTacArg}
	 * labeled alternative in {@link coqParser#tacarg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermTacArg(coqParser.TermTacArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#let_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_clause(coqParser.Let_clauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code contextHypContextRule}
	 * labeled alternative in {@link coqParser#context_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContextHypContextRule(coqParser.ContextHypContextRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code contextHypBracedContextRule}
	 * labeled alternative in {@link coqParser#context_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContextHypBracedContextRule(coqParser.ContextHypBracedContextRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stdContextRule}
	 * labeled alternative in {@link coqParser#context_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdContextRule(coqParser.StdContextRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code derivedContextRule}
	 * labeled alternative in {@link coqParser#context_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerivedContextRule(coqParser.DerivedContextRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code underscoreContextRule}
	 * labeled alternative in {@link coqParser#context_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnderscoreContextRule(coqParser.UnderscoreContextRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stdContextHyp}
	 * labeled alternative in {@link coqParser#context_hyp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdContextHyp(coqParser.StdContextHypContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprContextHyp}
	 * labeled alternative in {@link coqParser#context_hyp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprContextHyp(coqParser.ExprContextHypContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stdMatchRule}
	 * labeled alternative in {@link coqParser#match_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdMatchRule(coqParser.StdMatchRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code contextMatchRule}
	 * labeled alternative in {@link coqParser#match_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContextMatchRule(coqParser.ContextMatchRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code underscoreMatchRule}
	 * labeled alternative in {@link coqParser#match_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnderscoreMatchRule(coqParser.UnderscoreMatchRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(coqParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identSelector}
	 * labeled alternative in {@link coqParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentSelector(coqParser.IdentSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intSelector}
	 * labeled alternative in {@link coqParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntSelector(coqParser.IntSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#integ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteg(coqParser.IntegContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#int_selector_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_selector_body(coqParser.Int_selector_bodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selToplevelSelector}
	 * labeled alternative in {@link coqParser#toplevel_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelToplevelSelector(coqParser.SelToplevelSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allToplevelSelector}
	 * labeled alternative in {@link coqParser#toplevel_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllToplevelSelector(coqParser.AllToplevelSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parToplevelSelector}
	 * labeled alternative in {@link coqParser#toplevel_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParToplevelSelector(coqParser.ParToplevelSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#ltac}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtac(coqParser.LtacContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identLtacDef}
	 * labeled alternative in {@link coqParser#ltac_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentLtacDef(coqParser.IdentLtacDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code qualidLtacDef}
	 * labeled alternative in {@link coqParser#ltac_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualidLtacDef(coqParser.QualidLtacDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(coqParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOpsTerm(coqParser.OrOpsTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cofixLetTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCofixLetTerm(coqParser.CofixLetTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tildeOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTildeOpsTerm(coqParser.TildeOpsTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareOpsTerm(coqParser.CompareOpsTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameAssignLetTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameAssignLetTerm(coqParser.NameAssignLetTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multTermProjectionTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultTermProjectionTerm(coqParser.MultTermProjectionTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fixTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixTerm(coqParser.FixTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fixLetTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixLetTerm(coqParser.FixLetTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code recordTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordTerm(coqParser.RecordTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identAssignLetTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentAssignLetTerm(coqParser.IdentAssignLetTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forallTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForallTerm(coqParser.ForallTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code precBelow70Term}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecBelow70Term(coqParser.PrecBelow70TermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunTerm(coqParser.FunTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multArgProjectionTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultArgProjectionTerm(coqParser.MultArgProjectionTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code recordProjectionTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordProjectionTerm(coqParser.RecordProjectionTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code impliesOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpliesOpsTerm(coqParser.ImpliesOpsTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code existsExclamTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsExclamTerm(coqParser.ExistsExclamTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumOrSpecif}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumOrSpecif(coqParser.SumOrSpecifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code existsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsTerm(coqParser.ExistsTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lColOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLColOpsTerm(coqParser.LColOpsTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtTerm(coqParser.AtTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cofixTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCofixTerm(coqParser.CofixTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code colonOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonOpsTerm(coqParser.ColonOpsTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equivOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquivOpsTerm(coqParser.EquivOpsTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code colGOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColGOpsTerm(coqParser.ColGOpsTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifThenElseTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseTerm(coqParser.IfThenElseTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exists2Term}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists2Term(coqParser.Exists2TermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code patternAssignLetTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternAssignLetTerm(coqParser.PatternAssignLetTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOpsTerm(coqParser.AndOpsTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineCalcOpsTerm}
	 * labeled alternative in {@link coqParser#above_term_ex_below_70}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineCalcOpsTerm(coqParser.LineCalcOpsTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pointCalcAppOpsTerm}
	 * labeled alternative in {@link coqParser#above_term_ex_below_70}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointCalcAppOpsTerm(coqParser.PointCalcAppOpsTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code belowTerm}
	 * labeled alternative in {@link coqParser#above_term_ex_below_70}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBelowTerm(coqParser.BelowTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listOpsTerm}
	 * labeled alternative in {@link coqParser#above_term_ex_below_70}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOpsTerm(coqParser.ListOpsTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negOpsTerm}
	 * labeled alternative in {@link coqParser#below_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegOpsTerm(coqParser.NegOpsTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code belowTermExMinus}
	 * labeled alternative in {@link coqParser#below_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBelowTermExMinus(coqParser.BelowTermExMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomicTerm}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicTerm(coqParser.AtomicTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sig2Specif}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSig2Specif(coqParser.Sig2SpecifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sigTSpecif}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigTSpecif(coqParser.SigTSpecifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rewTerm}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRewTerm(coqParser.RewTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powOpsTerm}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowOpsTerm(coqParser.PowOpsTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeTerm}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTerm(coqParser.TypeTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code matchTerm}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchTerm(coqParser.MatchTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumBoolSpecif}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumBoolSpecif(coqParser.SumBoolSpecifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sigT2Specif}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigT2Specif(coqParser.SigT2SpecifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sigSpecif}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigSpecif(coqParser.SigSpecifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code qualidTerm}
	 * labeled alternative in {@link coqParser#atomic_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualidTerm(coqParser.QualidTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sortTerm}
	 * labeled alternative in {@link coqParser#atomic_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortTerm(coqParser.SortTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metaVariableTerm}
	 * labeled alternative in {@link coqParser#atomic_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetaVariableTerm(coqParser.MetaVariableTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numTerm}
	 * labeled alternative in {@link coqParser#atomic_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumTerm(coqParser.NumTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code underscoreTerm}
	 * labeled alternative in {@link coqParser#atomic_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnderscoreTerm(coqParser.UnderscoreTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracedTerm}
	 * labeled alternative in {@link coqParser#atomic_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedTerm(coqParser.BracedTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pairTerm}
	 * labeled alternative in {@link coqParser#atomic_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairTerm(coqParser.PairTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rew}
	 * labeled alternative in {@link coqParser#rew_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRew(coqParser.RewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracedRew}
	 * labeled alternative in {@link coqParser#rew_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedRew(coqParser.BracedRewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftArrowRew}
	 * labeled alternative in {@link coqParser#rew_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftArrowRew(coqParser.LeftArrowRewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftArrowBracedRew}
	 * labeled alternative in {@link coqParser#rew_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftArrowBracedRew(coqParser.LeftArrowBracedRewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rightArrowRew}
	 * labeled alternative in {@link coqParser#rew_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightArrowRew(coqParser.RightArrowRewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rightArrowBracedRew}
	 * labeled alternative in {@link coqParser#rew_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightArrowBracedRew(coqParser.RightArrowBracedRewContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#rew2_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRew2_term(coqParser.Rew2_termContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleTermArg}
	 * labeled alternative in {@link coqParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTermArg(coqParser.SingleTermArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identAssignArg}
	 * labeled alternative in {@link coqParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentAssignArg(coqParser.IdentAssignArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#arg_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_body(coqParser.Arg_bodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleBinder}
	 * labeled alternative in {@link coqParser#binders}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleBinder(coqParser.SingleBinderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleBinders}
	 * labeled alternative in {@link coqParser#binders}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleBinders(coqParser.MultipleBindersContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#binders_with_one_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinders_with_one_param(coqParser.Binders_with_one_paramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleNameBinder}
	 * labeled alternative in {@link coqParser#binder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleNameBinder(coqParser.SingleNameBinderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleNamesBinder}
	 * labeled alternative in {@link coqParser#binder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleNamesBinder(coqParser.MultipleNamesBinderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracedNameBinder}
	 * labeled alternative in {@link coqParser#binder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedNameBinder(coqParser.BracedNameBinderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracedNameOptionalBinder}
	 * labeled alternative in {@link coqParser#binder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedNameOptionalBinder(coqParser.BracedNameOptionalBinderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code implicitBinder}
	 * labeled alternative in {@link coqParser#binder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicitBinder(coqParser.ImplicitBinderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleName}
	 * labeled alternative in {@link coqParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleName(coqParser.SimpleNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code underscoreName}
	 * labeled alternative in {@link coqParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnderscoreName(coqParser.UnderscoreNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleQualidBinder}
	 * labeled alternative in {@link coqParser#qualid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleQualidBinder(coqParser.SingleQualidBinderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accessQualidBinder}
	 * labeled alternative in {@link coqParser#qualid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessQualidBinder(coqParser.AccessQualidBinderContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#metavariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetavariable(coqParser.MetavariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sortProp}
	 * labeled alternative in {@link coqParser#sort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortProp(coqParser.SortPropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sortSet}
	 * labeled alternative in {@link coqParser#sort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortSet(coqParser.SortSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sortType}
	 * labeled alternative in {@link coqParser#sort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortType(coqParser.SortTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleFixBody}
	 * labeled alternative in {@link coqParser#fix_bodies}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleFixBody(coqParser.SingleFixBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleFixBodies}
	 * labeled alternative in {@link coqParser#fix_bodies}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleFixBodies(coqParser.MultipleFixBodiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleCoFixBody}
	 * labeled alternative in {@link coqParser#cofix_bodies}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleCoFixBody(coqParser.SingleCoFixBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleCoFixBodies}
	 * labeled alternative in {@link coqParser#cofix_bodies}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleCoFixBodies(coqParser.MultipleCoFixBodiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#fix_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFix_body(coqParser.Fix_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#cofix_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCofix_body(coqParser.Cofix_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(coqParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#match_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_item(coqParser.Match_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#dep_ret_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDep_ret_type(coqParser.Dep_ret_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type(coqParser.Return_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(coqParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#mult_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult_pattern(coqParser.Mult_patternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code underscorePattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnderscorePattern(coqParser.UnderscorePatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code qualidPattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualidPattern(coqParser.QualidPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numPattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumPattern(coqParser.NumPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listOpsPattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOpsPattern(coqParser.ListOpsPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defMultiplePattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefMultiplePattern(coqParser.DefMultiplePatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code percOpsPattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercOpsPattern(coqParser.PercOpsPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orMultiplePattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrMultiplePattern(coqParser.OrMultiplePatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atDefMultiplePattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtDefMultiplePattern(coqParser.AtDefMultiplePatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asOpsPattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsOpsPattern(coqParser.AsOpsPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asOpsPatternImpl}
	 * labeled alternative in {@link coqParser#pattern_without_implicits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsOpsPatternImpl(coqParser.AsOpsPatternImplContext ctx);
	/**
	 * Visit a parse tree produced by the {@code percOpsPatternImpl}
	 * labeled alternative in {@link coqParser#pattern_without_implicits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercOpsPatternImpl(coqParser.PercOpsPatternImplContext ctx);
	/**
	 * Visit a parse tree produced by the {@code qualidPatternImpl}
	 * labeled alternative in {@link coqParser#pattern_without_implicits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualidPatternImpl(coqParser.QualidPatternImplContext ctx);
	/**
	 * Visit a parse tree produced by the {@code underscorePatternImpl}
	 * labeled alternative in {@link coqParser#pattern_without_implicits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnderscorePatternImpl(coqParser.UnderscorePatternImplContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numPatternImpl}
	 * labeled alternative in {@link coqParser#pattern_without_implicits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumPatternImpl(coqParser.NumPatternImplContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracedPattern}
	 * labeled alternative in {@link coqParser#pattern_without_implicits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedPattern(coqParser.BracedPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orMultiplePatternImpl}
	 * labeled alternative in {@link coqParser#pattern_without_implicits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrMultiplePatternImpl(coqParser.OrMultiplePatternImplContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#or_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_pattern(coqParser.Or_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#exists_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists_term(coqParser.Exists_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#return_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_term(coqParser.Return_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#equation_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation_term(coqParser.Equation_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#forall_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForall_term(coqParser.Forall_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#fun_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_term(coqParser.Fun_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#ident_assign_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent_assign_term(coqParser.Ident_assign_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#fix_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFix_term(coqParser.Fix_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#fix_body_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFix_body_term(coqParser.Fix_body_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#cofix_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCofix_term(coqParser.Cofix_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#name_assign_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_assign_term(coqParser.Name_assign_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#pattern_assign_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_assign_term(coqParser.Pattern_assign_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#if_then_else_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_then_else_term(coqParser.If_then_else_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#record}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord(coqParser.RecordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code recordRecord}
	 * labeled alternative in {@link coqParser#record_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordRecord(coqParser.RecordRecordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inductiveRecord}
	 * labeled alternative in {@link coqParser#record_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInductiveRecord(coqParser.InductiveRecordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code coinductiveRecord}
	 * labeled alternative in {@link coqParser#record_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoinductiveRecord(coqParser.CoinductiveRecordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defField}
	 * labeled alternative in {@link coqParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefField(coqParser.DefFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stdField}
	 * labeled alternative in {@link coqParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdField(coqParser.StdFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#field_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_term(coqParser.Field_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#record_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_term(coqParser.Record_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#field_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_def(coqParser.Field_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#field_def_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_def_term(coqParser.Field_def_termContext ctx);
	/**
	 * Visit a parse tree produced by the {@code qualidModuleType}
	 * labeled alternative in {@link coqParser#module_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualidModuleType(coqParser.QualidModuleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withDefModuleType}
	 * labeled alternative in {@link coqParser#module_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithDefModuleType(coqParser.WithDefModuleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withModuleModuleType}
	 * labeled alternative in {@link coqParser#module_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithModuleModuleType(coqParser.WithModuleModuleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moduleExprModuleType}
	 * labeled alternative in {@link coqParser#module_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleExprModuleType(coqParser.ModuleExprModuleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importModuleBinding}
	 * labeled alternative in {@link coqParser#module_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportModuleBinding(coqParser.ImportModuleBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exportModuleBinding}
	 * labeled alternative in {@link coqParser#module_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportModuleBinding(coqParser.ExportModuleBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stdModuleBinding}
	 * labeled alternative in {@link coqParser#module_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdModuleBinding(coqParser.StdModuleBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#module_bindings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_bindings(coqParser.Module_bindingsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stdModuleExpr}
	 * labeled alternative in {@link coqParser#module_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdModuleExpr(coqParser.StdModuleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exclamationModuleExpr}
	 * labeled alternative in {@link coqParser#module_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclamationModuleExpr(coqParser.ExclamationModuleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assumpt}
	 * labeled alternative in {@link coqParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssumpt(coqParser.AssumptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code def}
	 * labeled alternative in {@link coqParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(coqParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ind}
	 * labeled alternative in {@link coqParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInd(coqParser.IndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fix}
	 * labeled alternative in {@link coqParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFix(coqParser.FixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rec}
	 * labeled alternative in {@link coqParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRec(coqParser.RecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assert}
	 * labeled alternative in {@link coqParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssert(coqParser.AssertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code go}
	 * labeled alternative in {@link coqParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGo(coqParser.GoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleAssumption}
	 * labeled alternative in {@link coqParser#assumption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleAssumption(coqParser.SingleAssumptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleAssumption}
	 * labeled alternative in {@link coqParser#assumption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleAssumption(coqParser.MultipleAssumptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code axiom}
	 * labeled alternative in {@link coqParser#assumption_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAxiom(coqParser.AxiomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conj}
	 * labeled alternative in {@link coqParser#assumption_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConj(coqParser.ConjContext ctx);
	/**
	 * Visit a parse tree produced by the {@code param}
	 * labeled alternative in {@link coqParser#assumption_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(coqParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code params}
	 * labeled alternative in {@link coqParser#assumption_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(coqParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var}
	 * labeled alternative in {@link coqParser#assumption_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(coqParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vars}
	 * labeled alternative in {@link coqParser#assumption_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(coqParser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hyp}
	 * labeled alternative in {@link coqParser#assumption_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHyp(coqParser.HypContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hyps}
	 * labeled alternative in {@link coqParser#assumption_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHyps(coqParser.HypsContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#assums}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssums(coqParser.AssumsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stdDefinition}
	 * labeled alternative in {@link coqParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdDefinition(coqParser.StdDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letDefinition}
	 * labeled alternative in {@link coqParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetDefinition(coqParser.LetDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stdInductive}
	 * labeled alternative in {@link coqParser#inductive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdInductive(coqParser.StdInductiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code coInductive}
	 * labeled alternative in {@link coqParser#inductive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoInductive(coqParser.CoInductiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#ind_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInd_body(coqParser.Ind_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#ind_body_alloc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInd_body_alloc(coqParser.Ind_body_allocContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#ind_body_alloc_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInd_body_alloc_element(coqParser.Ind_body_alloc_elementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stdFixPoint}
	 * labeled alternative in {@link coqParser#fixpoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdFixPoint(coqParser.StdFixPointContext ctx);
	/**
	 * Visit a parse tree produced by the {@code coFixPoint}
	 * labeled alternative in {@link coqParser#fixpoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoFixPoint(coqParser.CoFixPointContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleBinderImplicit}
	 * labeled alternative in {@link coqParser#implicitArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleBinderImplicit(coqParser.SingleBinderImplicitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleBindersImplicit}
	 * labeled alternative in {@link coqParser#implicitArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleBindersImplicit(coqParser.MultipleBindersImplicitContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#assertion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertion(coqParser.AssertionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code theo}
	 * labeled alternative in {@link coqParser#assertion_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheo(coqParser.TheoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lem}
	 * labeled alternative in {@link coqParser#assertion_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLem(coqParser.LemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rema}
	 * labeled alternative in {@link coqParser#assertion_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRema(coqParser.RemaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fac}
	 * labeled alternative in {@link coqParser#assertion_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFac(coqParser.FacContext ctx);
	/**
	 * Visit a parse tree produced by the {@code col}
	 * labeled alternative in {@link coqParser#assertion_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCol(coqParser.ColContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prop}
	 * labeled alternative in {@link coqParser#assertion_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProp(coqParser.PropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defAssert}
	 * labeled alternative in {@link coqParser#assertion_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefAssert(coqParser.DefAssertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exam}
	 * labeled alternative in {@link coqParser#assertion_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExam(coqParser.ExamContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(coqParser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link coqParser#proof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProof(coqParser.ProofContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stdProofBody}
	 * labeled alternative in {@link coqParser#proof_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdProofBody(coqParser.StdProofBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracedProofBody}
	 * labeled alternative in {@link coqParser#proof_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedProofBody(coqParser.BracedProofBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code someIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomeIdent(coqParser.SomeIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqIdent(coqParser.EqIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllIdent(coqParser.AllIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code absurdIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsurdIdent(coqParser.AbsurdIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityIdent(coqParser.EqualityIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleIdent(coqParser.DoubleIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code f_equalIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF_equalIdent(coqParser.F_equalIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrIdent(coqParser.OrIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code contradictIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContradictIdent(coqParser.ContradictIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code freshIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreshIdent(coqParser.FreshIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code case_eqIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_eqIdent(coqParser.Case_eqIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lemmaIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLemmaIdent(coqParser.LemmaIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code easyIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEasyIdent(coqParser.EasyIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code recIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecIdent(coqParser.RecIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code changeIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeIdent(coqParser.ChangeIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decideIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecideIdent(coqParser.DecideIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftIdent(coqParser.LeftIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rightIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightIdent(coqParser.RightIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inversion_sigmaIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInversion_sigmaIdent(coqParser.Inversion_sigmaIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assert_fialsIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssert_fialsIdent(coqParser.Assert_fialsIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code failIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFailIdent(coqParser.FailIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dependentIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependentIdent(coqParser.DependentIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumIdent(coqParser.SumIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareIdent(coqParser.CompareIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tAutoIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTAutoIdent(coqParser.TAutoIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dtAutoIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtAutoIdent(coqParser.DtAutoIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intuitionIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntuitionIdent(coqParser.IntuitionIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dintuition}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDintuition(coqParser.DintuitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code topIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopIdent(coqParser.TopIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bottomIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBottomIdent(coqParser.BottomIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exfalsoIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExfalsoIdent(coqParser.ExfalsoIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stdIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdIdent(coqParser.StdIdentContext ctx);
}