package model.visitor.atomic;

import model.tactics.atomic.utilities.Delta;
import model.tactics.atomic.utilities.SingleFlag;

public interface FlagVisitor<R,P> {

    R visit(Delta delta,P p);

    R visit(SingleFlag singleFlag,P p);
}
