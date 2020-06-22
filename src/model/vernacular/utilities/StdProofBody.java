package model.vernacular.utilities;

import model.toplevel.BulletType;
import model.toplevel.utilities.TacticInvocation;
import model.visitor.vernacular.ProofBodyVisitor;

import java.util.Optional;

public class StdProofBody extends ProofBody {
    public StdProofBody(Optional<BulletType> optionalBullettype, TacticInvocation tacticInvocation) {
        super(optionalBullettype, tacticInvocation);
    }

    public  <R,P> R accept(ProofBodyVisitor<R,P> proofBodyVisitor, P p){
        return proofBodyVisitor.visit(this,p);
    }
}
