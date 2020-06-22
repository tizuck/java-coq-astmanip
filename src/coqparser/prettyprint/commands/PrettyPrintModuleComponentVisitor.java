package coqparser.prettyprint.commands;

import coqparser.prettyprint.PrettyPrintContext;
import coqparser.prettyprint.term.PrettyPrintIdentVisitor;
import model.commands.structcomand.utilities.*;
import model.visitor.commands.ModuleComponentVisitor;

public class PrettyPrintModuleComponentVisitor implements ModuleComponentVisitor<String, PrettyPrintContext> {
    @Override
    public String visit(DefComponent defComponent, PrettyPrintContext prettyPrintContext) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String visit(ModuleTypeComponent moduleTypeComponent, PrettyPrintContext prettyPrintContext) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String visit(ExportComponent exportComponent, PrettyPrintContext prettyPrintContext) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String visit(IdentComponent identComponent, PrettyPrintContext prettyPrintContext) {
        return identComponent.getId().accept(new PrettyPrintIdentVisitor(),prettyPrintContext);
    }

    @Override
    public String visit(ImportComponent importComponent, PrettyPrintContext prettyPrintContext) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String visit(LAddComponent lAddComponent, PrettyPrintContext prettyPrintContext) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String visit(LAddModuleExpressionComponent lAddModuleExpressionComponent, PrettyPrintContext prettyPrintContext) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String visit(LColonComponent lColonComponent, PrettyPrintContext prettyPrintContext) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String visit(ModuleBindingsComponent moduleBindingsComponent, PrettyPrintContext prettyPrintContext) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String visit(ModuleExpressionDefComponent moduleExpressionDefComponent, PrettyPrintContext prettyPrintContext) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String visit(ModuleTypeColonComponent moduleTypeColonComponent, PrettyPrintContext prettyPrintContext) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String visit(ModuleTypeLColonComponent moduleTypeLColonComponent, PrettyPrintContext prettyPrintContext) {
        throw new UnsupportedOperationException();
    }
}
