package model.visitor.term;

import model.term.utilities.*;

public interface PatternVisitor<R,P>  {
    R visit(AtDefMultiplePattern atDefMultiplePattern,P p);

    R visit(DefMultiplePattern defMultiplePattern,P p);

    R visit(OrMultiplePattern orMultiplePattern,P p);

    R visit(BracedPattern bracedPattern, P p);

    R visit(NumPattern numPatter,P p);

    R visit(OpsPattern opsPattern, P p);

    R visit(QualidPattern qualidPattern,P p);

    R visit(UnderscorePattern underscorePattern,P p);

}
