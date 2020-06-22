package model.tactics.expr;

import model.tactics.expr.utilities.TacArg;
import model.term.Qualid;
import model.visitor.expr.ExprVisitor;

import java.util.List;
import java.util.Objects;

public class ApplicationExpr implements Expr {

	private Qualid qualid;

	private List<TacArg> tacArgs;

	public ApplicationExpr(Qualid qualid, List<TacArg> tacArgs) {
		this.qualid = qualid;
		this.tacArgs = tacArgs;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ApplicationExpr that = (ApplicationExpr) o;
		return Objects.equals(qualid, that.qualid) &&
				Objects.equals(tacArgs, that.tacArgs);
	}

	public List<TacArg> getTacArgs() {
		return tacArgs;
	}

	public Qualid getQualid() {
		return qualid;
	}

	@Override
	public int hashCode() {
		return Objects.hash(qualid, tacArgs);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}
}
