package model.tactics.atomic.caseanalysisind;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.TermComponent;
import model.tactics.expr.utilities.QualidTacArg;
import model.visitor.expr.ExprVisitor;

import java.util.List;

public class FunctionalInduction extends AtomicTacticExpr {

	public FunctionalInduction(QualidTacArg qualid, List<TermComponent> terms) {

	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
