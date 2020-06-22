package antlr.visitor.vernacular;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.vernacular.utilities.Proof;

import java.util.stream.Collectors;

public class ProofVisitor extends GenericVisitor<Proof> {

    @Override
    public Proof visitProof(coqParser.ProofContext ctx) {
        return new Proof(ctx.proof_body().stream()
                                         .map(proof_bodyContext -> new ProofBodyVisitor().visit(proof_bodyContext))
                                         .collect(Collectors.toList()));
    }
}
