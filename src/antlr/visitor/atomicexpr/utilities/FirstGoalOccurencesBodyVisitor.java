package antlr.visitor.atomicexpr.utilities;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.term.IdentVisitor;
import model.tactics.atomic.utilities.AtOccurences;
import model.tactics.atomic.utilities.FirstGoalOccurencesBody;

import java.util.Optional;

public class FirstGoalOccurencesBodyVisitor extends GenericVisitor<FirstGoalOccurencesBody> {

    @Override
    public FirstGoalOccurencesBody visitFirst_goal_occurences_body(coqParser.First_goal_occurences_bodyContext ctx) {
        return new FirstGoalOccurencesBody(new IdentVisitor().visit(ctx.ident()),
                ctx.at_occurences() != null ? Optional.of(new AtOccurences(new OccurencesVisitor().visit(ctx.at_occurences().occurences())))
                                            : Optional.empty());
    }
}
