package coqparser.prettyprint.commands;

import coqparser.prettyprint.PrettyPrintConfiguration;
import coqparser.prettyprint.PrettyPrintContext;
import coqparser.prettyprint.term.PrettyPrintTermVisitor;
import model.commands.structcomand.utilities.DefinitionModuleType;
import model.commands.structcomand.utilities.ModuleExpressionModuleType;
import model.commands.structcomand.utilities.ModuleModuleType;
import model.commands.structcomand.utilities.QualidModuleType;
import model.term.Qualid;
import model.visitor.commands.ModuleTypeVisitor;

public class PrettyPrintModuleTypeVisitor implements ModuleTypeVisitor<String, PrettyPrintContext> {

    private PrettyPrintConfiguration prettyPrintConfiguration;

    public PrettyPrintModuleTypeVisitor(PrettyPrintConfiguration prettyPrintConfiguration) {
        this.prettyPrintConfiguration = prettyPrintConfiguration;
    }

    @Override
    public String visit(DefinitionModuleType definitionModuleType, PrettyPrintContext prettyPrintContext) {
        return definitionModuleType.getModuleType().accept(this,prettyPrintContext) +
                " with " +
                " Definition " +
                definitionModuleType.getQualid().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                +
                " := " +
                definitionModuleType.getTerm().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
    }

    @Override
    public String visit(ModuleExpressionModuleType moduleExpressionModuleType, PrettyPrintContext prettyPrintContext) {
        String qualids = "";
        for (Qualid qualid : moduleExpressionModuleType.getModuleExpression().getQualids()) {
            qualids += " " + qualid.accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                    new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
        }
        return (moduleExpressionModuleType.getModuleExpression().isHasExclamationMark()? "!":"") +
                qualids;
    }

    @Override
    public String visit(ModuleModuleType moduleModuleType, PrettyPrintContext prettyPrintContext) {
        return moduleModuleType.getModuleType().accept(this,prettyPrintContext) +
                " with " +
                " module " +
                moduleModuleType.getQualid1().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))
                +
                " := " +
                moduleModuleType.getQualid2().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                        new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
    }

    @Override
    public String visit(QualidModuleType qualidModuleType, PrettyPrintContext prettyPrintContext) {
        return qualidModuleType.getQualid().accept(new PrettyPrintTermVisitor(prettyPrintConfiguration),
                new PrettyPrintContext(prettyPrintContext.getIndentationLevel().getIndentation(),PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI));
    }
}
