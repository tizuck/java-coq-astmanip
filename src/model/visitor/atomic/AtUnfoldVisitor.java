package model.visitor.atomic;

import model.tactics.atomic.utilities.AtUnfoldQualidBody;
import model.tactics.atomic.utilities.AtUnfoldStringBody;

public interface AtUnfoldVisitor<R,P> {
    R visit(AtUnfoldQualidBody atUnfoldQualidBody,P p);

    R visit(AtUnfoldStringBody atUnfoldStringBody,P p);
}
