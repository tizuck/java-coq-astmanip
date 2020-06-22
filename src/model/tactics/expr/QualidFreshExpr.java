package model.tactics.expr;

import model.term.Qualid;
import model.visitor.expr.ExprVisitor;

import java.util.Objects;
import java.util.Optional;

public class QualidFreshExpr implements FreshExpr {

	private Optional<Qualid> oQualid;

	public QualidFreshExpr(Optional<Qualid> oQualid) {
		this.oQualid = oQualid;
	}

	public Optional<Qualid> getoQualid() {
		return oQualid;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		QualidFreshExpr that = (QualidFreshExpr) o;
		return Objects.equals(oQualid, that.oQualid);
	}

	@Override
	public int hashCode() {
		return Objects.hash(oQualid);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}
}
