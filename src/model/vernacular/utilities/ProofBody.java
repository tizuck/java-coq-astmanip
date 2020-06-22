package model.vernacular.utilities;

import model.toplevel.BulletType;
import model.toplevel.utilities.TacticInvocation;
import model.visitor.vernacular.ProofBodyVisitor;

import java.util.Objects;
import java.util.Optional;

public abstract class ProofBody {
    private Optional<BulletType> optionalBullettype;
    private TacticInvocation tacticInvocation;

    public ProofBody(Optional<BulletType> optionalBullettype, TacticInvocation tacticInvocation) {
        this.optionalBullettype = optionalBullettype;
        this.tacticInvocation = tacticInvocation;
    }

    public Optional<BulletType> getOptionalBullettype() {
        return optionalBullettype;
    }

    public TacticInvocation getTacticInvocation() {
        return tacticInvocation;
    }

    public abstract <R,P> R accept(ProofBodyVisitor<R,P> proofBodyVisitor,P p);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProofBody proofBody = (ProofBody) o;
        return Objects.equals(optionalBullettype, proofBody.optionalBullettype) &&
                Objects.equals(tacticInvocation, proofBody.tacticInvocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(optionalBullettype, tacticInvocation);
    }
}
