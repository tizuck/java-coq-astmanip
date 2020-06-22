grammar coq;

@header {
    package antlr;
}

/**************************************
* Coq File
**************************************/
coq_file : (coq_fragment)+
         ;

coq_fragment : sentence      #sentenceFragment
             | ltac '.'      #ltacFragment
             | command '.'   #commandFragment
             ;

bullet : '-'    #sub
       | '+'    #add
       | '*'    #mul
       | '--'   #sub2
       | '++'   #add2
       | '**'   #mul2
       | '---'  #sub3
       | '+++'  #add3
       | '***'  #mul3
       | '...'  #dot
       ;


/**************************************
* COQ COMMANDS
**************************************/

command : structural_command    #structCommand
        | undefined_command     #undefinedCommand
        ;

undefined_command : .+? ;

structural_command : ('From' STRING)? 'Require' qualid  		#stdRequire
    | 'Require' 'Import' qualid           				#importRequire
    | 'Require' 'Export' qualid           				#exportRequire
    | 'Require' 'Import' qualid+          				#importQualidsRequire
    | 'Require'  'Export' qualid+         				#exportQualidsRequire
    | 'Section' ident                     				#stdSection
    | 'End' ident                         				#stdEnd
    | 'Module' ident  (module_bindings)?  				#stdModule
    | 'Module' ident  module_type         				#moduleTypeModule
    | 'Module' ident  (module_bindings)? ':' module_type  		#moduleTypeColonModule
    | 'Module' ident  '<:' module_type ('<:' module_type)*  		#moduleTypesLColonModule
    | 'Module' '[' 'Export' ']'           				#exportModule
    | 'Module' '[' 'Import' ']'           				#importModule
    | 'Module' ident  (module_bindings)?
	  (':' module_type)? ':=' module_expression             	#moduleExprDefModule
    | 'Module' 'Type' ident (module_bindings)?              		#moduletype
    | 'Module' ident  (module_bindings)? '<:' module_type
	  ('<:' module_type)* ':=' module_expression            	#moduleTypesLGrModule
    | 'Module' ident  (module_bindings)? ':=' module_expression
	  ('<+' module_expression)*        				#moduleExprLAddModule
    | 'Include' module_type               #stdInclude
    | 'Include' module_type ('<+' module_type)*            		#moduleTypesInclude
    ;

proof_command :
    'Qed'
    | 'Defined'
    | 'Admitted'
    | 'Proof' (term)?
    | 'Proof' 'using' ident+ ('with' expr)?
    | 'Proof' 'using' 'All'
    | 'Proof' 'using' 'Type'
    | 'Proof' 'using' 'Type*'
    | 'Proof' 'using' '-' '(' ident+ ')'
    | 'Proof' 'using' collection
    | 'Default' 'Proof' 'Using' STRING
    | 'Suggest' 'Proof' 'Using'
    | 'Abort'
    | 'Abort' ident
    | 'Abort' 'All'
    | 'Existential' NUM ':=' term
    | 'Grab' 'Existential' 'Variables'
    | 'Undo'
    | 'Undo' NUM
    | 'Restart'
    | 'Focus'
    | 'Focus' NUM
    | 'Unfocus'
    | 'Unfocused'
    | '{' '|' '}'
    | NUM ':' '{'
    | 'Guarded'
    | 'Automatic' 'Introduction'
    | 'Optimize' ('Proof'|'Heap')
    ;

collection : collection '*' collection
    | collection '+' collection
    | collection '-' collection
    | collection '-' '(' ident+ ')'
    | collection '*'
    | 'Collection' ident ':=' section_subset_expr
    | 'Collection' KeySOME ':=' ident ident ident
    | 'Collection' 'Fewer' ':=' KeySOME '-' ident
    | 'Collection' 'Many' ':=' 'Fewer' ('+'|'-') KeySOME
    | 'Collection' 'Many' ':=' 'Fewer' '-' '(' ident  ident  ')'
    ;

section_subset_expr : 'section_subset_expr';

/**************************************
* THE TACTIC LANGUAGE
**************************************/

tactic_invocation : (toplevel_selector ':')? expr '.'
                  ;

binding_list : (num_binding_list_body)+        #numBinding
    | (ident_binding_list_body )+      #identBinding
    | below_term_ex_minus+             #belowTerms
    ;

num_binding_list_body : '('  NUM ':=' term ')';
ident_binding_list_body : '('  ident  ':=' term ')';

atomic_tactic :
	applying_theorem          #applying_theoremAtomic
    | managing_local_context      #managing_local_contextAtomic
    | controlling_proof_flow      #controlling_proof_flowAtomic
    | case_analysis_induction     #case_analysis_inductionAtomic
    | rewriting_expressions       #rewriting_expressionsAtomic
    | performing_computation      #performing_computationAtomic
    | conversion_tactics_hypo     #conversion_tactics_hypoAtomic
    | automation                  #automationAtomic
    | decision_procedures         #decision_proceduresAtomic
    | checking_properties         #checking_propertiesAtomic
    | equality                    #equalityAtomic
    | equality_inductive_sets     #equality_inductive_setsAtomic
    | inversion                   #inversionAtomic
    | classical_tactics           #classical_tacticsAtomic
    | automatizing                #automatizingAtomic
    | non_logical                 #non_logicalAtomic
    ;

non_logical :
    'cycle' ('-')? NUM              #cycle
    | 'swap' ('-')? NUM ('-')? NUM  #swap
    | 'revgoals'                    #revgoals
    | 'shelve'                      #shelve
    | 'shelve_unifiable'            #shelve_unifiable
    ;

automatizing :
    'btauto'                                   #btauto
    | 'omega'                                  #omega
    | 'ring'                                   #ring
    | 'ring_simplify' below_term_ex_minus+     #ring_simplify
    | 'field'                                  #fieldAutomatizing
    | 'field_simplify' below_term_ex_minus+    #field_simplify
    | 'field_simplify_eq'                      #field_simplify_eq
    | 'fourier'                                #fourier
    ;

classical_tactics :
    'classical_left'    #classical_left
    | 'classical_right'   #classical_right
    ;

inversion :
    'functional' 'inversion' ident  (qualid)?    #identFunctionalInversion
    | 'functional' 'inversion' NUM (qualid)?      #numFunctionalInversion
    | 'quote' ident+                              #quote
    ;

