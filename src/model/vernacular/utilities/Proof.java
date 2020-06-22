package model.vernacular.utilities;

import java.util.List;
import java.util.Objects;

public class Proof {
    private List<ProofBody> proofBodies;

    public Proof(List<ProofBody> proofBodies) {
        this.proofBodies = proofBodies;
    }

    public List<ProofBody> getProofBodies() {
        return proofBodies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proof proof = (Proof) o;
        return Objects.equals(proofBodies, proof.proofBodies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proofBodies);
    }
}
