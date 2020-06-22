package antlr.visitor.toplevel;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.toplevel.CompilationUnit;

import java.util.stream.Collectors;

public class CoqFileVisitor extends GenericVisitor<CompilationUnit> {
    @Override
    public CompilationUnit visitCoq_file(coqParser.Coq_fileContext ctx) {
        return new CompilationUnit(
                ctx.coq_fragment().stream()
                .map(coq_fragmentContext -> new CoqFragmentVisitor().visit(coq_fragmentContext))
                .collect(Collectors.toList())
        );
    }
}
