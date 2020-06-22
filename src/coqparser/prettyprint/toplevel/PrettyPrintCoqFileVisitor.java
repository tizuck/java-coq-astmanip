package coqparser.prettyprint.toplevel;

import coqparser.prettyprint.PrettyPrintConfiguration;
import coqparser.prettyprint.PrettyPrintContext;
import model.toplevel.CompilationUnit;
import model.toplevel.CoqFragment;
import model.visitor.toplevel.CoqFileVisitor;

public class PrettyPrintCoqFileVisitor implements CoqFileVisitor<String, PrettyPrintContext> {

    final private PrettyPrintConfiguration prettyPrintConfiguration;

    public PrettyPrintCoqFileVisitor(PrettyPrintConfiguration prettyPrintConfiguration) {
        this.prettyPrintConfiguration = prettyPrintConfiguration;
    }

    @Override
    public String visit(CompilationUnit compilationUnit, PrettyPrintContext prettyPrintContext) {
        String coqFile = "";
        for (CoqFragment coqFragment : compilationUnit.getCoqFragments()) {
            coqFile += coqFragment.accept(
                    new PrettyPrintCoqFragmentVisitor(prettyPrintConfiguration),
                    new PrettyPrintContext(0,PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI)) +
                    prettyPrintConfiguration.getEOL() + prettyPrintConfiguration.getEOL();
        }
        return coqFile;
    }
}
