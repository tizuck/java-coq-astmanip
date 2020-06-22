package model.tactics.atomic.tacargcomponents;

import model.term.Qualid;
import model.visitor.atomic.TacArgComponentVisitor;

import java.util.Objects;

public class QualidComponent  extends TacArgComponent {

    private Qualid qualid;

    public QualidComponent(Qualid qualid) {
        this.qualid = qualid;
    }

    public QualidComponent(ComponentType componentType, Qualid qualid) {
        super(componentType);
        this.qualid = qualid;
    }

    public Qualid getQualid() {
        return qualid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        QualidComponent that = (QualidComponent) o;
        return Objects.equals(qualid, that.qualid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), qualid);
    }

    @Override
    public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
        return tacArgComponentVisitor.visit(this,p);
    }
}
