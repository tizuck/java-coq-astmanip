package model.visitor.vernacular;

import model.vernacular.utilities.DefField;
import model.vernacular.utilities.StdField;

public interface FieldVisitor<R,P> {
    R visit(StdField stdField,P p);

    R visit(DefField defField,P p);
}