equality_inductive_sets :
    'decide' 'equality'               			#decideEquality
    | 'compare' atomic_term atomic_term                 #compare
    | 'simplify_eq' term ('with' binding_list)?		#termSimplify_Eq
    | 'esimplify_eq' term
    ('with' binding_list)?     		          	#termESimplify_Eq
    | 'simplify_eq' NUM                			#numSimplify_Eq
    | 'esimplify_eq' NUM               			#numESimplify_Eq
    | 'simplify_eq'                     	    #simplify_Eq
    | 'dependent' 'rewrite' '<-' ident 			#dependentRewirte
                        ;
equality :
    'f_equal'                      #f_equals
    | 'reflexivity'                #reflexivity
    | 'symmetry' ('in' ident)?     #symmetry
    | 'transitivity' term          #transitivity
    ;


checking_properties :
    'constr_eq' atomic_term atomic_term   				#constrEq
    | 'unify' atomic_term atomic_term ('with' ident)?   #unify
    | 'is_evar' term                  					#is_Evar
    | 'has_evar' term                 					#has_Evar
    | 'is_var' term                   					#is_Var
    ;

decision_procedures :
    'tauto'                             #tAuto
    | 'dtauto'                        	#dTAuto
    | 'intuition' expr                	#exprIntuition
    | 'intuition'                    	#intuition
    | 'dintuition'                    	#dtintuition
    | 'rtauto'                        	#rtAuto
    | 'firstorder'                    	#firstorder
    | 'firstorder' 'using' qualid+    	#usingFirstorder
    | 'firstorder' 'with' ident+      	#withFirstorder
    | 'firstorder' 'tactic' 'using'
	  qualid+ 'with' ident+       	#usingWithFirstorder
    | 'congruence'                   	#congruence
    | 'congruence n'                 	#congruenceN
    | 'congruence' 'with' atomic_term+	#withCongruence
    ;

automation :
    'auto'                                                   #auto
    | 'eauto'                                                #eAuto
    | 'auto' NUM                                             #numAuto
    | 'eauto' NUM                                            #numEAuto
    | 'auto' 'with *'                                        #withStarAuto
    | 'auto' 'with' ident+                                   #withAuto
    | 'eauto' 'with' ident+                                  #withEAuto
    | 'eauto' 'with *'                                       #withStartEAuto
    | 'auto' 'using' lemma+                                  #usingAuto
    | 'eauto' 'using' lemma+                                 #usingEAuto
    | 'auto' NUM ('using' lemma+)? ('with' ident+)?          #numUsingWithAuto
    | 'info_auto' NUM ('using' lemma+)? ('with' ident+)?     #numUsingWithInfo_Auto
    | 'info_auto'                                            #info_auto
    | 'debug' 'auto'                                         #debugAuto
    | 'trivial'                                              #trivial
    | 'trivial' 'with' ident+                                #withTrivial
    | 'trivial' 'with *'                                     #withStarTrivial
    | 'trivial' 'using' lemma+                               #usingTrivial
    | 'debug' 'trivial'                                      #debugTrivial
    | 'info_trivial'                                         #info_trivial
    | 'autounfold' 'with' ident+ ('in' 'clause')?            #withAutounfold
    | 'autounfold' 'with' '*'                                #withStartAutounfold
    | 'autorewrite' 'with' ident+                            #withAutorewrite
    | 'autorewrite' 'with' ident+ 'using' expr               #withUsingAutoRewrite
    | 'autorewrite' 'with' ident+ 'in' qualid                #withInAutoRewrite
    | 'autorewrite' 'with' ident+ 'in' qualid 'using' expr   #withInUsingAutoRewrite
    | 'autorewrite' 'with' ident+ 'in' 'clause'              #withInClauseAutorewrite
    | 'easy'                                                 #easy
    | 'now' expr                                             #now
    ;

conversion_tactics_hypo : 'conv_tactic' 'in' ident (',' ident)*;

performing_computation :
    'cbv' (flag)*                                 #cbv
    | 'lazy' (flag)*                              #lazy
    | 'compute' ('-')? (qualid)+                  #compute
    | 'cbv' ('-')? qualid+                        #cbvQualid
    | 'lazy' ('-')? qualid+                       #lazyQualid
    | 'vm_compute'                                #vm_compute
    | 'native_compute'                            #native_compute
    | 'red'                                       #red
    | 'red' 'in' ident                            #identRed
    | 'hnf'                                       #hnf
    | 'cbn'                                       #cbnSingleCommand
    | 'cbn' ('-')? qualid                         #cbn
    | 'simpl'                                     #simpl
    | 'simpl' 'in' ident (',' ident)*             #simpleIn
    | 'simpl' 'in' '*'                            #simpleStar
    | 'simpl' pattern2 ('at' NUM+)?               #simplPattern
    | 'simpl' qualid ('at' NUM+)?                 #simpleQualid
    | 'simpl' STRING ('at' NUM+)?                 #simplString
    | 'unfold' qualid ('in' ident)?               #unfoldQualidIn
    | 'unfold' qualid (',' qualid)*               #commaUnfoldQualid
    | 'unfold' qualidNumAt (',' qualidNumAt)*     #atUnfoldQualid
    | 'unfold' STRING                             #unfoldString
    | 'unfold' STRING '%' ident                   #percUnfoldString
    | 'unfold' STRING 'at' NUM (',' NUM)*
      (',' STRING 'at' NUM (',' NUM)*)*           #atUnfoldString
    | 'fold' term+                                #fold
    | 'pattern' term                              #performingCompuationPattern
    | 'pattern' term 'at' (SUB)? NUM+             #atPattern
    | 'pattern' term (',' term)*                  #termsPattern
    | 'pattern' term 'at'(SUB)? NUM (',' NUM)*
      (',' term 'at' (SUB)? NUM (',' NUM)*)*      #atTermsPattern
    ;

qualidNumAt : qualid 'at' NUM (',' NUM)*;

