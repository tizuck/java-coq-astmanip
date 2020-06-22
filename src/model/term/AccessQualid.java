package model.term;

import model.term.utilities.AccessIdent;
import model.visitor.term.TermVisitor;

import java.util.Objects;

public class AccessQualid extends Qualid {

	public AccessQualid(Qualid qualid, AccessIdent acId) {
		this.qualid = qualid;
		this.acId = acId;
	}

	private Qualid qualid;

	private AccessIdent acId;

	public Qualid getQualid() {
		return qualid;
	}

	public AccessIdent getAcId() {
		return acId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		AccessQualid that = (AccessQualid) o;
		return Objects.equals(qualid, that.qualid) &&
				Objects.equals(acId, that.acId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(qualid, acId);
	}

	@Override
	public <R, P> R accept(TermVisitor<R, P> termVisitor, P p) {
		return termVisitor.visit(this,p);
	}
}
