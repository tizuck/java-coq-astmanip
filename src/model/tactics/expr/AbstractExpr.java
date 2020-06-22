package model.tactics.expr;

import model.tactics.expr.utilities.Atom;
import model.term.utilities.Ident;
import model.visitor.expr.ExprVisitor;

import java.util.Objects;
import java.util.Optional;

public class AbstractExpr implements Expr {

	private Atom atom;

	private Optional<Ident> oIdent;

	public AbstractExpr(Atom atom, Optional<Ident> oIdent) {
		this.atom = atom;
		this.oIdent = oIdent;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		AbstractExpr that = (AbstractExpr) o;
		return Objects.equals(atom, that.atom) &&
				Objects.equals(oIdent, that.oIdent);
	}

	@Override
	public int hashCode() {
		return Objects.hash(atom, oIdent);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}
}
