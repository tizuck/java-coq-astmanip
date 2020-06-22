package model.toplevel.utilities;

import model.tactics.expr.Expr;
import model.term.Qualid;
import model.term.utilities.Ident;
import model.visitor.toplevel.LtacDefVisitor;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class QualidLtacDef extends LtacDef {

	private Qualid qualid;

	private Optional<List<Ident>> oIds;

	public QualidLtacDef(Expr expr, Qualid qualid, Optional<List<Ident>> oIds) {
		super(expr);
		this.qualid = qualid;
		this.oIds = oIds;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		QualidLtacDef that = (QualidLtacDef) o;
		return Objects.equals(qualid, that.qualid) &&
				Objects.equals(oIds, that.oIds);
	}

	public Qualid getQualid() {
		return qualid;
	}

	public Optional<List<Ident>> getoIds() {
		return oIds;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), qualid, oIds);
	}

	@Override
	public <R, P> R accept(LtacDefVisitor<R, P> ltacDefVisitor, P p) {
		return ltacDefVisitor.visit(this,p);
	}
}
