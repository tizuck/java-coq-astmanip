package antlr.visitor.vernacular;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.term.BindersVisitor;
import antlr.visitor.term.IdentVisitor;
import antlr.visitor.term.SortVisitor;
import antlr.visitor.term.TermVisitor;
import model.term.Sort;
import model.term.utilities.Binder;
import model.term.utilities.Ident;
import model.vernacular.*;
import model.vernacular.utilities.Field;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VernacularVisitor extends GenericVisitor<Sentence> {

    private final DefinitionVisitor definitionVisitor;
    private final AssumptionVisitor assumptionVisitor;
    private final InductiveVisitor inductiveVisitor;
    private final FixPointVisitor fixPointVisitor;

    public VernacularVisitor(){
        definitionVisitor = new DefinitionVisitor();
        assumptionVisitor = new AssumptionVisitor();
        inductiveVisitor = new InductiveVisitor();
        fixPointVisitor = new FixPointVisitor();
    }

    @Override
    public Sentence visitAssumpt(coqParser.AssumptContext ctx) {
        return assumptionVisitor.visit(ctx.assumption());
    }

    @Override
    public Sentence visitDef(coqParser.DefContext ctx){
        return definitionVisitor.visit(ctx.definition());
    }

    @Override
    public Sentence visitInd(coqParser.IndContext ctx) {
        return inductiveVisitor.visit(ctx.inductive());
    }

    @Override
    public Sentence visitFix(coqParser.FixContext ctx) {
        return fixPointVisitor.visit(ctx.fixpoint());
    }

    @Override
    public Sentence visitRec(coqParser.RecContext ctx) {
        Optional<List<Binder>> optionalBinders = Optional.empty();
        Optional<Sort> optionalSort = Optional.empty();
        Optional<Ident> optionalIdent = Optional.empty();
        Optional<List<Field>> optionalFields = Optional.empty();

        if(ctx.record().binders() != null){
           optionalBinders = Optional.of(new BindersVisitor(new TermVisitor()).visit(ctx.record().binders()));
        }

        if(ctx.record().sort() != null){
            optionalSort = Optional.of(new SortVisitor().visit(ctx.record().sort()));
        }

        if(ctx.record().ident().size() > 1){
            optionalIdent = Optional.of(new IdentVisitor().visit(ctx.record().ident(1)));
        }

        if(ctx.record().field() != null && ctx.record().field().size() > 0){
            List<Field> fields = new ArrayList<>();
            ctx.record().field().forEach(fieldContext -> {fields.add(new FieldVisitor().visit(fieldContext));});
            optionalFields = Optional.of(fields);
        }


        return new Record(new RecordKeywordVisitor().visit(ctx.record().record_keyword()),
                new IdentVisitor().visit(ctx.record().ident(0)),
                optionalBinders,
                optionalSort,
                optionalIdent,
                optionalFields);

    }

    @Override
    public Sentence visitAssert(coqParser.AssertContext ctx) {
        Optional<List<Binder>> optionalBinders = Optional.empty();

        if(ctx.assertion().binders() != null){
            optionalBinders = Optional.of(new BindersVisitor(new TermVisitor()).visit(ctx.assertion().binders()));
        }
        return new Assertion(new AssertionKeywordVisitor().visit(ctx.assertion().assertion_keyword()),
                new IdentVisitor().visit(ctx.assertion().ident()),
                optionalBinders,
                new TermVisitor().visit(ctx.assertion().term()),
                ctx.proof() != null ?
                Optional.of(new ProofVisitor().visit(ctx.proof())) : Optional.empty());
    }

    @Override
    public Sentence visitGo(coqParser.GoContext ctx) {
        return new Goal(new TermVisitor().visit(ctx.goal().term()),
                null);
    }
}
