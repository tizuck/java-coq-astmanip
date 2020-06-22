package model.toplevel.utilities;

import java.util.Objects;
import java.util.Optional;
import model.tactics.expr.Expr;

public class TacticInvocation {

	private Optional<ToplevelSelector> oTopLevelSelector;

	private Expr expr;

	public TacticInvocation(Optional<ToplevelSelector> oTopLevelSelector, Expr expr) {
		this.oTopLevelSelector = oTopLevelSelector;
		this.expr = expr;
	}

	public Optional<ToplevelSelector> getoTopLevelSelector() {
		return oTopLevelSelector;
	}

	public Expr getExpr() {
		return expr;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		TacticInvocation that = (TacticInvocation) o;
		return Objects.equals(oTopLevelSelector, that.oTopLevelSelector) &&
				Objects.equals(expr, that.expr);
	}

	@Override
	public int hashCode() {
		return Objects.hash(oTopLevelSelector, expr);
	}
}
