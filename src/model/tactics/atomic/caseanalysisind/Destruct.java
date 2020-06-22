package model.tactics.atomic.caseanalysisind;

import model.tactics.atomic.AtomicTacticExpr;
import model.tactics.atomic.tacargcomponents.*;
import model.tactics.atomic.utilities.DisjConjIntroPattern;
import model.term.Term;
import model.visitor.expr.ExprVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Destruct extends AtomicTacticExpr {

	public Destruct(TermComponent term) {
		tacArgs.add(term);

	}

	private Destruct(List<TacArgComponent> tacArgs){

		this.tacArgs.addAll(tacArgs);
	}


	public Destruct(TermComponent term, GoalOccurencesComponent goalOccurences) {
		tacArgs.add(term);
		tacArgs.add(goalOccurences);
	}

	public Destruct(TermComponent term, BindingListComponent bindingList, DisjConjIntroPatternComponent disjConjIntroPatternComponent){
		tacArgs.add(term);
		tacArgs.add(bindingList);
		tacArgs.add(disjConjIntroPatternComponent);
	}

	public Destruct(TermComponent term, DisjConjIntroPatternComponent disjConjIntroPattern){
		tacArgs.add(term);
		tacArgs.add(disjConjIntroPattern);
	}

	public static Destruct ofNums(TermComponent term, NumberListComponent nums){
		List<TacArgComponent> tacArgs = new ArrayList<TacArgComponent>();
		tacArgs.add(term);
		tacArgs.add(nums);
		return new Destruct(tacArgs);
	}

	public static Destruct ofTerms(TermListComponent terms){
		List<TacArgComponent> tacArgs = new ArrayList<TacArgComponent>();
		tacArgs.add(terms);
		return new Destruct(tacArgs);
	}

	public static Destruct ofTermAsList(List<DisjConjIntroPattern> disjConjIntroPatterns, List<Term> terms){
		List<TacArgComponent> tacArgComponents = new ArrayList<>();
		tacArgComponents.add(new TermDisjConjIntroPatternListComponent(disjConjIntroPatterns,terms));
		return new Destruct(tacArgComponents);
	}

	public static Destruct ofTermUsing(TermComponent term1, TermComponent term2, Optional<BindingListComponent> oBindingList){
		List<TacArgComponent> tacArgComponents = new ArrayList<>();
		tacArgComponents.add(term1);
		tacArgComponents.add(term2);
		if(oBindingList.isPresent()){
			tacArgComponents.add(oBindingList.get());
		}
		return new Destruct(tacArgComponents);
	}

	@Override
	public <R, P> R accept(ExprVisitor<R, P> exprVisitor, P p) {
		return exprVisitor.visit(this,p);
	}

}
