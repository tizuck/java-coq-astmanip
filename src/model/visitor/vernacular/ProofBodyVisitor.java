package model.visitor.vernacular;

import model.vernacular.utilities.BracedProofBody;
import model.vernacular.utilities.StdProofBody;

public interface ProofBodyVisitor<R,P> {

    R visit(StdProofBody stdProofBody,P p);

    R visit(BracedProofBody bracedProofBody,P p);
}
