package model.tactics.expr;

import java.util.List;
import java.util.Objects;

import model.tactics.expr.utilities.LetClause;
import model.visitor.expr.ExprVisitor;

public class LetExpr implements Expr {

	private boolean isRec;

	private List<LetClause> letClauses;

	private Expr expr;

	public LetExpr(boolean isRec, List<LetClause> letClauses, Expr expr) {
		this.isRec = isRec;
		this.letClauses = letClauses;
		this.expr= expr;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		LetExpr letExpr = (LetExpr) o;
		return isRec == letExpr.isRec &&
				Objects.equals(letClauses, letExpr.letClauses) &&
				Objects.equals(expr, letExpr.expr);
	}

	public boolean isRec() {
		return isRec;
	}

	public List<LetClause> getLetClauses() {
		return letClauses;
	}

	public Expr getExpr() {
		return expr;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isRec, letClauses, expr);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}
}
