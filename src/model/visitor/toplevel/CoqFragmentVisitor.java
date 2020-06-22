package model.visitor.toplevel;

import model.commands.UndefinedCommand;
import model.commands.structcomand.*;
import model.toplevel.LtacCoqFragment;
import model.vernacular.*;

public interface CoqFragmentVisitor<R,P> {

    R visit(Assertion assertion, P p);

    R visit(Assumption assumption, P p);

    R visit(CoFixPoint coFixPoint, P p);

    R visit(CoInductive coInductive, P p);

    R visit(Goal goal,P p);

    R visit(LetDefinition letDefinition,P p);

    R visit(Record record, P p);

    R visit(StdDefinition stdDefinition,P p);

    R visit(StdFixPoint stdFixPoint,P p);

    R visit(StdInductive stdInductive,P p);

    R visit(LtacCoqFragment ltacCoqFragment,P p);

    R visit(End end,P p);

    R visit(Include include,P p);

    R visit(Module module, P p);

    R visit(Require require, P p);

    R visit(RequireExport requireExport,P p);

    R visit(RequireImport requireImport, P p);

    R visit(Section section, P p);

    R visit(UndefinedCommand undefinedCommand, P p);
}
