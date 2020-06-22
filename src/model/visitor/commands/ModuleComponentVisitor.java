package model.visitor.commands;

import model.commands.structcomand.utilities.*;

public interface ModuleComponentVisitor<R,P> {

    R visit(DefComponent defComponent,P p);

    R visit(ModuleTypeComponent moduleTypeComponent,P p);

    R visit(ExportComponent exportComponent,P p);

    R visit(IdentComponent identComponent,P p);

    R visit(ImportComponent importComponent,P p);

    R visit(LAddComponent lAddComponent,P p);

    R visit(LAddModuleExpressionComponent lAddModuleExpressionComponent,P p);

    R visit(LColonComponent lColonComponent,P p);

    R visit(ModuleBindingsComponent moduleBindingsComponent,P p);

    R visit(ModuleExpressionDefComponent moduleExpressionDefComponent,P p);

    R visit(ModuleTypeColonComponent moduleTypeColonComponent,P p);

    R visit(ModuleTypeLColonComponent moduleTypeLColonComponent,P p);
}
