package antlr.visitor.atomicexpr.utilities;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.tactics.atomic.utilities.AtOccurences;
import model.tactics.atomic.utilities.SecondGoalOccurencesBody;

import java.util.Optional;

public class SecondGoalOccurencesBodyVisitor extends GenericVisitor<SecondGoalOccurencesBody> {
    @Override
    public SecondGoalOccurencesBody visitSecond_goal_occurences_body(coqParser.Second_goal_occurences_bodyContext ctx) {
        return new SecondGoalOccurencesBody(true,
                ctx.second_goal_occurences_body_body() != null,
                ctx.second_goal_occurences_body_body() != null ? (
                        ctx.second_goal_occurences_body_body().at_occurences() != null ? Optional.of(
                                new AtOccurences(new OccurencesVisitor().visit(ctx.second_goal_occurences_body_body().at_occurences())))
                                : Optional.empty()
                        ) : Optional.empty());
    }
}
