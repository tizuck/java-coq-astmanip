package antlr.visitor.vernacular;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.vernacular.utilities.BracedProofBody;
import model.vernacular.utilities.ProofBody;
import model.vernacular.utilities.StdProofBody;

import java.util.Optional;

public class ProofBodyVisitor extends GenericVisitor<ProofBody> {
    @Override
    public ProofBody visitStdProofBody(coqParser.StdProofBodyContext ctx) {
        return new StdProofBody(ctx.bullet() != null ? Optional.of(new BulletVisitor().visit(ctx.bullet())) : Optional.empty(),
                new TacticInvocationVisitor().visit(ctx.tactic_invocation()));
    }

    @Override
    public ProofBody visitBracedProofBody(coqParser.BracedProofBodyContext ctx) {
        return new BracedProofBody(ctx.bullet() != null ? Optional.of(new BulletVisitor().visit(ctx.bullet())) : Optional.empty(),
                new TacticInvocationVisitor().visit(ctx.tactic_invocation()));
    }
}
