package model.visitor.commands;

import model.commands.structcomand.utilities.DefinitionModuleType;
import model.commands.structcomand.utilities.ModuleExpressionModuleType;
import model.commands.structcomand.utilities.ModuleModuleType;
import model.commands.structcomand.utilities.QualidModuleType;

public interface ModuleTypeVisitor<R,P> {
    R visit(DefinitionModuleType definitionModuleType,P p);

    R visit(ModuleExpressionModuleType moduleExpressionModuleType,P p);

    R visit(ModuleModuleType moduleModuleType,P p);

    R visit(QualidModuleType qualidModuleType,P p);
}
