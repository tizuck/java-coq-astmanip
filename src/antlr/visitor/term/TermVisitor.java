package antlr.visitor.term;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.term.*;
import model.term.Number;
import model.term.utilities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class TermVisitor extends GenericVisitor<Term> {

    private final BindersVisitor bindersVisitor;
    private final FixBodiesVisitor fixBodiesVisitor;
    private final CofixBodiesVisitor cofixBodiesVisitor;
    private final FixBodyVisitor fixBodyVisitor;
    private final CofixBodyVisitor cofixBodyVisitor;
    private final NameVisitor nameVisitor;
    private final DepRetTypeVisitor depRetTypeVisitor;
    private final PatternVisitor patternVisitor;
    private final QualidVisitor qualidVisitor;
    private final ArgBodyVisitor argBodyVisitor;
    private final MatchItemVisitor matchItemVisitor;
    private final EquationVisitor equationVisitor;
    private final SortVisitor sortVisitor;
    private final IdentVisitor identVisitor;

    public TermVisitor(){
        bindersVisitor = new BindersVisitor(this);
        fixBodiesVisitor = new FixBodiesVisitor(this);
        cofixBodiesVisitor = new CofixBodiesVisitor(this);
        fixBodyVisitor = new FixBodyVisitor(this);
        cofixBodyVisitor = new CofixBodyVisitor(this);
        nameVisitor = new NameVisitor();
        depRetTypeVisitor = new DepRetTypeVisitor(this);
        patternVisitor = new PatternVisitor();
        qualidVisitor = new QualidVisitor();
        argBodyVisitor = new ArgBodyVisitor(this);
        matchItemVisitor = new MatchItemVisitor(this);
        equationVisitor = new EquationVisitor(this);
        sortVisitor = new SortVisitor();
        identVisitor = new IdentVisitor();
    }
    /**
     * <p> Returns the model.term from visiting its only child. Above_term was used to seperate Term
     * in order to realize precedences. It should not appear in the generated AST </p>
     *
     * <p> Corresponding Rule: {@code model.term : above_term ;} </p>
     * @param ctx current Parse Context
     * @return Returns the model.term from visiting its only child
     */
    @Override
    public Term visitTerm(coqParser.TermContext ctx) {
        return visit(ctx.above_term());
    }

    @Override
    public Term visitOrOpsTerm(coqParser.OrOpsTermContext ctx) {

        return new OpsTerm(visit(ctx.above_term(0)),
                visit(ctx.above_term(1)),
                Operatortype.OR);
    }

    @Override
    public Term visitCofixLetTerm(coqParser.CofixLetTermContext ctx) {
        return new CofixLet(visit(ctx.cofix_term()),
                cofixBodyVisitor.visit(ctx.cofix_body()));

    }

    @Override
    public Term visitTildeOpsTerm(coqParser.TildeOpsTermContext ctx) {

        return new SingleOpsTerm(visit(ctx.above_term()), Operatortype.TILDE);
    }


    @Override
    public Term visitCompareOpsTerm(coqParser.CompareOpsTermContext ctx) {
        Operatortype operatortype1 = Operatortype.NOOP;
        Operatortype operatortype2 = Operatortype.NOOP;
        boolean toOps = false;

        BuildCompareTerm buildCompareTerm = new BuildCompareTerm(ctx, operatortype1, operatortype2, toOps).invoke();
        operatortype1 = buildCompareTerm.getOperatortype1();
        operatortype2 = buildCompareTerm.getOperatortype2();
        toOps = buildCompareTerm.isToOps();

        if(toOps){
            return new TwoOpsTerm(visit(ctx.above_term_ex_below_70(0)),
                    operatortype2,
                    visit(ctx.above_term_ex_below_70(1)),
                    operatortype1,
                    visit(ctx.above_term_ex_below_70(2)));
        }
        else {
            return new OpsTerm(visit(ctx.above_term_ex_below_70(0)),
                    visit(ctx.above_term_ex_below_70(1)),
                    operatortype1);
        }

    }

    @Override
    public Term visitNameAssignLetTerm(coqParser.NameAssignLetTermContext ctx) {
        List<Name> names = new ArrayList<>();
        Optional<List<Name>> oNames;
        Optional<DepRetType> oDepRetType;

        if(ctx.name() != null && ctx.name().size() > 0){
            ctx.name().forEach(nameContext -> {names.add(nameVisitor.visit(nameContext));});
            oNames = Optional.of(names);
        }
        else {
            oNames = Optional.empty();
        }

        if(ctx.dep_ret_type() != null){
            oDepRetType = Optional.of(depRetTypeVisitor.visit(ctx.dep_ret_type()));
        }
        else {
            oDepRetType = Optional.empty();
        }
        return new NameAssignLet(visit(ctx.name_assign_term()),
        visit(ctx.term()),
                oNames,
                oDepRetType);
    }

    @Override
    public Term visitMultTermProjectionTerm(coqParser.MultTermProjectionTermContext ctx) {
        List<Term> terms = new ArrayList<>();
        ctx.below_term_ex_minus().forEach(below_term_ex_minusContext -> {terms.add(visit(below_term_ex_minusContext));});

        return new MultTermProjectionTerm(visit(ctx.above_term())
        ,qualidVisitor.visit(ctx.qualid()),
                terms);
    }

    @Override
    public Term visitFixTerm(coqParser.FixTermContext ctx) {
        return new FixTerm(fixBodiesVisitor.visit(ctx.fix_bodies()));
    }

    @Override
    public Term visitFixLetTerm(coqParser.FixLetTermContext ctx) {
         return new FixLet( visit(ctx.fix_term()),
                 fixBodyVisitor.visit(ctx.fix_body()));
    }

    @Override
    public Term visitRecordTerm(coqParser.RecordTermContext ctx) {
        return super.visitRecordTerm(ctx);
    }

    @Override
    public Term visitIdentAssignLetTerm(coqParser.IdentAssignLetTermContext ctx) {
        Optional<List<Binder>> oBinders;
        Optional<Term> oTerm;
        Term term;

        if(ctx.binders() != null){
            oBinders = Optional.of(bindersVisitor.visit(ctx.binders()));
        }
        else {
            oBinders = Optional.empty();
        }

        if(ctx.term().size() > 1){
            oTerm = Optional.of(visit(ctx.term(0)));
            term = visit(ctx.term(1));
        }
        else {
            oTerm = Optional.empty();
            term = visit(ctx.term(0));
        }

        return new IdentAssignLet(identVisitor.visit(ctx.ident()),
                visit(ctx.ident_assign_term()),
                oBinders,
                oTerm,
                term);
    }

    @Override
    public Term visitForallTerm(coqParser.ForallTermContext ctx) {
        return new ForallTerm(bindersVisitor.visit(ctx.binders()),
                this.visitForall_term(ctx.forall_term()))
                ;
    }

    @Override
    public Term visitPrecBelow70Term(coqParser.PrecBelow70TermContext ctx) {

        return visit(ctx.above_term_ex_below_70());
    }

    @Override
    public Term visitFunTerm(coqParser.FunTermContext ctx) {

        return new FunTerm(bindersVisitor.visit(ctx.binders()),
                visitFun_term(ctx.fun_term()));
    }

    @Override
    public Term visitMultArgProjectionTerm(coqParser.MultArgProjectionTermContext ctx) {
        List<Term> args = new ArrayList<>();
        ctx.arg().forEach(argContext -> {args.add(visit(argContext));});

        return new MultArgProjectionTerm(visit(ctx.above_term()),
                qualidVisitor.visit(ctx.qualid()),
                args);
    }

    @Override
    public Term visitRecordProjectionTerm(coqParser.RecordProjectionTermContext ctx) {
        return new RecordProjectionTerm(visit(ctx.above_term()),
                qualidVisitor.visit(ctx.qualid()));
    }

    @Override
    public Term visitImpliesOpsTerm(coqParser.ImpliesOpsTermContext ctx) {
        return new OpsTerm(visit(ctx.above_term(0)),
                visit(ctx.above_term(1)),
                Operatortype.IMPLIES);
    }

    @Override
    public Term visitExistsExclamTerm(coqParser.ExistsExclamTermContext ctx) {

        List<Ident> ids = new ArrayList<>();
        ctx.ident().forEach(identContext -> {ids.
                add(identVisitor.visit(identContext));
        });
        return new ExistsExclamTerm(ids,visitExists_term(ctx.exists_term()));
    }

    @Override
    public Term visitSumOrSpecif(coqParser.SumOrSpecifContext ctx) {

        return new SumOrSpecif(visit(ctx.above_term()),
                visit(ctx.term()));
    }

    @Override
    public Term visitExistsTerm(coqParser.ExistsTermContext ctx) {
        Optional<Term> oTerm = Optional.empty();

        if(ctx.term() != null){
           oTerm =  Optional.of(visit(ctx.term()));
        }
        return new ExistsTerm(identVisitor.visit(ctx.ident()),
                oTerm,
                visitExists_term(ctx.exists_term()))
                ;
    }

    @Override
    public Term visitLColOpsTerm(coqParser.LColOpsTermContext ctx) {
        return new OpsTerm(visit(ctx.above_term(0)),
                visit(ctx.above_term(1)),
                Operatortype.LCOL);
    }

    @Override
    public Term visitAtTerm(coqParser.AtTermContext ctx) {
        Optional<List<Term>> oTerms = Optional.empty();
        List<Term> terms = new ArrayList<>();
        if(ctx.below_term_ex_minus() != null && ctx.below_term_ex_minus().size() > 0){
            ctx.below_term_ex_minus().forEach(below_term_ex_minusContext -> {terms.add(visit(below_term_ex_minusContext));});
            oTerms = Optional.of(terms);
        }
        return new AtTerm(qualidVisitor.visit(ctx.qualid()),
                oTerms);
    }

    @Override
    public Term visitCofixTerm(coqParser.CofixTermContext ctx) {
        return new CofixTerm(cofixBodiesVisitor.visit(ctx.cofix_bodies()));
    }

    @Override
    public Term visitColonOpsTerm(coqParser.ColonOpsTermContext ctx) {
        return new OpsTerm(visit(ctx.above_term(0)),
                visit(ctx.above_term(1)),
                Operatortype.COLON);
    }

    @Override
    public Term visitEquivOpsTerm(coqParser.EquivOpsTermContext ctx) {
        return new OpsTerm(visit(ctx.above_term(0)),
                visit(ctx.above_term(1)),
                Operatortype.EQUIV);
    }

    @Override
    public Term visitColGOpsTerm(coqParser.ColGOpsTermContext ctx) {
        return new SingleOpsTerm(visit(ctx.above_term()),
                Operatortype.COLG);
    }

    @Override
    public Term visitIfThenElseTerm(coqParser.IfThenElseTermContext ctx) {
        Optional<DepRetType> oDepRetType = Optional.empty();
        if(ctx.dep_ret_type() != null){
            oDepRetType = Optional.of(depRetTypeVisitor.visit(ctx.dep_ret_type()));
        }
        return new IfThenElseTerm(visit(ctx.term(0)),
                oDepRetType,
                visit(ctx.term(1)),
                visit(ctx.if_then_else_term()));
    }

    @Override
    public Term visitExists2Term(coqParser.Exists2TermContext ctx) {

        if(ctx.term().size() > 1){
            return new Exists2Term(identVisitor.visit(ctx.ident()),
                    Optional.of(visit(ctx.term(0))),
                    visit(ctx.term(1)),
                    visitExists_term(ctx.exists_term()))
                    ;
        }

        return new Exists2Term(identVisitor.visit(ctx.ident()),
                Optional.empty(),
                visit(ctx.term(0)),
                visitExists_term(ctx.exists_term()));
    }

    @Override
    public Term visitPatternAssignLetTerm(coqParser.PatternAssignLetTermContext ctx) {
        Optional<Term> oTerm;
        Term term;
        Optional<ReturnType> oReturnType;
        if(ctx.term().size() > 1){
            oTerm = Optional.of(visit(ctx.term(0)));
            term = visit(ctx.term(1));
        }
        else {
            oTerm = Optional.empty();
            term = visit(ctx.term(0));
        }

        if(ctx.return_type() != null){
            oReturnType = Optional.of(new ReturnType(visit(ctx.return_type().return_term())));
        }
        else {
            oReturnType = Optional.empty();
        }

        return new PatternAssignLet(visit(ctx.pattern_assign_term()),
                patternVisitor.visit(ctx.pattern()),
                oTerm,
                term,
                oReturnType
                );
    }

    @Override
    public Term visitAndOpsTerm(coqParser.AndOpsTermContext ctx) {
        return new OpsTerm(visit(ctx.above_term(0)),
                visit(ctx.above_term(1)),
                Operatortype.AND);
    }

    @Override
    public Term visitLineCalcOpsTerm(coqParser.LineCalcOpsTermContext ctx) {
        if(ctx.op.getType() == coqParser.SUB){
            return new OpsTerm(visit(ctx.above_term_ex_below_70(0)),
                    visit(ctx.above_term_ex_below_70(1)),
                    Operatortype.SUB);
        }
        else if (ctx.op.getType() == coqParser.ADD){
            return new OpsTerm(visit(ctx.above_term_ex_below_70(0)),
                    visit(ctx.above_term_ex_below_70(1)),
                    Operatortype.ADD);
        }
        else {
            return new OpsTerm(visit(ctx.above_term_ex_below_70(0)),
                    visit(ctx.above_term_ex_below_70(1)),
                    Operatortype.ORB);
        }
    }

    @Override
    public Term visitPointCalcAppOpsTerm(coqParser.PointCalcAppOpsTermContext ctx) {
        //collect terms from left to right
        List<SingleOpsTerm> terms = new ArrayList<>();
        ctx.arg_body().forEach(arg_bodyContext -> {terms.add(argBodyVisitor.visit(arg_bodyContext));});
        List<Term> termsBuild = new ArrayList<>();

        for(int i = 0; i < terms.size();i++){

            //ignore first app-operator
            if(i==0){
                Term term1 = visit(ctx.below_term());
                SingleOpsTerm term2 = terms.get(0);

                addOpsTermToBuildList(termsBuild, term1, term2);
            }
            //take the last term from all build terms and add it as the new left child
            //of the new Operation. Afterwards add the new term to the the terms build in an earlier step
            //providing it for the next iteration
            else {
                SingleOpsTerm term2 = terms.get(i);

                mergeTermsBuild(termsBuild, i, term2);
            }
        }

        return termsBuild.get(termsBuild.size() - 1);
    }

    private void mergeTermsBuild(List<Term> termsBuild, int index, SingleOpsTerm term2) {
        if(term2.getOperator() == Operatortype.MUL){
            termsBuild.add(new OpsTerm(termsBuild.get(index-1),
                    term2.getTerm(), Operatortype.MUL));
        }
        else if(term2.getOperator() == Operatortype.DIV){
            termsBuild.add(new OpsTerm(termsBuild.get(index-1),
                    term2.getTerm(), Operatortype.DIV));
        }
        else if(term2.getOperator() == Operatortype.MOD){
            termsBuild.add(new OpsTerm(termsBuild.get(index-1),
                    term2.getTerm(), Operatortype.MOD));
        }
        else if(term2.getOperator() == Operatortype.MOD2){
            termsBuild.add(new OpsTerm(termsBuild.get(index-1),
                    term2.getTerm(), Operatortype.MOD2));
        }
        else if(term2.getOperator() == Operatortype.APP){
            termsBuild.add(new OpsTerm(termsBuild.get(index-1),
                    term2.getTerm(), Operatortype.APP));
        }
    }

    private void addOpsTermToBuildList(List<Term> termsBuild, Term term1, SingleOpsTerm term2) {
        if(term2.getOperator() == Operatortype.MUL){

            termsBuild.add(new OpsTerm(term1,
                    term2.getTerm(), Operatortype.MUL));
        }
        else if(term2.getOperator() == Operatortype.DIV){
            termsBuild.add(new OpsTerm(term1,
                    term2.getTerm(), Operatortype.DIV));
        }
        else if(term2.getOperator() == Operatortype.MOD){
            termsBuild.add(new OpsTerm(term1,
                    term2.getTerm(), Operatortype.MOD));
        }
        else if(term2.getOperator() == Operatortype.MOD2){
            termsBuild.add(new OpsTerm(term1,
                    term2.getTerm(), Operatortype.MOD2));
        }
        else {
            termsBuild.add(new OpsTerm(term1,
                    term2.getTerm(), Operatortype.APP));
        }
    }

    @Override
    public Term visitBelowTerm(coqParser.BelowTermContext ctx) {
        return visit(ctx.below_term());
    }

    @Override
    public Term visitNegOpsTerm(coqParser.NegOpsTermContext ctx)
    {
        return new SingleOpsTerm(visit(ctx.below_term_ex_minus()),
                Operatortype.SUB);
    }

    @Override
    public Term visitBelowTermExMinus(coqParser.BelowTermExMinusContext ctx) {
        return visit(ctx.below_term_ex_minus());
    }

    @Override
    public Term visitAtomicTerm(coqParser.AtomicTermContext ctx) {
        return visit(ctx.atomic_term());
    }

    @Override
    public Term visitSig2Specif(coqParser.Sig2SpecifContext ctx) {

        return new Sig2Specif(visit(ctx.term(0)),
                visit(ctx.term(1)),
                visit(ctx.term(2)),
                identVisitor.visit(ctx.ident()));
    }

    @Override
    public Term visitSigTSpecif(coqParser.SigTSpecifContext ctx) {

        return new SigTSpecif(visit(ctx.term(0)),
                visit(ctx.term(1)),
                identVisitor.visit(ctx.ident()));
    }

    @Override
    public Term visitRewTerm(coqParser.RewTermContext ctx) {
        return visit(ctx.rew_term());
    }

    @Override
    public Term visitPowOpsTerm(coqParser.PowOpsTermContext ctx) {

        return new OpsTerm(visit(ctx.below_term_ex_minus(0)),
                visit(ctx.below_term_ex_minus(1)),
                Operatortype.POW);
    }

    @Override
    public Term visitTypeTerm(coqParser.TypeTermContext ctx) {

        return new TypeTerm(visit(ctx.below_term_ex_minus()),
                identVisitor.visit(ctx.ident()));
    }

    @Override
    public Term visitMatchTerm(coqParser.MatchTermContext ctx) {

        Optional<ReturnType> optionalReturnType = Optional.empty();
        Optional<List<Equation>> optionalEquations = Optional.empty();
        List<Equation> equations = new ArrayList<>();

        List<MatchItem> matchItems = new ArrayList<>();
        ctx.match_item().forEach(match_itemContext -> {matchItems.add(matchItemVisitor.visit(match_itemContext));});

        if(ctx.return_type() != null){
            optionalReturnType = Optional.of(new ReturnType(visit(ctx.return_type().return_term())));
        }

        if(ctx.equation() != null && ctx.equation().size() > 0){
            ctx.equation().forEach(equationContext -> {equations.add(equationVisitor.visit(equationContext));});
            optionalEquations = Optional.of(equations);
        }

        return new MatchTerm(matchItems,
                optionalReturnType,
                optionalEquations);
    }

    @Override
    public Term visitListOpsTerm(coqParser.ListOpsTermContext ctx) {
        if(ctx.op.getType() == coqParser.LISTCONC){
            return new OpsTerm(visit(ctx.above_term_ex_below_70(0)),
                    visit(ctx.above_term_ex_below_70(1)),
                            Operatortype.LISTCONC);
        }
        else {
            return new OpsTerm(visit(ctx.above_term_ex_below_70(0)),
                    visit(ctx.above_term_ex_below_70(1)),
                    Operatortype.LISTADD);
        }
    }

    @Override
    public Term visitSumBoolSpecif(coqParser.SumBoolSpecifContext ctx) {

        return new SumBoolSpecif(visit(ctx.term(0)),
                visit(ctx.term(1)));
    }

    @Override
    public Term visitSigT2Specif(coqParser.SigT2SpecifContext ctx) {
        return new SigT2Specif(visit(ctx.term(0)),
                visit(ctx.term(1)),
                identVisitor.visit(ctx.ident()),
                visit(ctx.term(2)));
    }

    @Override
    public Term visitSigSpecif(coqParser.SigSpecifContext ctx) {
        Optional<Term> optionalTerm = Optional.empty();

        if(ctx.term().size() > 1){
            optionalTerm = Optional.of(visit(ctx.term(0)));

            return new SigSpecif(visit(ctx.term(1)),
                    optionalTerm,
                    identVisitor.visit(ctx.ident()));
        }

        return new SigSpecif(visit(ctx.term(0)),
                optionalTerm,
                identVisitor.visit(ctx.ident()));


    }

    @Override
    public Term visitQualidTerm(coqParser.QualidTermContext ctx){
        return qualidVisitor.visit(ctx.qualid());
    }

    @Override
    public Term visitSortTerm(coqParser.SortTermContext ctx) {
        return sortVisitor.visit(ctx.sort());
    }

    @Override
    public Term visitMetaVariableTerm(coqParser.MetaVariableTermContext ctx) {
        return new MetaVariable(identVisitor.visit(ctx.metavariable().ident()));
    }

    @Override
    public Term visitNumTerm(coqParser.NumTermContext ctx) {
        return new Number(Integer.valueOf(ctx.NUM().getSymbol().getText()));
    }

    @Override
    public Term visitUnderscoreTerm(coqParser.UnderscoreTermContext ctx) {
        return new Underscore();
    }

    @Override
    public Term visitBracedTerm(coqParser.BracedTermContext ctx) {
        return visit(ctx.term());
    }

    @Override
    public Term visitPairTerm(coqParser.PairTermContext ctx) {

        return new Pair(visit(ctx.term(0)),
                visit(ctx.term(1)));
    }

    @Override
    public Term visitRew(coqParser.RewContext ctx) {
        return new RewTerm(visit(ctx.term()),
                visit(ctx.rew2_term()));
    }

    @Override
    public Term visitBracedRew(coqParser.BracedRewContext ctx) {
        return new BracedRewTerm(visit(ctx.term(0)),
                visit(ctx.term(1)),
                visit(ctx.rew2_term()));
    }

    @Override
    public Term visitLeftArrowRew(coqParser.LeftArrowRewContext ctx) {
        return new LeftArrowRewTerm(visit(ctx.term()),
                visit(ctx.rew2_term()));
    }

    @Override
    public Term visitLeftArrowBracedRew(coqParser.LeftArrowBracedRewContext ctx) {
        return new LeftArrowBracedRewTerm(visit(ctx.term(0)),
                visit(ctx.term(1)),
                visit(ctx.rew2_term()));
    }

    @Override
    public Term visitRightArrowRew(coqParser.RightArrowRewContext ctx) {
        return new RightArrowRewTerm(visit(ctx.term()),
                visit(ctx.rew2_term()));
    }

    @Override
    public Term visitRightArrowBracedRew(coqParser.RightArrowBracedRewContext ctx) {
        return new RightArrowBracedRewTerm(visit(ctx.term(0)),
                visit(ctx.term(1)),
                visit(ctx.rew2_term()));
    }

    @Override
    public Term visitRew2_term(coqParser.Rew2_termContext ctx) {
        return visit(ctx.term());
    }

    @Override
    public Term visitForall_term(coqParser.Forall_termContext ctx){
        return visit(ctx.term());
    }

    @Override
    public Term visitExists_term(coqParser.Exists_termContext ctx){
        return visit(ctx.term());
    }

    @Override
    public Term visitFun_term(coqParser.Fun_termContext ctx){
        return visit(ctx.term());
    }

    @Override
    public Term visitFix_body_term(coqParser.Fix_body_termContext ctx){
        return visit(ctx.term());
    }

    @Override
    public Term visitIdent_assign_term(coqParser.Ident_assign_termContext ctx){ return visit(ctx.term());}

    @Override
    public Term visitFix_term(coqParser.Fix_termContext ctx){
        return visit(ctx.term());
    }

    @Override
    public Term visitReturn_term(coqParser.Return_termContext ctx){
        return visit(ctx.term());
    }

    @Override
    public Term visitName_assign_term(coqParser.Name_assign_termContext ctx){
        return visit(ctx.term());
    }

    @Override
    public Term visitPattern_assign_term(coqParser.Pattern_assign_termContext ctx){
        return visit(ctx.term());
    }

    @Override
    public Term visitIf_then_else_term(coqParser.If_then_else_termContext ctx){
        return visit(ctx.term());
    }

    @Override
    public Term visitCofix_term(coqParser.Cofix_termContext ctx) {
        return visit(ctx.term());
    }

    @Override
    public Term visitSingleTermArg(coqParser.SingleTermArgContext ctx){
        return visit(ctx.below_term_ex_minus());
    }

    @Override
    public Term visitIdentAssignArg(coqParser.IdentAssignArgContext ctx){
        return new ArgTerm(identVisitor.visit(ctx.ident()),
                visit(ctx.term()));
    }

    @Override
    public Term visitEquation_term(coqParser.Equation_termContext ctx){
        return visit(ctx.term());
    }

    private class LessOpsTermHelper {
        private coqParser.CompareOpsTermContext ctx;
        private Operatortype operatortype1;
        private Operatortype operatortype2;
        private boolean toOps;

        public LessOpsTermHelper(coqParser.CompareOpsTermContext ctx, Operatortype operatortype1, Operatortype operatortype2, boolean toOps) {
            this.ctx = ctx;
            this.operatortype1 = operatortype1;
            this.operatortype2 = operatortype2;
            this.toOps = toOps;
        }

        public Operatortype getOperatortype1() {
            return operatortype1;
        }

        public Operatortype getOperatortype2() {
            return operatortype2;
        }

        public boolean isToOps() {
            return toOps;
        }

        public LessOpsTermHelper invoke() {
            if(ctx.LESS().size() > 1){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.LESS;
                toOps = true;
            }
            else if (ctx.GREATER().size() > 0 ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.GREATER;
                toOps = true;
            }
            else if(ctx.LOEQ().size() > 0 ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.LOEQ;
                toOps = true;
            }
            else if(ctx.GOEQ().size() > 0 ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.GOEQ;
                toOps = true;
            }
            else if(ctx.COLG() != null ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.COLG;
                toOps = true;
            }
            else if(ctx.EQUAL().size() > 0 ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.EQUAL;
                toOps = true;
            }
            return this;
        }
    }

    private class GreaterOpsTermHelper {
        private coqParser.CompareOpsTermContext ctx;
        private Operatortype operatortype1;
        private Operatortype operatortype2;
        private boolean toOps;

        public GreaterOpsTermHelper(coqParser.CompareOpsTermContext ctx, Operatortype operatortype1, Operatortype operatortype2, boolean toOps) {
            this.ctx = ctx;
            this.operatortype1 = operatortype1;
            this.operatortype2 = operatortype2;
            this.toOps = toOps;
        }

        public Operatortype getOperatortype1() {
            return operatortype1;
        }

        public Operatortype getOperatortype2() {
            return operatortype2;
        }

        public boolean isToOps() {
            return toOps;
        }

        public GreaterOpsTermHelper invoke() {
            if(ctx.LESS().size() > 0 ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.LESS;
                toOps = true;
            }
            else if (ctx.GREATER().size() > 1 ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.GREATER;
                toOps = true;
            }
            else if(ctx.LOEQ().size() > 0 ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.LOEQ;
                toOps = true;
            }
            else if(ctx.GOEQ().size() > 0 ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.GOEQ;
                toOps = true;
            }
            else if(ctx.COLG() != null){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.COLG;
                toOps = true;
            }
            else if(ctx.EQUAL().size() > 0 ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.EQUAL;
                toOps = true;
            }
            return this;
        }
    }

    private class LoeqOpsTermHelper {
        private coqParser.CompareOpsTermContext ctx;
        private Operatortype operatortype1;
        private Operatortype operatortype2;
        private boolean toOps;

        public LoeqOpsTermHelper(coqParser.CompareOpsTermContext ctx, Operatortype operatortype1, Operatortype operatortype2, boolean toOps) {
            this.ctx = ctx;
            this.operatortype1 = operatortype1;
            this.operatortype2 = operatortype2;
            this.toOps = toOps;
        }

        public Operatortype getOperatortype1() {
            return operatortype1;
        }

        public Operatortype getOperatortype2() {
            return operatortype2;
        }

        public boolean isToOps() {
            return toOps;
        }

        public LoeqOpsTermHelper invoke() {
            if(ctx.LESS().size() > 0 ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.LESS;
                toOps = true;
            }
            else if (ctx.GREATER().size() > 0 ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.GREATER;
                toOps = true;
            }
            else if(ctx.LOEQ().size() > 1){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.LOEQ;
                toOps = true;
            }
            else if(ctx.GOEQ().size() > 0 ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.GOEQ;
                toOps = true;
            }
            else if(ctx.COLG() != null){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.COLG;
                toOps = true;
            }
            else if(ctx.EQUAL().size() > 0 ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.EQUAL;
                toOps = true;
            }
            return this;
        }
    }

    private class GoeqOpsTermHelper {
        private coqParser.CompareOpsTermContext ctx;
        private Operatortype operatortype1;
        private Operatortype operatortype2;
        private boolean toOps;

        public GoeqOpsTermHelper(coqParser.CompareOpsTermContext ctx, Operatortype operatortype1, Operatortype operatortype2, boolean toOps) {
            this.ctx = ctx;
            this.operatortype1 = operatortype1;
            this.operatortype2 = operatortype2;
            this.toOps = toOps;
        }

        public Operatortype getOperatortype1() {
            return operatortype1;
        }

        public Operatortype getOperatortype2() {
            return operatortype2;
        }

        public boolean isToOps() {
            return toOps;
        }

        public GoeqOpsTermHelper invoke() {
            if(ctx.LESS().size() > 0 ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.LESS;
                toOps = true;
            }
            else if (ctx.GREATER().size() > 0 ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.GREATER;
                toOps = true;
            }
            else if(ctx.LOEQ().size() > 0 ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.LOEQ;
                toOps = true;
            }
            else if(ctx.GOEQ().size() > 1){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.GOEQ;
                toOps = true;
            }
            else if(ctx.COLG() != null){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.COLG;
                toOps = true;
            }
            else if(ctx.EQUAL().size() > 0 ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.EQUAL;
                toOps = true;
            }
            return this;
        }
    }

    private class EqualOpsTermHelper {
        private coqParser.CompareOpsTermContext ctx;
        private Operatortype operatortype1;
        private Operatortype operatortype2;
        private boolean toOps;

        public EqualOpsTermHelper(coqParser.CompareOpsTermContext ctx, Operatortype operatortype1, Operatortype operatortype2, boolean toOps) {
            this.ctx = ctx;
            this.operatortype1 = operatortype1;
            this.operatortype2 = operatortype2;
            this.toOps = toOps;
        }

        public Operatortype getOperatortype1() {
            return operatortype1;
        }

        public Operatortype getOperatortype2() {
            return operatortype2;
        }

        public boolean isToOps() {
            return toOps;
        }

        public EqualOpsTermHelper invoke() {
            if(ctx.LESS().size() > 0 ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.LESS;
                toOps = true;
            }
            else if (ctx.GREATER().size() > 0  ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.GREATER;
                toOps = true;
            }
            else if(ctx.LOEQ().size() > 0 ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.LOEQ;
                toOps = true;
            }
            else if(ctx.GOEQ().size() > 0 ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.GOEQ;
                toOps = true;
            }
            else if(ctx.COLG() != null){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.COLG;
                toOps = true;
            }
            else if(ctx.EQUAL().size() > 1){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.EQUAL;
                toOps = true;
            }
            return this;
        }
    }

    private class GuillOpsTermHelper {
        private coqParser.CompareOpsTermContext ctx;
        private Operatortype operatortype1;
        private Operatortype operatortype2;
        private boolean toOps;

        public GuillOpsTermHelper(coqParser.CompareOpsTermContext ctx, Operatortype operatortype1, Operatortype operatortype2, boolean toOps) {
            this.ctx = ctx;
            this.operatortype1 = operatortype1;
            this.operatortype2 = operatortype2;
            this.toOps = toOps;
        }

        public Operatortype getOperatortype1() {
            return operatortype1;
        }

        public Operatortype getOperatortype2() {
            return operatortype2;
        }

        public boolean isToOps() {
            return toOps;
        }

        public GuillOpsTermHelper invoke() {
            if(ctx.LESS().size() > 0 ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.LESS;
                toOps = true;
            }
            else if (ctx.GREATER().size() > 0  ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.GREATER;
                toOps = true;
            }
            else if(ctx.LOEQ().size() > 0 ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.LOEQ;
                toOps = true;
            }
            else if(ctx.GOEQ().size() > 0 ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.GOEQ;
                toOps = true;
            }
            else if(ctx.COLG() != null){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.COLG;
                toOps = true;
            }
            else if(ctx.EQUAL().size() > 0 ){
                operatortype2 = operatortype1;
                operatortype1 = Operatortype.EQUAL;
                toOps = true;
            }
            return this;
        }
    }

    private class BuildCompareTerm {
        private coqParser.CompareOpsTermContext ctx;
        private Operatortype operatortype1;
        private Operatortype operatortype2;
        private boolean toOps;

        public BuildCompareTerm(coqParser.CompareOpsTermContext ctx, Operatortype operatortype1, Operatortype operatortype2, boolean toOps) {
            this.ctx = ctx;
            this.operatortype1 = operatortype1;
            this.operatortype2 = operatortype2;
            this.toOps = toOps;
        }

        public Operatortype getOperatortype1() {
            return operatortype1;
        }

        public Operatortype getOperatortype2() {
            return operatortype2;
        }

        public boolean isToOps() {
            return toOps;
        }

        public BuildCompareTerm invoke() {
            if(ctx.op.getType()== coqParser.LESS){
                operatortype1 = Operatortype.LESS;
                LessOpsTermHelper lessOpsTermHelper = new LessOpsTermHelper(ctx, operatortype1, operatortype2, toOps).invoke();
                operatortype1 = lessOpsTermHelper.getOperatortype1();
                operatortype2 = lessOpsTermHelper.getOperatortype2();
                toOps = lessOpsTermHelper.isToOps();
            }
            else if (ctx.op.getType()==coqParser.GREATER){
                operatortype1 = Operatortype.GREATER;
                GreaterOpsTermHelper greaterOpsTermHelper = new GreaterOpsTermHelper(ctx, operatortype1, operatortype2, toOps).invoke();
                operatortype1 = greaterOpsTermHelper.getOperatortype1();
                operatortype2 = greaterOpsTermHelper.getOperatortype2();
                toOps = greaterOpsTermHelper.isToOps();
            }
            else if (ctx.op.getType()==coqParser.LOEQ){

                operatortype1 = Operatortype.LOEQ;
                LoeqOpsTermHelper loeqOpsTermHelper = new LoeqOpsTermHelper(ctx, operatortype1, operatortype2, toOps).invoke();
                operatortype1 = loeqOpsTermHelper.getOperatortype1();
                operatortype2 = loeqOpsTermHelper.getOperatortype2();
                toOps = loeqOpsTermHelper.isToOps();
            }
            else if (ctx.op.getType()==coqParser.GOEQ){
                operatortype1 = Operatortype.GOEQ;
                GoeqOpsTermHelper goeqOpsTermHelper = new GoeqOpsTermHelper(ctx, operatortype1, operatortype2, toOps).invoke();
                operatortype1 = goeqOpsTermHelper.getOperatortype1();
                operatortype2 = goeqOpsTermHelper.getOperatortype2();
                toOps = goeqOpsTermHelper.isToOps();
            }
            else if (ctx.op.getType()==coqParser.EQUAL){
                operatortype1 = Operatortype.EQUAL;
                EqualOpsTermHelper equalOpsTermHelper = new EqualOpsTermHelper(ctx, operatortype1, operatortype2, toOps).invoke();
                operatortype1 = equalOpsTermHelper.getOperatortype1();
                operatortype2 = equalOpsTermHelper.getOperatortype2();
                toOps = equalOpsTermHelper.isToOps();
            }
            else if(ctx.op.getType()==coqParser.GUILL){
                operatortype1 = Operatortype.GUILL;
                GuillOpsTermHelper guillOpsTermHelper = new GuillOpsTermHelper(ctx, operatortype1, operatortype2, toOps).invoke();
                operatortype1 = guillOpsTermHelper.getOperatortype1();
                operatortype2 = guillOpsTermHelper.getOperatortype2();
                toOps = guillOpsTermHelper.isToOps();
            }
            return this;
        }
    }
}