rewriting_expressions :
    'rewrite'(rew_prefix)? term                         #termRewrite
    | 'erewrite' (rew_prefix)? term                     #termERewrite
    | 'rewrite' '->' (rew_prefix)? term                 #rightArrowRewrite
    | 'rewrite' '<-' (rew_prefix)? term                 #leftArrowRewrite
    | 'rewrite' (rew_prefix)? term 'in' 'clause'        #termInClauseRewrite
    | 'rewrite' (rew_prefix)? term 'at' occurences      #termAtOccurencesRewrite
    | 'rewrite' (rew_prefix)? term 'by' expr            #termByRewrite
    | 'rewrite' (rew_prefix)? ('<-'|'->')? atomic_term
      ((',')? (rew_prefix)? ('<-'|'->')? atomic_term)*  #atomic_TermsRewrite
    | 'replace' term 'with' term 'by' 'tactic'          #termWithTacticReplace
    | 'replace' term 'with' term 'in' 'clause'          #termWithClauseReplace
    | 'replace' term 'with' term                        #termWithReplace
    | 'replace' '->' term                               #rightArrowReplace
    | 'replace' '<-' term                               #leftArrowReplace
    | 'replace' term 'with' term 'in' 'clause'
      'by' 'tactic'                                     #termClauseTacticReplace
    | 'replace' term 'in' 'clause' 'replace' '->'
      term 'in' 'clause'                                #doubleReplace
    | 'replace' '<-' term 'in' 'clause'                 #leftArrowClauseReplace
    | 'subst' ident+                                    #identsSubst
    | 'subst'                                           #subst
    | 'stepl' term ('by' expr)?                         #termStepl
    | 'stepr' term 'stepr' term 'by' 'tactic'           #termByStepl
    | 'change' term  'with' term 'in' ident             #termWithInChange
    | 'change' term  'with' term                        #termWithChange
    | 'change' term 'in' ident                          #termInChange
    | 'change' term 'at' NUM (NUM)* 'with' term
      ('in' ident)?                                     #termAtWithChange
    ;

rew_prefix : (NUM)? '?' #question
           | (NUM)? '!' #exclamation
           ;

case_analysis_induction :
    'destruct' term                                                     #termDestruct
    | 'edestruct' term                                                  #termEDestruct
    | 'destruct' term (',' term )*                                      #termsDestruct
    | 'destruct' term 'as' disj_conj_intro_pattern                      #termAsDestruct
    | 'destruct' term 'as' disj_conj_intro_pattern
      (',' term 'as' disj_conj_intro_pattern)*                          #termAsListDestruct
    | 'destruct' term 'eq' naming_intro_pattern                         #termEqDestruct
    | 'destruct' term 'with' binding_list                               #termWithDestruct
    | 'destruct' term 'with' binding_list 'as'
      disj_conj_intro_pattern                                           #termWithAsDestruct
    | 'destruct' term 'using' term ('with' binding_list)?               #termUsingDestruct
    | 'destruct' term 'in' goal_occurrences                             #termInDestruct
    | 'destruct' term 'at' NUM+                                         #termAtDestruct
    | 'case' term ('with' binding_list )?                               #case
    | 'ecase' term ('with' binding_list )?                              #ecase
    | 'simple' 'destruct' (ident|NUM)                                   #simpleDestruct
    | 'case_eq' term                                                    #case_Eq
    | 'induction' term ('with' binding_list)?                           #termInduction
    | 'induction' term 'as' disj_conj_intro_pattern ('using' term)?     #termAsInduction
    | 'induction' term 'using' term ('with' binding_list)?              #termUsingInduction
    | 'induction' term (',' term)* 'using' qualid                       #termsUsingInduction
    | 'induction' term 'in' goal_occurrences                            #termInInduction
    | 'einduction' term                                                 #termEInduction
    | 'induction' term 'with' binding_list 'as' disj_conj_intro_pattern
      'using' term 'with' binding_list 'in' goal_occurrences            #withAsUsingInduction
    | 'einduction' term 'with' binding_list 'as'
      disj_conj_intro_pattern 'using' term 'with'binding_list
      'in' goal_occurrences                                             #withAsUsingInduction
    | 'elim' term                                                       #termElim
    | 'eelim' term                                                      #termEElim
    | 'elim' term 'with' binding_list                                   #termWithElim
    | 'elim' term 'using' term ('with' binding_list)?                   #termUsingElim
    | 'elim' term 'with' binding_list 'using' term 'with' binding_list  #withUsingWithElim
    | 'eelim' term 'with' binding_list 'using' term 'with' binding_list #withUsingWithEElim
    | 'elimtype' term                                                   #elimType
    | 'simple' 'induction' ident                                        #identSimpleInducti
    | 'simple' 'induction' NUM                                          #numSimpleInducti
    | 'double' 'induction' ident ident                                  #identDoubleInduction
    | 'double' 'induction' NUM NUM                                      #numDoubleInduction
    | 'dependent' 'induction' ident ('generalizing' ident+)?            #dependentInduction
    | 'dependent' 'destruction' ident                                   #dependentDestruction
    | 'functional' 'induction' '(' qualid atomic_term+ ')'
      (('as' disj_conj_intro_pattern)? 'using' term
      ('with' binding_list)?)?                                          #functionalInduction
    | 'discriminate' term ('with' binding_list)?                        #termDiscriminate
    | 'ediscriminate' term ('with' binding_list)?                       #termEDiscriminate
    | 'discriminate' NUM                                                #numDiscriminate
    | 'ediscriminate' NUM                                               #numEDiscriminate
    | 'discriminate'                                                    #discriminate
    | 'injection' term ('with' binding_list)?                           #termInjection
    | 'einjection' term ('with' binding_list)?                          #termEInjection
    | 'einjection' NUM                                                  #numEInjection
    | 'injection' NUM                                                   #numInjection
    | 'injection'                                                       #injection
    | 'injection' term ('with' binding_list)? 'as' intro_pattern+       #termAsInjection
    | 'einjection' term ('with' binding_list)? 'as' intro_pattern+      #termEInjectionAs
    | 'injection' (NUM)? 'as' intro_pattern+                            #asInjection
    | 'einjection' (NUM)? 'as' intro_pattern+                           #asEInjection
    | 'inversion' ident                                                 #identInversion
    | 'inversion' NUM                                                   #numInversion
    | 'inversion_clear' ident                                           #identInversion_Clear
    | 'inversion_clear' NUM                                             #numInversion_Clear
    | 'inversion' ident 'as' intro_pattern                              #asIdentInversion
    | 'inversion' NUM 'as' intro_pattern                                #asNumInversion
    | 'inversion_clear' ident 'as' intro_pattern                        #identAsInversion_Clear
    | 'inversion_clear' NUM 'as' intro_pattern                          #numAsInversion_Clear
    | 'inversion_clear' ident 'in' ident+                               #identInInversion_Clear
    | 'inversion' ident 'in' ident+                                     #identInInversion
    | 'inversion' ident 'as' intro_pattern 'in' ident+                  #asInInversion
    | 'inversion_clear' ident 'as' intro_pattern 'in' ident+            #asInInversion_Clear
    | 'dependent' 'inversion' ident ('as' intro_pattern)?
      ('with' term)?                                                    #dependentInversion
    | 'dependent' 'inversion_clear' ident ('as' intro_pattern)?
      ('with' term)?                                                    #dependentInversion_Clear
    | 'simple' 'inversion' ident ('as' intro_pattern)?                  #simpleInversion
    | 'inversion' ident 'using' ident  ('in' ident +)?                  #inversionUsing
    | 'inversion_sigma'                                                 #inversion_Sigma
    | 'fix' ident  NUM ('with' ('(' ident  binder+
        ('{' 'struct' ident  '}')? ':' term ')')+)?                     #fixCaseAnalysisInduction
    | 'cofix' ident  ('with' ( '(' ident  binder+ ':' term ')' )+)?  #cofixCaseAnalysisInduction
    ;

