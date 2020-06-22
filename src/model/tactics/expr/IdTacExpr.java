package model.tactics.expr;

import model.tactics.expr.utilities.MessageToken;
import model.visitor.expr.ExprVisitor;

import java.util.List;
import java.util.Objects;

public class IdTacExpr implements Expr {

	private List<MessageToken> messageTokens;

	public IdTacExpr(List<MessageToken> messageTokens) {
		this.messageTokens = messageTokens;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		IdTacExpr idTacExpr = (IdTacExpr) o;
		return Objects.equals(messageTokens, idTacExpr.messageTokens);
	}

	public List<MessageToken> getMessageTokens() {
		return messageTokens;
	}

	@Override
	public int hashCode() {
		return Objects.hash(messageTokens);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}
}
