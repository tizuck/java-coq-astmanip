// Generated from coq.g4 by ANTLR 4.7.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link coqParser}.
 */
public interface coqListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link coqParser#coq_file}.
	 * @param ctx the parse tree
	 */
	void enterCoq_file(coqParser.Coq_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#coq_file}.
	 * @param ctx the parse tree
	 */
	void exitCoq_file(coqParser.Coq_fileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sentenceFragment}
	 * labeled alternative in {@link coqParser#coq_fragment}.
	 * @param ctx the parse tree
	 */
	void enterSentenceFragment(coqParser.SentenceFragmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sentenceFragment}
	 * labeled alternative in {@link coqParser#coq_fragment}.
	 * @param ctx the parse tree
	 */
	void exitSentenceFragment(coqParser.SentenceFragmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltacFragment}
	 * labeled alternative in {@link coqParser#coq_fragment}.
	 * @param ctx the parse tree
	 */
	void enterLtacFragment(coqParser.LtacFragmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltacFragment}
	 * labeled alternative in {@link coqParser#coq_fragment}.
	 * @param ctx the parse tree
	 */
	void exitLtacFragment(coqParser.LtacFragmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commandFragment}
	 * labeled alternative in {@link coqParser#coq_fragment}.
	 * @param ctx the parse tree
	 */
	void enterCommandFragment(coqParser.CommandFragmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commandFragment}
	 * labeled alternative in {@link coqParser#coq_fragment}.
	 * @param ctx the parse tree
	 */
	void exitCommandFragment(coqParser.CommandFragmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 */
	void enterSub(coqParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 */
	void exitSub(coqParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 */
	void enterAdd(coqParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 */
	void exitAdd(coqParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 */
	void enterMul(coqParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 */
	void exitMul(coqParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub2}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 */
	void enterSub2(coqParser.Sub2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code sub2}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 */
	void exitSub2(coqParser.Sub2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code add2}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 */
	void enterAdd2(coqParser.Add2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code add2}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 */
	void exitAdd2(coqParser.Add2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code mul2}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 */
	void enterMul2(coqParser.Mul2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code mul2}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 */
	void exitMul2(coqParser.Mul2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code sub3}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 */
	void enterSub3(coqParser.Sub3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code sub3}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 */
	void exitSub3(coqParser.Sub3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code add3}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 */
	void enterAdd3(coqParser.Add3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code add3}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 */
	void exitAdd3(coqParser.Add3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code mul3}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 */
	void enterMul3(coqParser.Mul3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code mul3}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 */
	void exitMul3(coqParser.Mul3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code dot}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 */
	void enterDot(coqParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dot}
	 * labeled alternative in {@link coqParser#bullet}.
	 * @param ctx the parse tree
	 */
	void exitDot(coqParser.DotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structCommand}
	 * labeled alternative in {@link coqParser#command}.
	 * @param ctx the parse tree
	 */
	void enterStructCommand(coqParser.StructCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structCommand}
	 * labeled alternative in {@link coqParser#command}.
	 * @param ctx the parse tree
	 */
	void exitStructCommand(coqParser.StructCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code undefinedCommand}
	 * labeled alternative in {@link coqParser#command}.
	 * @param ctx the parse tree
	 */
	void enterUndefinedCommand(coqParser.UndefinedCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code undefinedCommand}
	 * labeled alternative in {@link coqParser#command}.
	 * @param ctx the parse tree
	 */
	void exitUndefinedCommand(coqParser.UndefinedCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#undefined_command}.
	 * @param ctx the parse tree
	 */
	void enterUndefined_command(coqParser.Undefined_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#undefined_command}.
	 * @param ctx the parse tree
	 */
	void exitUndefined_command(coqParser.Undefined_commandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stdRequire}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void enterStdRequire(coqParser.StdRequireContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stdRequire}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void exitStdRequire(coqParser.StdRequireContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importRequire}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void enterImportRequire(coqParser.ImportRequireContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importRequire}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void exitImportRequire(coqParser.ImportRequireContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exportRequire}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void enterExportRequire(coqParser.ExportRequireContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exportRequire}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void exitExportRequire(coqParser.ExportRequireContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importQualidsRequire}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void enterImportQualidsRequire(coqParser.ImportQualidsRequireContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importQualidsRequire}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void exitImportQualidsRequire(coqParser.ImportQualidsRequireContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exportQualidsRequire}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void enterExportQualidsRequire(coqParser.ExportQualidsRequireContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exportQualidsRequire}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void exitExportQualidsRequire(coqParser.ExportQualidsRequireContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stdSection}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void enterStdSection(coqParser.StdSectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stdSection}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void exitStdSection(coqParser.StdSectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stdEnd}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void enterStdEnd(coqParser.StdEndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stdEnd}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void exitStdEnd(coqParser.StdEndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stdModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void enterStdModule(coqParser.StdModuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stdModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void exitStdModule(coqParser.StdModuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moduleTypeModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void enterModuleTypeModule(coqParser.ModuleTypeModuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moduleTypeModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void exitModuleTypeModule(coqParser.ModuleTypeModuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moduleTypeColonModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void enterModuleTypeColonModule(coqParser.ModuleTypeColonModuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moduleTypeColonModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void exitModuleTypeColonModule(coqParser.ModuleTypeColonModuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moduleTypesLColonModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void enterModuleTypesLColonModule(coqParser.ModuleTypesLColonModuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moduleTypesLColonModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void exitModuleTypesLColonModule(coqParser.ModuleTypesLColonModuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exportModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void enterExportModule(coqParser.ExportModuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exportModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void exitExportModule(coqParser.ExportModuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void enterImportModule(coqParser.ImportModuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void exitImportModule(coqParser.ImportModuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moduleExprDefModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void enterModuleExprDefModule(coqParser.ModuleExprDefModuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moduleExprDefModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void exitModuleExprDefModule(coqParser.ModuleExprDefModuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moduletype}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void enterModuletype(coqParser.ModuletypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moduletype}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void exitModuletype(coqParser.ModuletypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moduleTypesLGrModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void enterModuleTypesLGrModule(coqParser.ModuleTypesLGrModuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moduleTypesLGrModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void exitModuleTypesLGrModule(coqParser.ModuleTypesLGrModuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moduleExprLAddModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void enterModuleExprLAddModule(coqParser.ModuleExprLAddModuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moduleExprLAddModule}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void exitModuleExprLAddModule(coqParser.ModuleExprLAddModuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stdInclude}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void enterStdInclude(coqParser.StdIncludeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stdInclude}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void exitStdInclude(coqParser.StdIncludeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moduleTypesInclude}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void enterModuleTypesInclude(coqParser.ModuleTypesIncludeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moduleTypesInclude}
	 * labeled alternative in {@link coqParser#structural_command}.
	 * @param ctx the parse tree
	 */
	void exitModuleTypesInclude(coqParser.ModuleTypesIncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#proof_command}.
	 * @param ctx the parse tree
	 */
	void enterProof_command(coqParser.Proof_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#proof_command}.
	 * @param ctx the parse tree
	 */
	void exitProof_command(coqParser.Proof_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#collection}.
	 * @param ctx the parse tree
	 */
	void enterCollection(coqParser.CollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#collection}.
	 * @param ctx the parse tree
	 */
	void exitCollection(coqParser.CollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#section_subset_expr}.
	 * @param ctx the parse tree
	 */
	void enterSection_subset_expr(coqParser.Section_subset_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#section_subset_expr}.
	 * @param ctx the parse tree
	 */
	void exitSection_subset_expr(coqParser.Section_subset_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#tactic_invocation}.
	 * @param ctx the parse tree
	 */
	void enterTactic_invocation(coqParser.Tactic_invocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#tactic_invocation}.
	 * @param ctx the parse tree
	 */
	void exitTactic_invocation(coqParser.Tactic_invocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numBinding}
	 * labeled alternative in {@link coqParser#binding_list}.
	 * @param ctx the parse tree
	 */
	void enterNumBinding(coqParser.NumBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numBinding}
	 * labeled alternative in {@link coqParser#binding_list}.
	 * @param ctx the parse tree
	 */
	void exitNumBinding(coqParser.NumBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identBinding}
	 * labeled alternative in {@link coqParser#binding_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentBinding(coqParser.IdentBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identBinding}
	 * labeled alternative in {@link coqParser#binding_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentBinding(coqParser.IdentBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code belowTerms}
	 * labeled alternative in {@link coqParser#binding_list}.
	 * @param ctx the parse tree
	 */
	void enterBelowTerms(coqParser.BelowTermsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code belowTerms}
	 * labeled alternative in {@link coqParser#binding_list}.
	 * @param ctx the parse tree
	 */
	void exitBelowTerms(coqParser.BelowTermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#num_binding_list_body}.
	 * @param ctx the parse tree
	 */
	void enterNum_binding_list_body(coqParser.Num_binding_list_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#num_binding_list_body}.
	 * @param ctx the parse tree
	 */
	void exitNum_binding_list_body(coqParser.Num_binding_list_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#ident_binding_list_body}.
	 * @param ctx the parse tree
	 */
	void enterIdent_binding_list_body(coqParser.Ident_binding_list_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#ident_binding_list_body}.
	 * @param ctx the parse tree
	 */
	void exitIdent_binding_list_body(coqParser.Ident_binding_list_bodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code applying_theoremAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void enterApplying_theoremAtomic(coqParser.Applying_theoremAtomicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code applying_theoremAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void exitApplying_theoremAtomic(coqParser.Applying_theoremAtomicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code managing_local_contextAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void enterManaging_local_contextAtomic(coqParser.Managing_local_contextAtomicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code managing_local_contextAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void exitManaging_local_contextAtomic(coqParser.Managing_local_contextAtomicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code controlling_proof_flowAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void enterControlling_proof_flowAtomic(coqParser.Controlling_proof_flowAtomicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code controlling_proof_flowAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void exitControlling_proof_flowAtomic(coqParser.Controlling_proof_flowAtomicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case_analysis_inductionAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void enterCase_analysis_inductionAtomic(coqParser.Case_analysis_inductionAtomicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case_analysis_inductionAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void exitCase_analysis_inductionAtomic(coqParser.Case_analysis_inductionAtomicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rewriting_expressionsAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void enterRewriting_expressionsAtomic(coqParser.Rewriting_expressionsAtomicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rewriting_expressionsAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void exitRewriting_expressionsAtomic(coqParser.Rewriting_expressionsAtomicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code performing_computationAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void enterPerforming_computationAtomic(coqParser.Performing_computationAtomicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code performing_computationAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void exitPerforming_computationAtomic(coqParser.Performing_computationAtomicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conversion_tactics_hypoAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void enterConversion_tactics_hypoAtomic(coqParser.Conversion_tactics_hypoAtomicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conversion_tactics_hypoAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void exitConversion_tactics_hypoAtomic(coqParser.Conversion_tactics_hypoAtomicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code automationAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void enterAutomationAtomic(coqParser.AutomationAtomicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code automationAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void exitAutomationAtomic(coqParser.AutomationAtomicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decision_proceduresAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void enterDecision_proceduresAtomic(coqParser.Decision_proceduresAtomicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decision_proceduresAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void exitDecision_proceduresAtomic(coqParser.Decision_proceduresAtomicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checking_propertiesAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void enterChecking_propertiesAtomic(coqParser.Checking_propertiesAtomicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checking_propertiesAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void exitChecking_propertiesAtomic(coqParser.Checking_propertiesAtomicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void enterEqualityAtomic(coqParser.EqualityAtomicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void exitEqualityAtomic(coqParser.EqualityAtomicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equality_inductive_setsAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void enterEquality_inductive_setsAtomic(coqParser.Equality_inductive_setsAtomicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equality_inductive_setsAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void exitEquality_inductive_setsAtomic(coqParser.Equality_inductive_setsAtomicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inversionAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void enterInversionAtomic(coqParser.InversionAtomicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inversionAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void exitInversionAtomic(coqParser.InversionAtomicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classical_tacticsAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void enterClassical_tacticsAtomic(coqParser.Classical_tacticsAtomicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classical_tacticsAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void exitClassical_tacticsAtomic(coqParser.Classical_tacticsAtomicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code automatizingAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void enterAutomatizingAtomic(coqParser.AutomatizingAtomicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code automatizingAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void exitAutomatizingAtomic(coqParser.AutomatizingAtomicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code non_logicalAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void enterNon_logicalAtomic(coqParser.Non_logicalAtomicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code non_logicalAtomic}
	 * labeled alternative in {@link coqParser#atomic_tactic}.
	 * @param ctx the parse tree
	 */
	void exitNon_logicalAtomic(coqParser.Non_logicalAtomicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cycle}
	 * labeled alternative in {@link coqParser#non_logical}.
	 * @param ctx the parse tree
	 */
	void enterCycle(coqParser.CycleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cycle}
	 * labeled alternative in {@link coqParser#non_logical}.
	 * @param ctx the parse tree
	 */
	void exitCycle(coqParser.CycleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code swap}
	 * labeled alternative in {@link coqParser#non_logical}.
	 * @param ctx the parse tree
	 */
	void enterSwap(coqParser.SwapContext ctx);
	/**
	 * Exit a parse tree produced by the {@code swap}
	 * labeled alternative in {@link coqParser#non_logical}.
	 * @param ctx the parse tree
	 */
	void exitSwap(coqParser.SwapContext ctx);
	/**
	 * Enter a parse tree produced by the {@code revgoals}
	 * labeled alternative in {@link coqParser#non_logical}.
	 * @param ctx the parse tree
	 */
	void enterRevgoals(coqParser.RevgoalsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code revgoals}
	 * labeled alternative in {@link coqParser#non_logical}.
	 * @param ctx the parse tree
	 */
	void exitRevgoals(coqParser.RevgoalsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shelve}
	 * labeled alternative in {@link coqParser#non_logical}.
	 * @param ctx the parse tree
	 */
	void enterShelve(coqParser.ShelveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shelve}
	 * labeled alternative in {@link coqParser#non_logical}.
	 * @param ctx the parse tree
	 */
	void exitShelve(coqParser.ShelveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shelve_unifiable}
	 * labeled alternative in {@link coqParser#non_logical}.
	 * @param ctx the parse tree
	 */
	void enterShelve_unifiable(coqParser.Shelve_unifiableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shelve_unifiable}
	 * labeled alternative in {@link coqParser#non_logical}.
	 * @param ctx the parse tree
	 */
	void exitShelve_unifiable(coqParser.Shelve_unifiableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code btauto}
	 * labeled alternative in {@link coqParser#automatizing}.
	 * @param ctx the parse tree
	 */
	void enterBtauto(coqParser.BtautoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code btauto}
	 * labeled alternative in {@link coqParser#automatizing}.
	 * @param ctx the parse tree
	 */
	void exitBtauto(coqParser.BtautoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code omega}
	 * labeled alternative in {@link coqParser#automatizing}.
	 * @param ctx the parse tree
	 */
	void enterOmega(coqParser.OmegaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code omega}
	 * labeled alternative in {@link coqParser#automatizing}.
	 * @param ctx the parse tree
	 */
	void exitOmega(coqParser.OmegaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ring}
	 * labeled alternative in {@link coqParser#automatizing}.
	 * @param ctx the parse tree
	 */
	void enterRing(coqParser.RingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ring}
	 * labeled alternative in {@link coqParser#automatizing}.
	 * @param ctx the parse tree
	 */
	void exitRing(coqParser.RingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ring_simplify}
	 * labeled alternative in {@link coqParser#automatizing}.
	 * @param ctx the parse tree
	 */
	void enterRing_simplify(coqParser.Ring_simplifyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ring_simplify}
	 * labeled alternative in {@link coqParser#automatizing}.
	 * @param ctx the parse tree
	 */
	void exitRing_simplify(coqParser.Ring_simplifyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fieldAutomatizing}
	 * labeled alternative in {@link coqParser#automatizing}.
	 * @param ctx the parse tree
	 */
	void enterFieldAutomatizing(coqParser.FieldAutomatizingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fieldAutomatizing}
	 * labeled alternative in {@link coqParser#automatizing}.
	 * @param ctx the parse tree
	 */
	void exitFieldAutomatizing(coqParser.FieldAutomatizingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code field_simplify}
	 * labeled alternative in {@link coqParser#automatizing}.
	 * @param ctx the parse tree
	 */
	void enterField_simplify(coqParser.Field_simplifyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code field_simplify}
	 * labeled alternative in {@link coqParser#automatizing}.
	 * @param ctx the parse tree
	 */
	void exitField_simplify(coqParser.Field_simplifyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code field_simplify_eq}
	 * labeled alternative in {@link coqParser#automatizing}.
	 * @param ctx the parse tree
	 */
	void enterField_simplify_eq(coqParser.Field_simplify_eqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code field_simplify_eq}
	 * labeled alternative in {@link coqParser#automatizing}.
	 * @param ctx the parse tree
	 */
	void exitField_simplify_eq(coqParser.Field_simplify_eqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fourier}
	 * labeled alternative in {@link coqParser#automatizing}.
	 * @param ctx the parse tree
	 */
	void enterFourier(coqParser.FourierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fourier}
	 * labeled alternative in {@link coqParser#automatizing}.
	 * @param ctx the parse tree
	 */
	void exitFourier(coqParser.FourierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classical_left}
	 * labeled alternative in {@link coqParser#classical_tactics}.
	 * @param ctx the parse tree
	 */
	void enterClassical_left(coqParser.Classical_leftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classical_left}
	 * labeled alternative in {@link coqParser#classical_tactics}.
	 * @param ctx the parse tree
	 */
	void exitClassical_left(coqParser.Classical_leftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classical_right}
	 * labeled alternative in {@link coqParser#classical_tactics}.
	 * @param ctx the parse tree
	 */
	void enterClassical_right(coqParser.Classical_rightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classical_right}
	 * labeled alternative in {@link coqParser#classical_tactics}.
	 * @param ctx the parse tree
	 */
	void exitClassical_right(coqParser.Classical_rightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identFunctionalInversion}
	 * labeled alternative in {@link coqParser#inversion}.
	 * @param ctx the parse tree
	 */
	void enterIdentFunctionalInversion(coqParser.IdentFunctionalInversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identFunctionalInversion}
	 * labeled alternative in {@link coqParser#inversion}.
	 * @param ctx the parse tree
	 */
	void exitIdentFunctionalInversion(coqParser.IdentFunctionalInversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numFunctionalInversion}
	 * labeled alternative in {@link coqParser#inversion}.
	 * @param ctx the parse tree
	 */
	void enterNumFunctionalInversion(coqParser.NumFunctionalInversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numFunctionalInversion}
	 * labeled alternative in {@link coqParser#inversion}.
	 * @param ctx the parse tree
	 */
	void exitNumFunctionalInversion(coqParser.NumFunctionalInversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quote}
	 * labeled alternative in {@link coqParser#inversion}.
	 * @param ctx the parse tree
	 */
	void enterQuote(coqParser.QuoteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quote}
	 * labeled alternative in {@link coqParser#inversion}.
	 * @param ctx the parse tree
	 */
	void exitQuote(coqParser.QuoteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decideEquality}
	 * labeled alternative in {@link coqParser#equality_inductive_sets}.
	 * @param ctx the parse tree
	 */
	void enterDecideEquality(coqParser.DecideEqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decideEquality}
	 * labeled alternative in {@link coqParser#equality_inductive_sets}.
	 * @param ctx the parse tree
	 */
	void exitDecideEquality(coqParser.DecideEqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compare}
	 * labeled alternative in {@link coqParser#equality_inductive_sets}.
	 * @param ctx the parse tree
	 */
	void enterCompare(coqParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link coqParser#equality_inductive_sets}.
	 * @param ctx the parse tree
	 */
	void exitCompare(coqParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termSimplify_Eq}
	 * labeled alternative in {@link coqParser#equality_inductive_sets}.
	 * @param ctx the parse tree
	 */
	void enterTermSimplify_Eq(coqParser.TermSimplify_EqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termSimplify_Eq}
	 * labeled alternative in {@link coqParser#equality_inductive_sets}.
	 * @param ctx the parse tree
	 */
	void exitTermSimplify_Eq(coqParser.TermSimplify_EqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termESimplify_Eq}
	 * labeled alternative in {@link coqParser#equality_inductive_sets}.
	 * @param ctx the parse tree
	 */
	void enterTermESimplify_Eq(coqParser.TermESimplify_EqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termESimplify_Eq}
	 * labeled alternative in {@link coqParser#equality_inductive_sets}.
	 * @param ctx the parse tree
	 */
	void exitTermESimplify_Eq(coqParser.TermESimplify_EqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numSimplify_Eq}
	 * labeled alternative in {@link coqParser#equality_inductive_sets}.
	 * @param ctx the parse tree
	 */
	void enterNumSimplify_Eq(coqParser.NumSimplify_EqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numSimplify_Eq}
	 * labeled alternative in {@link coqParser#equality_inductive_sets}.
	 * @param ctx the parse tree
	 */
	void exitNumSimplify_Eq(coqParser.NumSimplify_EqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numESimplify_Eq}
	 * labeled alternative in {@link coqParser#equality_inductive_sets}.
	 * @param ctx the parse tree
	 */
	void enterNumESimplify_Eq(coqParser.NumESimplify_EqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numESimplify_Eq}
	 * labeled alternative in {@link coqParser#equality_inductive_sets}.
	 * @param ctx the parse tree
	 */
	void exitNumESimplify_Eq(coqParser.NumESimplify_EqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simplify_Eq}
	 * labeled alternative in {@link coqParser#equality_inductive_sets}.
	 * @param ctx the parse tree
	 */
	void enterSimplify_Eq(coqParser.Simplify_EqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simplify_Eq}
	 * labeled alternative in {@link coqParser#equality_inductive_sets}.
	 * @param ctx the parse tree
	 */
	void exitSimplify_Eq(coqParser.Simplify_EqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dependentRewirte}
	 * labeled alternative in {@link coqParser#equality_inductive_sets}.
	 * @param ctx the parse tree
	 */
	void enterDependentRewirte(coqParser.DependentRewirteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dependentRewirte}
	 * labeled alternative in {@link coqParser#equality_inductive_sets}.
	 * @param ctx the parse tree
	 */
	void exitDependentRewirte(coqParser.DependentRewirteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code f_equals}
	 * labeled alternative in {@link coqParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterF_equals(coqParser.F_equalsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code f_equals}
	 * labeled alternative in {@link coqParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitF_equals(coqParser.F_equalsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code reflexivity}
	 * labeled alternative in {@link coqParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterReflexivity(coqParser.ReflexivityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code reflexivity}
	 * labeled alternative in {@link coqParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitReflexivity(coqParser.ReflexivityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code symmetry}
	 * labeled alternative in {@link coqParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterSymmetry(coqParser.SymmetryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code symmetry}
	 * labeled alternative in {@link coqParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitSymmetry(coqParser.SymmetryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code transitivity}
	 * labeled alternative in {@link coqParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterTransitivity(coqParser.TransitivityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code transitivity}
	 * labeled alternative in {@link coqParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitTransitivity(coqParser.TransitivityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constrEq}
	 * labeled alternative in {@link coqParser#checking_properties}.
	 * @param ctx the parse tree
	 */
	void enterConstrEq(coqParser.ConstrEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constrEq}
	 * labeled alternative in {@link coqParser#checking_properties}.
	 * @param ctx the parse tree
	 */
	void exitConstrEq(coqParser.ConstrEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unify}
	 * labeled alternative in {@link coqParser#checking_properties}.
	 * @param ctx the parse tree
	 */
	void enterUnify(coqParser.UnifyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unify}
	 * labeled alternative in {@link coqParser#checking_properties}.
	 * @param ctx the parse tree
	 */
	void exitUnify(coqParser.UnifyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code is_Evar}
	 * labeled alternative in {@link coqParser#checking_properties}.
	 * @param ctx the parse tree
	 */
	void enterIs_Evar(coqParser.Is_EvarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code is_Evar}
	 * labeled alternative in {@link coqParser#checking_properties}.
	 * @param ctx the parse tree
	 */
	void exitIs_Evar(coqParser.Is_EvarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code has_Evar}
	 * labeled alternative in {@link coqParser#checking_properties}.
	 * @param ctx the parse tree
	 */
	void enterHas_Evar(coqParser.Has_EvarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code has_Evar}
	 * labeled alternative in {@link coqParser#checking_properties}.
	 * @param ctx the parse tree
	 */
	void exitHas_Evar(coqParser.Has_EvarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code is_Var}
	 * labeled alternative in {@link coqParser#checking_properties}.
	 * @param ctx the parse tree
	 */
	void enterIs_Var(coqParser.Is_VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code is_Var}
	 * labeled alternative in {@link coqParser#checking_properties}.
	 * @param ctx the parse tree
	 */
	void exitIs_Var(coqParser.Is_VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tAuto}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 */
	void enterTAuto(coqParser.TAutoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tAuto}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 */
	void exitTAuto(coqParser.TAutoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dTAuto}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 */
	void enterDTAuto(coqParser.DTAutoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dTAuto}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 */
	void exitDTAuto(coqParser.DTAutoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprIntuition}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 */
	void enterExprIntuition(coqParser.ExprIntuitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprIntuition}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 */
	void exitExprIntuition(coqParser.ExprIntuitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intuition}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 */
	void enterIntuition(coqParser.IntuitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intuition}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 */
	void exitIntuition(coqParser.IntuitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dtintuition}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 */
	void enterDtintuition(coqParser.DtintuitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dtintuition}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 */
	void exitDtintuition(coqParser.DtintuitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rtAuto}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 */
	void enterRtAuto(coqParser.RtAutoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rtAuto}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 */
	void exitRtAuto(coqParser.RtAutoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code firstorder}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 */
	void enterFirstorder(coqParser.FirstorderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code firstorder}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 */
	void exitFirstorder(coqParser.FirstorderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code usingFirstorder}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 */
	void enterUsingFirstorder(coqParser.UsingFirstorderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code usingFirstorder}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 */
	void exitUsingFirstorder(coqParser.UsingFirstorderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withFirstorder}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 */
	void enterWithFirstorder(coqParser.WithFirstorderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withFirstorder}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 */
	void exitWithFirstorder(coqParser.WithFirstorderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code usingWithFirstorder}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 */
	void enterUsingWithFirstorder(coqParser.UsingWithFirstorderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code usingWithFirstorder}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 */
	void exitUsingWithFirstorder(coqParser.UsingWithFirstorderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code congruence}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 */
	void enterCongruence(coqParser.CongruenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code congruence}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 */
	void exitCongruence(coqParser.CongruenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code congruenceN}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 */
	void enterCongruenceN(coqParser.CongruenceNContext ctx);
	/**
	 * Exit a parse tree produced by the {@code congruenceN}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 */
	void exitCongruenceN(coqParser.CongruenceNContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withCongruence}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 */
	void enterWithCongruence(coqParser.WithCongruenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withCongruence}
	 * labeled alternative in {@link coqParser#decision_procedures}.
	 * @param ctx the parse tree
	 */
	void exitWithCongruence(coqParser.WithCongruenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code auto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterAuto(coqParser.AutoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code auto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitAuto(coqParser.AutoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterEAuto(coqParser.EAutoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitEAuto(coqParser.EAutoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterNumAuto(coqParser.NumAutoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitNumAuto(coqParser.NumAutoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numEAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterNumEAuto(coqParser.NumEAutoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numEAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitNumEAuto(coqParser.NumEAutoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withStarAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterWithStarAuto(coqParser.WithStarAutoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withStarAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitWithStarAuto(coqParser.WithStarAutoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterWithAuto(coqParser.WithAutoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitWithAuto(coqParser.WithAutoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withEAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterWithEAuto(coqParser.WithEAutoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withEAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitWithEAuto(coqParser.WithEAutoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withStartEAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterWithStartEAuto(coqParser.WithStartEAutoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withStartEAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitWithStartEAuto(coqParser.WithStartEAutoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code usingAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterUsingAuto(coqParser.UsingAutoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code usingAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitUsingAuto(coqParser.UsingAutoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code usingEAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterUsingEAuto(coqParser.UsingEAutoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code usingEAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitUsingEAuto(coqParser.UsingEAutoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numUsingWithAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterNumUsingWithAuto(coqParser.NumUsingWithAutoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numUsingWithAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitNumUsingWithAuto(coqParser.NumUsingWithAutoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numUsingWithInfo_Auto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterNumUsingWithInfo_Auto(coqParser.NumUsingWithInfo_AutoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numUsingWithInfo_Auto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitNumUsingWithInfo_Auto(coqParser.NumUsingWithInfo_AutoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code info_auto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterInfo_auto(coqParser.Info_autoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code info_auto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitInfo_auto(coqParser.Info_autoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code debugAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterDebugAuto(coqParser.DebugAutoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code debugAuto}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitDebugAuto(coqParser.DebugAutoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trivial}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterTrivial(coqParser.TrivialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trivial}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitTrivial(coqParser.TrivialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withTrivial}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterWithTrivial(coqParser.WithTrivialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withTrivial}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitWithTrivial(coqParser.WithTrivialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withStarTrivial}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterWithStarTrivial(coqParser.WithStarTrivialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withStarTrivial}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitWithStarTrivial(coqParser.WithStarTrivialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code usingTrivial}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterUsingTrivial(coqParser.UsingTrivialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code usingTrivial}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitUsingTrivial(coqParser.UsingTrivialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code debugTrivial}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterDebugTrivial(coqParser.DebugTrivialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code debugTrivial}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitDebugTrivial(coqParser.DebugTrivialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code info_trivial}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterInfo_trivial(coqParser.Info_trivialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code info_trivial}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitInfo_trivial(coqParser.Info_trivialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withAutounfold}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterWithAutounfold(coqParser.WithAutounfoldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withAutounfold}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitWithAutounfold(coqParser.WithAutounfoldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withStartAutounfold}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterWithStartAutounfold(coqParser.WithStartAutounfoldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withStartAutounfold}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitWithStartAutounfold(coqParser.WithStartAutounfoldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withAutorewrite}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterWithAutorewrite(coqParser.WithAutorewriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withAutorewrite}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitWithAutorewrite(coqParser.WithAutorewriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withUsingAutoRewrite}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterWithUsingAutoRewrite(coqParser.WithUsingAutoRewriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withUsingAutoRewrite}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitWithUsingAutoRewrite(coqParser.WithUsingAutoRewriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withInAutoRewrite}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterWithInAutoRewrite(coqParser.WithInAutoRewriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withInAutoRewrite}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitWithInAutoRewrite(coqParser.WithInAutoRewriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withInUsingAutoRewrite}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterWithInUsingAutoRewrite(coqParser.WithInUsingAutoRewriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withInUsingAutoRewrite}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitWithInUsingAutoRewrite(coqParser.WithInUsingAutoRewriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withInClauseAutorewrite}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterWithInClauseAutorewrite(coqParser.WithInClauseAutorewriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withInClauseAutorewrite}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitWithInClauseAutorewrite(coqParser.WithInClauseAutorewriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code easy}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterEasy(coqParser.EasyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code easy}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitEasy(coqParser.EasyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code now}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterNow(coqParser.NowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code now}
	 * labeled alternative in {@link coqParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitNow(coqParser.NowContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#conversion_tactics_hypo}.
	 * @param ctx the parse tree
	 */
	void enterConversion_tactics_hypo(coqParser.Conversion_tactics_hypoContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#conversion_tactics_hypo}.
	 * @param ctx the parse tree
	 */
	void exitConversion_tactics_hypo(coqParser.Conversion_tactics_hypoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cbv}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterCbv(coqParser.CbvContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cbv}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitCbv(coqParser.CbvContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lazy}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterLazy(coqParser.LazyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lazy}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitLazy(coqParser.LazyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compute}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterCompute(coqParser.ComputeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compute}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitCompute(coqParser.ComputeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cbvQualid}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterCbvQualid(coqParser.CbvQualidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cbvQualid}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitCbvQualid(coqParser.CbvQualidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lazyQualid}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterLazyQualid(coqParser.LazyQualidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lazyQualid}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitLazyQualid(coqParser.LazyQualidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vm_compute}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterVm_compute(coqParser.Vm_computeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vm_compute}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitVm_compute(coqParser.Vm_computeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code native_compute}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterNative_compute(coqParser.Native_computeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code native_compute}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitNative_compute(coqParser.Native_computeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code red}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterRed(coqParser.RedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code red}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitRed(coqParser.RedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identRed}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterIdentRed(coqParser.IdentRedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identRed}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitIdentRed(coqParser.IdentRedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hnf}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterHnf(coqParser.HnfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hnf}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitHnf(coqParser.HnfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cbnSingleCommand}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterCbnSingleCommand(coqParser.CbnSingleCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cbnSingleCommand}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitCbnSingleCommand(coqParser.CbnSingleCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cbn}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterCbn(coqParser.CbnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cbn}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitCbn(coqParser.CbnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpl}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterSimpl(coqParser.SimplContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpl}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitSimpl(coqParser.SimplContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleIn}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterSimpleIn(coqParser.SimpleInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleIn}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitSimpleIn(coqParser.SimpleInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleStar}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStar(coqParser.SimpleStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleStar}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStar(coqParser.SimpleStarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simplPattern}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterSimplPattern(coqParser.SimplPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simplPattern}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitSimplPattern(coqParser.SimplPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleQualid}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterSimpleQualid(coqParser.SimpleQualidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleQualid}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitSimpleQualid(coqParser.SimpleQualidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simplString}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterSimplString(coqParser.SimplStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simplString}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitSimplString(coqParser.SimplStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unfoldQualidIn}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterUnfoldQualidIn(coqParser.UnfoldQualidInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unfoldQualidIn}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitUnfoldQualidIn(coqParser.UnfoldQualidInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commaUnfoldQualid}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterCommaUnfoldQualid(coqParser.CommaUnfoldQualidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commaUnfoldQualid}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitCommaUnfoldQualid(coqParser.CommaUnfoldQualidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atUnfoldQualid}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterAtUnfoldQualid(coqParser.AtUnfoldQualidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atUnfoldQualid}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitAtUnfoldQualid(coqParser.AtUnfoldQualidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unfoldString}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterUnfoldString(coqParser.UnfoldStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unfoldString}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitUnfoldString(coqParser.UnfoldStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code percUnfoldString}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterPercUnfoldString(coqParser.PercUnfoldStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code percUnfoldString}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitPercUnfoldString(coqParser.PercUnfoldStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atUnfoldString}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterAtUnfoldString(coqParser.AtUnfoldStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atUnfoldString}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitAtUnfoldString(coqParser.AtUnfoldStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fold}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterFold(coqParser.FoldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fold}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitFold(coqParser.FoldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code performingCompuationPattern}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterPerformingCompuationPattern(coqParser.PerformingCompuationPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code performingCompuationPattern}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitPerformingCompuationPattern(coqParser.PerformingCompuationPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atPattern}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterAtPattern(coqParser.AtPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atPattern}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitAtPattern(coqParser.AtPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termsPattern}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterTermsPattern(coqParser.TermsPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termsPattern}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitTermsPattern(coqParser.TermsPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atTermsPattern}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void enterAtTermsPattern(coqParser.AtTermsPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atTermsPattern}
	 * labeled alternative in {@link coqParser#performing_computation}.
	 * @param ctx the parse tree
	 */
	void exitAtTermsPattern(coqParser.AtTermsPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#qualidNumAt}.
	 * @param ctx the parse tree
	 */
	void enterQualidNumAt(coqParser.QualidNumAtContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#qualidNumAt}.
	 * @param ctx the parse tree
	 */
	void exitQualidNumAt(coqParser.QualidNumAtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termRewrite}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void enterTermRewrite(coqParser.TermRewriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termRewrite}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void exitTermRewrite(coqParser.TermRewriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termERewrite}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void enterTermERewrite(coqParser.TermERewriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termERewrite}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void exitTermERewrite(coqParser.TermERewriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rightArrowRewrite}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void enterRightArrowRewrite(coqParser.RightArrowRewriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rightArrowRewrite}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void exitRightArrowRewrite(coqParser.RightArrowRewriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftArrowRewrite}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void enterLeftArrowRewrite(coqParser.LeftArrowRewriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftArrowRewrite}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void exitLeftArrowRewrite(coqParser.LeftArrowRewriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termInClauseRewrite}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void enterTermInClauseRewrite(coqParser.TermInClauseRewriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termInClauseRewrite}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void exitTermInClauseRewrite(coqParser.TermInClauseRewriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termAtOccurencesRewrite}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void enterTermAtOccurencesRewrite(coqParser.TermAtOccurencesRewriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termAtOccurencesRewrite}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void exitTermAtOccurencesRewrite(coqParser.TermAtOccurencesRewriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termByRewrite}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void enterTermByRewrite(coqParser.TermByRewriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termByRewrite}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void exitTermByRewrite(coqParser.TermByRewriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomic_TermsRewrite}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void enterAtomic_TermsRewrite(coqParser.Atomic_TermsRewriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomic_TermsRewrite}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void exitAtomic_TermsRewrite(coqParser.Atomic_TermsRewriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termWithTacticReplace}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void enterTermWithTacticReplace(coqParser.TermWithTacticReplaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termWithTacticReplace}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void exitTermWithTacticReplace(coqParser.TermWithTacticReplaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termWithClauseReplace}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void enterTermWithClauseReplace(coqParser.TermWithClauseReplaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termWithClauseReplace}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void exitTermWithClauseReplace(coqParser.TermWithClauseReplaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termWithReplace}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void enterTermWithReplace(coqParser.TermWithReplaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termWithReplace}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void exitTermWithReplace(coqParser.TermWithReplaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rightArrowReplace}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void enterRightArrowReplace(coqParser.RightArrowReplaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rightArrowReplace}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void exitRightArrowReplace(coqParser.RightArrowReplaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftArrowReplace}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void enterLeftArrowReplace(coqParser.LeftArrowReplaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftArrowReplace}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void exitLeftArrowReplace(coqParser.LeftArrowReplaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termClauseTacticReplace}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void enterTermClauseTacticReplace(coqParser.TermClauseTacticReplaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termClauseTacticReplace}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void exitTermClauseTacticReplace(coqParser.TermClauseTacticReplaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleReplace}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void enterDoubleReplace(coqParser.DoubleReplaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleReplace}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void exitDoubleReplace(coqParser.DoubleReplaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftArrowClauseReplace}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void enterLeftArrowClauseReplace(coqParser.LeftArrowClauseReplaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftArrowClauseReplace}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void exitLeftArrowClauseReplace(coqParser.LeftArrowClauseReplaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identsSubst}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void enterIdentsSubst(coqParser.IdentsSubstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identsSubst}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void exitIdentsSubst(coqParser.IdentsSubstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subst}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void enterSubst(coqParser.SubstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subst}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void exitSubst(coqParser.SubstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termStepl}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void enterTermStepl(coqParser.TermSteplContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termStepl}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void exitTermStepl(coqParser.TermSteplContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termByStepl}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void enterTermByStepl(coqParser.TermBySteplContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termByStepl}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void exitTermByStepl(coqParser.TermBySteplContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termWithInChange}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void enterTermWithInChange(coqParser.TermWithInChangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termWithInChange}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void exitTermWithInChange(coqParser.TermWithInChangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termWithChange}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void enterTermWithChange(coqParser.TermWithChangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termWithChange}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void exitTermWithChange(coqParser.TermWithChangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termInChange}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void enterTermInChange(coqParser.TermInChangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termInChange}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void exitTermInChange(coqParser.TermInChangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termAtWithChange}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void enterTermAtWithChange(coqParser.TermAtWithChangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termAtWithChange}
	 * labeled alternative in {@link coqParser#rewriting_expressions}.
	 * @param ctx the parse tree
	 */
	void exitTermAtWithChange(coqParser.TermAtWithChangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code question}
	 * labeled alternative in {@link coqParser#rew_prefix}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(coqParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code question}
	 * labeled alternative in {@link coqParser#rew_prefix}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(coqParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exclamation}
	 * labeled alternative in {@link coqParser#rew_prefix}.
	 * @param ctx the parse tree
	 */
	void enterExclamation(coqParser.ExclamationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exclamation}
	 * labeled alternative in {@link coqParser#rew_prefix}.
	 * @param ctx the parse tree
	 */
	void exitExclamation(coqParser.ExclamationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermDestruct(coqParser.TermDestructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermDestruct(coqParser.TermDestructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termEDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermEDestruct(coqParser.TermEDestructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termEDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermEDestruct(coqParser.TermEDestructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termsDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermsDestruct(coqParser.TermsDestructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termsDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermsDestruct(coqParser.TermsDestructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termAsDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermAsDestruct(coqParser.TermAsDestructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termAsDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermAsDestruct(coqParser.TermAsDestructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termAsListDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermAsListDestruct(coqParser.TermAsListDestructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termAsListDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermAsListDestruct(coqParser.TermAsListDestructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termEqDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermEqDestruct(coqParser.TermEqDestructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termEqDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermEqDestruct(coqParser.TermEqDestructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termWithDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermWithDestruct(coqParser.TermWithDestructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termWithDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermWithDestruct(coqParser.TermWithDestructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termWithAsDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermWithAsDestruct(coqParser.TermWithAsDestructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termWithAsDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermWithAsDestruct(coqParser.TermWithAsDestructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termUsingDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermUsingDestruct(coqParser.TermUsingDestructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termUsingDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermUsingDestruct(coqParser.TermUsingDestructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termInDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermInDestruct(coqParser.TermInDestructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termInDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermInDestruct(coqParser.TermInDestructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termAtDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermAtDestruct(coqParser.TermAtDestructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termAtDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermAtDestruct(coqParser.TermAtDestructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterCase(coqParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitCase(coqParser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ecase}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterEcase(coqParser.EcaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ecase}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitEcase(coqParser.EcaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDestruct(coqParser.SimpleDestructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleDestruct}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDestruct(coqParser.SimpleDestructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case_Eq}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterCase_Eq(coqParser.Case_EqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case_Eq}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitCase_Eq(coqParser.Case_EqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermInduction(coqParser.TermInductionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermInduction(coqParser.TermInductionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termAsInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermAsInduction(coqParser.TermAsInductionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termAsInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermAsInduction(coqParser.TermAsInductionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termUsingInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermUsingInduction(coqParser.TermUsingInductionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termUsingInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermUsingInduction(coqParser.TermUsingInductionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termsUsingInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermsUsingInduction(coqParser.TermsUsingInductionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termsUsingInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermsUsingInduction(coqParser.TermsUsingInductionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termInInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermInInduction(coqParser.TermInInductionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termInInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermInInduction(coqParser.TermInInductionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termEInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermEInduction(coqParser.TermEInductionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termEInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermEInduction(coqParser.TermEInductionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withAsUsingInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterWithAsUsingInduction(coqParser.WithAsUsingInductionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withAsUsingInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitWithAsUsingInduction(coqParser.WithAsUsingInductionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termElim}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermElim(coqParser.TermElimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termElim}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermElim(coqParser.TermElimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termEElim}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermEElim(coqParser.TermEElimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termEElim}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermEElim(coqParser.TermEElimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termWithElim}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermWithElim(coqParser.TermWithElimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termWithElim}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermWithElim(coqParser.TermWithElimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termUsingElim}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermUsingElim(coqParser.TermUsingElimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termUsingElim}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermUsingElim(coqParser.TermUsingElimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withUsingWithElim}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterWithUsingWithElim(coqParser.WithUsingWithElimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withUsingWithElim}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitWithUsingWithElim(coqParser.WithUsingWithElimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withUsingWithEElim}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterWithUsingWithEElim(coqParser.WithUsingWithEElimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withUsingWithEElim}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitWithUsingWithEElim(coqParser.WithUsingWithEElimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elimType}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterElimType(coqParser.ElimTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elimType}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitElimType(coqParser.ElimTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identSimpleInducti}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterIdentSimpleInducti(coqParser.IdentSimpleInductiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identSimpleInducti}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitIdentSimpleInducti(coqParser.IdentSimpleInductiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numSimpleInducti}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterNumSimpleInducti(coqParser.NumSimpleInductiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numSimpleInducti}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitNumSimpleInducti(coqParser.NumSimpleInductiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identDoubleInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterIdentDoubleInduction(coqParser.IdentDoubleInductionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identDoubleInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitIdentDoubleInduction(coqParser.IdentDoubleInductionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numDoubleInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterNumDoubleInduction(coqParser.NumDoubleInductionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numDoubleInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitNumDoubleInduction(coqParser.NumDoubleInductionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dependentInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterDependentInduction(coqParser.DependentInductionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dependentInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitDependentInduction(coqParser.DependentInductionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dependentDestruction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterDependentDestruction(coqParser.DependentDestructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dependentDestruction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitDependentDestruction(coqParser.DependentDestructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionalInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterFunctionalInduction(coqParser.FunctionalInductionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionalInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitFunctionalInduction(coqParser.FunctionalInductionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termDiscriminate}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermDiscriminate(coqParser.TermDiscriminateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termDiscriminate}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermDiscriminate(coqParser.TermDiscriminateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termEDiscriminate}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermEDiscriminate(coqParser.TermEDiscriminateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termEDiscriminate}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermEDiscriminate(coqParser.TermEDiscriminateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numDiscriminate}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterNumDiscriminate(coqParser.NumDiscriminateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numDiscriminate}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitNumDiscriminate(coqParser.NumDiscriminateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numEDiscriminate}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterNumEDiscriminate(coqParser.NumEDiscriminateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numEDiscriminate}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitNumEDiscriminate(coqParser.NumEDiscriminateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code discriminate}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterDiscriminate(coqParser.DiscriminateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code discriminate}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitDiscriminate(coqParser.DiscriminateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termInjection}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermInjection(coqParser.TermInjectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termInjection}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermInjection(coqParser.TermInjectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termEInjection}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermEInjection(coqParser.TermEInjectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termEInjection}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermEInjection(coqParser.TermEInjectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numEInjection}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterNumEInjection(coqParser.NumEInjectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numEInjection}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitNumEInjection(coqParser.NumEInjectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numInjection}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterNumInjection(coqParser.NumInjectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numInjection}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitNumInjection(coqParser.NumInjectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code injection}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterInjection(coqParser.InjectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code injection}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitInjection(coqParser.InjectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termAsInjection}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermAsInjection(coqParser.TermAsInjectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termAsInjection}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermAsInjection(coqParser.TermAsInjectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termEInjectionAs}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterTermEInjectionAs(coqParser.TermEInjectionAsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termEInjectionAs}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitTermEInjectionAs(coqParser.TermEInjectionAsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asInjection}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterAsInjection(coqParser.AsInjectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asInjection}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitAsInjection(coqParser.AsInjectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asEInjection}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterAsEInjection(coqParser.AsEInjectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asEInjection}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitAsEInjection(coqParser.AsEInjectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identInversion}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterIdentInversion(coqParser.IdentInversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identInversion}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitIdentInversion(coqParser.IdentInversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numInversion}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterNumInversion(coqParser.NumInversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numInversion}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitNumInversion(coqParser.NumInversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identInversion_Clear}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterIdentInversion_Clear(coqParser.IdentInversion_ClearContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identInversion_Clear}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitIdentInversion_Clear(coqParser.IdentInversion_ClearContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numInversion_Clear}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterNumInversion_Clear(coqParser.NumInversion_ClearContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numInversion_Clear}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitNumInversion_Clear(coqParser.NumInversion_ClearContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asIdentInversion}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterAsIdentInversion(coqParser.AsIdentInversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asIdentInversion}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitAsIdentInversion(coqParser.AsIdentInversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asNumInversion}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterAsNumInversion(coqParser.AsNumInversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asNumInversion}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitAsNumInversion(coqParser.AsNumInversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identAsInversion_Clear}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterIdentAsInversion_Clear(coqParser.IdentAsInversion_ClearContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identAsInversion_Clear}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitIdentAsInversion_Clear(coqParser.IdentAsInversion_ClearContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numAsInversion_Clear}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterNumAsInversion_Clear(coqParser.NumAsInversion_ClearContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numAsInversion_Clear}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitNumAsInversion_Clear(coqParser.NumAsInversion_ClearContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identInInversion_Clear}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterIdentInInversion_Clear(coqParser.IdentInInversion_ClearContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identInInversion_Clear}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitIdentInInversion_Clear(coqParser.IdentInInversion_ClearContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identInInversion}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterIdentInInversion(coqParser.IdentInInversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identInInversion}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitIdentInInversion(coqParser.IdentInInversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asInInversion}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterAsInInversion(coqParser.AsInInversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asInInversion}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitAsInInversion(coqParser.AsInInversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asInInversion_Clear}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterAsInInversion_Clear(coqParser.AsInInversion_ClearContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asInInversion_Clear}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitAsInInversion_Clear(coqParser.AsInInversion_ClearContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dependentInversion}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterDependentInversion(coqParser.DependentInversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dependentInversion}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitDependentInversion(coqParser.DependentInversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dependentInversion_Clear}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterDependentInversion_Clear(coqParser.DependentInversion_ClearContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dependentInversion_Clear}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitDependentInversion_Clear(coqParser.DependentInversion_ClearContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleInversion}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterSimpleInversion(coqParser.SimpleInversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleInversion}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitSimpleInversion(coqParser.SimpleInversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inversionUsing}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterInversionUsing(coqParser.InversionUsingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inversionUsing}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitInversionUsing(coqParser.InversionUsingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inversion_Sigma}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterInversion_Sigma(coqParser.Inversion_SigmaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inversion_Sigma}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitInversion_Sigma(coqParser.Inversion_SigmaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fixCaseAnalysisInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterFixCaseAnalysisInduction(coqParser.FixCaseAnalysisInductionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fixCaseAnalysisInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitFixCaseAnalysisInduction(coqParser.FixCaseAnalysisInductionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cofixCaseAnalysisInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void enterCofixCaseAnalysisInduction(coqParser.CofixCaseAnalysisInductionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cofixCaseAnalysisInduction}
	 * labeled alternative in {@link coqParser#case_analysis_induction}.
	 * @param ctx the parse tree
	 */
	void exitCofixCaseAnalysisInduction(coqParser.CofixCaseAnalysisInductionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identAssert}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterIdentAssert(coqParser.IdentAssertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identAssert}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitIdentAssert(coqParser.IdentAssertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termAssert}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterTermAssert(coqParser.TermAssertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termAssert}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitTermAssert(coqParser.TermAssertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code byAssert}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterByAssert(coqParser.ByAssertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code byAssert}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitByAssert(coqParser.ByAssertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asAssert}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterAsAssert(coqParser.AsAssertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asAssert}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitAsAssert(coqParser.AsAssertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asByAssert}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterAsByAssert(coqParser.AsByAssertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asByAssert}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitAsByAssert(coqParser.AsByAssertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asByEAssert}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterAsByEAssert(coqParser.AsByEAssertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asByEAssert}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitAsByEAssert(coqParser.AsByEAssertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identDefAssert}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterIdentDefAssert(coqParser.IdentDefAssertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identDefAssert}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitIdentDefAssert(coqParser.IdentDefAssertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code poseProof}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterPoseProof(coqParser.PoseProofContext ctx);
	/**
	 * Exit a parse tree produced by the {@code poseProof}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitPoseProof(coqParser.PoseProofContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ePoseProof}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterEPoseProof(coqParser.EPoseProofContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ePoseProof}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitEPoseProof(coqParser.EPoseProofContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterIdentEnough(coqParser.IdentEnoughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitIdentEnough(coqParser.IdentEnoughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterTermEnough(coqParser.TermEnoughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitTermEnough(coqParser.TermEnoughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterAsEnough(coqParser.AsEnoughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitAsEnough(coqParser.AsEnoughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identByEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterIdentByEnough(coqParser.IdentByEnoughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identByEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitIdentByEnough(coqParser.IdentByEnoughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identByEEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterIdentByEEnough(coqParser.IdentByEEnoughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identByEEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitIdentByEEnough(coqParser.IdentByEEnoughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termByEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterTermByEnough(coqParser.TermByEnoughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termByEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitTermByEnough(coqParser.TermByEnoughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termByEEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterTermByEEnough(coqParser.TermByEEnoughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termByEEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitTermByEEnough(coqParser.TermByEEnoughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asByEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterAsByEnough(coqParser.AsByEnoughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asByEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitAsByEnough(coqParser.AsByEnoughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asByEEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterAsByEEnough(coqParser.AsByEEnoughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asByEEnough}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitAsByEEnough(coqParser.AsByEEnoughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cut}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterCut(coqParser.CutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cut}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitCut(coqParser.CutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specialize}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterSpecialize(coqParser.SpecializeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specialize}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitSpecialize(coqParser.SpecializeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withSpecialize}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterWithSpecialize(coqParser.WithSpecializeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withSpecialize}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitWithSpecialize(coqParser.WithSpecializeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termGeneralize}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterTermGeneralize(coqParser.TermGeneralizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termGeneralize}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitTermGeneralize(coqParser.TermGeneralizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termAtGeneralize}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterTermAtGeneralize(coqParser.TermAtGeneralizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termAtGeneralize}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitTermAtGeneralize(coqParser.TermAtGeneralizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termAsGeneralize}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterTermAsGeneralize(coqParser.TermAsGeneralizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termAsGeneralize}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitTermAsGeneralize(coqParser.TermAsGeneralizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termAtAsGeneralize}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterTermAtAsGeneralize(coqParser.TermAtAsGeneralizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termAtAsGeneralize}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitTermAtAsGeneralize(coqParser.TermAtAsGeneralizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code generalizeDependent}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterGeneralizeDependent(coqParser.GeneralizeDependentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code generalizeDependent}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitGeneralizeDependent(coqParser.GeneralizeDependentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code evar}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterEvar(coqParser.EvarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code evar}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitEvar(coqParser.EvarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identInstantiate}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterIdentInstantiate(coqParser.IdentInstantiateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identInstantiate}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitIdentInstantiate(coqParser.IdentInstantiateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numInstantiate}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterNumInstantiate(coqParser.NumInstantiateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numInstantiate}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitNumInstantiate(coqParser.NumInstantiateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numInInstantiate}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterNumInInstantiate(coqParser.NumInInstantiateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numInInstantiate}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitNumInInstantiate(coqParser.NumInInstantiateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueInstantiate}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterValueInstantiate(coqParser.ValueInstantiateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueInstantiate}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitValueInstantiate(coqParser.ValueInstantiateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeInstantiate}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterTypeInstantiate(coqParser.TypeInstantiateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeInstantiate}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitTypeInstantiate(coqParser.TypeInstantiateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instantiate}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterInstantiate(coqParser.InstantiateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instantiate}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitInstantiate(coqParser.InstantiateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code admit}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterAdmit(coqParser.AdmitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code admit}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitAdmit(coqParser.AdmitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code give_up}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterGive_up(coqParser.Give_upContext ctx);
	/**
	 * Exit a parse tree produced by the {@code give_up}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitGive_up(coqParser.Give_upContext ctx);
	/**
	 * Enter a parse tree produced by the {@code absurd}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterAbsurd(coqParser.AbsurdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code absurd}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitAbsurd(coqParser.AbsurdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code contradiction}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterContradiction(coqParser.ContradictionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code contradiction}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitContradiction(coqParser.ContradictionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code contradict}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterContradict(coqParser.ContradictContext ctx);
	/**
	 * Exit a parse tree produced by the {@code contradict}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitContradict(coqParser.ContradictContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exfalso}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void enterExfalso(coqParser.ExfalsoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exfalso}
	 * labeled alternative in {@link coqParser#controlling_proof_flow}.
	 * @param ctx the parse tree
	 */
	void exitExfalso(coqParser.ExfalsoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intro}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterIntro(coqParser.IntroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intro}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitIntro(coqParser.IntroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intros}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterIntros(coqParser.IntrosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intros}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitIntros(coqParser.IntrosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identIntros}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterIdentIntros(coqParser.IdentIntrosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identIntros}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitIdentIntros(coqParser.IdentIntrosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identsIntros}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterIdentsIntros(coqParser.IdentsIntrosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identsIntros}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitIdentsIntros(coqParser.IdentsIntrosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code untilIdentIntros}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterUntilIdentIntros(coqParser.UntilIdentIntrosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code untilIdentIntros}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitUntilIdentIntros(coqParser.UntilIdentIntrosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code untilNumIntros}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterUntilNumIntros(coqParser.UntilNumIntrosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code untilNumIntros}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitUntilNumIntros(coqParser.UntilNumIntrosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code afterIdentIntro}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterAfterIdentIntro(coqParser.AfterIdentIntroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code afterIdentIntro}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitAfterIdentIntro(coqParser.AfterIdentIntroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code beforeIdentIntro}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterBeforeIdentIntro(coqParser.BeforeIdentIntroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code beforeIdentIntro}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitBeforeIdentIntro(coqParser.BeforeIdentIntroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atTopIntro}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterAtTopIntro(coqParser.AtTopIntroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atTopIntro}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitAtTopIntro(coqParser.AtTopIntroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atBottomIntro}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterAtBottomIntro(coqParser.AtBottomIntroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atBottomIntro}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitAtBottomIntro(coqParser.AtBottomIntroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identAfterIdentIntro}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterIdentAfterIdentIntro(coqParser.IdentAfterIdentIntroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identAfterIdentIntro}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitIdentAfterIdentIntro(coqParser.IdentAfterIdentIntroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identBeforeIdentIntro}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterIdentBeforeIdentIntro(coqParser.IdentBeforeIdentIntroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identBeforeIdentIntro}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitIdentBeforeIdentIntro(coqParser.IdentBeforeIdentIntroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identIntro}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterIdentIntro(coqParser.IdentIntroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identIntro}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitIdentIntro(coqParser.IdentIntroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code introPatternListIntros}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterIntroPatternListIntros(coqParser.IntroPatternListIntrosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code introPatternListIntros}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitIntroPatternListIntros(coqParser.IntroPatternListIntrosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identsClear}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterIdentsClear(coqParser.IdentsClearContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identsClear}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitIdentsClear(coqParser.IdentsClearContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clearbody}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterClearbody(coqParser.ClearbodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clearbody}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitClearbody(coqParser.ClearbodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negativIdentsClear}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterNegativIdentsClear(coqParser.NegativIdentsClearContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negativIdentsClear}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitNegativIdentsClear(coqParser.NegativIdentsClearContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clear}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterClear(coqParser.ClearContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clear}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitClear(coqParser.ClearContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dependentClear}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterDependentClear(coqParser.DependentClearContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dependentClear}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitDependentClear(coqParser.DependentClearContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identsRevert}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterIdentsRevert(coqParser.IdentsRevertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identsRevert}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitIdentsRevert(coqParser.IdentsRevertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dependentRevert}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterDependentRevert(coqParser.DependentRevertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dependentRevert}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitDependentRevert(coqParser.DependentRevertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code afterMove}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterAfterMove(coqParser.AfterMoveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code afterMove}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitAfterMove(coqParser.AfterMoveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code beforeMove}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterBeforeMove(coqParser.BeforeMoveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code beforeMove}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitBeforeMove(coqParser.BeforeMoveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code topMove}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterTopMove(coqParser.TopMoveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code topMove}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitTopMove(coqParser.TopMoveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bottomMove}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterBottomMove(coqParser.BottomMoveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bottomMove}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitBottomMove(coqParser.BottomMoveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rename}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterRename(coqParser.RenameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rename}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitRename(coqParser.RenameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identSet}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterIdentSet(coqParser.IdentSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identSet}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitIdentSet(coqParser.IdentSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identInSet}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterIdentInSet(coqParser.IdentInSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identInSet}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitIdentInSet(coqParser.IdentInSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identDefSet}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterIdentDefSet(coqParser.IdentDefSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identDefSet}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitIdentDefSet(coqParser.IdentDefSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termSet}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterTermSet(coqParser.TermSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termSet}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitTermSet(coqParser.TermSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identDefInSet}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterIdentDefInSet(coqParser.IdentDefInSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identDefInSet}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitIdentDefInSet(coqParser.IdentDefInSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identDefInESet}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterIdentDefInESet(coqParser.IdentDefInESetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identDefInESet}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitIdentDefInESet(coqParser.IdentDefInESetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termInSet}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterTermInSet(coqParser.TermInSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termInSet}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitTermInSet(coqParser.TermInSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termInESet}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterTermInESet(coqParser.TermInESetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termInESet}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitTermInESet(coqParser.TermInESetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asRemember}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterAsRemember(coqParser.AsRememberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asRemember}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitAsRemember(coqParser.AsRememberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asERemember}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterAsERemember(coqParser.AsERememberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asERemember}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitAsERemember(coqParser.AsERememberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asEqnRemember}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterAsEqnRemember(coqParser.AsEqnRememberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asEqnRemember}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitAsEqnRemember(coqParser.AsEqnRememberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asEqnERemember}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterAsEqnERemember(coqParser.AsEqnERememberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asEqnERemember}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitAsEqnERemember(coqParser.AsEqnERememberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asInRemember}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterAsInRemember(coqParser.AsInRememberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asInRemember}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitAsInRemember(coqParser.AsInRememberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asInERemember}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterAsInERemember(coqParser.AsInERememberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asInERemember}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitAsInERemember(coqParser.AsInERememberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identDefPose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterIdentDefPose(coqParser.IdentDefPoseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identDefPose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitIdentDefPose(coqParser.IdentDefPoseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identDefEPose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterIdentDefEPose(coqParser.IdentDefEPoseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identDefEPose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitIdentDefEPose(coqParser.IdentDefEPoseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identBinderDefPose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterIdentBinderDefPose(coqParser.IdentBinderDefPoseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identBinderDefPose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitIdentBinderDefPose(coqParser.IdentBinderDefPoseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identBinderDefEPose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterIdentBinderDefEPose(coqParser.IdentBinderDefEPoseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identBinderDefEPose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitIdentBinderDefEPose(coqParser.IdentBinderDefEPoseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termPose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterTermPose(coqParser.TermPoseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termPose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitTermPose(coqParser.TermPoseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termEPose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterTermEPose(coqParser.TermEPoseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termEPose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitTermEPose(coqParser.TermEPoseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code qualidsDecompose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterQualidsDecompose(coqParser.QualidsDecomposeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code qualidsDecompose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitQualidsDecompose(coqParser.QualidsDecomposeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sumDecompose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterSumDecompose(coqParser.SumDecomposeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sumDecompose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitSumDecompose(coqParser.SumDecomposeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recordDecompose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void enterRecordDecompose(coqParser.RecordDecomposeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recordDecompose}
	 * labeled alternative in {@link coqParser#managing_local_context}.
	 * @param ctx the parse tree
	 */
	void exitRecordDecompose(coqParser.RecordDecomposeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exact}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterExact(coqParser.ExactContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exact}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitExact(coqParser.ExactContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eexact}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterEexact(coqParser.EexactContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eexact}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitEexact(coqParser.EexactContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assumptionApplyingTheorem}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterAssumptionApplyingTheorem(coqParser.AssumptionApplyingTheoremContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assumptionApplyingTheorem}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitAssumptionApplyingTheorem(coqParser.AssumptionApplyingTheoremContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eassumption}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterEassumption(coqParser.EassumptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eassumption}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitEassumption(coqParser.EassumptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refine}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterRefine(coqParser.RefineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refine}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitRefine(coqParser.RefineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterWithApply(coqParser.WithApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitWithApply(coqParser.WithApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termsApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterTermsApply(coqParser.TermsApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termsApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitTermsApply(coqParser.TermsApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termEApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterTermEApply(coqParser.TermEApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termEApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitTermEApply(coqParser.TermEApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termSimpleApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterTermSimpleApply(coqParser.TermSimpleApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termSimpleApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitTermSimpleApply(coqParser.TermSimpleApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termWithSimpleApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterTermWithSimpleApply(coqParser.TermWithSimpleApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termWithSimpleApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitTermWithSimpleApply(coqParser.TermWithSimpleApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termWithSimpleEApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterTermWithSimpleEApply(coqParser.TermWithSimpleEApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termWithSimpleEApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitTermWithSimpleEApply(coqParser.TermWithSimpleEApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termWithApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterTermWithApply(coqParser.TermWithApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termWithApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitTermWithApply(coqParser.TermWithApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termWithEApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterTermWithEApply(coqParser.TermWithEApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termWithEApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitTermWithEApply(coqParser.TermWithEApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterLApply(coqParser.LApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitLApply(coqParser.LApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterInApply(coqParser.InApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitInApply(coqParser.InApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withInSimpleApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterWithInSimpleApply(coqParser.WithInSimpleApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withInSimpleApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitWithInSimpleApply(coqParser.WithInSimpleApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withInApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterWithInApply(coqParser.WithInApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withInApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitWithInApply(coqParser.WithInApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withInEApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterWithInEApply(coqParser.WithInEApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withInEApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitWithInEApply(coqParser.WithInEApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withInSimpleEApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterWithInSimpleEApply(coqParser.WithInSimpleEApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withInSimpleEApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitWithInSimpleEApply(coqParser.WithInSimpleEApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termInSimpleApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterTermInSimpleApply(coqParser.TermInSimpleApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termInSimpleApply}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitTermInSimpleApply(coqParser.TermInSimpleApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constructor}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(coqParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constructor}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(coqParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code split}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterSplit(coqParser.SplitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code split}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitSplit(coqParser.SplitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termExists}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterTermExists(coqParser.TermExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termExists}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitTermExists(coqParser.TermExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bindingsExists}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterBindingsExists(coqParser.BindingsExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bindingsExists}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitBindingsExists(coqParser.BindingsExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code left}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterLeft(coqParser.LeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code left}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitLeft(coqParser.LeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code right}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterRight(coqParser.RightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code right}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitRight(coqParser.RightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code econstructor}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterEconstructor(coqParser.EconstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code econstructor}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitEconstructor(coqParser.EconstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eexists}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterEexists(coqParser.EexistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eexists}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitEexists(coqParser.EexistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eleft}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterEleft(coqParser.EleftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eleft}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitEleft(coqParser.EleftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eright}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void enterEright(coqParser.ErightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eright}
	 * labeled alternative in {@link coqParser#applying_theorem}.
	 * @param ctx the parse tree
	 */
	void exitEright(coqParser.ErightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stdGoalOccurence}
	 * labeled alternative in {@link coqParser#goal_occurrences}.
	 * @param ctx the parse tree
	 */
	void enterStdGoalOccurence(coqParser.StdGoalOccurenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stdGoalOccurence}
	 * labeled alternative in {@link coqParser#goal_occurrences}.
	 * @param ctx the parse tree
	 */
	void exitStdGoalOccurence(coqParser.StdGoalOccurenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code starDerivedGoalOccurence}
	 * labeled alternative in {@link coqParser#goal_occurrences}.
	 * @param ctx the parse tree
	 */
	void enterStarDerivedGoalOccurence(coqParser.StarDerivedGoalOccurenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code starDerivedGoalOccurence}
	 * labeled alternative in {@link coqParser#goal_occurrences}.
	 * @param ctx the parse tree
	 */
	void exitStarDerivedGoalOccurence(coqParser.StarDerivedGoalOccurenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code star}
	 * labeled alternative in {@link coqParser#goal_occurrences}.
	 * @param ctx the parse tree
	 */
	void enterStar(coqParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code star}
	 * labeled alternative in {@link coqParser#goal_occurrences}.
	 * @param ctx the parse tree
	 */
	void exitStar(coqParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#at_occurences}.
	 * @param ctx the parse tree
	 */
	void enterAt_occurences(coqParser.At_occurencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#at_occurences}.
	 * @param ctx the parse tree
	 */
	void exitAt_occurences(coqParser.At_occurencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#occurences}.
	 * @param ctx the parse tree
	 */
	void enterOccurences(coqParser.OccurencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#occurences}.
	 * @param ctx the parse tree
	 */
	void exitOccurences(coqParser.OccurencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#first_goal_occurences_body}.
	 * @param ctx the parse tree
	 */
	void enterFirst_goal_occurences_body(coqParser.First_goal_occurences_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#first_goal_occurences_body}.
	 * @param ctx the parse tree
	 */
	void exitFirst_goal_occurences_body(coqParser.First_goal_occurences_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#second_goal_occurences_body}.
	 * @param ctx the parse tree
	 */
	void enterSecond_goal_occurences_body(coqParser.Second_goal_occurences_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#second_goal_occurences_body}.
	 * @param ctx the parse tree
	 */
	void exitSecond_goal_occurences_body(coqParser.Second_goal_occurences_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#second_goal_occurences_body_body}.
	 * @param ctx the parse tree
	 */
	void enterSecond_goal_occurences_body_body(coqParser.Second_goal_occurences_body_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#second_goal_occurences_body_body}.
	 * @param ctx the parse tree
	 */
	void exitSecond_goal_occurences_body_body(coqParser.Second_goal_occurences_body_bodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code namingIntroPattern}
	 * labeled alternative in {@link coqParser#intro_pattern}.
	 * @param ctx the parse tree
	 */
	void enterNamingIntroPattern(coqParser.NamingIntroPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code namingIntroPattern}
	 * labeled alternative in {@link coqParser#intro_pattern}.
	 * @param ctx the parse tree
	 */
	void exitNamingIntroPattern(coqParser.NamingIntroPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code percIntroPattern}
	 * labeled alternative in {@link coqParser#intro_pattern}.
	 * @param ctx the parse tree
	 */
	void enterPercIntroPattern(coqParser.PercIntroPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code percIntroPattern}
	 * labeled alternative in {@link coqParser#intro_pattern}.
	 * @param ctx the parse tree
	 */
	void exitPercIntroPattern(coqParser.PercIntroPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actionIntroPattern}
	 * labeled alternative in {@link coqParser#intro_pattern}.
	 * @param ctx the parse tree
	 */
	void enterActionIntroPattern(coqParser.ActionIntroPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actionIntroPattern}
	 * labeled alternative in {@link coqParser#intro_pattern}.
	 * @param ctx the parse tree
	 */
	void exitActionIntroPattern(coqParser.ActionIntroPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code underscoreIntroPattern}
	 * labeled alternative in {@link coqParser#intro_pattern}.
	 * @param ctx the parse tree
	 */
	void enterUnderscoreIntroPattern(coqParser.UnderscoreIntroPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code underscoreIntroPattern}
	 * labeled alternative in {@link coqParser#intro_pattern}.
	 * @param ctx the parse tree
	 */
	void exitUnderscoreIntroPattern(coqParser.UnderscoreIntroPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code disjConjActionIntroPattern}
	 * labeled alternative in {@link coqParser#action_intro_pattern}.
	 * @param ctx the parse tree
	 */
	void enterDisjConjActionIntroPattern(coqParser.DisjConjActionIntroPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code disjConjActionIntroPattern}
	 * labeled alternative in {@link coqParser#action_intro_pattern}.
	 * @param ctx the parse tree
	 */
	void exitDisjConjActionIntroPattern(coqParser.DisjConjActionIntroPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalActionIntroPattern}
	 * labeled alternative in {@link coqParser#action_intro_pattern}.
	 * @param ctx the parse tree
	 */
	void enterEqualActionIntroPattern(coqParser.EqualActionIntroPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalActionIntroPattern}
	 * labeled alternative in {@link coqParser#action_intro_pattern}.
	 * @param ctx the parse tree
	 */
	void exitEqualActionIntroPattern(coqParser.EqualActionIntroPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code introPatternListsDisjConjIntroPattern}
	 * labeled alternative in {@link coqParser#disj_conj_intro_pattern}.
	 * @param ctx the parse tree
	 */
	void enterIntroPatternListsDisjConjIntroPattern(coqParser.IntroPatternListsDisjConjIntroPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code introPatternListsDisjConjIntroPattern}
	 * labeled alternative in {@link coqParser#disj_conj_intro_pattern}.
	 * @param ctx the parse tree
	 */
	void exitIntroPatternListsDisjConjIntroPattern(coqParser.IntroPatternListsDisjConjIntroPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code introPatternsDisjConjIntroPattern}
	 * labeled alternative in {@link coqParser#disj_conj_intro_pattern}.
	 * @param ctx the parse tree
	 */
	void enterIntroPatternsDisjConjIntroPattern(coqParser.IntroPatternsDisjConjIntroPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code introPatternsDisjConjIntroPattern}
	 * labeled alternative in {@link coqParser#disj_conj_intro_pattern}.
	 * @param ctx the parse tree
	 */
	void exitIntroPatternsDisjConjIntroPattern(coqParser.IntroPatternsDisjConjIntroPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andIntroPatternDisjConjIntroPattern}
	 * labeled alternative in {@link coqParser#disj_conj_intro_pattern}.
	 * @param ctx the parse tree
	 */
	void enterAndIntroPatternDisjConjIntroPattern(coqParser.AndIntroPatternDisjConjIntroPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andIntroPatternDisjConjIntroPattern}
	 * labeled alternative in {@link coqParser#disj_conj_intro_pattern}.
	 * @param ctx the parse tree
	 */
	void exitAndIntroPatternDisjConjIntroPattern(coqParser.AndIntroPatternDisjConjIntroPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eq}
	 * labeled alternative in {@link coqParser#equal_intro_pattern}.
	 * @param ctx the parse tree
	 */
	void enterEq(coqParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eq}
	 * labeled alternative in {@link coqParser#equal_intro_pattern}.
	 * @param ctx the parse tree
	 */
	void exitEq(coqParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link coqParser#equal_intro_pattern}.
	 * @param ctx the parse tree
	 */
	void enterOr(coqParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link coqParser#equal_intro_pattern}.
	 * @param ctx the parse tree
	 */
	void exitOr(coqParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identNaming}
	 * labeled alternative in {@link coqParser#naming_intro_pattern}.
	 * @param ctx the parse tree
	 */
	void enterIdentNaming(coqParser.IdentNamingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identNaming}
	 * labeled alternative in {@link coqParser#naming_intro_pattern}.
	 * @param ctx the parse tree
	 */
	void exitIdentNaming(coqParser.IdentNamingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code questionIdentNaming}
	 * labeled alternative in {@link coqParser#naming_intro_pattern}.
	 * @param ctx the parse tree
	 */
	void enterQuestionIdentNaming(coqParser.QuestionIdentNamingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code questionIdentNaming}
	 * labeled alternative in {@link coqParser#naming_intro_pattern}.
	 * @param ctx the parse tree
	 */
	void exitQuestionIdentNaming(coqParser.QuestionIdentNamingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code questionNaming}
	 * labeled alternative in {@link coqParser#naming_intro_pattern}.
	 * @param ctx the parse tree
	 */
	void enterQuestionNaming(coqParser.QuestionNamingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code questionNaming}
	 * labeled alternative in {@link coqParser#naming_intro_pattern}.
	 * @param ctx the parse tree
	 */
	void exitQuestionNaming(coqParser.QuestionNamingContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#intro_pattern_list}.
	 * @param ctx the parse tree
	 */
	void enterIntro_pattern_list(coqParser.Intro_pattern_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#intro_pattern_list}.
	 * @param ctx the parse tree
	 */
	void exitIntro_pattern_list(coqParser.Intro_pattern_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#intro_pattern_list_body}.
	 * @param ctx the parse tree
	 */
	void enterIntro_pattern_list_body(coqParser.Intro_pattern_list_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#intro_pattern_list_body}.
	 * @param ctx the parse tree
	 */
	void exitIntro_pattern_list_body(coqParser.Intro_pattern_list_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#flag}.
	 * @param ctx the parse tree
	 */
	void enterFlag(coqParser.FlagContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#flag}.
	 * @param ctx the parse tree
	 */
	void exitFlag(coqParser.FlagContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#pattern2}.
	 * @param ctx the parse tree
	 */
	void enterPattern2(coqParser.Pattern2Context ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#pattern2}.
	 * @param ctx the parse tree
	 */
	void exitPattern2(coqParser.Pattern2Context ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#lemma}.
	 * @param ctx the parse tree
	 */
	void enterLemma(coqParser.LemmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#lemma}.
	 * @param ctx the parse tree
	 */
	void exitLemma(coqParser.LemmaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr2Expr}
	 * labeled alternative in {@link coqParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr2Expr(coqParser.Expr2ExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr2Expr}
	 * labeled alternative in {@link coqParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr2Expr(coqParser.Expr2ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code localAppExpr}
	 * labeled alternative in {@link coqParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLocalAppExpr(coqParser.LocalAppExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code localAppExpr}
	 * labeled alternative in {@link coqParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLocalAppExpr(coqParser.LocalAppExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sequenceExpr}
	 * labeled alternative in {@link coqParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSequenceExpr(coqParser.SequenceExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sequenceExpr}
	 * labeled alternative in {@link coqParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSequenceExpr(coqParser.SequenceExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tacarg3expr}
	 * labeled alternative in {@link coqParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterTacarg3expr(coqParser.Tacarg3exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tacarg3expr}
	 * labeled alternative in {@link coqParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitTacarg3expr(coqParser.Tacarg3exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pairedSequenceLocalAppExpr}
	 * labeled alternative in {@link coqParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterPairedSequenceLocalAppExpr(coqParser.PairedSequenceLocalAppExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pairedSequenceLocalAppExpr}
	 * labeled alternative in {@link coqParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitPairedSequenceLocalAppExpr(coqParser.PairedSequenceLocalAppExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#pairedSequenceLocalAppExprBody}.
	 * @param ctx the parse tree
	 */
	void enterPairedSequenceLocalAppExprBody(coqParser.PairedSequenceLocalAppExprBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#pairedSequenceLocalAppExprBody}.
	 * @param ctx the parse tree
	 */
	void exitPairedSequenceLocalAppExprBody(coqParser.PairedSequenceLocalAppExprBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 */
	void enterDoExpr(coqParser.DoExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 */
	void exitDoExpr(coqParser.DoExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code progressExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 */
	void enterProgressExpr(coqParser.ProgressExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code progressExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 */
	void exitProgressExpr(coqParser.ProgressExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repeatExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 */
	void enterRepeatExpr(coqParser.RepeatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repeatExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 */
	void exitRepeatExpr(coqParser.RepeatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tryExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 */
	void enterTryExpr(coqParser.TryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tryExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 */
	void exitTryExpr(coqParser.TryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code softCutExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 */
	void enterSoftCutExpr(coqParser.SoftCutExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code softCutExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 */
	void exitSoftCutExpr(coqParser.SoftCutExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exactlyOnceExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 */
	void enterExactlyOnceExpr(coqParser.ExactlyOnceExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exactlyOnceExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 */
	void exitExactlyOnceExpr(coqParser.ExactlyOnceExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timeoutExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 */
	void enterTimeoutExpr(coqParser.TimeoutExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timeoutExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 */
	void exitTimeoutExpr(coqParser.TimeoutExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timeExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 */
	void enterTimeExpr(coqParser.TimeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timeExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 */
	void exitTimeExpr(coqParser.TimeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code onlyExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 */
	void enterOnlyExpr(coqParser.OnlyExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code onlyExpr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 */
	void exitOnlyExpr(coqParser.OnlyExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tacExpr2Expr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 */
	void enterTacExpr2Expr(coqParser.TacExpr2ExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tacExpr2Expr}
	 * labeled alternative in {@link coqParser#tacexpr3}.
	 * @param ctx the parse tree
	 */
	void exitTacExpr2Expr(coqParser.TacExpr2ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftBiasedOpsExpr}
	 * labeled alternative in {@link coqParser#tacexpr2}.
	 * @param ctx the parse tree
	 */
	void enterLeftBiasedOpsExpr(coqParser.LeftBiasedOpsExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftBiasedOpsExpr}
	 * labeled alternative in {@link coqParser#tacexpr2}.
	 * @param ctx the parse tree
	 */
	void exitLeftBiasedOpsExpr(coqParser.LeftBiasedOpsExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code backTrackingExpr}
	 * labeled alternative in {@link coqParser#tacexpr2}.
	 * @param ctx the parse tree
	 */
	void enterBackTrackingExpr(coqParser.BackTrackingExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code backTrackingExpr}
	 * labeled alternative in {@link coqParser#tacexpr2}.
	 * @param ctx the parse tree
	 */
	void exitBackTrackingExpr(coqParser.BackTrackingExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code generalizedBranchingExpr}
	 * labeled alternative in {@link coqParser#tacexpr2}.
	 * @param ctx the parse tree
	 */
	void enterGeneralizedBranchingExpr(coqParser.GeneralizedBranchingExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code generalizedBranchingExpr}
	 * labeled alternative in {@link coqParser#tacexpr2}.
	 * @param ctx the parse tree
	 */
	void exitGeneralizedBranchingExpr(coqParser.GeneralizedBranchingExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tacExpr1Expr}
	 * labeled alternative in {@link coqParser#tacexpr2}.
	 * @param ctx the parse tree
	 */
	void enterTacExpr1Expr(coqParser.TacExpr1ExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tacExpr1Expr}
	 * labeled alternative in {@link coqParser#tacexpr2}.
	 * @param ctx the parse tree
	 */
	void exitTacExpr1Expr(coqParser.TacExpr1ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterFunExpr(coqParser.FunExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitFunExpr(coqParser.FunExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterLetExpr(coqParser.LetExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitLetExpr(coqParser.LetExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code contextMatchExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterContextMatchExpr(coqParser.ContextMatchExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code contextMatchExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitContextMatchExpr(coqParser.ContextMatchExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code contextLazyMatchExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterContextLazyMatchExpr(coqParser.ContextLazyMatchExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code contextLazyMatchExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitContextLazyMatchExpr(coqParser.ContextLazyMatchExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code contextMultitMatchExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterContextMultitMatchExpr(coqParser.ContextMultitMatchExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code contextMultitMatchExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitContextMultitMatchExpr(coqParser.ContextMultitMatchExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code matchMatchExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterMatchMatchExpr(coqParser.MatchMatchExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code matchMatchExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitMatchMatchExpr(coqParser.MatchMatchExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code matchLazyMatchExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterMatchLazyMatchExpr(coqParser.MatchLazyMatchExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code matchLazyMatchExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitMatchLazyMatchExpr(coqParser.MatchLazyMatchExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code matchMultiMatchExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterMatchMultiMatchExpr(coqParser.MatchMultiMatchExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code matchMultiMatchExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitMatchMultiMatchExpr(coqParser.MatchMultiMatchExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code abstractExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterAbstractExpr(coqParser.AbstractExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code abstractExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitAbstractExpr(coqParser.AbstractExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code solveExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterSolveExpr(coqParser.SolveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code solveExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitSolveExpr(coqParser.SolveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code firstExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterFirstExpr(coqParser.FirstExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code firstExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitFirstExpr(coqParser.FirstExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idTacExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterIdTacExpr(coqParser.IdTacExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idTacExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitIdTacExpr(coqParser.IdTacExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identFailExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterIdentFailExpr(coqParser.IdentFailExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identFailExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitIdentFailExpr(coqParser.IdentFailExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numFailExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterNumFailExpr(coqParser.NumFailExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numFailExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitNumFailExpr(coqParser.NumFailExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code failExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterFailExpr(coqParser.FailExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code failExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitFailExpr(coqParser.FailExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code freshStringExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterFreshStringExpr(coqParser.FreshStringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code freshStringExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitFreshStringExpr(coqParser.FreshStringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code freshQualidExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterFreshQualidExpr(coqParser.FreshQualidExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code freshQualidExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitFreshQualidExpr(coqParser.FreshQualidExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code freshExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterFreshExpr(coqParser.FreshExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code freshExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitFreshExpr(coqParser.FreshExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code contextExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterContextExpr(coqParser.ContextExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code contextExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitContextExpr(coqParser.ContextExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code contextExprBraceds}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterContextExprBraceds(coqParser.ContextExprBracedsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code contextExprBraceds}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitContextExprBraceds(coqParser.ContextExprBracedsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code evalExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterEvalExpr(coqParser.EvalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code evalExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitEvalExpr(coqParser.EvalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterTypeExpr(coqParser.TypeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitTypeExpr(coqParser.TypeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constrExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterConstrExpr(coqParser.ConstrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constrExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitConstrExpr(coqParser.ConstrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uconstrExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterUconstrExpr(coqParser.UconstrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uconstrExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitUconstrExpr(coqParser.UconstrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeTermExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterTypeTermExpr(coqParser.TypeTermExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeTermExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitTypeTermExpr(coqParser.TypeTermExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numgoals}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterNumgoals(coqParser.NumgoalsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numgoals}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitNumgoals(coqParser.NumgoalsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code guardExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterGuardExpr(coqParser.GuardExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code guardExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitGuardExpr(coqParser.GuardExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assertFailsExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterAssertFailsExpr(coqParser.AssertFailsExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assertFailsExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitAssertFailsExpr(coqParser.AssertFailsExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assertSucceedsExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterAssertSucceedsExpr(coqParser.AssertSucceedsExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assertSucceedsExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitAssertSucceedsExpr(coqParser.AssertSucceedsExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomicExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterAtomicExpr(coqParser.AtomicExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomicExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitAtomicExpr(coqParser.AtomicExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code applicationExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterApplicationExpr(coqParser.ApplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code applicationExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitApplicationExpr(coqParser.ApplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(coqParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link coqParser#tacexpr1}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(coqParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code qualidAtom}
	 * labeled alternative in {@link coqParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterQualidAtom(coqParser.QualidAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code qualidAtom}
	 * labeled alternative in {@link coqParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitQualidAtom(coqParser.QualidAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unitAtom}
	 * labeled alternative in {@link coqParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterUnitAtom(coqParser.UnitAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unitAtom}
	 * labeled alternative in {@link coqParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitUnitAtom(coqParser.UnitAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intAtom}
	 * labeled alternative in {@link coqParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIntAtom(coqParser.IntAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intAtom}
	 * labeled alternative in {@link coqParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIntAtom(coqParser.IntAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracedExprAtom}
	 * labeled alternative in {@link coqParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBracedExprAtom(coqParser.BracedExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracedExprAtom}
	 * labeled alternative in {@link coqParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBracedExprAtom(coqParser.BracedExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dotExprAtom}
	 * labeled alternative in {@link coqParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDotExprAtom(coqParser.DotExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dotExprAtom}
	 * labeled alternative in {@link coqParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDotExprAtom(coqParser.DotExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringMessageToken}
	 * labeled alternative in {@link coqParser#message_token}.
	 * @param ctx the parse tree
	 */
	void enterStringMessageToken(coqParser.StringMessageTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringMessageToken}
	 * labeled alternative in {@link coqParser#message_token}.
	 * @param ctx the parse tree
	 */
	void exitStringMessageToken(coqParser.StringMessageTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identMessageToken}
	 * labeled alternative in {@link coqParser#message_token}.
	 * @param ctx the parse tree
	 */
	void enterIdentMessageToken(coqParser.IdentMessageTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identMessageToken}
	 * labeled alternative in {@link coqParser#message_token}.
	 * @param ctx the parse tree
	 */
	void exitIdentMessageToken(coqParser.IdentMessageTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intMessageToken}
	 * labeled alternative in {@link coqParser#message_token}.
	 * @param ctx the parse tree
	 */
	void enterIntMessageToken(coqParser.IntMessageTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intMessageToken}
	 * labeled alternative in {@link coqParser#message_token}.
	 * @param ctx the parse tree
	 */
	void exitIntMessageToken(coqParser.IntMessageTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code qualidTacArg}
	 * labeled alternative in {@link coqParser#tacarg}.
	 * @param ctx the parse tree
	 */
	void enterQualidTacArg(coqParser.QualidTacArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code qualidTacArg}
	 * labeled alternative in {@link coqParser#tacarg}.
	 * @param ctx the parse tree
	 */
	void exitQualidTacArg(coqParser.QualidTacArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unitTacArg}
	 * labeled alternative in {@link coqParser#tacarg}.
	 * @param ctx the parse tree
	 */
	void enterUnitTacArg(coqParser.UnitTacArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unitTacArg}
	 * labeled alternative in {@link coqParser#tacarg}.
	 * @param ctx the parse tree
	 */
	void exitUnitTacArg(coqParser.UnitTacArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltacTacArg}
	 * labeled alternative in {@link coqParser#tacarg}.
	 * @param ctx the parse tree
	 */
	void enterLtacTacArg(coqParser.LtacTacArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltacTacArg}
	 * labeled alternative in {@link coqParser#tacarg}.
	 * @param ctx the parse tree
	 */
	void exitLtacTacArg(coqParser.LtacTacArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringTacArg}
	 * labeled alternative in {@link coqParser#tacarg}.
	 * @param ctx the parse tree
	 */
	void enterStringTacArg(coqParser.StringTacArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringTacArg}
	 * labeled alternative in {@link coqParser#tacarg}.
	 * @param ctx the parse tree
	 */
	void exitStringTacArg(coqParser.StringTacArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termTacArg}
	 * labeled alternative in {@link coqParser#tacarg}.
	 * @param ctx the parse tree
	 */
	void enterTermTacArg(coqParser.TermTacArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termTacArg}
	 * labeled alternative in {@link coqParser#tacarg}.
	 * @param ctx the parse tree
	 */
	void exitTermTacArg(coqParser.TermTacArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#let_clause}.
	 * @param ctx the parse tree
	 */
	void enterLet_clause(coqParser.Let_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#let_clause}.
	 * @param ctx the parse tree
	 */
	void exitLet_clause(coqParser.Let_clauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code contextHypContextRule}
	 * labeled alternative in {@link coqParser#context_rule}.
	 * @param ctx the parse tree
	 */
	void enterContextHypContextRule(coqParser.ContextHypContextRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code contextHypContextRule}
	 * labeled alternative in {@link coqParser#context_rule}.
	 * @param ctx the parse tree
	 */
	void exitContextHypContextRule(coqParser.ContextHypContextRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code contextHypBracedContextRule}
	 * labeled alternative in {@link coqParser#context_rule}.
	 * @param ctx the parse tree
	 */
	void enterContextHypBracedContextRule(coqParser.ContextHypBracedContextRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code contextHypBracedContextRule}
	 * labeled alternative in {@link coqParser#context_rule}.
	 * @param ctx the parse tree
	 */
	void exitContextHypBracedContextRule(coqParser.ContextHypBracedContextRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stdContextRule}
	 * labeled alternative in {@link coqParser#context_rule}.
	 * @param ctx the parse tree
	 */
	void enterStdContextRule(coqParser.StdContextRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stdContextRule}
	 * labeled alternative in {@link coqParser#context_rule}.
	 * @param ctx the parse tree
	 */
	void exitStdContextRule(coqParser.StdContextRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code derivedContextRule}
	 * labeled alternative in {@link coqParser#context_rule}.
	 * @param ctx the parse tree
	 */
	void enterDerivedContextRule(coqParser.DerivedContextRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code derivedContextRule}
	 * labeled alternative in {@link coqParser#context_rule}.
	 * @param ctx the parse tree
	 */
	void exitDerivedContextRule(coqParser.DerivedContextRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code underscoreContextRule}
	 * labeled alternative in {@link coqParser#context_rule}.
	 * @param ctx the parse tree
	 */
	void enterUnderscoreContextRule(coqParser.UnderscoreContextRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code underscoreContextRule}
	 * labeled alternative in {@link coqParser#context_rule}.
	 * @param ctx the parse tree
	 */
	void exitUnderscoreContextRule(coqParser.UnderscoreContextRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stdContextHyp}
	 * labeled alternative in {@link coqParser#context_hyp}.
	 * @param ctx the parse tree
	 */
	void enterStdContextHyp(coqParser.StdContextHypContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stdContextHyp}
	 * labeled alternative in {@link coqParser#context_hyp}.
	 * @param ctx the parse tree
	 */
	void exitStdContextHyp(coqParser.StdContextHypContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprContextHyp}
	 * labeled alternative in {@link coqParser#context_hyp}.
	 * @param ctx the parse tree
	 */
	void enterExprContextHyp(coqParser.ExprContextHypContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprContextHyp}
	 * labeled alternative in {@link coqParser#context_hyp}.
	 * @param ctx the parse tree
	 */
	void exitExprContextHyp(coqParser.ExprContextHypContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stdMatchRule}
	 * labeled alternative in {@link coqParser#match_rule}.
	 * @param ctx the parse tree
	 */
	void enterStdMatchRule(coqParser.StdMatchRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stdMatchRule}
	 * labeled alternative in {@link coqParser#match_rule}.
	 * @param ctx the parse tree
	 */
	void exitStdMatchRule(coqParser.StdMatchRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code contextMatchRule}
	 * labeled alternative in {@link coqParser#match_rule}.
	 * @param ctx the parse tree
	 */
	void enterContextMatchRule(coqParser.ContextMatchRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code contextMatchRule}
	 * labeled alternative in {@link coqParser#match_rule}.
	 * @param ctx the parse tree
	 */
	void exitContextMatchRule(coqParser.ContextMatchRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code underscoreMatchRule}
	 * labeled alternative in {@link coqParser#match_rule}.
	 * @param ctx the parse tree
	 */
	void enterUnderscoreMatchRule(coqParser.UnderscoreMatchRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code underscoreMatchRule}
	 * labeled alternative in {@link coqParser#match_rule}.
	 * @param ctx the parse tree
	 */
	void exitUnderscoreMatchRule(coqParser.UnderscoreMatchRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(coqParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(coqParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identSelector}
	 * labeled alternative in {@link coqParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterIdentSelector(coqParser.IdentSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identSelector}
	 * labeled alternative in {@link coqParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitIdentSelector(coqParser.IdentSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intSelector}
	 * labeled alternative in {@link coqParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterIntSelector(coqParser.IntSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intSelector}
	 * labeled alternative in {@link coqParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitIntSelector(coqParser.IntSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#integ}.
	 * @param ctx the parse tree
	 */
	void enterInteg(coqParser.IntegContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#integ}.
	 * @param ctx the parse tree
	 */
	void exitInteg(coqParser.IntegContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#int_selector_body}.
	 * @param ctx the parse tree
	 */
	void enterInt_selector_body(coqParser.Int_selector_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#int_selector_body}.
	 * @param ctx the parse tree
	 */
	void exitInt_selector_body(coqParser.Int_selector_bodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selToplevelSelector}
	 * labeled alternative in {@link coqParser#toplevel_selector}.
	 * @param ctx the parse tree
	 */
	void enterSelToplevelSelector(coqParser.SelToplevelSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selToplevelSelector}
	 * labeled alternative in {@link coqParser#toplevel_selector}.
	 * @param ctx the parse tree
	 */
	void exitSelToplevelSelector(coqParser.SelToplevelSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allToplevelSelector}
	 * labeled alternative in {@link coqParser#toplevel_selector}.
	 * @param ctx the parse tree
	 */
	void enterAllToplevelSelector(coqParser.AllToplevelSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allToplevelSelector}
	 * labeled alternative in {@link coqParser#toplevel_selector}.
	 * @param ctx the parse tree
	 */
	void exitAllToplevelSelector(coqParser.AllToplevelSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parToplevelSelector}
	 * labeled alternative in {@link coqParser#toplevel_selector}.
	 * @param ctx the parse tree
	 */
	void enterParToplevelSelector(coqParser.ParToplevelSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parToplevelSelector}
	 * labeled alternative in {@link coqParser#toplevel_selector}.
	 * @param ctx the parse tree
	 */
	void exitParToplevelSelector(coqParser.ParToplevelSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#ltac}.
	 * @param ctx the parse tree
	 */
	void enterLtac(coqParser.LtacContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#ltac}.
	 * @param ctx the parse tree
	 */
	void exitLtac(coqParser.LtacContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identLtacDef}
	 * labeled alternative in {@link coqParser#ltac_def}.
	 * @param ctx the parse tree
	 */
	void enterIdentLtacDef(coqParser.IdentLtacDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identLtacDef}
	 * labeled alternative in {@link coqParser#ltac_def}.
	 * @param ctx the parse tree
	 */
	void exitIdentLtacDef(coqParser.IdentLtacDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code qualidLtacDef}
	 * labeled alternative in {@link coqParser#ltac_def}.
	 * @param ctx the parse tree
	 */
	void enterQualidLtacDef(coqParser.QualidLtacDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code qualidLtacDef}
	 * labeled alternative in {@link coqParser#ltac_def}.
	 * @param ctx the parse tree
	 */
	void exitQualidLtacDef(coqParser.QualidLtacDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(coqParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(coqParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterOrOpsTerm(coqParser.OrOpsTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitOrOpsTerm(coqParser.OrOpsTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cofixLetTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterCofixLetTerm(coqParser.CofixLetTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cofixLetTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitCofixLetTerm(coqParser.CofixLetTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tildeOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterTildeOpsTerm(coqParser.TildeOpsTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tildeOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitTildeOpsTerm(coqParser.TildeOpsTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterCompareOpsTerm(coqParser.CompareOpsTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitCompareOpsTerm(coqParser.CompareOpsTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nameAssignLetTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterNameAssignLetTerm(coqParser.NameAssignLetTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nameAssignLetTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitNameAssignLetTerm(coqParser.NameAssignLetTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multTermProjectionTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterMultTermProjectionTerm(coqParser.MultTermProjectionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multTermProjectionTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitMultTermProjectionTerm(coqParser.MultTermProjectionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fixTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterFixTerm(coqParser.FixTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fixTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitFixTerm(coqParser.FixTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fixLetTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterFixLetTerm(coqParser.FixLetTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fixLetTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitFixLetTerm(coqParser.FixLetTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recordTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterRecordTerm(coqParser.RecordTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recordTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitRecordTerm(coqParser.RecordTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identAssignLetTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterIdentAssignLetTerm(coqParser.IdentAssignLetTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identAssignLetTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitIdentAssignLetTerm(coqParser.IdentAssignLetTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forallTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterForallTerm(coqParser.ForallTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forallTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitForallTerm(coqParser.ForallTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code precBelow70Term}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterPrecBelow70Term(coqParser.PrecBelow70TermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code precBelow70Term}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitPrecBelow70Term(coqParser.PrecBelow70TermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterFunTerm(coqParser.FunTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitFunTerm(coqParser.FunTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multArgProjectionTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterMultArgProjectionTerm(coqParser.MultArgProjectionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multArgProjectionTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitMultArgProjectionTerm(coqParser.MultArgProjectionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recordProjectionTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterRecordProjectionTerm(coqParser.RecordProjectionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recordProjectionTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitRecordProjectionTerm(coqParser.RecordProjectionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code impliesOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterImpliesOpsTerm(coqParser.ImpliesOpsTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code impliesOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitImpliesOpsTerm(coqParser.ImpliesOpsTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code existsExclamTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterExistsExclamTerm(coqParser.ExistsExclamTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code existsExclamTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitExistsExclamTerm(coqParser.ExistsExclamTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sumOrSpecif}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterSumOrSpecif(coqParser.SumOrSpecifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sumOrSpecif}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitSumOrSpecif(coqParser.SumOrSpecifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code existsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterExistsTerm(coqParser.ExistsTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code existsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitExistsTerm(coqParser.ExistsTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lColOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterLColOpsTerm(coqParser.LColOpsTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lColOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitLColOpsTerm(coqParser.LColOpsTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterAtTerm(coqParser.AtTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitAtTerm(coqParser.AtTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cofixTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterCofixTerm(coqParser.CofixTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cofixTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitCofixTerm(coqParser.CofixTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code colonOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterColonOpsTerm(coqParser.ColonOpsTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code colonOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitColonOpsTerm(coqParser.ColonOpsTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equivOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterEquivOpsTerm(coqParser.EquivOpsTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equivOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitEquivOpsTerm(coqParser.EquivOpsTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code colGOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterColGOpsTerm(coqParser.ColGOpsTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code colGOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitColGOpsTerm(coqParser.ColGOpsTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifThenElseTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseTerm(coqParser.IfThenElseTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifThenElseTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseTerm(coqParser.IfThenElseTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exists2Term}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterExists2Term(coqParser.Exists2TermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exists2Term}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitExists2Term(coqParser.Exists2TermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code patternAssignLetTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterPatternAssignLetTerm(coqParser.PatternAssignLetTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code patternAssignLetTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitPatternAssignLetTerm(coqParser.PatternAssignLetTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void enterAndOpsTerm(coqParser.AndOpsTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andOpsTerm}
	 * labeled alternative in {@link coqParser#above_term}.
	 * @param ctx the parse tree
	 */
	void exitAndOpsTerm(coqParser.AndOpsTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineCalcOpsTerm}
	 * labeled alternative in {@link coqParser#above_term_ex_below_70}.
	 * @param ctx the parse tree
	 */
	void enterLineCalcOpsTerm(coqParser.LineCalcOpsTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineCalcOpsTerm}
	 * labeled alternative in {@link coqParser#above_term_ex_below_70}.
	 * @param ctx the parse tree
	 */
	void exitLineCalcOpsTerm(coqParser.LineCalcOpsTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pointCalcAppOpsTerm}
	 * labeled alternative in {@link coqParser#above_term_ex_below_70}.
	 * @param ctx the parse tree
	 */
	void enterPointCalcAppOpsTerm(coqParser.PointCalcAppOpsTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pointCalcAppOpsTerm}
	 * labeled alternative in {@link coqParser#above_term_ex_below_70}.
	 * @param ctx the parse tree
	 */
	void exitPointCalcAppOpsTerm(coqParser.PointCalcAppOpsTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code belowTerm}
	 * labeled alternative in {@link coqParser#above_term_ex_below_70}.
	 * @param ctx the parse tree
	 */
	void enterBelowTerm(coqParser.BelowTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code belowTerm}
	 * labeled alternative in {@link coqParser#above_term_ex_below_70}.
	 * @param ctx the parse tree
	 */
	void exitBelowTerm(coqParser.BelowTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listOpsTerm}
	 * labeled alternative in {@link coqParser#above_term_ex_below_70}.
	 * @param ctx the parse tree
	 */
	void enterListOpsTerm(coqParser.ListOpsTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listOpsTerm}
	 * labeled alternative in {@link coqParser#above_term_ex_below_70}.
	 * @param ctx the parse tree
	 */
	void exitListOpsTerm(coqParser.ListOpsTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negOpsTerm}
	 * labeled alternative in {@link coqParser#below_term}.
	 * @param ctx the parse tree
	 */
	void enterNegOpsTerm(coqParser.NegOpsTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negOpsTerm}
	 * labeled alternative in {@link coqParser#below_term}.
	 * @param ctx the parse tree
	 */
	void exitNegOpsTerm(coqParser.NegOpsTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code belowTermExMinus}
	 * labeled alternative in {@link coqParser#below_term}.
	 * @param ctx the parse tree
	 */
	void enterBelowTermExMinus(coqParser.BelowTermExMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code belowTermExMinus}
	 * labeled alternative in {@link coqParser#below_term}.
	 * @param ctx the parse tree
	 */
	void exitBelowTermExMinus(coqParser.BelowTermExMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomicTerm}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTerm(coqParser.AtomicTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomicTerm}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTerm(coqParser.AtomicTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sig2Specif}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 */
	void enterSig2Specif(coqParser.Sig2SpecifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sig2Specif}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 */
	void exitSig2Specif(coqParser.Sig2SpecifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sigTSpecif}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 */
	void enterSigTSpecif(coqParser.SigTSpecifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sigTSpecif}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 */
	void exitSigTSpecif(coqParser.SigTSpecifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rewTerm}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 */
	void enterRewTerm(coqParser.RewTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rewTerm}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 */
	void exitRewTerm(coqParser.RewTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powOpsTerm}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 */
	void enterPowOpsTerm(coqParser.PowOpsTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powOpsTerm}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 */
	void exitPowOpsTerm(coqParser.PowOpsTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeTerm}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 */
	void enterTypeTerm(coqParser.TypeTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeTerm}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 */
	void exitTypeTerm(coqParser.TypeTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code matchTerm}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 */
	void enterMatchTerm(coqParser.MatchTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code matchTerm}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 */
	void exitMatchTerm(coqParser.MatchTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sumBoolSpecif}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 */
	void enterSumBoolSpecif(coqParser.SumBoolSpecifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sumBoolSpecif}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 */
	void exitSumBoolSpecif(coqParser.SumBoolSpecifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sigT2Specif}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 */
	void enterSigT2Specif(coqParser.SigT2SpecifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sigT2Specif}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 */
	void exitSigT2Specif(coqParser.SigT2SpecifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sigSpecif}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 */
	void enterSigSpecif(coqParser.SigSpecifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sigSpecif}
	 * labeled alternative in {@link coqParser#below_term_ex_minus}.
	 * @param ctx the parse tree
	 */
	void exitSigSpecif(coqParser.SigSpecifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code qualidTerm}
	 * labeled alternative in {@link coqParser#atomic_term}.
	 * @param ctx the parse tree
	 */
	void enterQualidTerm(coqParser.QualidTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code qualidTerm}
	 * labeled alternative in {@link coqParser#atomic_term}.
	 * @param ctx the parse tree
	 */
	void exitQualidTerm(coqParser.QualidTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sortTerm}
	 * labeled alternative in {@link coqParser#atomic_term}.
	 * @param ctx the parse tree
	 */
	void enterSortTerm(coqParser.SortTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sortTerm}
	 * labeled alternative in {@link coqParser#atomic_term}.
	 * @param ctx the parse tree
	 */
	void exitSortTerm(coqParser.SortTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code metaVariableTerm}
	 * labeled alternative in {@link coqParser#atomic_term}.
	 * @param ctx the parse tree
	 */
	void enterMetaVariableTerm(coqParser.MetaVariableTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code metaVariableTerm}
	 * labeled alternative in {@link coqParser#atomic_term}.
	 * @param ctx the parse tree
	 */
	void exitMetaVariableTerm(coqParser.MetaVariableTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numTerm}
	 * labeled alternative in {@link coqParser#atomic_term}.
	 * @param ctx the parse tree
	 */
	void enterNumTerm(coqParser.NumTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numTerm}
	 * labeled alternative in {@link coqParser#atomic_term}.
	 * @param ctx the parse tree
	 */
	void exitNumTerm(coqParser.NumTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code underscoreTerm}
	 * labeled alternative in {@link coqParser#atomic_term}.
	 * @param ctx the parse tree
	 */
	void enterUnderscoreTerm(coqParser.UnderscoreTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code underscoreTerm}
	 * labeled alternative in {@link coqParser#atomic_term}.
	 * @param ctx the parse tree
	 */
	void exitUnderscoreTerm(coqParser.UnderscoreTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracedTerm}
	 * labeled alternative in {@link coqParser#atomic_term}.
	 * @param ctx the parse tree
	 */
	void enterBracedTerm(coqParser.BracedTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracedTerm}
	 * labeled alternative in {@link coqParser#atomic_term}.
	 * @param ctx the parse tree
	 */
	void exitBracedTerm(coqParser.BracedTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pairTerm}
	 * labeled alternative in {@link coqParser#atomic_term}.
	 * @param ctx the parse tree
	 */
	void enterPairTerm(coqParser.PairTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pairTerm}
	 * labeled alternative in {@link coqParser#atomic_term}.
	 * @param ctx the parse tree
	 */
	void exitPairTerm(coqParser.PairTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rew}
	 * labeled alternative in {@link coqParser#rew_term}.
	 * @param ctx the parse tree
	 */
	void enterRew(coqParser.RewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rew}
	 * labeled alternative in {@link coqParser#rew_term}.
	 * @param ctx the parse tree
	 */
	void exitRew(coqParser.RewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracedRew}
	 * labeled alternative in {@link coqParser#rew_term}.
	 * @param ctx the parse tree
	 */
	void enterBracedRew(coqParser.BracedRewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracedRew}
	 * labeled alternative in {@link coqParser#rew_term}.
	 * @param ctx the parse tree
	 */
	void exitBracedRew(coqParser.BracedRewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftArrowRew}
	 * labeled alternative in {@link coqParser#rew_term}.
	 * @param ctx the parse tree
	 */
	void enterLeftArrowRew(coqParser.LeftArrowRewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftArrowRew}
	 * labeled alternative in {@link coqParser#rew_term}.
	 * @param ctx the parse tree
	 */
	void exitLeftArrowRew(coqParser.LeftArrowRewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftArrowBracedRew}
	 * labeled alternative in {@link coqParser#rew_term}.
	 * @param ctx the parse tree
	 */
	void enterLeftArrowBracedRew(coqParser.LeftArrowBracedRewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftArrowBracedRew}
	 * labeled alternative in {@link coqParser#rew_term}.
	 * @param ctx the parse tree
	 */
	void exitLeftArrowBracedRew(coqParser.LeftArrowBracedRewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rightArrowRew}
	 * labeled alternative in {@link coqParser#rew_term}.
	 * @param ctx the parse tree
	 */
	void enterRightArrowRew(coqParser.RightArrowRewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rightArrowRew}
	 * labeled alternative in {@link coqParser#rew_term}.
	 * @param ctx the parse tree
	 */
	void exitRightArrowRew(coqParser.RightArrowRewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rightArrowBracedRew}
	 * labeled alternative in {@link coqParser#rew_term}.
	 * @param ctx the parse tree
	 */
	void enterRightArrowBracedRew(coqParser.RightArrowBracedRewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rightArrowBracedRew}
	 * labeled alternative in {@link coqParser#rew_term}.
	 * @param ctx the parse tree
	 */
	void exitRightArrowBracedRew(coqParser.RightArrowBracedRewContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#rew2_term}.
	 * @param ctx the parse tree
	 */
	void enterRew2_term(coqParser.Rew2_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#rew2_term}.
	 * @param ctx the parse tree
	 */
	void exitRew2_term(coqParser.Rew2_termContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleTermArg}
	 * labeled alternative in {@link coqParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterSingleTermArg(coqParser.SingleTermArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleTermArg}
	 * labeled alternative in {@link coqParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitSingleTermArg(coqParser.SingleTermArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identAssignArg}
	 * labeled alternative in {@link coqParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterIdentAssignArg(coqParser.IdentAssignArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identAssignArg}
	 * labeled alternative in {@link coqParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitIdentAssignArg(coqParser.IdentAssignArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#arg_body}.
	 * @param ctx the parse tree
	 */
	void enterArg_body(coqParser.Arg_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#arg_body}.
	 * @param ctx the parse tree
	 */
	void exitArg_body(coqParser.Arg_bodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleBinder}
	 * labeled alternative in {@link coqParser#binders}.
	 * @param ctx the parse tree
	 */
	void enterSingleBinder(coqParser.SingleBinderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleBinder}
	 * labeled alternative in {@link coqParser#binders}.
	 * @param ctx the parse tree
	 */
	void exitSingleBinder(coqParser.SingleBinderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleBinders}
	 * labeled alternative in {@link coqParser#binders}.
	 * @param ctx the parse tree
	 */
	void enterMultipleBinders(coqParser.MultipleBindersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleBinders}
	 * labeled alternative in {@link coqParser#binders}.
	 * @param ctx the parse tree
	 */
	void exitMultipleBinders(coqParser.MultipleBindersContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#binders_with_one_param}.
	 * @param ctx the parse tree
	 */
	void enterBinders_with_one_param(coqParser.Binders_with_one_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#binders_with_one_param}.
	 * @param ctx the parse tree
	 */
	void exitBinders_with_one_param(coqParser.Binders_with_one_paramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleNameBinder}
	 * labeled alternative in {@link coqParser#binder}.
	 * @param ctx the parse tree
	 */
	void enterSingleNameBinder(coqParser.SingleNameBinderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleNameBinder}
	 * labeled alternative in {@link coqParser#binder}.
	 * @param ctx the parse tree
	 */
	void exitSingleNameBinder(coqParser.SingleNameBinderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleNamesBinder}
	 * labeled alternative in {@link coqParser#binder}.
	 * @param ctx the parse tree
	 */
	void enterMultipleNamesBinder(coqParser.MultipleNamesBinderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleNamesBinder}
	 * labeled alternative in {@link coqParser#binder}.
	 * @param ctx the parse tree
	 */
	void exitMultipleNamesBinder(coqParser.MultipleNamesBinderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracedNameBinder}
	 * labeled alternative in {@link coqParser#binder}.
	 * @param ctx the parse tree
	 */
	void enterBracedNameBinder(coqParser.BracedNameBinderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracedNameBinder}
	 * labeled alternative in {@link coqParser#binder}.
	 * @param ctx the parse tree
	 */
	void exitBracedNameBinder(coqParser.BracedNameBinderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracedNameOptionalBinder}
	 * labeled alternative in {@link coqParser#binder}.
	 * @param ctx the parse tree
	 */
	void enterBracedNameOptionalBinder(coqParser.BracedNameOptionalBinderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracedNameOptionalBinder}
	 * labeled alternative in {@link coqParser#binder}.
	 * @param ctx the parse tree
	 */
	void exitBracedNameOptionalBinder(coqParser.BracedNameOptionalBinderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code implicitBinder}
	 * labeled alternative in {@link coqParser#binder}.
	 * @param ctx the parse tree
	 */
	void enterImplicitBinder(coqParser.ImplicitBinderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code implicitBinder}
	 * labeled alternative in {@link coqParser#binder}.
	 * @param ctx the parse tree
	 */
	void exitImplicitBinder(coqParser.ImplicitBinderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleName}
	 * labeled alternative in {@link coqParser#name}.
	 * @param ctx the parse tree
	 */
	void enterSimpleName(coqParser.SimpleNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleName}
	 * labeled alternative in {@link coqParser#name}.
	 * @param ctx the parse tree
	 */
	void exitSimpleName(coqParser.SimpleNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code underscoreName}
	 * labeled alternative in {@link coqParser#name}.
	 * @param ctx the parse tree
	 */
	void enterUnderscoreName(coqParser.UnderscoreNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code underscoreName}
	 * labeled alternative in {@link coqParser#name}.
	 * @param ctx the parse tree
	 */
	void exitUnderscoreName(coqParser.UnderscoreNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleQualidBinder}
	 * labeled alternative in {@link coqParser#qualid}.
	 * @param ctx the parse tree
	 */
	void enterSingleQualidBinder(coqParser.SingleQualidBinderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleQualidBinder}
	 * labeled alternative in {@link coqParser#qualid}.
	 * @param ctx the parse tree
	 */
	void exitSingleQualidBinder(coqParser.SingleQualidBinderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accessQualidBinder}
	 * labeled alternative in {@link coqParser#qualid}.
	 * @param ctx the parse tree
	 */
	void enterAccessQualidBinder(coqParser.AccessQualidBinderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accessQualidBinder}
	 * labeled alternative in {@link coqParser#qualid}.
	 * @param ctx the parse tree
	 */
	void exitAccessQualidBinder(coqParser.AccessQualidBinderContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#metavariable}.
	 * @param ctx the parse tree
	 */
	void enterMetavariable(coqParser.MetavariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#metavariable}.
	 * @param ctx the parse tree
	 */
	void exitMetavariable(coqParser.MetavariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sortProp}
	 * labeled alternative in {@link coqParser#sort}.
	 * @param ctx the parse tree
	 */
	void enterSortProp(coqParser.SortPropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sortProp}
	 * labeled alternative in {@link coqParser#sort}.
	 * @param ctx the parse tree
	 */
	void exitSortProp(coqParser.SortPropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sortSet}
	 * labeled alternative in {@link coqParser#sort}.
	 * @param ctx the parse tree
	 */
	void enterSortSet(coqParser.SortSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sortSet}
	 * labeled alternative in {@link coqParser#sort}.
	 * @param ctx the parse tree
	 */
	void exitSortSet(coqParser.SortSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sortType}
	 * labeled alternative in {@link coqParser#sort}.
	 * @param ctx the parse tree
	 */
	void enterSortType(coqParser.SortTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sortType}
	 * labeled alternative in {@link coqParser#sort}.
	 * @param ctx the parse tree
	 */
	void exitSortType(coqParser.SortTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleFixBody}
	 * labeled alternative in {@link coqParser#fix_bodies}.
	 * @param ctx the parse tree
	 */
	void enterSingleFixBody(coqParser.SingleFixBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleFixBody}
	 * labeled alternative in {@link coqParser#fix_bodies}.
	 * @param ctx the parse tree
	 */
	void exitSingleFixBody(coqParser.SingleFixBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleFixBodies}
	 * labeled alternative in {@link coqParser#fix_bodies}.
	 * @param ctx the parse tree
	 */
	void enterMultipleFixBodies(coqParser.MultipleFixBodiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleFixBodies}
	 * labeled alternative in {@link coqParser#fix_bodies}.
	 * @param ctx the parse tree
	 */
	void exitMultipleFixBodies(coqParser.MultipleFixBodiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleCoFixBody}
	 * labeled alternative in {@link coqParser#cofix_bodies}.
	 * @param ctx the parse tree
	 */
	void enterSingleCoFixBody(coqParser.SingleCoFixBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleCoFixBody}
	 * labeled alternative in {@link coqParser#cofix_bodies}.
	 * @param ctx the parse tree
	 */
	void exitSingleCoFixBody(coqParser.SingleCoFixBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleCoFixBodies}
	 * labeled alternative in {@link coqParser#cofix_bodies}.
	 * @param ctx the parse tree
	 */
	void enterMultipleCoFixBodies(coqParser.MultipleCoFixBodiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleCoFixBodies}
	 * labeled alternative in {@link coqParser#cofix_bodies}.
	 * @param ctx the parse tree
	 */
	void exitMultipleCoFixBodies(coqParser.MultipleCoFixBodiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#fix_body}.
	 * @param ctx the parse tree
	 */
	void enterFix_body(coqParser.Fix_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#fix_body}.
	 * @param ctx the parse tree
	 */
	void exitFix_body(coqParser.Fix_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#cofix_body}.
	 * @param ctx the parse tree
	 */
	void enterCofix_body(coqParser.Cofix_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#cofix_body}.
	 * @param ctx the parse tree
	 */
	void exitCofix_body(coqParser.Cofix_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(coqParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(coqParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#match_item}.
	 * @param ctx the parse tree
	 */
	void enterMatch_item(coqParser.Match_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#match_item}.
	 * @param ctx the parse tree
	 */
	void exitMatch_item(coqParser.Match_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#dep_ret_type}.
	 * @param ctx the parse tree
	 */
	void enterDep_ret_type(coqParser.Dep_ret_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#dep_ret_type}.
	 * @param ctx the parse tree
	 */
	void exitDep_ret_type(coqParser.Dep_ret_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(coqParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(coqParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(coqParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(coqParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#mult_pattern}.
	 * @param ctx the parse tree
	 */
	void enterMult_pattern(coqParser.Mult_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#mult_pattern}.
	 * @param ctx the parse tree
	 */
	void exitMult_pattern(coqParser.Mult_patternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code underscorePattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterUnderscorePattern(coqParser.UnderscorePatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code underscorePattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitUnderscorePattern(coqParser.UnderscorePatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code qualidPattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterQualidPattern(coqParser.QualidPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code qualidPattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitQualidPattern(coqParser.QualidPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numPattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterNumPattern(coqParser.NumPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numPattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitNumPattern(coqParser.NumPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listOpsPattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterListOpsPattern(coqParser.ListOpsPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listOpsPattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitListOpsPattern(coqParser.ListOpsPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defMultiplePattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterDefMultiplePattern(coqParser.DefMultiplePatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defMultiplePattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitDefMultiplePattern(coqParser.DefMultiplePatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code percOpsPattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPercOpsPattern(coqParser.PercOpsPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code percOpsPattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPercOpsPattern(coqParser.PercOpsPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orMultiplePattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterOrMultiplePattern(coqParser.OrMultiplePatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orMultiplePattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitOrMultiplePattern(coqParser.OrMultiplePatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atDefMultiplePattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterAtDefMultiplePattern(coqParser.AtDefMultiplePatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atDefMultiplePattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitAtDefMultiplePattern(coqParser.AtDefMultiplePatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asOpsPattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterAsOpsPattern(coqParser.AsOpsPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asOpsPattern}
	 * labeled alternative in {@link coqParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitAsOpsPattern(coqParser.AsOpsPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asOpsPatternImpl}
	 * labeled alternative in {@link coqParser#pattern_without_implicits}.
	 * @param ctx the parse tree
	 */
	void enterAsOpsPatternImpl(coqParser.AsOpsPatternImplContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asOpsPatternImpl}
	 * labeled alternative in {@link coqParser#pattern_without_implicits}.
	 * @param ctx the parse tree
	 */
	void exitAsOpsPatternImpl(coqParser.AsOpsPatternImplContext ctx);
	/**
	 * Enter a parse tree produced by the {@code percOpsPatternImpl}
	 * labeled alternative in {@link coqParser#pattern_without_implicits}.
	 * @param ctx the parse tree
	 */
	void enterPercOpsPatternImpl(coqParser.PercOpsPatternImplContext ctx);
	/**
	 * Exit a parse tree produced by the {@code percOpsPatternImpl}
	 * labeled alternative in {@link coqParser#pattern_without_implicits}.
	 * @param ctx the parse tree
	 */
	void exitPercOpsPatternImpl(coqParser.PercOpsPatternImplContext ctx);
	/**
	 * Enter a parse tree produced by the {@code qualidPatternImpl}
	 * labeled alternative in {@link coqParser#pattern_without_implicits}.
	 * @param ctx the parse tree
	 */
	void enterQualidPatternImpl(coqParser.QualidPatternImplContext ctx);
	/**
	 * Exit a parse tree produced by the {@code qualidPatternImpl}
	 * labeled alternative in {@link coqParser#pattern_without_implicits}.
	 * @param ctx the parse tree
	 */
	void exitQualidPatternImpl(coqParser.QualidPatternImplContext ctx);
	/**
	 * Enter a parse tree produced by the {@code underscorePatternImpl}
	 * labeled alternative in {@link coqParser#pattern_without_implicits}.
	 * @param ctx the parse tree
	 */
	void enterUnderscorePatternImpl(coqParser.UnderscorePatternImplContext ctx);
	/**
	 * Exit a parse tree produced by the {@code underscorePatternImpl}
	 * labeled alternative in {@link coqParser#pattern_without_implicits}.
	 * @param ctx the parse tree
	 */
	void exitUnderscorePatternImpl(coqParser.UnderscorePatternImplContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numPatternImpl}
	 * labeled alternative in {@link coqParser#pattern_without_implicits}.
	 * @param ctx the parse tree
	 */
	void enterNumPatternImpl(coqParser.NumPatternImplContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numPatternImpl}
	 * labeled alternative in {@link coqParser#pattern_without_implicits}.
	 * @param ctx the parse tree
	 */
	void exitNumPatternImpl(coqParser.NumPatternImplContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracedPattern}
	 * labeled alternative in {@link coqParser#pattern_without_implicits}.
	 * @param ctx the parse tree
	 */
	void enterBracedPattern(coqParser.BracedPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracedPattern}
	 * labeled alternative in {@link coqParser#pattern_without_implicits}.
	 * @param ctx the parse tree
	 */
	void exitBracedPattern(coqParser.BracedPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orMultiplePatternImpl}
	 * labeled alternative in {@link coqParser#pattern_without_implicits}.
	 * @param ctx the parse tree
	 */
	void enterOrMultiplePatternImpl(coqParser.OrMultiplePatternImplContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orMultiplePatternImpl}
	 * labeled alternative in {@link coqParser#pattern_without_implicits}.
	 * @param ctx the parse tree
	 */
	void exitOrMultiplePatternImpl(coqParser.OrMultiplePatternImplContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#or_pattern}.
	 * @param ctx the parse tree
	 */
	void enterOr_pattern(coqParser.Or_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#or_pattern}.
	 * @param ctx the parse tree
	 */
	void exitOr_pattern(coqParser.Or_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#exists_term}.
	 * @param ctx the parse tree
	 */
	void enterExists_term(coqParser.Exists_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#exists_term}.
	 * @param ctx the parse tree
	 */
	void exitExists_term(coqParser.Exists_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#return_term}.
	 * @param ctx the parse tree
	 */
	void enterReturn_term(coqParser.Return_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#return_term}.
	 * @param ctx the parse tree
	 */
	void exitReturn_term(coqParser.Return_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#equation_term}.
	 * @param ctx the parse tree
	 */
	void enterEquation_term(coqParser.Equation_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#equation_term}.
	 * @param ctx the parse tree
	 */
	void exitEquation_term(coqParser.Equation_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#forall_term}.
	 * @param ctx the parse tree
	 */
	void enterForall_term(coqParser.Forall_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#forall_term}.
	 * @param ctx the parse tree
	 */
	void exitForall_term(coqParser.Forall_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#fun_term}.
	 * @param ctx the parse tree
	 */
	void enterFun_term(coqParser.Fun_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#fun_term}.
	 * @param ctx the parse tree
	 */
	void exitFun_term(coqParser.Fun_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#ident_assign_term}.
	 * @param ctx the parse tree
	 */
	void enterIdent_assign_term(coqParser.Ident_assign_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#ident_assign_term}.
	 * @param ctx the parse tree
	 */
	void exitIdent_assign_term(coqParser.Ident_assign_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#fix_term}.
	 * @param ctx the parse tree
	 */
	void enterFix_term(coqParser.Fix_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#fix_term}.
	 * @param ctx the parse tree
	 */
	void exitFix_term(coqParser.Fix_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#fix_body_term}.
	 * @param ctx the parse tree
	 */
	void enterFix_body_term(coqParser.Fix_body_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#fix_body_term}.
	 * @param ctx the parse tree
	 */
	void exitFix_body_term(coqParser.Fix_body_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#cofix_term}.
	 * @param ctx the parse tree
	 */
	void enterCofix_term(coqParser.Cofix_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#cofix_term}.
	 * @param ctx the parse tree
	 */
	void exitCofix_term(coqParser.Cofix_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#name_assign_term}.
	 * @param ctx the parse tree
	 */
	void enterName_assign_term(coqParser.Name_assign_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#name_assign_term}.
	 * @param ctx the parse tree
	 */
	void exitName_assign_term(coqParser.Name_assign_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#pattern_assign_term}.
	 * @param ctx the parse tree
	 */
	void enterPattern_assign_term(coqParser.Pattern_assign_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#pattern_assign_term}.
	 * @param ctx the parse tree
	 */
	void exitPattern_assign_term(coqParser.Pattern_assign_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#if_then_else_term}.
	 * @param ctx the parse tree
	 */
	void enterIf_then_else_term(coqParser.If_then_else_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#if_then_else_term}.
	 * @param ctx the parse tree
	 */
	void exitIf_then_else_term(coqParser.If_then_else_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#record}.
	 * @param ctx the parse tree
	 */
	void enterRecord(coqParser.RecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#record}.
	 * @param ctx the parse tree
	 */
	void exitRecord(coqParser.RecordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recordRecord}
	 * labeled alternative in {@link coqParser#record_keyword}.
	 * @param ctx the parse tree
	 */
	void enterRecordRecord(coqParser.RecordRecordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recordRecord}
	 * labeled alternative in {@link coqParser#record_keyword}.
	 * @param ctx the parse tree
	 */
	void exitRecordRecord(coqParser.RecordRecordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inductiveRecord}
	 * labeled alternative in {@link coqParser#record_keyword}.
	 * @param ctx the parse tree
	 */
	void enterInductiveRecord(coqParser.InductiveRecordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inductiveRecord}
	 * labeled alternative in {@link coqParser#record_keyword}.
	 * @param ctx the parse tree
	 */
	void exitInductiveRecord(coqParser.InductiveRecordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code coinductiveRecord}
	 * labeled alternative in {@link coqParser#record_keyword}.
	 * @param ctx the parse tree
	 */
	void enterCoinductiveRecord(coqParser.CoinductiveRecordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code coinductiveRecord}
	 * labeled alternative in {@link coqParser#record_keyword}.
	 * @param ctx the parse tree
	 */
	void exitCoinductiveRecord(coqParser.CoinductiveRecordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defField}
	 * labeled alternative in {@link coqParser#field}.
	 * @param ctx the parse tree
	 */
	void enterDefField(coqParser.DefFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defField}
	 * labeled alternative in {@link coqParser#field}.
	 * @param ctx the parse tree
	 */
	void exitDefField(coqParser.DefFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stdField}
	 * labeled alternative in {@link coqParser#field}.
	 * @param ctx the parse tree
	 */
	void enterStdField(coqParser.StdFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stdField}
	 * labeled alternative in {@link coqParser#field}.
	 * @param ctx the parse tree
	 */
	void exitStdField(coqParser.StdFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#field_term}.
	 * @param ctx the parse tree
	 */
	void enterField_term(coqParser.Field_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#field_term}.
	 * @param ctx the parse tree
	 */
	void exitField_term(coqParser.Field_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#record_term}.
	 * @param ctx the parse tree
	 */
	void enterRecord_term(coqParser.Record_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#record_term}.
	 * @param ctx the parse tree
	 */
	void exitRecord_term(coqParser.Record_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#field_def}.
	 * @param ctx the parse tree
	 */
	void enterField_def(coqParser.Field_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#field_def}.
	 * @param ctx the parse tree
	 */
	void exitField_def(coqParser.Field_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#field_def_term}.
	 * @param ctx the parse tree
	 */
	void enterField_def_term(coqParser.Field_def_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#field_def_term}.
	 * @param ctx the parse tree
	 */
	void exitField_def_term(coqParser.Field_def_termContext ctx);
	/**
	 * Enter a parse tree produced by the {@code qualidModuleType}
	 * labeled alternative in {@link coqParser#module_type}.
	 * @param ctx the parse tree
	 */
	void enterQualidModuleType(coqParser.QualidModuleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code qualidModuleType}
	 * labeled alternative in {@link coqParser#module_type}.
	 * @param ctx the parse tree
	 */
	void exitQualidModuleType(coqParser.QualidModuleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withDefModuleType}
	 * labeled alternative in {@link coqParser#module_type}.
	 * @param ctx the parse tree
	 */
	void enterWithDefModuleType(coqParser.WithDefModuleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withDefModuleType}
	 * labeled alternative in {@link coqParser#module_type}.
	 * @param ctx the parse tree
	 */
	void exitWithDefModuleType(coqParser.WithDefModuleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withModuleModuleType}
	 * labeled alternative in {@link coqParser#module_type}.
	 * @param ctx the parse tree
	 */
	void enterWithModuleModuleType(coqParser.WithModuleModuleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withModuleModuleType}
	 * labeled alternative in {@link coqParser#module_type}.
	 * @param ctx the parse tree
	 */
	void exitWithModuleModuleType(coqParser.WithModuleModuleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moduleExprModuleType}
	 * labeled alternative in {@link coqParser#module_type}.
	 * @param ctx the parse tree
	 */
	void enterModuleExprModuleType(coqParser.ModuleExprModuleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moduleExprModuleType}
	 * labeled alternative in {@link coqParser#module_type}.
	 * @param ctx the parse tree
	 */
	void exitModuleExprModuleType(coqParser.ModuleExprModuleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importModuleBinding}
	 * labeled alternative in {@link coqParser#module_binding}.
	 * @param ctx the parse tree
	 */
	void enterImportModuleBinding(coqParser.ImportModuleBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importModuleBinding}
	 * labeled alternative in {@link coqParser#module_binding}.
	 * @param ctx the parse tree
	 */
	void exitImportModuleBinding(coqParser.ImportModuleBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exportModuleBinding}
	 * labeled alternative in {@link coqParser#module_binding}.
	 * @param ctx the parse tree
	 */
	void enterExportModuleBinding(coqParser.ExportModuleBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exportModuleBinding}
	 * labeled alternative in {@link coqParser#module_binding}.
	 * @param ctx the parse tree
	 */
	void exitExportModuleBinding(coqParser.ExportModuleBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stdModuleBinding}
	 * labeled alternative in {@link coqParser#module_binding}.
	 * @param ctx the parse tree
	 */
	void enterStdModuleBinding(coqParser.StdModuleBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stdModuleBinding}
	 * labeled alternative in {@link coqParser#module_binding}.
	 * @param ctx the parse tree
	 */
	void exitStdModuleBinding(coqParser.StdModuleBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#module_bindings}.
	 * @param ctx the parse tree
	 */
	void enterModule_bindings(coqParser.Module_bindingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#module_bindings}.
	 * @param ctx the parse tree
	 */
	void exitModule_bindings(coqParser.Module_bindingsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stdModuleExpr}
	 * labeled alternative in {@link coqParser#module_expression}.
	 * @param ctx the parse tree
	 */
	void enterStdModuleExpr(coqParser.StdModuleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stdModuleExpr}
	 * labeled alternative in {@link coqParser#module_expression}.
	 * @param ctx the parse tree
	 */
	void exitStdModuleExpr(coqParser.StdModuleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exclamationModuleExpr}
	 * labeled alternative in {@link coqParser#module_expression}.
	 * @param ctx the parse tree
	 */
	void enterExclamationModuleExpr(coqParser.ExclamationModuleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exclamationModuleExpr}
	 * labeled alternative in {@link coqParser#module_expression}.
	 * @param ctx the parse tree
	 */
	void exitExclamationModuleExpr(coqParser.ExclamationModuleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assumpt}
	 * labeled alternative in {@link coqParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterAssumpt(coqParser.AssumptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assumpt}
	 * labeled alternative in {@link coqParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitAssumpt(coqParser.AssumptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code def}
	 * labeled alternative in {@link coqParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterDef(coqParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code def}
	 * labeled alternative in {@link coqParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitDef(coqParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ind}
	 * labeled alternative in {@link coqParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterInd(coqParser.IndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ind}
	 * labeled alternative in {@link coqParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitInd(coqParser.IndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fix}
	 * labeled alternative in {@link coqParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterFix(coqParser.FixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fix}
	 * labeled alternative in {@link coqParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitFix(coqParser.FixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rec}
	 * labeled alternative in {@link coqParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterRec(coqParser.RecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rec}
	 * labeled alternative in {@link coqParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitRec(coqParser.RecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assert}
	 * labeled alternative in {@link coqParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterAssert(coqParser.AssertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assert}
	 * labeled alternative in {@link coqParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitAssert(coqParser.AssertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code go}
	 * labeled alternative in {@link coqParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterGo(coqParser.GoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code go}
	 * labeled alternative in {@link coqParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitGo(coqParser.GoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleAssumption}
	 * labeled alternative in {@link coqParser#assumption}.
	 * @param ctx the parse tree
	 */
	void enterSingleAssumption(coqParser.SingleAssumptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleAssumption}
	 * labeled alternative in {@link coqParser#assumption}.
	 * @param ctx the parse tree
	 */
	void exitSingleAssumption(coqParser.SingleAssumptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleAssumption}
	 * labeled alternative in {@link coqParser#assumption}.
	 * @param ctx the parse tree
	 */
	void enterMultipleAssumption(coqParser.MultipleAssumptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleAssumption}
	 * labeled alternative in {@link coqParser#assumption}.
	 * @param ctx the parse tree
	 */
	void exitMultipleAssumption(coqParser.MultipleAssumptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code axiom}
	 * labeled alternative in {@link coqParser#assumption_keyword}.
	 * @param ctx the parse tree
	 */
	void enterAxiom(coqParser.AxiomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code axiom}
	 * labeled alternative in {@link coqParser#assumption_keyword}.
	 * @param ctx the parse tree
	 */
	void exitAxiom(coqParser.AxiomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conj}
	 * labeled alternative in {@link coqParser#assumption_keyword}.
	 * @param ctx the parse tree
	 */
	void enterConj(coqParser.ConjContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conj}
	 * labeled alternative in {@link coqParser#assumption_keyword}.
	 * @param ctx the parse tree
	 */
	void exitConj(coqParser.ConjContext ctx);
	/**
	 * Enter a parse tree produced by the {@code param}
	 * labeled alternative in {@link coqParser#assumption_keyword}.
	 * @param ctx the parse tree
	 */
	void enterParam(coqParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code param}
	 * labeled alternative in {@link coqParser#assumption_keyword}.
	 * @param ctx the parse tree
	 */
	void exitParam(coqParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code params}
	 * labeled alternative in {@link coqParser#assumption_keyword}.
	 * @param ctx the parse tree
	 */
	void enterParams(coqParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code params}
	 * labeled alternative in {@link coqParser#assumption_keyword}.
	 * @param ctx the parse tree
	 */
	void exitParams(coqParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var}
	 * labeled alternative in {@link coqParser#assumption_keyword}.
	 * @param ctx the parse tree
	 */
	void enterVar(coqParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var}
	 * labeled alternative in {@link coqParser#assumption_keyword}.
	 * @param ctx the parse tree
	 */
	void exitVar(coqParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vars}
	 * labeled alternative in {@link coqParser#assumption_keyword}.
	 * @param ctx the parse tree
	 */
	void enterVars(coqParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vars}
	 * labeled alternative in {@link coqParser#assumption_keyword}.
	 * @param ctx the parse tree
	 */
	void exitVars(coqParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hyp}
	 * labeled alternative in {@link coqParser#assumption_keyword}.
	 * @param ctx the parse tree
	 */
	void enterHyp(coqParser.HypContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hyp}
	 * labeled alternative in {@link coqParser#assumption_keyword}.
	 * @param ctx the parse tree
	 */
	void exitHyp(coqParser.HypContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hyps}
	 * labeled alternative in {@link coqParser#assumption_keyword}.
	 * @param ctx the parse tree
	 */
	void enterHyps(coqParser.HypsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hyps}
	 * labeled alternative in {@link coqParser#assumption_keyword}.
	 * @param ctx the parse tree
	 */
	void exitHyps(coqParser.HypsContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#assums}.
	 * @param ctx the parse tree
	 */
	void enterAssums(coqParser.AssumsContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#assums}.
	 * @param ctx the parse tree
	 */
	void exitAssums(coqParser.AssumsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stdDefinition}
	 * labeled alternative in {@link coqParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterStdDefinition(coqParser.StdDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stdDefinition}
	 * labeled alternative in {@link coqParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitStdDefinition(coqParser.StdDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letDefinition}
	 * labeled alternative in {@link coqParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterLetDefinition(coqParser.LetDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letDefinition}
	 * labeled alternative in {@link coqParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitLetDefinition(coqParser.LetDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stdInductive}
	 * labeled alternative in {@link coqParser#inductive}.
	 * @param ctx the parse tree
	 */
	void enterStdInductive(coqParser.StdInductiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stdInductive}
	 * labeled alternative in {@link coqParser#inductive}.
	 * @param ctx the parse tree
	 */
	void exitStdInductive(coqParser.StdInductiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code coInductive}
	 * labeled alternative in {@link coqParser#inductive}.
	 * @param ctx the parse tree
	 */
	void enterCoInductive(coqParser.CoInductiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code coInductive}
	 * labeled alternative in {@link coqParser#inductive}.
	 * @param ctx the parse tree
	 */
	void exitCoInductive(coqParser.CoInductiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#ind_body}.
	 * @param ctx the parse tree
	 */
	void enterInd_body(coqParser.Ind_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#ind_body}.
	 * @param ctx the parse tree
	 */
	void exitInd_body(coqParser.Ind_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#ind_body_alloc}.
	 * @param ctx the parse tree
	 */
	void enterInd_body_alloc(coqParser.Ind_body_allocContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#ind_body_alloc}.
	 * @param ctx the parse tree
	 */
	void exitInd_body_alloc(coqParser.Ind_body_allocContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#ind_body_alloc_element}.
	 * @param ctx the parse tree
	 */
	void enterInd_body_alloc_element(coqParser.Ind_body_alloc_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#ind_body_alloc_element}.
	 * @param ctx the parse tree
	 */
	void exitInd_body_alloc_element(coqParser.Ind_body_alloc_elementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stdFixPoint}
	 * labeled alternative in {@link coqParser#fixpoint}.
	 * @param ctx the parse tree
	 */
	void enterStdFixPoint(coqParser.StdFixPointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stdFixPoint}
	 * labeled alternative in {@link coqParser#fixpoint}.
	 * @param ctx the parse tree
	 */
	void exitStdFixPoint(coqParser.StdFixPointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code coFixPoint}
	 * labeled alternative in {@link coqParser#fixpoint}.
	 * @param ctx the parse tree
	 */
	void enterCoFixPoint(coqParser.CoFixPointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code coFixPoint}
	 * labeled alternative in {@link coqParser#fixpoint}.
	 * @param ctx the parse tree
	 */
	void exitCoFixPoint(coqParser.CoFixPointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleBinderImplicit}
	 * labeled alternative in {@link coqParser#implicitArgs}.
	 * @param ctx the parse tree
	 */
	void enterSingleBinderImplicit(coqParser.SingleBinderImplicitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleBinderImplicit}
	 * labeled alternative in {@link coqParser#implicitArgs}.
	 * @param ctx the parse tree
	 */
	void exitSingleBinderImplicit(coqParser.SingleBinderImplicitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleBindersImplicit}
	 * labeled alternative in {@link coqParser#implicitArgs}.
	 * @param ctx the parse tree
	 */
	void enterMultipleBindersImplicit(coqParser.MultipleBindersImplicitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleBindersImplicit}
	 * labeled alternative in {@link coqParser#implicitArgs}.
	 * @param ctx the parse tree
	 */
	void exitMultipleBindersImplicit(coqParser.MultipleBindersImplicitContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#assertion}.
	 * @param ctx the parse tree
	 */
	void enterAssertion(coqParser.AssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#assertion}.
	 * @param ctx the parse tree
	 */
	void exitAssertion(coqParser.AssertionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code theo}
	 * labeled alternative in {@link coqParser#assertion_keyword}.
	 * @param ctx the parse tree
	 */
	void enterTheo(coqParser.TheoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code theo}
	 * labeled alternative in {@link coqParser#assertion_keyword}.
	 * @param ctx the parse tree
	 */
	void exitTheo(coqParser.TheoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lem}
	 * labeled alternative in {@link coqParser#assertion_keyword}.
	 * @param ctx the parse tree
	 */
	void enterLem(coqParser.LemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lem}
	 * labeled alternative in {@link coqParser#assertion_keyword}.
	 * @param ctx the parse tree
	 */
	void exitLem(coqParser.LemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rema}
	 * labeled alternative in {@link coqParser#assertion_keyword}.
	 * @param ctx the parse tree
	 */
	void enterRema(coqParser.RemaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rema}
	 * labeled alternative in {@link coqParser#assertion_keyword}.
	 * @param ctx the parse tree
	 */
	void exitRema(coqParser.RemaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fac}
	 * labeled alternative in {@link coqParser#assertion_keyword}.
	 * @param ctx the parse tree
	 */
	void enterFac(coqParser.FacContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fac}
	 * labeled alternative in {@link coqParser#assertion_keyword}.
	 * @param ctx the parse tree
	 */
	void exitFac(coqParser.FacContext ctx);
	/**
	 * Enter a parse tree produced by the {@code col}
	 * labeled alternative in {@link coqParser#assertion_keyword}.
	 * @param ctx the parse tree
	 */
	void enterCol(coqParser.ColContext ctx);
	/**
	 * Exit a parse tree produced by the {@code col}
	 * labeled alternative in {@link coqParser#assertion_keyword}.
	 * @param ctx the parse tree
	 */
	void exitCol(coqParser.ColContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prop}
	 * labeled alternative in {@link coqParser#assertion_keyword}.
	 * @param ctx the parse tree
	 */
	void enterProp(coqParser.PropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prop}
	 * labeled alternative in {@link coqParser#assertion_keyword}.
	 * @param ctx the parse tree
	 */
	void exitProp(coqParser.PropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defAssert}
	 * labeled alternative in {@link coqParser#assertion_keyword}.
	 * @param ctx the parse tree
	 */
	void enterDefAssert(coqParser.DefAssertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defAssert}
	 * labeled alternative in {@link coqParser#assertion_keyword}.
	 * @param ctx the parse tree
	 */
	void exitDefAssert(coqParser.DefAssertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exam}
	 * labeled alternative in {@link coqParser#assertion_keyword}.
	 * @param ctx the parse tree
	 */
	void enterExam(coqParser.ExamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exam}
	 * labeled alternative in {@link coqParser#assertion_keyword}.
	 * @param ctx the parse tree
	 */
	void exitExam(coqParser.ExamContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(coqParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(coqParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link coqParser#proof}.
	 * @param ctx the parse tree
	 */
	void enterProof(coqParser.ProofContext ctx);
	/**
	 * Exit a parse tree produced by {@link coqParser#proof}.
	 * @param ctx the parse tree
	 */
	void exitProof(coqParser.ProofContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stdProofBody}
	 * labeled alternative in {@link coqParser#proof_body}.
	 * @param ctx the parse tree
	 */
	void enterStdProofBody(coqParser.StdProofBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stdProofBody}
	 * labeled alternative in {@link coqParser#proof_body}.
	 * @param ctx the parse tree
	 */
	void exitStdProofBody(coqParser.StdProofBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracedProofBody}
	 * labeled alternative in {@link coqParser#proof_body}.
	 * @param ctx the parse tree
	 */
	void enterBracedProofBody(coqParser.BracedProofBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracedProofBody}
	 * labeled alternative in {@link coqParser#proof_body}.
	 * @param ctx the parse tree
	 */
	void exitBracedProofBody(coqParser.BracedProofBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code someIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterSomeIdent(coqParser.SomeIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code someIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitSomeIdent(coqParser.SomeIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterEqIdent(coqParser.EqIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitEqIdent(coqParser.EqIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterAllIdent(coqParser.AllIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitAllIdent(coqParser.AllIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code absurdIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterAbsurdIdent(coqParser.AbsurdIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code absurdIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitAbsurdIdent(coqParser.AbsurdIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterEqualityIdent(coqParser.EqualityIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitEqualityIdent(coqParser.EqualityIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterDoubleIdent(coqParser.DoubleIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitDoubleIdent(coqParser.DoubleIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code f_equalIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterF_equalIdent(coqParser.F_equalIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code f_equalIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitF_equalIdent(coqParser.F_equalIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterOrIdent(coqParser.OrIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitOrIdent(coqParser.OrIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code contradictIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterContradictIdent(coqParser.ContradictIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code contradictIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitContradictIdent(coqParser.ContradictIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code freshIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterFreshIdent(coqParser.FreshIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code freshIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitFreshIdent(coqParser.FreshIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case_eqIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterCase_eqIdent(coqParser.Case_eqIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case_eqIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitCase_eqIdent(coqParser.Case_eqIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lemmaIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterLemmaIdent(coqParser.LemmaIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lemmaIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitLemmaIdent(coqParser.LemmaIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code easyIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterEasyIdent(coqParser.EasyIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code easyIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitEasyIdent(coqParser.EasyIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterRecIdent(coqParser.RecIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitRecIdent(coqParser.RecIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code changeIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterChangeIdent(coqParser.ChangeIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code changeIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitChangeIdent(coqParser.ChangeIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decideIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterDecideIdent(coqParser.DecideIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decideIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitDecideIdent(coqParser.DecideIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterLeftIdent(coqParser.LeftIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitLeftIdent(coqParser.LeftIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rightIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterRightIdent(coqParser.RightIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rightIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitRightIdent(coqParser.RightIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inversion_sigmaIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterInversion_sigmaIdent(coqParser.Inversion_sigmaIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inversion_sigmaIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitInversion_sigmaIdent(coqParser.Inversion_sigmaIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assert_fialsIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterAssert_fialsIdent(coqParser.Assert_fialsIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assert_fialsIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitAssert_fialsIdent(coqParser.Assert_fialsIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code failIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterFailIdent(coqParser.FailIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code failIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitFailIdent(coqParser.FailIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dependentIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterDependentIdent(coqParser.DependentIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dependentIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitDependentIdent(coqParser.DependentIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sumIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterSumIdent(coqParser.SumIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sumIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitSumIdent(coqParser.SumIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterCompareIdent(coqParser.CompareIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitCompareIdent(coqParser.CompareIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tAutoIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterTAutoIdent(coqParser.TAutoIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tAutoIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitTAutoIdent(coqParser.TAutoIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dtAutoIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterDtAutoIdent(coqParser.DtAutoIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dtAutoIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitDtAutoIdent(coqParser.DtAutoIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intuitionIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIntuitionIdent(coqParser.IntuitionIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intuitionIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIntuitionIdent(coqParser.IntuitionIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dintuition}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterDintuition(coqParser.DintuitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dintuition}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitDintuition(coqParser.DintuitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code topIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterTopIdent(coqParser.TopIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code topIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitTopIdent(coqParser.TopIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bottomIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterBottomIdent(coqParser.BottomIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bottomIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitBottomIdent(coqParser.BottomIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exfalsoIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterExfalsoIdent(coqParser.ExfalsoIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exfalsoIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitExfalsoIdent(coqParser.ExfalsoIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stdIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterStdIdent(coqParser.StdIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stdIdent}
	 * labeled alternative in {@link coqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitStdIdent(coqParser.StdIdentContext ctx);
}