controlling_proof_flow :
    'assert' '(' ident  ':' term ')'                                    #identAssert
    | 'assert' term                                                     #termAssert
    | 'assert' term 'by' expr                                           #byAssert
    | 'assert' term 'as' intro_pattern                                  #asAssert
    | 'assert' term 'as' intro_pattern 'by' expr                        #asByAssert
    | 'eassert' term 'as' intro_pattern 'by' expr                       #asByEAssert
    | 'assert' '(' ident  ':=' term ')'                                 #identDefAssert
    | 'pose' 'proof' term ('as' intro_pattern)?                         #poseProof
    | 'epose' 'proof' term ('as' intro_pattern)?                        #ePoseProof
    | 'enough' '(' ident  ':' term ')'                                  #identEnough
    | 'enough' term                                                     #termEnough
    | 'enough' term 'as' intro_pattern                                  #asEnough
    | 'enough' '(' ident  ':' term ')' 'by' expr                        #identByEnough
    | 'eenough' '(' ident  ':' term ')' 'by' expr                       #identByEEnough
    | 'enough' term 'by' expr                                           #termByEnough
    | 'eenough' term 'by' expr                                          #termByEEnough
    | 'enough' term 'as' intro_pattern 'by' expr                        #asByEnough
    | 'eenough' term 'as' intro_pattern 'by' expr                       #asByEEnough
    | 'cut' term                                                        #cut
    | 'specialize' '(' ident  atomic_term* ')'('as' intro_pattern)?     #specialize
    | 'specialize' ident  'with' binding_list ('as' intro_pattern)?     #withSpecialize
    | 'generalize' atomic_term+                                         #termGeneralize
    | 'generalize' term 'at' NUM+                                       #termAtGeneralize
    | 'generalize' term 'as' ident                                      #termAsGeneralize
    | 'generalize'  term 'at' NUM+ 'as' ident
      (',' term 'at' NUM+ 'as' ident  )*                                #termAtAsGeneralize
    | 'generalize' 'dependent' term                                     #generalizeDependent
    | 'evar' '(' ident  ':' term ')'                                    #evar
    | 'instantiate' '(' IDENT ':=' term ')'                             #identInstantiate
    | 'instantiate' '(' NUM ':=' term ')'                               #numInstantiate
    | 'instantiate' '(' NUM ':=' term ')' 'in' ident                    #numInInstantiate
    | 'instantiate' '(' NUM ':=' term ')' 'in'
      '(' 'Value' 'of' ident  ')'                                       #valueInstantiate
    | 'instantiate' '(' NUM ':=' term ')' 'in'
      '(' 'Type' 'of' ident  ')'                                        #typeInstantiate
    | 'instantiate'                                                     #instantiate
    | 'admit'                                                           #admit
    | 'give_up'                                                         #give_up
    | 'absurd' term                                                     #absurd
    | 'contradiction' (ident )?                                         #contradiction
    | 'contradict' ident                                                #contradict
    | 'exfalso'                                                         #exfalso
    ;

managing_local_context :
    'intro'                                                            #intro
    | 'intros'                                                         #intros
    | 'intros' '@' ident                                               #identIntros
    | 'intros' ident+                                                  #identsIntros
    | 'intros' 'until' ident                                           #untilIdentIntros
    | 'intros' 'until' NUM                                             #untilNumIntros
    | 'intro' 'after' ident                                            #afterIdentIntro
    | 'intro' 'before' ident                                           #beforeIdentIntro
    | 'intro' 'at' 'top'                                               #atTopIntro
    | 'intro'  'at' 'bottom'                                           #atBottomIntro
    | 'intro' ident  'after' ident                                     #identAfterIdentIntro
    | 'intro' ident  'before' ident                                    #identBeforeIdentIntro
    | 'intro' ident                                                    #identIntro
    | 'intros' intro_pattern_list                                      #introPatternListIntros
    | 'clear' ident+                                                   #identsClear
    | 'clearbody' ident                                                #clearbody
    | 'clear' '-' ident+                                               #negativIdentsClear
    | 'clear'                                                          #clear
    | 'clear' 'dependent' ident                                        #dependentClear
    | 'revert' ident+                                                  #identsRevert
    | 'revert' 'dependent' '@' ident                                   #dependentRevert
    | 'move' ident  'after' ident                                      #afterMove
    | 'move' ident  'before' ident                                     #beforeMove
    | 'move' ident  'at' 'top'                                         #topMove
    | 'move' ident  'at' 'bottom'                                      #bottomMove
    | 'rename' ident  'into' ident  (',' ident  'into' ident  )*       #rename
    | 'set' '(' ident  ':=' term ')'                                   #identSet
    | 'set' '(' ident  ':=' term ')' 'in' (goal_occurrences)?          #identInSet
    | 'set' '(' ident  binder+ ':=' term ')'                           #identDefSet
    | 'set' term                                                       #termSet
    | 'set' '(' ident  binder+ ':=' term ')' 'in' (goal_occurrences)?  #identDefInSet
    | 'eset' '(' ident  binder+ ':=' term ')' 'in' (goal_occurrences)? #identDefInESet
    | 'set' term 'in' (goal_occurrences)?                              #termInSet
    | 'eset' term 'in' (goal_occurrences)?                             #termInESet
    | 'remember' term 'as' ident                                       #asRemember
    | 'eremember' term 'as' ident                                      #asERemember
    | 'remember' term 'as' ident  'eqn:' ident                         #asEqnRemember
    | 'eremember' term 'as' ident  'eqn:' ident                        #asEqnERemember
    | 'remember' term 'as' ident  'in' goal_occurrences                #asInRemember
    | 'eremember' term 'as' ident  'in' goal_occurrences               #asInERemember
    | 'pose' '(' ident  ':=' term ')'                                  #identDefPose
    | 'epose' '(' ident  ':=' term ')'                                 #identDefEPose
    | 'pose' '(' ident  binder+ ':=' term ')'                          #identBinderDefPose
    | 'epose' '(' ident  binder+ ':=' term ')'                         #identBinderDefEPose
    | 'pose' term                                                      #termPose
    | 'epose' term                                                     #termEPose
    | 'decompose' '[' (qualid)* ']' term                               #qualidsDecompose
    | 'decompose' 'sum' term                                           #sumDecompose
    | 'decompose' 'record' term                                        #recordDecompose
    ;

