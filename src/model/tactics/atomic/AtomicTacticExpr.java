package model.tactics.atomic;

import model.tactics.atomic.tacargcomponents.TacArgComponent;
import model.tactics.expr.Expr;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class AtomicTacticExpr implements Expr {

	protected List<TacArgComponent> tacArgs;

	public AtomicTacticExpr(){
		tacArgs = new ArrayList<>();
	}

	public List<TacArgComponent> getTacArgs() {
		return tacArgs;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		AtomicTacticExpr that = (AtomicTacticExpr) o;
		return Objects.equals(tacArgs, that.tacArgs);
	}

	@Override
	public int hashCode() {
		return Objects.hash(tacArgs);
	}
}
