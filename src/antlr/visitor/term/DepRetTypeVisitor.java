package antlr.visitor.term;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.term.utilities.DepRetType;
import model.term.utilities.Name;
import model.term.utilities.ReturnType;

import java.util.Optional;

public class DepRetTypeVisitor extends GenericVisitor<DepRetType> {

    private final NameVisitor nameVisitor;
    private final TermVisitor termVisitor;

    public DepRetTypeVisitor(TermVisitor termVisitor){
        nameVisitor = new NameVisitor();
        this.termVisitor = termVisitor;
    }
    @Override
    public DepRetType visitDep_ret_type(coqParser.Dep_ret_typeContext ctx){
        Optional<Name> oName;
        if(ctx.name() != null){
            oName = Optional.of(nameVisitor.visit(ctx.name()));
        }
        else {
            oName = Optional.empty();
        }

        return new DepRetType(oName,
                new ReturnType(termVisitor.visit(ctx.return_type().return_term())));
    }
}