applying_theorem :
    'exact' term                                                        #exact
    | 'eexact' term                                                     #eexact
    | 'assumption'                                                   #assumptionApplyingTheorem
    | 'eassumption'                                                     #eassumption
    | ('simple')? ('notypeclasses')? 'refine' atomic_term               #refine
    | 'apply' term 'with' binding_list                                  #withApply
    | 'apply' term (',' term)*                                          #termsApply
    | 'eapply' term                                                     #termEApply
    | 'simple' 'apply' term                                             #termSimpleApply
    | 'simple' 'apply' term 'with' binding_list
      (',' term ('with' binding_list)?)*                                #termWithSimpleApply
    | 'simple' 'eapply' term 'with' binding_list
      (',' term ('with' binding_list)?)*                                #termWithSimpleEApply
    | 'apply' term ('with' binding_list)?
      (',' term ('with' binding_list)?)*                                #termWithApply
    | 'eapply' term ('with' binding_list)?
      (',' term ('with' binding_list)?)*                                #termWithEApply
    | 'lapply' term                                                     #lApply
    | 'apply' term 'in' ident                                           #inApply
    | 'simple' 'apply' term 'with' binding_list
      ( ',' term 'with' binding_list)* 'in' ident
      ('as' intro_pattern)?                                             #withInSimpleApply
    | 'apply' term 'with' binding_list ( ',' term 'with' binding_list)*
      'in' ident  ('as' intro_pattern)?                                 #withInApply
    | 'eapply' term 'with' binding_list
      ( ',' term 'with' binding_list)* 'in' ident
      ('as' intro_pattern)?                                             #withInEApply
    | 'simple' 'eapply' term 'with' binding_list
      ( ',' term 'with' binding_list)* 'in' ident
      ('as' intro_pattern)?                                             #withInSimpleEApply
    | 'simple' 'apply' term 'in' ident                                  #termInSimpleApply
    | 'constructor' (NUM ('with' binding_list)?)?                       #constructor
    | 'split' ('with' binding_list)?                                    #split
    | 'exists' term                                                     #termExists
    | 'exists' binding_list                                             #bindingsExists
    | 'left' ('with' binding_list)?                                     #left
    | 'right' ('with' binding_list)?                                    #right
    | 'econstructor'                                                    #econstructor
    | 'eexists'                                                         #eexists
    | 'eleft'                                                           #eleft
    | 'eright'                                                          #eright
    ;

goal_occurrences :
    ident  (at_occurences)? (first_goal_occurences_body)*
      (second_goal_occurences_body)?                        #stdGoalOccurence
    | '*' '|-' ('*'(at_occurences)?)?                       #starDerivedGoalOccurence
    | '*'                                                   #star
    ;

at_occurences : 'at' occurences;
occurences : (SUB)? NUM+;

first_goal_occurences_body : ',' ident  (at_occurences)?;
second_goal_occurences_body : '|-' (second_goal_occurences_body_body)?;

second_goal_occurences_body_body : '*' (at_occurences)?;

intro_pattern :
    naming_intro_pattern              #namingIntroPattern
    | action_intro_pattern            #actionIntroPattern
    | intro_pattern '%' atomic_term+  #percIntroPattern
    | '_'                             #underscoreIntroPattern
    ;

action_intro_pattern :
    disj_conj_intro_pattern  #disjConjActionIntroPattern
    | equal_intro_pattern    #equalActionIntroPattern
    ;

disj_conj_intro_pattern :
    '[' (intro_pattern_list)?
      ('|' (intro_pattern_list)?)* ']'             #introPatternListsDisjConjIntroPattern
    | '(' intro_pattern
      (',' intro_pattern)* ')'                     #introPatternsDisjConjIntroPattern
    | '(' intro_pattern ( '&' intro_pattern )* ')' #andIntroPatternDisjConjIntroPattern
    ;

equal_intro_pattern :
    '[' '=' naming_intro_pattern+ ']'   #eq
    | '->' 'or' '<-'                    #or
    ;

naming_intro_pattern :
    ident          #identNaming
    | '?' ident    #questionIdentNaming
    | '?'          #questionNaming
    ;

intro_pattern_list : (intro_pattern_list_body)+ ;

intro_pattern_list_body : intro_pattern
                        |'*'
                        |KeySTARSTAR
                        ;

flag : 'beta'
     | 'delta'
     | 'delta' ('-')? qualid+
     | 'match'
     | 'fix'
     | 'cofix'
     | 'iota'
     | 'zeta'
     ;
pattern2 : term ;

lemma : term;

expr : <assoc = right> expr ';' expr  #sequenceExpr
    | '[' '>' expr ('|' expr)* ']'   #localAppExpr
    | expr2                          #expr2Expr
    ;

expr2 :
    expr2 ';' '[' (expr)? (pairedSequenceLocalAppExprBody)* ']'  #pairedSequenceLocalAppExpr
    | tacexpr3                                                   #tacarg3expr
    ;

pairedSequenceLocalAppExprBody : '|' (expr)?;

tacexpr3 :
    'do' (NUM|ident) tacexpr3            #doExpr
    | 'progress' tacexpr3                #progressExpr
    | 'repeat' tacexpr3                  #repeatExpr
    | 'try' tacexpr3                     #tryExpr
    | 'once' tacexpr3                    #softCutExpr
    | 'exactly_once'tacexpr3             #exactlyOnceExpr
    | 'timeout' (NUM | ident ) tacexpr3  #timeoutExpr
    | 'time' (STRING)? tacexpr3          #timeExpr
    | 'only' (selector)? ':' tacexpr3    #onlyExpr
    | tacexpr2                           #tacExpr2Expr
    ;

tacexpr2 :
    tacexpr1 '||' tacexpr3               #leftBiasedOpsExpr
    |  tacexpr1 '+' tacexpr3             #backTrackingExpr
    | 'tryif' tacexpr1 'then' tacexpr1
      'else' tacexpr1                    #generalizedBranchingExpr
    | tacexpr1                           #tacExpr1Expr
    ;


