package model.visitor.toplevel;

import model.toplevel.utilities.IdentLtacDef;
import model.toplevel.utilities.QualidLtacDef;

public interface LtacDefVisitor<R,P> {
    R visit(QualidLtacDef qualidLtacDef,P p);
    R visit(IdentLtacDef identLtacDef,P p);
}
