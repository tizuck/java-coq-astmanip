package model.visitor.expr;

import model.tactics.expr.utilities.IdMessageToken;
import model.tactics.expr.utilities.IntMessageToken;
import model.tactics.expr.utilities.StringMessageToken;

public interface MessageTokenVisitor<R,P> {

    R visit(StringMessageToken stringMessageToken,P p);

    R visit(IdMessageToken idMessageToken,P p);

    R visit(IntMessageToken intMessageToken,P p);

}