tacexpr1 :
    'fun' name+ '=>' tacexpr1+                                        #funExpr
    | 'let' (KeyREC)? let_clause ('with' let_clause)* 'in' expr       #letExpr
    | 'match' (KeyREVERSE)? 'goal' 'with' ('|')?  context_rule
    ('|' context_rule )* 'end'                                        #contextMatchExpr
    | 'lazymatch' (KeyREVERSE)? 'goal' 'with' ('|')?  context_rule
    ('|' context_rule )* 'end'                                        #contextLazyMatchExpr
    |  'multimatch' (KeyREVERSE)? 'goal' 'with' ('|')?  context_rule
    ('|' context_rule)* 'end'                                         #contextMultitMatchExpr
    | 'match'  expr 'with' ('|' match_rule)+ 'end'                    #matchMatchExpr
    | 'lazymatch'  expr 'with' ('|' match_rule)+ 'end'                #matchLazyMatchExpr
    | 'multimatch' expr 'with' ('|' match_rule)+ 'end'                #matchMultiMatchExpr
    | 'abstract' atom ('using' ident )?                               #abstractExpr
    | 'solve' '[' expr ('|' expr)* ']'                                #solveExpr
    | 'first' '[' expr ('|' expr)* ']'                                #firstExpr
    | 'idtac'  (message_token+)?                                      #idTacExpr
    | 'fail' ident (message_token+)?                                  #identFailExpr
    | 'fail' NUM (message_token+)?                                    #numFailExpr
    | 'fail' (message_token+)?                                        #failExpr
    | 'fresh' STRING                                                  #freshStringExpr
    | 'fresh' qualid                                                  #freshQualidExpr
    | 'fresh'                                                         #freshExpr
    | 'context' ident  (term)?                                        #contextExpr
    | 'context' ident '[' (term)? ']'                                 #contextExprBraceds
    | 'eval' 'redexpr' 'in' term                                      #evalExpr
    | 'type' 'of' term                                                #typeExpr
    | 'constr' ':' term                                               #constrExpr
    | 'uconstr' ':' term                                              #uconstrExpr
    | 'type_term' term                                                #typeTermExpr
    | 'numgoals'                                                      #numgoals
    | 'guard' test                                                    #guardExpr
    | 'assert_fails' tacexpr3                                         #assertFailsExpr
    | 'assert_suceeds' tacexpr3                                       #assertSucceedsExpr
    | atomic_tactic                                                   #atomicExpr
    | qualid tacarg+                                                  #applicationExpr
    | atom                                                            #atomExpr
    ;

atom :
    qualid           #qualidAtom
    | '()'           #unitAtom
    | integ          #intAtom
    | '(' expr ')'   #bracedExprAtom
    | '..'           #dotExprAtom
    ;

message_token :
    STRING  #stringMessageToken
    | ident #identMessageToken
    | integ #intMessageToken
    ;

tacarg :
    qualid                   #qualidTacArg
    | '()'                   #unitTacArg
    | 'ltac' ':' atom        #ltacTacArg
    | '(' STRING ')'         #stringTacArg
    | below_term_ex_minus    #termTacArg
    ;

let_clause : ident  (name+)? ':=' expr ;

context_rule :
    context_hyp (',' context_hyp)* '|-' term '=>' expr ('@' ident)?  #contextHypContextRule
    | '[' context_hyp (',' context_hyp)* '|-' term ']' '=>'
      expr ('@' ident)?                                              #contextHypBracedContextRule
    | term '=>' expr ('@' ident)?                                    #stdContextRule
    | '|-' term '=>' expr ('@' ident)?                               #derivedContextRule
    | '_' '=>' expr ('@' ident)?                                     #underscoreContextRule
    ;

context_hyp :
    name ':' term                                             #stdContextHyp
    | name ':=' term (':' term)? '=>' expr                    #exprContextHyp
    ;

match_rule :
    term '=>' expr                                 #stdMatchRule
    | 'context' (ident )? '[' term ']' '=>' expr   #contextMatchRule
    | '_' '=>' expr                                #underscoreMatchRule
    ;

test : integ (EQUAL| LESS | LOEQ | GREATER | GOEQ) integ;

selector :
    ident                                          #identSelector
    | int_selector_body (',' int_selector_body)*   #intSelector
    ;

integ : (SUB)? NUM;

int_selector_body : integ | integ '-' integ;


toplevel_selector :
    selector      #selToplevelSelector
    | 'all'       #allToplevelSelector
    | 'par'       #parToplevelSelector
    ;

ltac : (KeyLOCAL)? 'Ltac' ltac_def ('with' ltac_def)*;

ltac_def :
    ident  (ident )* ':=' expr      #identLtacDef
    | qualid (ident )* ':=' expr    #qualidLtacDef
    ;

/**************************************
* SYNTAX OF TERMS
**************************************/

term : above_term ;

above_term :
    'forall' binders ',' forall_term                                    #forallTerm
    | 'exists' ident  (':' term)? ',' exists_term                       #existsTerm
    | 'exists2' ident  (':' term)? ',' term '&' exists_term             #exists2Term
    | 'exists' '!' ident+ ',' exists_term                               #existsExclamTerm
    | 'fun' binders '=>' fun_term                                       #funTerm
    |'fix' fix_bodies                                                   #fixTerm
    |'cofix' cofix_bodies                                               #cofixTerm
    | 'let' ident   (binders)? (':' term)? ':=' term 'in'
      ident_assign_term                                                 #identAssignLetTerm
    | 'let' 'fix' fix_body 'in' fix_term                                #fixLetTerm
    | 'let' 'cofix' cofix_body 'in' cofix_term                          #cofixLetTerm
    | 'let' '(' (name)? (',' name)* ')' (dep_ret_type)?
      ':=' term 'in' name_assign_term                                   #nameAssignLetTerm
    | 'let' '\'' pattern ('in' term)? ':=' term (return_type)?
      'in' pattern_assign_term                                          #patternAssignLetTerm
    | 'if' term (dep_ret_type)? 'then' term 'else' if_then_else_term    #ifThenElseTerm
    | above_term '.' '(' qualid ')'                                     #recordProjectionTerm
    | above_term '.' '(' qualid arg+ ')'                                #multArgProjectionTerm
    | above_term '.' '(' '@' qualid (below_term_ex_minus)+ ')'          #multTermProjectionTerm
    | above_term '+' '{' term '}'                                       #sumOrSpecif
    | '@' qualid (below_term_ex_minus)*                                 #atTerm
    | above_term_ex_below_70
      op=(LESS|GREATER|LOEQ|GOEQ|EQUAL|GUILL)
      above_term_ex_below_70 ((LESS|GREATER|LOEQ|GOEQ|COLG|EQUAL)
      above_term_ex_below_70)?                                          #compareOpsTerm
    |<assoc=right> above_term COLON above_term                          #colonOpsTerm
    |<assoc=right> above_term LCOL above_term                           #lColOpsTerm
    | above_term COLG                                                   #colGOpsTerm
    | <assoc=right> TILDE above_term                                    #tildeOpsTerm
    | <assoc=right> above_term AND above_term                           #andOpsTerm
    | <assoc=right> above_term OR above_term                            #orOpsTerm
    | above_term EQUIV above_term                                       #equivOpsTerm
    | <assoc=right> above_term IMPLIES above_term                       #impliesOpsTerm
    | record_term                                                       #recordTerm
    | above_term_ex_below_70                                            #precBelow70Term
    ;

