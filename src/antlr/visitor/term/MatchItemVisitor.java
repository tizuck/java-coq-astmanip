package antlr.visitor.term;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.term.Qualid;
import model.term.utilities.MatchItem;
import model.term.utilities.Name;
import model.term.utilities.Pattern;

import java.util.List;
import java.util.Optional;

public class MatchItemVisitor extends GenericVisitor<MatchItem> {

    private final TermVisitor termVisitor;
    private final NameVisitor nameVisitor;
    private final QualidVisitor qualidVisitor;
    private final PatternVisitor patternVisitor;

    public MatchItemVisitor(TermVisitor termVisitor){
        this.termVisitor = termVisitor;
        nameVisitor = new NameVisitor();
        qualidVisitor = new QualidVisitor();
        patternVisitor = new PatternVisitor();

    }

    @Override
    public MatchItem visitMatch_item(coqParser.Match_itemContext ctx){

        Optional<Name> oName = Optional.empty();
        Optional<Qualid> oQualid = Optional.empty();
        Optional<List<Pattern>> oPattern = Optional.empty();

        if(ctx.name() != null){
            oName = Optional.of(nameVisitor.visit(ctx.name()));
        }

        if(ctx.qualid() != null){
            oQualid = Optional.of(qualidVisitor.visit(ctx.qualid()));
        }

        if(ctx.pattern() != null && ctx.pattern().size() > 0){
            ctx.pattern().forEach(patternContext -> {patternVisitor.visit(patternContext);});
        }

        return new MatchItem(termVisitor.visit(ctx.term()),
                oName,
                oQualid,
                oPattern);
    }
}
