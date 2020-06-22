package model.toplevel.utilities;

import model.tactics.expr.Expr;
import model.term.utilities.Ident;
import model.visitor.toplevel.LtacDefVisitor;

import java.util.List;
import java.util.Objects;

public class IdentLtacDef extends LtacDef {

	private List<Ident> ids;

	public IdentLtacDef(Expr expr, List<Ident> ids) {
		super(expr);
		this.ids = ids;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		IdentLtacDef that = (IdentLtacDef) o;
		return Objects.equals(ids, that.ids);
	}

	public List<Ident> getIds() {
		return ids;
	}

	@Override
	public <R, P> R accept(LtacDefVisitor<R, P> ltacDefVisitor, P p) {
		return ltacDefVisitor.visit(this,p);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ids);
	}
}