above_term_ex_below_70 :
    below_term arg_body+                                                #pointCalcAppOpsTerm
    | above_term_ex_below_70 op=(LISTCONC|LISTADD)
      above_term_ex_below_70                                            #listOpsTerm
    | above_term_ex_below_70 op=(SUB|ADD|ORB) above_term_ex_below_70    #lineCalcOpsTerm
    | below_term                                                        #belowTerm
    ;

below_term :
     SUB below_term_ex_minus   #negOpsTerm
    | below_term_ex_minus      #belowTermExMinus
    ;

below_term_ex_minus :
    '{' term '}' '+' '{' term '}'                                  #sumBoolSpecif
    | '{' ident  (':' term)? '|' term '}'                          #sigSpecif
    | '{' ident  ':' term '|' term '&' term '}'                    #sig2Specif
    | '{' ident  ':' term '&' term '}'                             #sigTSpecif
    | '{' ident  ':' term '&' term '&' term '}'                    #sigT2Specif
    | below_term_ex_minus POW below_term_ex_minus                  #powOpsTerm
    | below_term_ex_minus '%' ident                                #typeTerm
    | 'match' match_item (',' match_item)* (return_type)? 'with'
      (('|' equation)*|(equation ('|' equation)*))? 'end'          #matchTerm
    | rew_term                                                     #rewTerm
    | atomic_term                                                  #atomicTerm
    ;

atomic_term :
    qualid                    #qualidTerm
    | sort                    #sortTerm
    | metavariable            #metaVariableTerm
    | NUM                     #numTerm
    | '_'                     #underscoreTerm
    | '(' term ')'            #bracedTerm
    | '(' term ',' term ')'   #pairTerm
    ;

rew_term :
    'rew' term 'in' rew2_term                      #rew
    | 'rew' '[' term ']' term 'in' rew2_term       #bracedRew
    | 'rew' '<-' term 'in' rew2_term               #leftArrowRew
    | 'rew' '<-' '[' term ']' term 'in' rew2_term  #leftArrowBracedRew
    | 'rew' '->' term 'in' rew2_term               #rightArrowRew
    | 'rew' '->' '[' term ']' term 'in' rew2_term  #rightArrowBracedRew
    ;

rew2_term : term;

arg : below_term_ex_minus       #singleTermArg
    |'(' ident  ':=' term ')'   #identAssignArg
    ;

arg_body : (op=(MUL|DIV|MOD|MOD2) below_term | arg);

binders :
    binders_with_one_param    #singleBinder
    | binder (binder)*        #multipleBinders
    ;

binders_with_one_param :  name (name)* ':' term;

binder :
    name                                 #singleNameBinder
    | '(' name (name)* ':' term ')'      #multipleNamesBinder
    | '(' name ':=' term ')'             #bracedNameBinder
    | '(' name ':' term ':=' term ')'    #bracedNameOptionalBinder
    | implicitArgs                       #implicitBinder
    ;

name :
    ident  #simpleName
    | '_'  #underscoreName
    ;

qualid :
    ident                    #singleQualidBinder
    | qualid ACCESS_IDENT    #accessQualidBinder
    ;

metavariable : '?' ident;

sort :
    'Prop'     #sortProp
    | 'Set'    #sortSet
    | 'Type'   #sortType
    ;

fix_bodies :
    fix_body                                   #singleFixBody
    | fix_body ('with' fix_body)* 'for' ident  #multipleFixBodies
    ;

cofix_bodies :
    cofix_body                                      #singleCoFixBody
    | cofix_body ('with' cofix_body)* 'for' ident   #multipleCoFixBodies
    ;

fix_body : ident  binders (annotation)? (':' term)? ':=' fix_body_term
;
cofix_body : ident  (binders)? (':' term)? ':=' term;

annotation : '{' 'struct' ident  '}';

match_item : term ('as' name)? ('in' qualid (pattern)*)?;

dep_ret_type : ('as' name)? return_type;

return_type : 'return' return_term;

equation : mult_pattern ('|' mult_pattern)* '=>' equation_term;

mult_pattern : pattern (',' pattern)*;

pattern :
    qualid pattern_without_implicits (pattern_without_implicits)*       #defMultiplePattern
    | '@' qualid pattern_without_implicits (pattern_without_implicits)* #atDefMultiplePattern
    | pattern 'as' ident                                                #asOpsPattern
    | pattern '%' ident                                                 #percOpsPattern
    | pattern '::' ident                                                #listOpsPattern
    | qualid                                                            #qualidPattern
    |'_'                                                                #underscorePattern
    | NUM                                                               #numPattern
    | '(' or_pattern (',' or_pattern)* ')'                              #orMultiplePattern
    ;

pattern_without_implicits:
    pattern 'as' ident                      #asOpsPatternImpl
    | pattern '%' ident                     #percOpsPatternImpl
    | qualid                                #qualidPatternImpl
    |'_'                                    #underscorePatternImpl
    | NUM                                   #numPatternImpl
    | '(' pattern ')'                       #bracedPattern
    | '(' or_pattern (',' or_pattern)* ')'  #orMultiplePatternImpl
    ;

or_pattern : pattern ('|' pattern)*;

exists_term: term;

return_term: term;

equation_term : term;

forall_term : term;

fun_term : term;

ident_assign_term : term;

fix_term : term;

fix_body_term : term;

cofix_term : term;

name_assign_term : term;

pattern_assign_term : term;

if_then_else_term : term;

/**************************************
* EXTENSIONS OF GALLINA
**************************************/

record : record_keyword ident  (binders)? (':' sort)? ':='
          (ident )? '{' (field (';' field)*)? '}' '.';

record_keyword :
    'Record'         #recordRecord
    |'Inductive'     #inductiveRecord
    |'CoInductive'   #coinductiveRecord
    ;
field :
    name (binders)? (':' term)? ':=' field_term #defField
    | name (binders)? ':' field_term            #stdField
    ;

field_term : term ;

record_term : '{|' (field_def (';' field_def)*)? '|}';
field_def : name (binders)? ':=' field_def_term ;

field_def_term : term;

module_type :
    qualid                                              #qualidModuleType
    | module_type 'with' 'Definition' qualid ':=' term  #withDefModuleType
    | module_type 'with' 'module' qualid ':=' qualid    #withModuleModuleType
    | module_expression                                 #moduleExprModuleType
    ;

