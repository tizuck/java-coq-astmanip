package model.tactics.expr;

import model.visitor.expr.ExprVisitor;

public interface  Expr  {
    <R,P> R  accept(ExprVisitor<R,P> exprVisitor, P p);
}
