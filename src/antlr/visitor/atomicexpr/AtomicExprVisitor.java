package antlr.visitor.atomicexpr;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.tactics.atomic.AtomicTacticExpr;

public class AtomicExprVisitor extends GenericVisitor<AtomicTacticExpr> {

    @Override
    public AtomicTacticExpr visitCase_analysis_inductionAtomic(coqParser.Case_analysis_inductionAtomicContext ctx) {
        return new CaseAnalysisInductionVisitor().visit(ctx.case_analysis_induction());
    }

    @Override
    public AtomicTacticExpr visitApplying_theoremAtomic(coqParser.Applying_theoremAtomicContext ctx) {
        return new ApplyingTheoremVisitor().visit(ctx.applying_theorem());
    }

    @Override
    public AtomicTacticExpr visitPerforming_computationAtomic(coqParser.Performing_computationAtomicContext ctx) {
        return new PerformingComputationVisitor().visit(ctx.performing_computation());
    }

    @Override
    public AtomicTacticExpr visitManaging_local_contextAtomic(coqParser.Managing_local_contextAtomicContext ctx) {
        return new ManagingLocalContextVisitor().visit(ctx.managing_local_context());
    }

    @Override
    public AtomicTacticExpr visitEqualityAtomic(coqParser.EqualityAtomicContext ctx) {
        return new EqualityVisitor().visit(ctx.equality());
    }

    @Override
    public AtomicTacticExpr visitRewriting_expressionsAtomic(coqParser.Rewriting_expressionsAtomicContext ctx) {
        return new RewritingExpressionsVisitor().visit(ctx.rewriting_expressions());
    }

    @Override
    public AtomicTacticExpr visitAutomationAtomic(coqParser.AutomationAtomicContext ctx) {
        return new AutomationVisitor().visit(ctx.automation());
    }

    @Override
    public AtomicTacticExpr visitControlling_proof_flowAtomic(coqParser.Controlling_proof_flowAtomicContext ctx) {
        return new ControllingProofFlowVisitor().visit(ctx.controlling_proof_flow());
    }
}
