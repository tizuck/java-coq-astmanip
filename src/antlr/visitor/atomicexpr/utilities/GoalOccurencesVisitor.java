package antlr.visitor.atomicexpr.utilities;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import antlr.visitor.term.IdentVisitor;
import model.tactics.atomic.utilities.AtOccurences;
import model.tactics.atomic.utilities.GoalOccurences;

import java.util.Optional;
import java.util.stream.Collectors;

public class GoalOccurencesVisitor extends GenericVisitor<GoalOccurences> {
    @Override
    public GoalOccurences visitStdGoalOccurence(coqParser.StdGoalOccurenceContext ctx) {
        return new GoalOccurences(new IdentVisitor().visit(ctx.ident()),
                ctx.at_occurences() != null ? Optional.of(new AtOccurences(new OccurencesVisitor().visit(ctx.at_occurences().occurences())))
                                            : Optional.empty(),
                ctx.first_goal_occurences_body().size() > 0 ? Optional.of(ctx.first_goal_occurences_body()
                                .stream()
                                .map(first_goal_occurences_bodyContext -> new FirstGoalOccurencesBodyVisitor().visit(first_goal_occurences_bodyContext)).collect(Collectors.toList()))
                                                            : Optional.empty(),
                ctx.second_goal_occurences_body() != null ? Optional.of(new SecondGoalOccurencesBodyVisitor().visit(ctx.second_goal_occurences_body()))
                                                          : Optional.empty());
    }
}