module_binding :
    '(' 'Import' ident  (ident )* ':' module_type ')'   #importModuleBinding
    | '(' 'Export' ident  (ident )* ':' module_type ')' #exportModuleBinding
    | '(' ident  (ident )* ':' module_type ')'          #stdModuleBinding
    ;

module_bindings : module_binding (module_binding)*;

module_expression :
    qualid (qualid)*        #stdModuleExpr
    | '!'qualid (qualid)*   #exclamationModuleExpr
    ;

/**************************************
* THE VERNACULAR
**************************************/

sentence :
    assumption              #assumpt
    | definition            #def
    | inductive             #ind
    | fixpoint              #fix
    | record                #rec
    | assertion (proof)?    #assert
    | goal                  #go
    ;
assumption :
    assumption_keyword assums '.'                           #singleAssumption
    | assumption_keyword '(' assums ')' ('(' assums ')')*   #multipleAssumption
    ;

assumption_keyword :
    'Axiom'                     #axiom
    | 'Conjecture'              #conj
    | 'Parameter'               #param
    | 'Parameters'              #params
    | 'Variable'                #var
    | 'Variables'               #vars
    | 'Hypothesis'              #hyp
    | 'Hypotheses'              #hyps
    ;

assums : ident  (ident )* ':' term;

definition :
    (KeyLOCAL)? 'Definition' ident (binders)?
      (':' term)? ':=' term '.'                         #stdDefinition
    | 'Let' ident  (binders)? (':' term)? ':=' term '.' #letDefinition
    ;

inductive :
    'Inductive'  ind_body ('with' ind_body)*
    ('where' STRING ':=' term ':' ident)? '.'           #stdInductive
    | 'CoInductive'  ind_body ('with' ind_body)*
        ('where' STRING ':=' term ':' ident)? '.'       #coInductive
    ;

ind_body : ident  ((binders)? ':' term)? ':=' (ind_body_alloc| '|' ind_body_alloc)?;

ind_body_alloc : ident (binders)? (':' term)? (ind_body_alloc_element)*;

ind_body_alloc_element : '|' ident  (binders)? (':' term)?;

fixpoint :
    'Fixpoint'  fix_body ('with' fix_body)*
      ('where' STRING ':=' term ':' ident)? '.'      #stdFixPoint
    | 'CoFixpoint'  cofix_body ('with' cofix_body)*
      ('where' STRING ':=' term ':' ident)? '.'      #coFixPoint
    ;

implicitArgs :
    '{' binders_with_one_param '}'     #singleBinderImplicit
    | '{' binder+ '}'                  #multipleBindersImplicit
    ;
assertion : assertion_keyword ident (binders)? ':' term '.';

assertion_keyword :
    'Theorem'                   #theo
    | 'Lemma'                   #lem
    | 'Remark'                  #rema
    | 'Fact'                    #fac
    | 'Corollary'               #col
    | 'Proposition'             #prop
    | 'Definition'              #defAssert
    | 'Example'                 #exam
    ;

goal : 'Goal' term proof;

proof : (proof_command '.')? (proof_body)+ ('Qed.'|'Defined.'|'Admitted.');

proof_body :
    (bullet)? tactic_invocation              #stdProofBody
    | (bullet)? '{' tactic_invocation '}'    #bracedProofBody
    ;


ident :
    'Some'                #someIdent
    | 'eq'                #eqIdent
    | 'all'               #allIdent
    | 'absurd'            #absurdIdent
    | 'equality'          #equalityIdent
    | 'double'            #doubleIdent
    | 'f_equal'           #f_equalIdent
    | 'or'                #orIdent
    | 'contradict'        #contradictIdent
    | 'fresh'             #freshIdent
    | 'case_eq'           #case_eqIdent
    | 'lemma'             #lemmaIdent
    | 'easy'              #easyIdent
    | 'rec'               #recIdent
    | 'change'            #changeIdent
    | 'decide'            #decideIdent
    | 'left'              #leftIdent
    | 'right'             #rightIdent
    | 'inversion_sigma'   #inversion_sigmaIdent
    | 'assert_fails'      #assert_fialsIdent
    | 'fail'              #failIdent
    | 'dependent'         #dependentIdent
    | 'sum'               #sumIdent
    | 'compare'           #compareIdent
    | 'tauto'             #tAutoIdent
    | 'dtauto'            #dtAutoIdent
    | 'intuition'         #intuitionIdent
    | 'dintuition'        #dintuition
    | 'top'               #topIdent
    | 'bottom'            #bottomIdent
    | 'exfalso'           #exfalsoIdent
    | IDENT               #stdIdent
    ;

/**************************************
* LEXER RULES
**************************************/
/**
* Operators
*/
ADD : '+';
LISTADD : '++';
LISTCONC : '::';
MUL : '*';
DIV : '/';
MOD : '//';
MOD2 : 'mod';
SUB : '-';
ORB : '||';
COLON : ':';
LESS : '<';
GREATER : '>';
LOEQ : '<=';
GOEQ : '>=';
EQUAL : '=';
GUILL : '<>';
COLG : ':>';
LCOL : '<:';
AND : '/\\';
OR : '\\/';
EQUIV : '<->';
IMPLIES : '->';
TILDE : '~';
POW : '^';


/**
* KEYWORDS
*/
KeySOME : 'Some';
KeyLOCAL : 'Local';
KeyREC : 'Rec';
KeyREVERSE : 'reverse';
KeySTARSTAR : '**';
/*
* STRINGS
*/
STRING : '"' (~["])* '"';
/*
* IDENTIFIER AND ACCESS IDENTIFIER
*/
IDENT : KeySOME |  IDENT2;
fragment IDENT2 : FIRST_LETTER (SUBSEQUENT_LETTER)*;
fragment FIRST_LETTER :  [a-z] | [A-Z] | '_' | UNICODE_LETTER;
fragment SUBSEQUENT_LETTER : [a-z] | [A-Z] | DIGIT | '_' | '"' | '\''
    | UNICODE_LETTER | UNICODE_ID_PART;
fragment UNICODE_LETTER : '\\' 'u' HEX HEX HEX HEX;
fragment UNICODE_ID_PART : '\\' 'u' HEX HEX HEX HEX;
fragment HEX : [0-9a-fA-F];
ACCESS_IDENT : '.' IDENT;
/*
* NATURAL NUMBERS AND INTEGERS
*/

NUM : DIGIT (DIGIT)*;
fragment DIGIT : [0-9];


WS : [ \n\t\r] -> skip;
BLOCKCOMMENT : '(*' .*? '*)' -> skip;