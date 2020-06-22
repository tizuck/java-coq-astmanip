package model.tactics.atomic.manageloccont;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.IdentComponent;
import model.tactics.atomic.tacargcomponents.IdentListComponent;
import model.tactics.atomic.tacargcomponents.IntroPatternListComponent;
import model.tactics.atomic.tacargcomponents.TacArgComponent;
import model.visitor.expr.ExprVisitor;

public class Intros extends AtomicTacticExpr {

	public Intros(IdentComponent id) {
		tacArgs.add(id);
	}

	public Intros(IdentListComponent ids){
		tacArgs.add(ids);
	}

	public Intros(IntroPatternListComponent introPatternList){
		tacArgs.add(introPatternList);
	}

	public Intros(){

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

	@Override
	public String toString() {
		String intros = "intros ";
		for (TacArgComponent tacArg : tacArgs) {
			intros += tacArg.toString() + " ";
		}
		return intros;
	}
}
