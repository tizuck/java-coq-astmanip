package test;

import coqparser.CoqParser;
import coqparser.prettyprint.PrettyPrintConfiguration;
import coqparser.prettyprint.PrettyPrintContext;
import coqparser.prettyprint.toplevel.PrettyPrintCoqFileVisitor;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class InitLibraryTests {

    private static class CoqFiles {
        public  static final String datatypes = "(************************************************************************)\n" +
                "(*         *   The Coq Proof Assistant / The Coq Development Team       *)\n" +
                "(*  v      *   INRIA, CNRS and contributors - Copyright 1999-2018       *)\n" +
                "(* <O___,, *       (see CREDITS file for the list of authors)           *)\n" +
                "(*   \\VV/  **************************************************************)\n" +
                "(*    //   *    This file is distributed under the terms of the         *)\n" +
                "(*         *     GNU Lesser General Public License Version 2.1          *)\n" +
                "(*         *     (see LICENSE file for the text of the license)         *)\n" +
                "(************************************************************************)\n" +
                "\n" +
                "Set Implicit Arguments.\n" +
                "\n" +
                "Require Import Notations.\n" +
                "Require Import Logic.\n" +
                "Declare ML Module \"nat_syntax_plugin\".\n" +
                "\n" +
                "(********************************************************************)\n" +
                "(** * Datatypes with zero and one element *)\n" +
                "\n" +
                "(** [Empty_set] is a datatype with no inhabitant *)\n" +
                "\n" +
                "Inductive Empty_set : Set :=.\n" +
                "\n" +
                "(** [unit] is a singleton datatype with sole inhabitant [tt] *)\n" +
                "\n" +
                "Inductive unit : Set :=\n" +
                "    tt : unit.\n" +
                "\n" +
                "\n" +
                "(********************************************************************)\n" +
                "(** * The boolean datatype *)\n" +
                "\n" +
                "(** [bool] is the datatype of the boolean values [true] and [false] *)\n" +
                "\n" +
                "Inductive bool : Set :=\n" +
                "  | true : bool\n" +
                "  | false : bool.\n" +
                "\n" +
                "Add Printing If bool.\n" +
                "\n" +
                "Delimit Scope bool_scope with bool.\n" +
                "\n" +
                "Bind Scope bool_scope with bool.\n" +
                "\n" +
                "(** Basic boolean operators *)\n" +
                "\n" +
                "Definition andb (b1 b2:bool) : bool := if b1 then b2 else false.\n" +
                "\n" +
                "Definition orb (b1 b2:bool) : bool := if b1 then true else b2.\n" +
                "\n" +
                "Definition implb (b1 b2:bool) : bool := if b1 then b2 else true.\n" +
                "\n" +
                "Definition xorb (b1 b2:bool) : bool :=\n" +
                "  match b1, b2 with\n" +
                "    | true, true => false\n" +
                "    | true, false => true\n" +
                "    | false, true => true\n" +
                "    | false, false => false\n" +
                "  end.\n" +
                "\n" +
                "Definition negb (b:bool) := if b then false else true.\n" +
                "\n" +
                "Infix \"||\" := orb : bool_scope.\n" +
                "Infix \"&&\" := andb : bool_scope.\n" +
                "\n" +
                "(** Basic properties of [andb] *)\n" +
                "\n" +
                "Lemma andb_prop : forall a b:bool, andb a b = true -> a = true /\\ b = true.\n" +
                "Proof.\n" +
                "  destruct a, b; repeat split; assumption.\n" +
                "Qed.\n" +
                "Hint Resolve andb_prop: bool.\n" +
                "\n" +
                "Lemma andb_true_intro :\n" +
                "  forall b1 b2:bool, b1 = true /\\ b2 = true -> andb b1 b2 = true.\n" +
                "Proof.\n" +
                "  destruct b1; destruct b2; simpl; intros [? ?]; assumption.\n" +
                "Qed.\n" +
                "Hint Resolve andb_true_intro: bool.\n" +
                "\n" +
                "(** Interpretation of booleans as propositions *)\n" +
                "\n" +
                "Inductive eq_true : bool -> Prop := is_eq_true : eq_true true.\n" +
                "\n" +
                "Hint Constructors eq_true : eq_true.\n" +
                "\n" +
                "(** Another way of interpreting booleans as propositions *)\n" +
                "\n" +
                "Definition is_true b := b = true.\n" +
                "\n" +
                "(** [is_true] can be activated as a coercion by\n" +
                "   ([Local]) [Coercion is_true : bool >-> Sortclass].\n" +
                "*)\n" +
                "\n" +
                "(** Additional rewriting lemmas about [eq_true] *)\n" +
                "\n" +
                "Lemma eq_true_ind_r :\n" +
                "  forall (P : bool -> Prop) (b : bool), P b -> eq_true b -> P true.\n" +
                "Proof.\n" +
                "  intros P b H H0; destruct H0 in H; assumption.\n" +
                "Defined.\n" +
                "\n" +
                "Lemma eq_true_rec_r :\n" +
                "  forall (P : bool -> Set) (b : bool), P b -> eq_true b -> P true.\n" +
                "Proof.\n" +
                "  intros P b H H0; destruct H0 in H; assumption.\n" +
                "Defined.\n" +
                "\n" +
                "Lemma eq_true_rect_r :\n" +
                "  forall (P : bool -> Type) (b : bool), P b -> eq_true b -> P true.\n" +
                "Proof.\n" +
                "  intros P b H H0; destruct H0 in H; assumption.\n" +
                "Defined.\n" +
                "\n" +
                "(** The [BoolSpec] inductive will be used to relate a [boolean] value\n" +
                "    and two propositions corresponding respectively to the [true]\n" +
                "    case and the [false] case.\n" +
                "    Interest: [BoolSpec] behave nicely with [case] and [destruct].\n" +
                "    See also [Bool.reflect] when [Q = ~P].\n" +
                "*)\n" +
                "\n" +
                "Inductive BoolSpec (P Q : Prop) : bool -> Prop :=\n" +
                "  | BoolSpecT : P -> BoolSpec P Q true\n" +
                "  | BoolSpecF : Q -> BoolSpec P Q false.\n" +
                "Hint Constructors BoolSpec.\n" +
                "\n" +
                "\n" +
                "(********************************************************************)\n" +
                "(** * Peano natural numbers *)\n" +
                "\n" +
                "(** [nat] is the datatype of natural numbers built from [O] and successor [S];\n" +
                "    note that the constructor name is the letter O.\n" +
                "    Numbers in [nat] can be denoted using a decimal notation;\n" +
                "    e.g. [3%nat] abbreviates [S (S (S O))] *)\n" +
                "\n" +
                "Inductive nat : Set :=\n" +
                "  | O : nat\n" +
                "  | S : nat -> nat.\n" +
                "\n" +
                "Delimit Scope nat_scope with nat.\n" +
                "Bind Scope nat_scope with nat.\n" +
                "Arguments S _%nat.\n" +
                "\n" +
                "\n" +
                "(********************************************************************)\n" +
                "(** * Container datatypes *)\n" +
                "\n" +
                "(* Set Universe Polymorphism. *)\n" +
                "\n" +
                "(** [option A] is the extension of [A] with an extra element [None] *)\n" +
                "\n" +
                "Inductive option (A:Type) : Type :=\n" +
                "  | Some : A -> option A\n" +
                "  | None : option A.\n" +
                "\n" +
                "Arguments Some {A} a.\n" +
                "Arguments None {A}.\n" +
                "\n" +
                "Definition option_map (A B:Type) (f:A->B) (o : option A) : option B :=\n" +
                "  match o with\n" +
                "    | Some a => @Some B (f a)\n" +
                "    | None => @None B\n" +
                "  end.\n" +
                "\n" +
                "(** [sum A B], written [A + B], is the disjoint sum of [A] and [B] *)\n" +
                "\n" +
                "Inductive sum (A B:Type) : Type :=\n" +
                "  | inl : A -> sum A B\n" +
                "  | inr : B -> sum A B.\n" +
                "\n" +
                "Notation \"x + y\" := (sum x y) : type_scope.\n" +
                "\n" +
                "Arguments inl {A B} _ , [A] B _.\n" +
                "Arguments inr {A B} _ , A [B] _.\n" +
                "\n" +
                "(** [prod A B], written [A * B], is the product of [A] and [B];\n" +
                "    the pair [pair A B a b] of [a] and [b] is abbreviated [(a,b)] *)\n" +
                "\n" +
                "Inductive prod (A B:Type) : Type :=\n" +
                "  pair : A -> B -> prod A B.\n" +
                "\n" +
                "Add Printing Let prod.\n" +
                "\n" +
                "Notation \"x * y\" := (prod x y) : type_scope.\n" +
                "Notation \"( x , y , .. , z )\" := (pair .. (pair x y) .. z) : core_scope.\n" +
                "\n" +
                "Arguments pair {A B} _ _.\n" +
                "\n" +
                "Section projections.\n" +
                "  Context {A : Type} {B : Type}.\n" +
                "\n" +
                "  Definition fst (p:A * B) := match p with\n" +
                "\t\t\t\t| (x, y) => x\n" +
                "                              end.\n" +
                "  Definition snd (p:A * B) := match p with\n" +
                "\t\t\t\t| (x, y) => y\n" +
                "                              end.\n" +
                "End projections.\n" +
                "\n" +
                "Hint Resolve pair inl inr: core.\n" +
                "\n" +
                "Lemma surjective_pairing :\n" +
                "  forall (A B:Type) (p:A * B), p = pair (fst p) (snd p).\n" +
                "Proof.\n" +
                "  destruct p; reflexivity.\n" +
                "Qed.\n" +
                "\n" +
                "Lemma injective_projections :\n" +
                "  forall (A B:Type) (p1 p2:A * B),\n" +
                "    fst p1 = fst p2 -> snd p1 = snd p2 -> p1 = p2.\n" +
                "Proof.\n" +
                "  destruct p1; destruct p2; simpl; intros Hfst Hsnd.\n" +
                "  rewrite Hfst; rewrite Hsnd; reflexivity.\n" +
                "Qed.\n" +
                "\n" +
                "Definition prod_uncurry (A B C:Type) (f:prod A B -> C)\n" +
                "  (x:A) (y:B) : C := f (pair x y).\n" +
                "\n" +
                "Definition prod_curry (A B C:Type) (f:A -> B -> C)\n" +
                "  (p:prod A B) : C := match p with\n" +
                "                       | pair x y => f x y\n" +
                "                       end.\n" +
                "\n" +
                "(** Polymorphic lists and some operations *)\n" +
                "\n" +
                "Inductive list (A : Type) : Type :=\n" +
                " | nil : list A\n" +
                " | cons : A -> list A -> list A.\n" +
                "\n" +
                "Arguments nil {A}.\n" +
                "Arguments cons {A} a l.\n" +
                "Infix \"::\" := cons (at level 60, right associativity) : list_scope.\n" +
                "Delimit Scope list_scope with list.\n" +
                "Bind Scope list_scope with list.\n" +
                "\n" +
                "Local Open Scope list_scope.\n" +
                "\n" +
                "Definition length (A : Type) : list A -> nat :=\n" +
                "  fix length l :=\n" +
                "  match l with\n" +
                "   | nil => O\n" +
                "   | _ :: l' => S (length l')\n" +
                "  end.\n" +
                "\n" +
                "(** Concatenation of two lists *)\n" +
                "\n" +
                "Definition app (A : Type) : list A -> list A -> list A :=\n" +
                "  fix app l m :=\n" +
                "  match l with\n" +
                "   | nil => m\n" +
                "   | a :: l1 => a :: app l1 m\n" +
                "  end.\n" +
                "\n" +
                "\n" +
                "Infix \"++\" := app (right associativity, at level 60) : list_scope.\n" +
                "\n" +
                "(* Unset Universe Polymorphism. *)\n" +
                "\n" +
                "(********************************************************************)\n" +
                "(** * The comparison datatype *)\n" +
                "\n" +
                "Inductive comparison : Set :=\n" +
                "  | Eq : comparison\n" +
                "  | Lt : comparison\n" +
                "  | Gt : comparison.\n" +
                "\n" +
                "Lemma comparison_eq_stable : forall c c' : comparison, ~~ c = c' -> c = c'.\n" +
                "Proof.\n" +
                "  destruct c, c'; intro H; reflexivity || destruct H; discriminate.\n" +
                "Qed.\n" +
                "\n" +
                "Definition CompOpp (r:comparison) :=\n" +
                "  match r with\n" +
                "    | Eq => Eq\n" +
                "    | Lt => Gt\n" +
                "    | Gt => Lt\n" +
                "  end.\n" +
                "\n" +
                "Lemma CompOpp_involutive : forall c, CompOpp (CompOpp c) = c.\n" +
                "Proof.\n" +
                "  destruct c; reflexivity.\n" +
                "Qed.\n" +
                "\n" +
                "Lemma CompOpp_inj : forall c c', CompOpp c = CompOpp c' -> c = c'.\n" +
                "Proof.\n" +
                "  destruct c; destruct c'; auto; discriminate.\n" +
                "Qed.\n" +
                "\n" +
                "Lemma CompOpp_iff : forall c c', CompOpp c = c' <-> c = CompOpp c'.\n" +
                "Proof.\n" +
                "  split; intros; apply CompOpp_inj; rewrite CompOpp_involutive; auto.\n" +
                "Qed.\n" +
                "\n" +
                "(** The [CompareSpec] inductive relates a [comparison] value with three\n" +
                "   propositions, one for each possible case. Typically, it can be used to\n" +
                "   specify a comparison function via some equality and order predicates.\n" +
                "   Interest: [CompareSpec] behave nicely with [case] and [destruct]. *)\n" +
                "\n" +
                "Inductive CompareSpec (Peq Plt Pgt : Prop) : comparison -> Prop :=\n" +
                " | CompEq : Peq -> CompareSpec Peq Plt Pgt Eq\n" +
                " | CompLt : Plt -> CompareSpec Peq Plt Pgt Lt\n" +
                " | CompGt : Pgt -> CompareSpec Peq Plt Pgt Gt.\n" +
                "Hint Constructors CompareSpec.\n" +
                "\n" +
                "(** For having clean interfaces after extraction, [CompareSpec] is declared\n" +
                "    in Prop. For some situations, it is nonetheless useful to have a\n" +
                "    version in Type. Interestingly, these two versions are equivalent. *)\n" +
                "\n" +
                "Inductive CompareSpecT (Peq Plt Pgt : Prop) : comparison -> Type :=\n" +
                " | CompEqT : Peq -> CompareSpecT Peq Plt Pgt Eq\n" +
                " | CompLtT : Plt -> CompareSpecT Peq Plt Pgt Lt\n" +
                " | CompGtT : Pgt -> CompareSpecT Peq Plt Pgt Gt.\n" +
                "Hint Constructors CompareSpecT.\n" +
                "\n" +
                "Lemma CompareSpec2Type : forall Peq Plt Pgt c,\n" +
                " CompareSpec Peq Plt Pgt c -> CompareSpecT Peq Plt Pgt c.\n" +
                "Proof.\n" +
                " destruct c; intros H; constructor; inversion_clear H; auto.\n" +
                "Defined.\n" +
                "\n" +
                "(** As an alternate formulation, one may also directly refer to predicates\n" +
                " [eq] and [lt] for specifying a comparison, rather that fully-applied\n" +
                " propositions. This [CompSpec] is now a particular case of [CompareSpec]. *)\n" +
                "\n" +
                "Definition CompSpec {A} (eq lt : A->A->Prop)(x y:A) : comparison -> Prop :=\n" +
                " CompareSpec (eq x y) (lt x y) (lt y x).\n" +
                "\n" +
                "Definition CompSpecT {A} (eq lt : A->A->Prop)(x y:A) : comparison -> Type :=\n" +
                " CompareSpecT (eq x y) (lt x y) (lt y x).\n" +
                "Hint Unfold CompSpec CompSpecT.\n" +
                "\n" +
                "Lemma CompSpec2Type : forall A (eq lt:A->A->Prop) x y c,\n" +
                " CompSpec eq lt x y c -> CompSpecT eq lt x y c.\n" +
                "Proof. intros. apply CompareSpec2Type; assumption. Defined.\n" +
                "\n" +
                "(******************************************************************)\n" +
                "(** * Misc Other Datatypes *)\n" +
                "\n" +
                "(** [identity A a] is the family of datatypes on [A] whose sole non-empty\n" +
                "    member is the singleton datatype [identity A a a] whose\n" +
                "    sole inhabitant is denoted [identity_refl A a] *)\n" +
                "\n" +
                "Inductive identity (A:Type) (a:A) : A -> Type :=\n" +
                "  identity_refl : identity a a.\n" +
                "Hint Resolve identity_refl: core.\n" +
                "\n" +
                "Arguments identity_ind [A] a P f y i.\n" +
                "Arguments identity_rec [A] a P f y i.\n" +
                "Arguments identity_rect [A] a P f y i.\n" +
                "\n" +
                "(** Identity type *)\n" +
                "\n" +
                "Definition ID := forall A:Type, A -> A.\n" +
                "Definition id : ID := fun A x => x.\n" +
                "\n" +
                "Definition IDProp := forall A:Prop, A -> A.\n" +
                "Definition idProp : IDProp := fun A x => x.\n" +
                "\n" +
                "\n" +
                "(* begin hide *)\n" +
                "\n" +
                "(* Compatibility *)\n" +
                "\n" +
                "Notation prodT := prod (only parsing).\n" +
                "Notation pairT := pair (only parsing).\n" +
                "Notation prodT_rect := prod_rect (only parsing).\n" +
                "Notation prodT_rec := prod_rec (only parsing).\n" +
                "Notation prodT_ind := prod_ind (only parsing).\n" +
                "Notation fstT := fst (only parsing).\n" +
                "Notation sndT := snd (only parsing).\n" +
                "Notation prodT_uncurry := prod_uncurry (only parsing).\n" +
                "Notation prodT_curry := prod_curry (only parsing).\n" +
                "\n" +
                "(* end hide *)";
        public static final String logic = "(************************************************************************)\n" +
                "(*         *   The Coq Proof Assistant / The Coq Development Team       *)\n" +
                "(*  v      *   INRIA, CNRS and contributors - Copyright 1999-2018       *)\n" +
                "(* <O___,, *       (see CREDITS file for the list of authors)           *)\n" +
                "(*   \\VV/  **************************************************************)\n" +
                "(*    //   *    This file is distributed under the terms of the         *)\n" +
                "(*         *     GNU Lesser General Public License Version 2.1          *)\n" +
                "(*         *     (see LICENSE file for the text of the license)         *)\n" +
                "(************************************************************************)\n" +
                "\n" +
                "Set Implicit Arguments.\n" +
                "\n" +
                "Require Export Notations.\n" +
                "\n" +
                "Notation \"A -> B\" := (forall (_ : A), B) : type_scope.\n" +
                "\n" +
                "(** * Propositional connectives *)\n" +
                "\n" +
                "(** [True] is the always true proposition *)\n" +
                "\n" +
                "Inductive True : Prop :=\n" +
                "  I : True.\n" +
                "\n" +
                "(** [False] is the always false proposition *)\n" +
                "Inductive False : Prop :=.\n" +
                "\n" +
                "(** [not A], written [~A], is the negation of [A] *)\n" +
                "Definition not (A:Prop) := A -> False.\n" +
                "\n" +
                "Notation \"~ x\" := (not x) : type_scope.\n" +
                "\n" +
                "Hint Unfold not: core.\n" +
                "\n" +
                "  (** [and A B], written [A /\\ B], is the conjunction of [A] and [B]\n" +
                "      [conj p q] is a proof of [A /\\ B] as soon as\n" +
                "      [p] is a proof of [A] and [q] a proof of [B]\n" +
                "      [proj1] and [proj2] are first and second projections of a conjunction *)\n" +
                "\n" +
                "Inductive and (A B:Prop) : Prop :=\n" +
                "  conj : A -> B -> A /\\ B\n" +
                "\n" +
                "where \"A /\\ B\" := (and A B) : type_scope.\n" +
                "\n" +
                "Section Conjunction.\n" +
                "\n" +
                "  Variables A B : Prop.\n" +
                "\n" +
                "  Theorem proj1 : A /\\ B -> A.\n" +
                "  Proof.\n" +
                "    destruct 1; trivial.\n" +
                "  Qed.\n" +
                "\n" +
                "  Theorem proj2 : A /\\ B -> B.\n" +
                "  Proof.\n" +
                "    destruct 1; trivial.\n" +
                "  Qed.\n" +
                "\n" +
                "End Conjunction.\n" +
                "\n" +
                "(** [or A B], written [A \\/ B], is the disjunction of [A] and [B] *)\n" +
                "\n" +
                "Inductive or (A B:Prop) : Prop :=\n" +
                "  | or_introl : A -> A \\/ B\n" +
                "  | or_intror : B -> A \\/ B\n" +
                "\n" +
                "where \"A \\/ B\" := (or A B) : type_scope.\n" +
                "\n" +
                "Arguments or_introl [A B] _, [A] B _.\n" +
                "Arguments or_intror [A B] _, A [B] _.\n" +
                "\n" +
                "(** [iff A B], written [A <-> B], expresses the equivalence of [A] and [B] *)\n" +
                "\n" +
                "Definition iff (A B:Prop) := (A -> B) /\\ (B -> A).\n" +
                "\n" +
                "Notation \"A <-> B\" := (iff A B) : type_scope.\n" +
                "\n" +
                "Section Equivalence.\n" +
                "\n" +
                "Theorem iff_refl : forall A:Prop, A <-> A.\n" +
                "  Proof.\n" +
                "    split; auto.\n" +
                "  Qed.\n" +
                "\n" +
                "Theorem iff_trans : forall A B C:Prop, (A <-> B) -> (B <-> C) -> (A <-> C).\n" +
                "  Proof.\n" +
                "    intros A B C [H1 H2] [H3 H4]; split; auto.\n" +
                "  Qed.\n" +
                "\n" +
                "Theorem iff_sym : forall A B:Prop, (A <-> B) -> (B <-> A).\n" +
                "  Proof.\n" +
                "    intros A B [H1 H2]; split; auto.\n" +
                "  Qed.\n" +
                "\n" +
                "End Equivalence.\n" +
                "\n" +
                "Hint Unfold iff: extcore.\n" +
                "\n" +
                "(** Backward direction of the equivalences above does not need assumptions *)\n" +
                "\n" +
                "Theorem and_iff_compat_l : forall A B C : Prop,\n" +
                "  (B <-> C) -> (A /\\ B <-> A /\\ C).\n" +
                "Proof.\n" +
                "  intros ? ? ? [Hl Hr]; split; intros [? ?]; (split; [ assumption | ]);\n" +
                "  [apply Hl | apply Hr]; assumption.\n" +
                "Qed.\n" +
                "\n" +
                "Theorem and_iff_compat_r : forall A B C : Prop,\n" +
                "  (B <-> C) -> (B /\\ A <-> C /\\ A).\n" +
                "Proof.\n" +
                "  intros ? ? ? [Hl Hr]; split; intros [? ?]; (split; [ | assumption ]);\n" +
                "  [apply Hl | apply Hr]; assumption.\n" +
                "Qed.\n" +
                "\n" +
                "Theorem or_iff_compat_l : forall A B C : Prop,\n" +
                "  (B <-> C) -> (A \\/ B <-> A \\/ C).\n" +
                "Proof.\n" +
                "  intros ? ? ? [Hl Hr]; split; (intros [?|?]; [left; assumption| right]);\n" +
                "  [apply Hl | apply Hr]; assumption.\n" +
                "Qed.\n" +
                "\n" +
                "Theorem or_iff_compat_r : forall A B C : Prop,\n" +
                "  (B <-> C) -> (B \\/ A <-> C \\/ A).\n" +
                "Proof.\n" +
                "  intros ? ? ? [Hl Hr]; split; (intros [?|?]; [left| right; assumption]);\n" +
                "  [apply Hl | apply Hr]; assumption.\n" +
                "Qed.\n" +
                "\n" +
                "Theorem imp_iff_compat_l : forall A B C : Prop,\n" +
                "  (B <-> C) -> ((A -> B) <-> (A -> C)).\n" +
                "Proof.\n" +
                "  intros ? ? ? [Hl Hr]; split; intros H ?; [apply Hl | apply Hr]; apply H; assumption.\n" +
                "Qed.\n" +
                "\n" +
                "Theorem imp_iff_compat_r : forall A B C : Prop,\n" +
                "  (B <-> C) -> ((B -> A) <-> (C -> A)).\n" +
                "Proof.\n" +
                "  intros ? ? ? [Hl Hr]; split; intros H ?; [apply H, Hr | apply H, Hl]; assumption.\n" +
                "Qed.\n" +
                "\n" +
                "Theorem not_iff_compat : forall A B : Prop,\n" +
                "  (A <-> B) -> (~ A <-> ~B).\n" +
                "Proof.\n" +
                "  intros; apply imp_iff_compat_r; assumption.\n" +
                "Qed.\n" +
                "\n" +
                "\n" +
                "(** Some equivalences *)\n" +
                "\n" +
                "Theorem neg_false : forall A : Prop, ~ A <-> (A <-> False).\n" +
                "Proof.\n" +
                "  intro A; unfold not; split.\n" +
                "  - intro H; split; [exact H | intro H1; elim H1].\n" +
                "  - intros [H _]; exact H.\n" +
                "Qed.\n" +
                "\n" +
                "Theorem and_cancel_l : forall A B C : Prop,\n" +
                "  (B -> A) -> (C -> A) -> ((A /\\ B <-> A /\\ C) <-> (B <-> C)).\n" +
                "Proof.\n" +
                "  intros A B C Hl Hr.\n" +
                "  split; [ | apply and_iff_compat_l]; intros [HypL HypR]; split; intros.\n" +
                "  + apply HypL; split; [apply Hl | ]; assumption.\n" +
                "  + apply HypR; split; [apply Hr | ]; assumption.\n" +
                "Qed.\n" +
                "\n" +
                "Theorem and_cancel_r : forall A B C : Prop,\n" +
                "  (B -> A) -> (C -> A) -> ((B /\\ A <-> C /\\ A) <-> (B <-> C)).\n" +
                "Proof.\n" +
                "  intros A B C Hl Hr.\n" +
                "  split; [ | apply and_iff_compat_r]; intros [HypL HypR]; split; intros.\n" +
                "  + apply HypL; split; [ | apply Hl ]; assumption.\n" +
                "  + apply HypR; split; [ | apply Hr ]; assumption.\n" +
                "Qed.\n" +
                "\n" +
                "Theorem and_comm : forall A B : Prop, A /\\ B <-> B /\\ A.\n" +
                "Proof.\n" +
                "  intros; split; intros [? ?]; split; assumption.\n" +
                "Qed.\n" +
                "\n" +
                "Theorem and_assoc : forall A B C : Prop, (A /\\ B) /\\ C <-> A /\\ B /\\ C.\n" +
                "Proof.\n" +
                "  intros; split; [ intros [[? ?] ?]| intros [? [? ?]]]; repeat split; assumption.\n" +
                "Qed.\n" +
                "\n" +
                "Theorem or_cancel_l : forall A B C : Prop,\n" +
                "  (B -> ~ A) -> (C -> ~ A) -> ((A \\/ B <-> A \\/ C) <-> (B <-> C)).\n" +
                "Proof.\n" +
                "  intros ? ? ? Fl Fr; split; [ | apply or_iff_compat_l]; intros [Hl Hr]; split; intros.\n" +
                "  { destruct Hl; [ right | destruct Fl | ]; assumption. }\n" +
                "  { destruct Hr; [ right | destruct Fr | ]; assumption. }\n" +
                "Qed.\n" +
                "\n" +
                "Theorem or_cancel_r : forall A B C : Prop,\n" +
                "  (B -> ~ A) -> (C -> ~ A) -> ((B \\/ A <-> C \\/ A) <-> (B <-> C)).\n" +
                "Proof.\n" +
                "  intros ? ? ? Fl Fr; split; [ | apply or_iff_compat_r]; intros [Hl Hr]; split; intros.\n" +
                "  { destruct Hl; [ left | | destruct Fl ]; assumption. }\n" +
                "  { destruct Hr; [ left | | destruct Fr ]; assumption. }\n" +
                "Qed.\n" +
                "\n" +
                "Theorem or_comm : forall A B : Prop, (A \\/ B) <-> (B \\/ A).\n" +
                "Proof.\n" +
                "  intros; split; (intros [? | ?]; [ right | left ]; assumption).\n" +
                "Qed.\n" +
                "\n" +
                "Theorem or_assoc : forall A B C : Prop, (A \\/ B) \\/ C <-> A \\/ B \\/ C.\n" +
                "Proof.\n" +
                "  intros; split; [ intros [[?|?]|?]| intros [?|[?|?]]].\n" +
                "  + left; assumption.\n" +
                "  + right; left; assumption.\n" +
                "  + right; right; assumption.\n" +
                "  + left; left; assumption.\n" +
                "  + left; right; assumption.\n" +
                "  + right; assumption.\n" +
                "Qed.\n" +
                "Lemma iff_and : forall A B : Prop, (A <-> B) -> (A -> B) /\\ (B -> A).\n" +
                "Proof.\n" +
                "  intros A B []; split; trivial.\n" +
                "Qed.\n" +
                "\n" +
                "Lemma iff_to_and : forall A B : Prop, (A <-> B) <-> (A -> B) /\\ (B -> A).\n" +
                "Proof.\n" +
                "  intros; split; intros [Hl Hr]; (split; intros; [ apply Hl | apply Hr]); assumption.\n" +
                "Qed.\n" +
                "\n" +
                "(** [(IF_then_else P Q R)], written [IF P then Q else R] denotes\n" +
                "    either [P] and [Q], or [~P] and [R] *)\n" +
                "\n" +
                "Definition IF_then_else (P Q R:Prop) := P /\\ Q \\/ ~ P /\\ R.\n" +
                "\n" +
                "Notation \"'IF' c1 'then' c2 'else' c3\" := (IF_then_else c1 c2 c3)\n" +
                "  (at level 200, right associativity) : type_scope.\n" +
                "\n" +
                "(** * First-order quantifiers *)\n" +
                "\n" +
                "(** [ex P], or simply [exists x, P x], or also [exists x:A, P x],\n" +
                "    expresses the existence of an [x] of some type [A] in [Set] which\n" +
                "    satisfies the predicate [P].  This is existential quantification.\n" +
                "    [ex2 P Q], or simply [exists2 x, P x & Q x], or also\n" +
                "    [exists2 x:A, P x & Q x], expresses the existence of an [x] of\n" +
                "    type [A] which satisfies both predicates [P] and [Q].\n" +
                "    Universal quantification is primitively written [forall x:A, Q]. By\n" +
                "    symmetry with existential quantification, the construction [all P]\n" +
                "    is provided too.\n" +
                "*)\n" +
                "\n" +
                "Inductive ex (A:Type) (P:A -> Prop) : Prop :=\n" +
                "  ex_intro : forall x:A, P x -> ex (A:=A) P.\n" +
                "\n" +
                "Inductive ex2 (A:Type) (P Q:A -> Prop) : Prop :=\n" +
                "  ex_intro2 : forall x:A, P x -> Q x -> ex2 (A:=A) P Q.\n" +
                "\n" +
                "Definition all (A:Type) (P:A -> Prop) := forall x:A, P x.\n" +
                "\n" +
                "(* Rule order is important to give printing priority to fully typed exists *)\n" +
                "\n" +
                "Notation \"'exists' x .. y , p\" := (ex (fun x => .. (ex (fun y => p)) ..))\n" +
                "  (at level 200, x binder, right associativity,\n" +
                "   format \"'[' 'exists'  '/  ' x  ..  y ,  '/  ' p ']'\")\n" +
                "  : type_scope.\n" +
                "\n" +
                "Notation \"'exists2' x , p & q\" := (ex2 (fun x => p) (fun x => q))\n" +
                "  (at level 200, x ident, p at level 200, right associativity) : type_scope.\n" +
                "Notation \"'exists2' x : A , p & q\" := (ex2 (A:=A) (fun x => p) (fun x => q))\n" +
                "  (at level 200, x ident, A at level 200, p at level 200, right associativity,\n" +
                "    format \"'[' 'exists2'  '/  ' x  :  A ,  '/  ' '[' p  &  '/' q ']' ']'\")\n" +
                "  : type_scope.\n" +
                "\n" +
                "Notation \"'exists2' ' x , p & q\" := (ex2 (fun x => p) (fun x => q))\n" +
                "  (at level 200, x strict pattern, p at level 200, right associativity) : type_scope.\n" +
                "Notation \"'exists2' ' x : A , p & q\" := (ex2 (A:=A) (fun x => p) (fun x => q))\n" +
                "  (at level 200, x strict pattern, A at level 200, p at level 200, right associativity,\n" +
                "    format \"'[' 'exists2'  '/  ' ' x  :  A ,  '/  ' '[' p  &  '/' q ']' ']'\")\n" +
                "  : type_scope.\n" +
                "\n" +
                "(** Derived rules for universal quantification *)\n" +
                "\n" +
                "Section universal_quantification.\n" +
                "\n" +
                "  Variable A : Type.\n" +
                "  Variable P : A -> Prop.\n" +
                "\n" +
                "  Theorem inst : forall x:A, all (fun x => P x) -> P x.\n" +
                "  Proof.\n" +
                "    unfold all; auto.\n" +
                "  Qed.\n" +
                "\n" +
                "  Theorem gen : forall (B:Prop) (f:forall y:A, B -> P y), B -> all P.\n" +
                "  Proof.\n" +
                "    red; auto.\n" +
                "  Qed.\n" +
                "\n" +
                "End universal_quantification.\n" +
                "\n" +
                "(** * Equality *)\n" +
                "\n" +
                "(** [eq x y], or simply [x=y] expresses the equality of [x] and\n" +
                "    [y]. Both [x] and [y] must belong to the same type [A].\n" +
                "    The definition is inductive and states the reflexivity of the equality.\n" +
                "    The others properties (symmetry, transitivity, replacement of\n" +
                "    equals by equals) are proved below. The type of [x] and [y] can be\n" +
                "    made explicit using the notation [x = y :> A]. This is Leibniz equality\n" +
                "    as it expresses that [x] and [y] are equal iff every property on\n" +
                "    [A] which is true of [x] is also true of [y] *)\n" +
                "\n" +
                "Inductive eq (A:Type) (x:A) : A -> Prop :=\n" +
                "    eq_refl : x = x :>A\n" +
                "\n" +
                "where \"x = y :> A\" := (@eq A x y) : type_scope.\n" +
                "\n" +
                "Notation \"x = y\" := (x = y :>_) : type_scope.\n" +
                "Notation \"x <> y  :> T\" := (~ x = y :>T) : type_scope.\n" +
                "Notation \"x <> y\" := (x <> y :>_) : type_scope.\n" +
                "\n" +
                "Arguments eq {A} x _.\n" +
                "Arguments eq_refl {A x} , [A] x.\n" +
                "\n" +
                "Arguments eq_ind [A] x P _ y _.\n" +
                "Arguments eq_rec [A] x P _ y _.\n" +
                "Arguments eq_rect [A] x P _ y _.\n" +
                "\n" +
                "Hint Resolve I conj or_introl or_intror : core.\n" +
                "Hint Resolve eq_refl: core.\n" +
                "Hint Resolve ex_intro ex_intro2: core.\n" +
                "\n" +
                "Section Logic_lemmas.\n" +
                "\n" +
                "  Theorem absurd : forall A C:Prop, A -> ~ A -> C.\n" +
                "  Proof.\n" +
                "    unfold not; intros A C h1 h2.\n" +
                "    destruct (h2 h1).\n" +
                "  Qed.\n" +
                "\n" +
                "  Section equality.\n" +
                "    Variables A B : Type.\n" +
                "    Variable f : A -> B.\n" +
                "    Variables x y z : A.\n" +
                "\n" +
                "    Theorem eq_sym : x = y -> y = x.\n" +
                "    Proof.\n" +
                "      destruct 1; trivial.\n" +
                "    Defined.\n" +
                "\n" +
                "    Theorem eq_trans : x = y -> y = z -> x = z.\n" +
                "    Proof.\n" +
                "      destruct 2; trivial.\n" +
                "    Defined.\n" +
                "\n" +
                "    Theorem f_equal : x = y -> f x = f y.\n" +
                "    Proof.\n" +
                "      destruct 1; trivial.\n" +
                "    Defined.\n" +
                "\n" +
                "    Theorem not_eq_sym : x <> y -> y <> x.\n" +
                "    Proof.\n" +
                "      red; intros h1 h2; apply h1; destruct h2; trivial.\n" +
                "    Qed.\n" +
                "\n" +
                "  End equality.\n" +
                "\n" +
                "  Definition eq_ind_r :\n" +
                "    forall (A:Type) (x:A) (P:A -> Prop), P x -> forall y:A, y = x -> P y.\n" +
                "    intros A x P H y H0. elim eq_sym with (1 := H0); assumption.\n" +
                "  Defined.\n" +
                "\n" +
                "  Definition eq_rec_r :\n" +
                "    forall (A:Type) (x:A) (P:A -> Set), P x -> forall y:A, y = x -> P y.\n" +
                "    intros A x P H y H0; elim eq_sym with (1 := H0); assumption.\n" +
                "  Defined.\n" +
                "\n" +
                "  Definition eq_rect_r :\n" +
                "    forall (A:Type) (x:A) (P:A -> Type), P x -> forall y:A, y = x -> P y.\n" +
                "    intros A x P H y H0; elim eq_sym with (1 := H0); assumption.\n" +
                "  Defined.\n" +
                "End Logic_lemmas.\n" +
                "\n" +
                "Module EqNotations.\n" +
                "  Notation \"'rew' H 'in' H'\" := (eq_rect _ _ H' _ H)\n" +
                "    (at level 10, H' at level 10,\n" +
                "     format \"'[' 'rew'  H  in  '/' H' ']'\").\n" +
                "  Notation \"'rew' [ P ] H 'in' H'\" := (eq_rect _ P H' _ H)\n" +
                "    (at level 10, H' at level 10,\n" +
                "     format \"'[' 'rew'  [ P ]  '/    ' H  in  '/' H' ']'\").\n" +
                "  Notation \"'rew' <- H 'in' H'\" := (eq_rect_r _ H' H)\n" +
                "    (at level 10, H' at level 10,\n" +
                "     format \"'[' 'rew'  <-  H  in  '/' H' ']'\").\n" +
                "  Notation \"'rew' <- [ P ] H 'in' H'\" := (eq_rect_r P H' H)\n" +
                "    (at level 10, H' at level 10,\n" +
                "     format \"'[' 'rew'  <-  [ P ]  '/    ' H  in  '/' H' ']'\").\n" +
                "  Notation \"'rew' -> H 'in' H'\" := (eq_rect _ _ H' _ H)\n" +
                "    (at level 10, H' at level 10, only parsing).\n" +
                "  Notation \"'rew' -> [ P ] H 'in' H'\" := (eq_rect _ P H' _ H)\n" +
                "    (at level 10, H' at level 10, only parsing).\n" +
                "\n" +
                "End EqNotations.\n" +
                "\n" +
                "Import EqNotations.\n" +
                "\n" +
                "Lemma rew_opp_r : forall A (P:A->Type) (x y:A) (H:x=y) (a:P y), rew H in rew <- H in a = a.\n" +
                "Proof.\n" +
                "intros.\n" +
                "destruct H.\n" +
                "reflexivity.\n" +
                "Defined.\n" +
                "\n" +
                "Lemma rew_opp_l : forall A (P:A->Type) (x y:A) (H:x=y) (a:P x), rew <- H in rew H in a = a.\n" +
                "Proof.\n" +
                "intros.\n" +
                "destruct H.\n" +
                "reflexivity.\n" +
                "Defined.\n" +
                "\n" +
                "Theorem f_equal2 :\n" +
                "  forall (A1 A2 B:Type) (f:A1 -> A2 -> B) (x1 y1:A1)\n" +
                "    (x2 y2:A2), x1 = y1 -> x2 = y2 -> f x1 x2 = f y1 y2.\n" +
                "Proof.\n" +
                "  destruct 1; destruct 1; reflexivity.\n" +
                "Qed.\n" +
                "\n" +
                "Theorem f_equal3 :\n" +
                "  forall (A1 A2 A3 B:Type) (f:A1 -> A2 -> A3 -> B) (x1 y1:A1)\n" +
                "    (x2 y2:A2) (x3 y3:A3),\n" +
                "    x1 = y1 -> x2 = y2 -> x3 = y3 -> f x1 x2 x3 = f y1 y2 y3.\n" +
                "Proof.\n" +
                "  destruct 1; destruct 1; destruct 1; reflexivity.\n" +
                "Qed.\n" +
                "\n" +
                "Theorem f_equal4 :\n" +
                "  forall (A1 A2 A3 A4 B:Type) (f:A1 -> A2 -> A3 -> A4 -> B)\n" +
                "    (x1 y1:A1) (x2 y2:A2) (x3 y3:A3) (x4 y4:A4),\n" +
                "    x1 = y1 -> x2 = y2 -> x3 = y3 -> x4 = y4 -> f x1 x2 x3 x4 = f y1 y2 y3 y4.\n" +
                "Proof.\n" +
                "  destruct 1; destruct 1; destruct 1; destruct 1; reflexivity.\n" +
                "Qed.\n" +
                "\n" +
                "Theorem f_equal5 :\n" +
                "  forall (A1 A2 A3 A4 A5 B:Type) (f:A1 -> A2 -> A3 -> A4 -> A5 -> B)\n" +
                "    (x1 y1:A1) (x2 y2:A2) (x3 y3:A3) (x4 y4:A4) (x5 y5:A5),\n" +
                "    x1 = y1 ->\n" +
                "    x2 = y2 ->\n" +
                "    x3 = y3 -> x4 = y4 -> x5 = y5 -> f x1 x2 x3 x4 x5 = f y1 y2 y3 y4 y5.\n" +
                "Proof.\n" +
                "  destruct 1; destruct 1; destruct 1; destruct 1; destruct 1; reflexivity.\n" +
                "Qed.\n" +
                "\n" +
                "Theorem f_equal_compose : forall A B C (a b:A) (f:A->B) (g:B->C) (e:a=b),\n" +
                "  f_equal g (f_equal f e) = f_equal (fun a => g (f a)) e.\n" +
                "Proof.\n" +
                "  destruct e. reflexivity.\n" +
                "Defined.\n" +
                "\n" +
                "(** The groupoid structure of equality *)\n" +
                "\n" +
                "Theorem eq_trans_refl_l : forall A (x y:A) (e:x=y), eq_trans eq_refl e = e.\n" +
                "Proof.\n" +
                "  destruct e. reflexivity.\n" +
                "Defined.\n" +
                "\n" +
                "Theorem eq_trans_refl_r : forall A (x y:A) (e:x=y), eq_trans e eq_refl = e.\n" +
                "Proof.\n" +
                "  destruct e. reflexivity.\n" +
                "Defined.\n" +
                "\n" +
                "Theorem eq_sym_involutive : forall A (x y:A) (e:x=y), eq_sym (eq_sym e) = e.\n" +
                "Proof.\n" +
                "  destruct e; reflexivity.\n" +
                "Defined.\n" +
                "\n" +
                "Theorem eq_trans_sym_inv_l : forall A (x y:A) (e:x=y), eq_trans (eq_sym e) e = eq_refl.\n" +
                "Proof.\n" +
                "  destruct e; reflexivity.\n" +
                "Defined.\n" +
                "\n" +
                "Theorem eq_trans_sym_inv_r : forall A (x y:A) (e:x=y), eq_trans e (eq_sym e) = eq_refl.\n" +
                "Proof.\n" +
                "  destruct e; reflexivity.\n" +
                "Defined.\n" +
                "\n" +
                "Theorem eq_trans_assoc : forall A (x y z t:A) (e:x=y) (e':y=z) (e'':z=t),\n" +
                "  eq_trans e (eq_trans e' e'') = eq_trans (eq_trans e e') e''.\n" +
                "Proof.\n" +
                "  destruct e''; reflexivity.\n" +
                "Defined.\n" +
                "\n" +
                "(** Extra properties of equality *)\n" +
                "\n" +
                "Theorem eq_id_comm_l : forall A (f:A->A) (Hf:forall a, a = f a), forall a, f_equal f (Hf a) = Hf (f a).\n" +
                "Proof.\n" +
                "  intros.\n" +
                "  unfold f_equal.\n" +
                "  rewrite <- (eq_trans_sym_inv_l (Hf a)).\n" +
                "  destruct (Hf a) at 1 2.\n" +
                "  destruct (Hf a).\n" +
                "  reflexivity.\n" +
                "Defined.\n" +
                "\n" +
                "Theorem eq_id_comm_r : forall A (f:A->A) (Hf:forall a, f a = a), forall a, f_equal f (Hf a) = Hf (f a).\n" +
                "Proof.\n" +
                "  intros.\n" +
                "  unfold f_equal.\n" +
                "  rewrite <- (eq_trans_sym_inv_l (Hf (f (f a)))).\n" +
                "  set (Hfsymf := fun a => eq_sym (Hf a)).\n" +
                "  change (eq_sym (Hf (f (f a)))) with (Hfsymf (f (f a))).\n" +
                "  pattern (Hfsymf (f (f a))).\n" +
                "  destruct (eq_id_comm_l f Hfsymf (f a)).\n" +
                "  destruct (eq_id_comm_l f Hfsymf a).\n" +
                "  unfold Hfsymf.\n" +
                "  destruct (Hf a). simpl.\n" +
                "  rewrite eq_trans_refl_l.\n" +
                "  reflexivity.\n" +
                "Defined.\n" +
                "\n" +
                "Lemma eq_refl_map_distr : forall A B x (f:A->B), f_equal f (eq_refl x) = eq_refl (f x).\n" +
                "Proof.\n" +
                "  reflexivity.\n" +
                "Qed.\n" +
                "\n" +
                "Lemma eq_trans_map_distr : forall A B x y z (f:A->B) (e:x=y) (e':y=z), f_equal f (eq_trans e e') = eq_trans (f_equal f e) (f_equal f e').\n" +
                "Proof.\n" +
                "destruct e'.\n" +
                "reflexivity.\n" +
                "Defined.\n" +
                "\n" +
                "Lemma eq_sym_map_distr : forall A B (x y:A) (f:A->B) (e:x=y), eq_sym (f_equal f e) = f_equal f (eq_sym e).\n" +
                "Proof.\n" +
                "destruct e.\n" +
                "reflexivity.\n" +
                "Defined.\n" +
                "\n" +
                "Lemma eq_trans_sym_distr : forall A (x y z:A) (e:x=y) (e':y=z), eq_sym (eq_trans e e') = eq_trans (eq_sym e') (eq_sym e).\n" +
                "Proof.\n" +
                "destruct e, e'.\n" +
                "reflexivity.\n" +
                "Defined.\n" +
                "\n" +
                "Lemma eq_trans_rew_distr : forall A (P:A -> Type) (x y z:A) (e:x=y) (e':y=z) (k:P x),\n" +
                "    rew (eq_trans e e') in k = rew e' in rew e in k.\n" +
                "Proof.\n" +
                "  destruct e, e'; reflexivity.\n" +
                "Qed.\n" +
                "\n" +
                "Lemma rew_const : forall A P (x y:A) (e:x=y) (k:P),\n" +
                "    rew [fun _ => P] e in k = k.\n" +
                "Proof.\n" +
                "  destruct e; reflexivity.\n" +
                "Qed.\n" +
                "\n" +
                "\n" +
                "(* Aliases *)\n" +
                "\n" +
                "Notation sym_eq := eq_sym (only parsing).\n" +
                "Notation trans_eq := eq_trans (only parsing).\n" +
                "Notation sym_not_eq := not_eq_sym (only parsing).\n" +
                "\n" +
                "Notation refl_equal := eq_refl (only parsing).\n" +
                "Notation sym_equal := eq_sym (only parsing).\n" +
                "Notation trans_equal := eq_trans (only parsing).\n" +
                "Notation sym_not_equal := not_eq_sym (only parsing).\n" +
                "\n" +
                "Hint Immediate eq_sym not_eq_sym: core.\n" +
                "\n" +
                "(** Basic definitions about relations and properties *)\n" +
                "\n" +
                "Definition subrelation (A B : Type) (R R' : A->B->Prop) :=\n" +
                "  forall x y, R x y -> R' x y.\n" +
                "\n" +
                "Definition unique (A : Type) (P : A->Prop) (x:A) :=\n" +
                "  P x /\\ forall (x':A), P x' -> x=x'.\n" +
                "\n" +
                "Definition uniqueness (A:Type) (P:A->Prop) := forall x y, P x -> P y -> x = y.\n" +
                "\n" +
                "(** Unique existence *)\n" +
                "\n" +
                "Notation \"'exists' ! x .. y , p\" :=\n" +
                "  (ex (unique (fun x => .. (ex (unique (fun y => p))) ..)))\n" +
                "  (at level 200, x binder, right associativity,\n" +
                "   format \"'[' 'exists'  !  '/  ' x  ..  y ,  '/  ' p ']'\")\n" +
                "  : type_scope.\n" +
                "\n" +
                "Lemma unique_existence : forall (A:Type) (P:A->Prop),\n" +
                "  ((exists x, P x) /\\ uniqueness P) <-> (exists! x, P x).\n" +
                "Proof.\n" +
                "  intros A P; split.\n" +
                "  - intros ((x,Hx),Huni); exists x; red; auto.\n" +
                "  - intros (x,(Hx,Huni)); split.\n" +
                "    + exists x; assumption.\n" +
                "    + intros x' x'' Hx' Hx''; transitivity x.\n" +
                "      symmetry; auto.\n" +
                "      auto.\n" +
                "Qed.\n" +
                "\n" +
                "Lemma forall_exists_unique_domain_coincide :\n" +
                "  forall A (P:A->Prop), (exists! x, P x) ->\n" +
                "  forall Q:A->Prop, (forall x, P x -> Q x) <-> (exists x, P x /\\ Q x).\n" +
                "Proof.\n" +
                "  intros A P (x & Hp & Huniq); split.\n" +
                "  - intro; exists x; auto.\n" +
                "  - intros (x0 & HPx0 & HQx0) x1 HPx1.\n" +
                "    assert (H : x0 = x1) by (transitivity x; [symmetry|]; auto).\n" +
                "    destruct H.\n" +
                "    assumption.\n" +
                "Qed.\n" +
                "\n" +
                "Lemma forall_exists_coincide_unique_domain :\n" +
                "  forall A (P:A->Prop),\n" +
                "  (forall Q:A->Prop, (forall x, P x -> Q x) <-> (exists x, P x /\\ Q x))\n" +
                "  -> (exists! x, P x).\n" +
                "Proof.\n" +
                "  intros A P H.\n" +
                "  destruct H with (Q:=P) as ((x & Hx & _),_); [trivial|].\n" +
                "  exists x. split; [trivial|].\n" +
                "  destruct H with (Q:=fun x'=>x=x') as (_,Huniq).\n" +
                "  apply Huniq. exists x; auto.\n" +
                "Qed.\n" +
                "\n" +
                "(** * Being inhabited *)\n" +
                "\n" +
                "(** The predicate [inhabited] can be used in different contexts. If [A] is\n" +
                "    thought as a type, [inhabited A] states that [A] is inhabited. If [A] is\n" +
                "    thought as a computationally relevant proposition, then\n" +
                "    [inhabited A] weakens [A] so as to hide its computational meaning.\n" +
                "    The so-weakened proof remains computationally relevant but only in\n" +
                "    a propositional context.\n" +
                "*)\n" +
                "\n" +
                "Inductive inhabited (A:Type) : Prop := inhabits : A -> inhabited A.\n" +
                "\n" +
                "Hint Resolve inhabits: core.\n" +
                "\n" +
                "Lemma exists_inhabited : forall (A:Type) (P:A->Prop),\n" +
                "  (exists x, P x) -> inhabited A.\n" +
                "Proof.\n" +
                "  destruct 1; auto.\n" +
                "Qed.\n" +
                "\n" +
                "Lemma inhabited_covariant (A B : Type) : (A -> B) -> inhabited A -> inhabited B.\n" +
                "Proof.\n" +
                "  intros f [x];exact (inhabits (f x)).\n" +
                "Qed.\n" +
                "\n" +
                "(** Declaration of stepl and stepr for eq and iff *)\n" +
                "\n" +
                "Lemma eq_stepl : forall (A : Type) (x y z : A), x = y -> x = z -> z = y.\n" +
                "Proof.\n" +
                "  intros A x y z H1 H2. rewrite <- H2; exact H1.\n" +
                "Qed.\n" +
                "\n" +
                "Declare Left Step eq_stepl.\n" +
                "Declare Right Step eq_trans.\n" +
                "\n" +
                "Lemma iff_stepl : forall A B C : Prop, (A <-> B) -> (A <-> C) -> (C <-> B).\n" +
                "Proof.\n" +
                "  intros ? ? ? [? ?] [? ?]; split; intros; auto.\n" +
                "Qed.\n" +
                "\n" +
                "Declare Left Step iff_stepl.\n" +
                "Declare Right Step iff_trans.\n" +
                "\n" +
                "Local Notation \"'rew' 'dependent' H 'in' H'\"\n" +
                "  := (match H with\n" +
                "      | eq_refl => H'\n" +
                "      end)\n" +
                "       (at level 10, H' at level 10,\n" +
                "        format \"'[' 'rew'  'dependent'  '/    ' H  in  '/' H' ']'\").\n" +
                "\n" +
                "(** Equality for [ex] *)\n" +
                "Section ex.\n" +
                "  Local Unset Implicit Arguments.\n" +
                "  Definition eq_ex_uncurried {A : Type} (P : A -> Prop) {u1 v1 : A} {u2 : P u1} {v2 : P v1}\n" +
                "             (pq : exists p : u1 = v1, rew p in u2 = v2)\n" +
                "  : ex_intro P u1 u2 = ex_intro P v1 v2.\n" +
                "  Proof.\n" +
                "    destruct pq as [p q].\n" +
                "    destruct q; simpl in *.\n" +
                "    destruct p; reflexivity.\n" +
                "  Qed.\n" +
                "\n" +
                "  Definition eq_ex {A : Type} {P : A -> Prop} (u1 v1 : A) (u2 : P u1) (v2 : P v1)\n" +
                "             (p : u1 = v1) (q : rew p in u2 = v2)\n" +
                "  : ex_intro P u1 u2 = ex_intro P v1 v2\n" +
                "    := eq_ex_uncurried P (ex_intro _ p q).\n" +
                "\n" +
                "  Definition eq_ex_hprop {A} {P : A -> Prop} (P_hprop : forall (x : A) (p q : P x), p = q)\n" +
                "             (u1 v1 : A) (u2 : P u1) (v2 : P v1)\n" +
                "             (p : u1 = v1)\n" +
                "    : ex_intro P u1 u2 = ex_intro P v1 v2\n" +
                "    := eq_ex u1 v1 u2 v2 p (P_hprop _ _ _).\n" +
                "\n" +
                "  Lemma rew_ex {A x} {P : A -> Type} (Q : forall a, P a -> Prop) (u : exists p, Q x p) {y} (H : x = y)\n" +
                "  : rew [fun a => exists p, Q a p] H in u\n" +
                "    = match u with\n" +
                "        | ex_intro _ u1 u2\n" +
                "          => ex_intro\n" +
                "               (Q y)\n" +
                "               (rew H in u1)\n" +
                "               (rew dependent H in u2)\n" +
                "      end.\n" +
                "  Proof.\n" +
                "    destruct H, u; reflexivity.\n" +
                "  Qed.\n" +
                "End ex.\n" +
                "\n" +
                "(** Equality for [ex2] *)\n" +
                "Section ex2.\n" +
                "  Local Unset Implicit Arguments.\n" +
                "\n" +
                "  Definition eq_ex2_uncurried {A : Type} (P Q : A -> Prop) {u1 v1 : A}\n" +
                "             {u2 : P u1} {v2 : P v1}\n" +
                "             {u3 : Q u1} {v3 : Q v1}\n" +
                "             (pq : exists2 p : u1 = v1, rew p in u2 = v2 & rew p in u3 = v3)\n" +
                "  : ex_intro2 P Q u1 u2 u3 = ex_intro2 P Q v1 v2 v3.\n" +
                "  Proof.\n" +
                "    destruct pq as [p q r].\n" +
                "    destruct r, q, p; simpl in *.\n" +
                "    reflexivity.\n" +
                "  Qed.\n" +
                "\n" +
                "  Definition eq_ex2 {A : Type} {P Q : A -> Prop}\n" +
                "             (u1 v1 : A)\n" +
                "             (u2 : P u1) (v2 : P v1)\n" +
                "             (u3 : Q u1) (v3 : Q v1)\n" +
                "             (p : u1 = v1) (q : rew p in u2 = v2) (r : rew p in u3 = v3)\n" +
                "  : ex_intro2 P Q u1 u2 u3 = ex_intro2 P Q v1 v2 v3\n" +
                "    := eq_ex2_uncurried P Q (ex_intro2 _ _ p q r).\n" +
                "\n" +
                "  Definition eq_ex2_hprop {A} {P Q : A -> Prop}\n" +
                "             (P_hprop : forall (x : A) (p q : P x), p = q)\n" +
                "             (Q_hprop : forall (x : A) (p q : Q x), p = q)\n" +
                "             (u1 v1 : A) (u2 : P u1) (v2 : P v1) (u3 : Q u1) (v3 : Q v1)\n" +
                "             (p : u1 = v1)\n" +
                "    : ex_intro2 P Q u1 u2 u3 = ex_intro2 P Q v1 v2 v3\n" +
                "    := eq_ex2 u1 v1 u2 v2 u3 v3 p (P_hprop _ _ _) (Q_hprop _ _ _).\n" +
                "\n" +
                "  Lemma rew_ex2 {A x} {P : A -> Type}\n" +
                "        (Q : forall a, P a -> Prop)\n" +
                "        (R : forall a, P a -> Prop)\n" +
                "        (u : exists2 p, Q x p & R x p) {y} (H : x = y)\n" +
                "  : rew [fun a => exists2 p, Q a p & R a p] H in u\n" +
                "    = match u with\n" +
                "        | ex_intro2 _ _ u1 u2 u3\n" +
                "          => ex_intro2\n" +
                "               (Q y)\n" +
                "               (R y)\n" +
                "               (rew H in u1)\n" +
                "               (rew dependent H in u2)\n" +
                "               (rew dependent H in u3)\n" +
                "      end.\n" +
                "  Proof.\n" +
                "    destruct H, u; reflexivity.\n" +
                "  Qed.\n" +
                "End ex2.";

        public static final String decimal = "(************************************************************************)\n" +
                "(*         *   The Coq Proof Assistant / The Coq Development Team       *)\n" +
                "(*  v      *   INRIA, CNRS and contributors - Copyright 1999-2018       *)\n" +
                "(* <O___,, *       (see CREDITS file for the list of authors)           *)\n" +
                "(*   \\VV/  **************************************************************)\n" +
                "(*    //   *    This file is distributed under the terms of the         *)\n" +
                "(*         *     GNU Lesser General Public License Version 2.1          *)\n" +
                "(*         *     (see LICENSE file for the text of the license)         *)\n" +
                "(************************************************************************)\n" +
                "\n" +
                "(** * Decimal numbers *)\n" +
                "\n" +
                "(** These numbers coded in base 10 will be used for parsing and printing\n" +
                "    other Coq numeral datatypes in an human-readable way.\n" +
                "    See the [Numeral Notation] command.\n" +
                "    We represent numbers in base 10 as lists of decimal digits,\n" +
                "    in big-endian order (most significant digit comes first). *)\n" +
                "\n" +
                "(** Unsigned integers are just lists of digits.\n" +
                "    For instance, ten is (D1 (D0 Nil)) *)\n" +
                "\n" +
                "Inductive uint :=\n" +
                " | Nil\n" +
                " | D0 (_:uint)\n" +
                " | D1 (_:uint)\n" +
                " | D2 (_:uint)\n" +
                " | D3 (_:uint)\n" +
                " | D4 (_:uint)\n" +
                " | D5 (_:uint)\n" +
                " | D6 (_:uint)\n" +
                " | D7 (_:uint)\n" +
                " | D8 (_:uint)\n" +
                " | D9 (_:uint).\n" +
                "\n" +
                "(** [Nil] is the number terminator. Taken alone, it behaves as zero,\n" +
                "    but rather use [D0 Nil] instead, since this form will be denoted\n" +
                "    as [0], while [Nil] will be printed as [Nil]. *)\n" +
                "\n" +
                "Notation zero := (D0 Nil).\n" +
                "\n" +
                "(** For signed integers, we use two constructors [Pos] and [Neg]. *)\n" +
                "\n" +
                "Inductive int := Pos (d:uint) | Neg (d:uint).\n" +
                "\n" +
                "Delimit Scope uint_scope with uint.\n" +
                "Bind Scope uint_scope with uint.\n" +
                "Delimit Scope int_scope with int.\n" +
                "Bind Scope int_scope with int.\n" +
                "\n" +
                "(** This representation favors simplicity over canonicity.\n" +
                "    For normalizing numbers, we need to remove head zero digits,\n" +
                "    and choose our canonical representation of 0 (here [D0 Nil]\n" +
                "    for unsigned numbers and [Pos (D0 Nil)] for signed numbers). *)\n" +
                "\n" +
                "(** [nzhead] removes all head zero digits *)\n" +
                "\n" +
                "Fixpoint nzhead d :=\n" +
                "  match d with\n" +
                "  | D0 d => nzhead d\n" +
                "  | _ => d\n" +
                "  end.\n" +
                "\n" +
                "(** [unorm] : normalization of unsigned integers *)\n" +
                "\n" +
                "Definition unorm d :=\n" +
                "  match nzhead d with\n" +
                "  | Nil => zero\n" +
                "  | d => d\n" +
                "  end.\n" +
                "\n" +
                "(** [norm] : normalization of signed integers *)\n" +
                "\n" +
                "Definition norm d :=\n" +
                "  match d with\n" +
                "  | Pos d => Pos (unorm d)\n" +
                "  | Neg d =>\n" +
                "    match nzhead d with\n" +
                "    | Nil => Pos zero\n" +
                "    | d => Neg d\n" +
                "    end\n" +
                "  end.\n" +
                "\n" +
                "(** A few easy operations. For more advanced computations, use the conversions\n" +
                "    with other Coq numeral datatypes (e.g. Z) and the operations on them. *)\n" +
                "\n" +
                "Definition opp (d:int) :=\n" +
                "  match d with\n" +
                "  | Pos d => Neg d\n" +
                "  | Neg d => Pos d\n" +
                "  end.\n" +
                "\n" +
                "(** For conversions with binary numbers, it is easier to operate\n" +
                "    on little-endian numbers. *)\n" +
                "\n" +
                "Fixpoint revapp (d d' : uint) :=\n" +
                "  match d with\n" +
                "  | Nil => d'\n" +
                "  | D0 d => revapp d (D0 d')\n" +
                "  | D1 d => revapp d (D1 d')\n" +
                "  | D2 d => revapp d (D2 d')\n" +
                "  | D3 d => revapp d (D3 d')\n" +
                "  | D4 d => revapp d (D4 d')\n" +
                "  | D5 d => revapp d (D5 d')\n" +
                "  | D6 d => revapp d (D6 d')\n" +
                "  | D7 d => revapp d (D7 d')\n" +
                "  | D8 d => revapp d (D8 d')\n" +
                "  | D9 d => revapp d (D9 d')\n" +
                "  end.\n" +
                "\n" +
                "Definition rev d := revapp d Nil.\n" +
                "\n" +
                "Module Little.\n" +
                "\n" +
                "(** Successor of little-endian numbers *)\n" +
                "\n" +
                "Fixpoint succ d :=\n" +
                "  match d with\n" +
                "  | Nil => D1 Nil\n" +
                "  | D0 d => D1 d\n" +
                "  | D1 d => D2 d\n" +
                "  | D2 d => D3 d\n" +
                "  | D3 d => D4 d\n" +
                "  | D4 d => D5 d\n" +
                "  | D5 d => D6 d\n" +
                "  | D6 d => D7 d\n" +
                "  | D7 d => D8 d\n" +
                "  | D8 d => D9 d\n" +
                "  | D9 d => D0 (succ d)\n" +
                "  end.\n" +
                "\n" +
                "(** Doubling little-endian numbers *)\n" +
                "\n" +
                "Fixpoint double d :=\n" +
                "  match d with\n" +
                "  | Nil => Nil\n" +
                "  | D0 d => D0 (double d)\n" +
                "  | D1 d => D2 (double d)\n" +
                "  | D2 d => D4 (double d)\n" +
                "  | D3 d => D6 (double d)\n" +
                "  | D4 d => D8 (double d)\n" +
                "  | D5 d => D0 (succ_double d)\n" +
                "  | D6 d => D2 (succ_double d)\n" +
                "  | D7 d => D4 (succ_double d)\n" +
                "  | D8 d => D6 (succ_double d)\n" +
                "  | D9 d => D8 (succ_double d)\n" +
                "  end\n" +
                "\n" +
                "with succ_double d :=\n" +
                "  match d with\n" +
                "  | Nil => D1 Nil\n" +
                "  | D0 d => D1 (double d)\n" +
                "  | D1 d => D3 (double d)\n" +
                "  | D2 d => D5 (double d)\n" +
                "  | D3 d => D7 (double d)\n" +
                "  | D4 d => D9 (double d)\n" +
                "  | D5 d => D1 (succ_double d)\n" +
                "  | D6 d => D3 (succ_double d)\n" +
                "  | D7 d => D5 (succ_double d)\n" +
                "  | D8 d => D7 (succ_double d)\n" +
                "  | D9 d => D9 (succ_double d)\n" +
                "  end.\n" +
                "\n" +
                "End Little.";

        public static final String logic_typeV = "(************************************************************************)\n" +
                "(*         *   The Coq Proof Assistant / The Coq Development Team       *)\n" +
                "(*  v      *   INRIA, CNRS and contributors - Copyright 1999-2018       *)\n" +
                "(* <O___,, *       (see CREDITS file for the list of authors)           *)\n" +
                "(*   \\VV/  **************************************************************)\n" +
                "(*    //   *    This file is distributed under the terms of the         *)\n" +
                "(*         *     GNU Lesser General Public License Version 2.1          *)\n" +
                "(*         *     (see LICENSE file for the text of the license)         *)\n" +
                "(************************************************************************)\n" +
                "\n" +
                "(** This module defines type constructors for types in [Type]\n" +
                "    ([Datatypes.v] and [Logic.v] defined them for types in [Set]) *)\n" +
                "\n" +
                "Set Implicit Arguments.\n" +
                "\n" +
                "Require Import Datatypes.\n" +
                "Require Export Logic.\n" +
                "\n" +
                "(** Negation of a type in [Type] *)\n" +
                "\n" +
                "Definition notT (A:Type) := A -> False.\n" +
                "\n" +
                "(** Properties of [identity] *)\n" +
                "\n" +
                "Section identity_is_a_congruence.\n" +
                "\n" +
                " Variables A B : Type.\n" +
                " Variable f : A -> B.\n" +
                "\n" +
                " Variables x y z : A.\n" +
                "\n" +
                " Lemma identity_sym : identity x y -> identity y x.\n" +
                " Proof.\n" +
                "  destruct 1; trivial.\n" +
                " Defined.\n" +
                "\n" +
                " Lemma identity_trans : identity x y -> identity y z -> identity x z.\n" +
                " Proof.\n" +
                "  destruct 2; trivial.\n" +
                " Defined.\n" +
                "\n" +
                " Lemma identity_congr : identity x y -> identity (f x) (f y).\n" +
                " Proof.\n" +
                "  destruct 1; trivial.\n" +
                " Defined.\n" +
                "\n" +
                " Lemma not_identity_sym : notT (identity x y) -> notT (identity y x).\n" +
                " Proof.\n" +
                "  red; intros H H'; apply H; destruct H'; trivial.\n" +
                " Qed.\n" +
                "\n" +
                "End identity_is_a_congruence.\n" +
                "\n" +
                "Definition identity_ind_r :\n" +
                "  forall (A:Type) (a:A) (P:A -> Prop), P a -> forall y:A, identity y a -> P y.\n" +
                " intros A x P H y H0; case identity_sym with (1 := H0); trivial.\n" +
                "Defined.\n" +
                "\n" +
                "Definition identity_rec_r :\n" +
                "  forall (A:Type) (a:A) (P:A -> Set), P a -> forall y:A, identity y a -> P y.\n" +
                " intros A x P H y H0; case identity_sym with (1 := H0); trivial.\n" +
                "Defined.\n" +
                "\n" +
                "Definition identity_rect_r :\n" +
                "  forall (A:Type) (a:A) (P:A -> Type), P a -> forall y:A, identity y a -> P y.\n" +
                " intros A x P H y H0; case identity_sym with (1 := H0); trivial.\n" +
                "Defined.\n" +
                "\n" +
                "Hint Immediate identity_sym not_identity_sym: core.\n" +
                "\n" +
                "Notation refl_id := identity_refl (only parsing).\n" +
                "Notation sym_id := identity_sym (only parsing).\n" +
                "Notation trans_id := identity_trans (only parsing).\n" +
                "Notation sym_not_id := not_identity_sym (only parsing).";

        public final static String nat = "(************************************************************************)\n" +
                "(*         *   The Coq Proof Assistant / The Coq Development Team       *)\n" +
                "(*  v      *   INRIA, CNRS and contributors - Copyright 1999-2018       *)\n" +
                "(* <O___,, *       (see CREDITS file for the list of authors)           *)\n" +
                "(*   \\VV/  **************************************************************)\n" +
                "(*    //   *    This file is distributed under the terms of the         *)\n" +
                "(*         *     GNU Lesser General Public License Version 2.1          *)\n" +
                "(*         *     (see LICENSE file for the text of the license)         *)\n" +
                "(************************************************************************)\n" +
                "\n" +
                "Require Import Notations Logic Datatypes.\n" +
                "Require Decimal.\n" +
                "Local Open Scope nat_scope.\n" +
                "\n" +
                "(**********************************************************************)\n" +
                "(** * Peano natural numbers, definitions of operations *)\n" +
                "(**********************************************************************)\n" +
                "\n" +
                "(** This file is meant to be used as a whole module,\n" +
                "    without importing it, leading to qualified definitions\n" +
                "    (e.g. Nat.pred) *)\n" +
                "\n" +
                "Definition t := nat.\n" +
                "\n" +
                "(** ** Constants *)\n" +
                "\n" +
                "Definition zero := 0.\n" +
                "Definition one := 1.\n" +
                "Definition two := 2.\n" +
                "\n" +
                "(** ** Basic operations *)\n" +
                "\n" +
                "Definition succ := S.\n" +
                "\n" +
                "Definition pred n :=\n" +
                "  match n with\n" +
                "    | 0 => n\n" +
                "    | S u => u\n" +
                "  end.\n" +
                "\n" +
                "Fixpoint add n m :=\n" +
                "  match n with\n" +
                "  | 0 => m\n" +
                "  | S p => S (p + m)\n" +
                "  end\n" +
                "\n" +
                "where \"n + m\" := (add n m) : nat_scope.\n" +
                "\n" +
                "Definition double n := n + n.\n" +
                "\n" +
                "Fixpoint mul n m :=\n" +
                "  match n with\n" +
                "  | 0 => 0\n" +
                "  | S p => m + p * m\n" +
                "  end\n" +
                "\n" +
                "where \"n * m\" := (mul n m) : nat_scope.\n" +
                "\n" +
                "(** Truncated subtraction: [n-m] is [0] if [n<=m] *)\n" +
                "\n" +
                "Fixpoint sub n m :=\n" +
                "  match n, m with\n" +
                "  | S k, S l => k - l\n" +
                "  | _, _ => n\n" +
                "  end\n" +
                "\n" +
                "where \"n - m\" := (sub n m) : nat_scope.\n" +
                "\n" +
                "(** ** Comparisons *)\n" +
                "\n" +
                "Fixpoint eqb n m : bool :=\n" +
                "  match n, m with\n" +
                "    | 0, 0 => true\n" +
                "    | 0, S _ => false\n" +
                "    | S _, 0 => false\n" +
                "    | S n', S m' => eqb n' m'\n" +
                "  end.\n" +
                "\n" +
                "Fixpoint leb n m : bool :=\n" +
                "  match n, m with\n" +
                "    | 0, _ => true\n" +
                "    | _, 0 => false\n" +
                "    | S n', S m' => leb n' m'\n" +
                "  end.\n" +
                "\n" +
                "Definition ltb n m := leb (S n) m.\n" +
                "\n" +
                "Infix \"=?\" := eqb (at level 70) : nat_scope.\n" +
                "Infix \"<=?\" := leb (at level 70) : nat_scope.\n" +
                "Infix \"<?\" := ltb (at level 70) : nat_scope.\n" +
                "\n" +
                "Fixpoint compare n m : comparison :=\n" +
                "  match n, m with\n" +
                "   | 0, 0 => Eq\n" +
                "   | 0, S _ => Lt\n" +
                "   | S _, 0 => Gt\n" +
                "   | S n', S m' => compare n' m'\n" +
                "  end.\n" +
                "\n" +
                "Infix \"?=\" := compare (at level 70) : nat_scope.\n" +
                "\n" +
                "(** ** Minimum, maximum *)\n" +
                "\n" +
                "Fixpoint max n m :=\n" +
                "  match n, m with\n" +
                "    | 0, _ => m\n" +
                "    | S n', 0 => n\n" +
                "    | S n', S m' => S (max n' m')\n" +
                "  end.\n" +
                "\n" +
                "Fixpoint min n m :=\n" +
                "  match n, m with\n" +
                "    | 0, _ => 0\n" +
                "    | S n', 0 => 0\n" +
                "    | S n', S m' => S (min n' m')\n" +
                "  end.\n" +
                "\n" +
                "(** ** Parity tests *)\n" +
                "\n" +
                "Fixpoint even n : bool :=\n" +
                "  match n with\n" +
                "    | 0 => true\n" +
                "    | 1 => false\n" +
                "    | S (S n') => even n'\n" +
                "  end.\n" +
                "\n" +
                "Definition odd n := negb (even n).\n" +
                "\n" +
                "(** ** Power *)\n" +
                "\n" +
                "Fixpoint pow n m :=\n" +
                "  match m with\n" +
                "    | 0 => 1\n" +
                "    | S m => n * (n^m)\n" +
                "  end\n" +
                "\n" +
                "where \"n ^ m\" := (pow n m) : nat_scope.\n" +
                "\n" +
                "(** ** Tail-recursive versions of [add] and [mul] *)\n" +
                "\n" +
                "Fixpoint tail_add n m :=\n" +
                "  match n with\n" +
                "    | O => m\n" +
                "    | S n => tail_add n (S m)\n" +
                "  end.\n" +
                "\n" +
                "(** [tail_addmul r n m] is [r + n * m]. *)\n" +
                "\n" +
                "Fixpoint tail_addmul r n m :=\n" +
                "  match n with\n" +
                "    | O => r\n" +
                "    | S n => tail_addmul (tail_add m r) n m\n" +
                "  end.\n" +
                "\n" +
                "Definition tail_mul n m := tail_addmul 0 n m.\n" +
                "\n" +
                "(** ** Conversion with a decimal representation for printing/parsing *)\n" +
                "\n" +
                "Local Notation ten := (S (S (S (S (S (S (S (S (S (S O)))))))))).\n" +
                "\n" +
                "Fixpoint of_uint_acc (d:Decimal.uint)(acc:nat) :=\n" +
                "  match d with\n" +
                "  | Decimal.Nil => acc\n" +
                "  | Decimal.D0 d => of_uint_acc d (tail_mul ten acc)\n" +
                "  | Decimal.D1 d => of_uint_acc d (S (tail_mul ten acc))\n" +
                "  | Decimal.D2 d => of_uint_acc d (S (S (tail_mul ten acc)))\n" +
                "  | Decimal.D3 d => of_uint_acc d (S (S (S (tail_mul ten acc))))\n" +
                "  | Decimal.D4 d => of_uint_acc d (S (S (S (S (tail_mul ten acc)))))\n" +
                "  | Decimal.D5 d => of_uint_acc d (S (S (S (S (S (tail_mul ten acc))))))\n" +
                "  | Decimal.D6 d => of_uint_acc d (S (S (S (S (S (S (tail_mul ten acc)))))))\n" +
                "  | Decimal.D7 d => of_uint_acc d (S (S (S (S (S (S (S (tail_mul ten acc))))))))\n" +
                "  | Decimal.D8 d => of_uint_acc d (S (S (S (S (S (S (S (S (tail_mul ten acc)))))))))\n" +
                "  | Decimal.D9 d => of_uint_acc d (S (S (S (S (S (S (S (S (S (tail_mul ten acc))))))))))\n" +
                "  end.\n" +
                "\n" +
                "Definition of_uint (d:Decimal.uint) := of_uint_acc d O.\n" +
                "\n" +
                "Fixpoint to_little_uint n acc :=\n" +
                "  match n with\n" +
                "  | O => acc\n" +
                "  | S n => to_little_uint n (Decimal.Little.succ acc)\n" +
                "  end.\n" +
                "\n" +
                "Definition to_uint n :=\n" +
                "  Decimal.rev (to_little_uint n Decimal.zero).\n" +
                "\n" +
                "Definition of_int (d:Decimal.int) : option nat :=\n" +
                "  match Decimal.norm d with\n" +
                "    | Decimal.Pos u => Some (of_uint u)\n" +
                "    | _ => None\n" +
                "  end.\n" +
                "\n" +
                "Definition to_int n := Decimal.Pos (to_uint n).\n" +
                "\n" +
                "(** ** Euclidean division *)\n" +
                "\n" +
                "(** This division is linear and tail-recursive.\n" +
                "    In [divmod], [y] is the predecessor of the actual divisor,\n" +
                "    and [u] is [y] minus the real remainder\n" +
                "*)\n" +
                "\n" +
                "Fixpoint divmod x y q u :=\n" +
                "  match x with\n" +
                "    | 0 => (q,u)\n" +
                "    | S x' => match u with\n" +
                "                | 0 => divmod x' y (S q) y\n" +
                "                | S u' => divmod x' y q u'\n" +
                "              end\n" +
                "  end.\n" +
                "\n" +
                "Definition div x y :=\n" +
                "  match y with\n" +
                "    | 0 => y\n" +
                "    | S y' => fst (divmod x y' 0 y')\n" +
                "  end.\n" +
                "\n" +
                "Definition modulo x y :=\n" +
                "  match y with\n" +
                "    | 0 => y\n" +
                "    | S y' => y' - snd (divmod x y' 0 y')\n" +
                "  end.\n" +
                "\n" +
                "Infix \"/\" := div : nat_scope.\n" +
                "Infix \"mod\" := modulo (at level 40, no associativity) : nat_scope.\n" +
                "\n" +
                "\n" +
                "(** ** Greatest common divisor *)\n" +
                "\n" +
                "(** We use Euclid algorithm, which is normally not structural,\n" +
                "    but Coq is now clever enough to accept this (behind modulo\n" +
                "    there is a subtraction, which now preserves being a subterm)\n" +
                "*)\n" +
                "\n" +
                "Fixpoint gcd a b :=\n" +
                "  match a with\n" +
                "   | O => b\n" +
                "   | S a' => gcd (b mod (S a')) (S a')\n" +
                "  end.\n" +
                "\n" +
                "(** ** Square *)\n" +
                "\n" +
                "Definition square n := n * n.\n" +
                "\n" +
                "(** ** Square root *)\n" +
                "\n" +
                "(** The following square root function is linear (and tail-recursive).\n" +
                "  With Peano representation, we can't do better. For faster algorithm,\n" +
                "  see Psqrt/Zsqrt/Nsqrt...\n" +
                "  We search the square root of n = k + p^2 + (q - r)\n" +
                "  with q = 2p and 0<=r<=q. We start with p=q=r=0, hence\n" +
                "  looking for the square root of n = k. Then we progressively\n" +
                "  decrease k and r. When k = S k' and r=0, it means we can use (S p)\n" +
                "  as new sqrt candidate, since (S k')+p^2+2p = k'+(S p)^2.\n" +
                "  When k reaches 0, we have found the biggest p^2 square contained\n" +
                "  in n, hence the square root of n is p.\n" +
                "*)\n" +
                "\n" +
                "Fixpoint sqrt_iter k p q r :=\n" +
                "  match k with\n" +
                "    | O => p\n" +
                "    | S k' => match r with\n" +
                "                | O => sqrt_iter k' (S p) (S (S q)) (S (S q))\n" +
                "                | S r' => sqrt_iter k' p q r'\n" +
                "              end\n" +
                "  end.\n" +
                "\n" +
                "Definition sqrt n := sqrt_iter n 0 0 0.\n" +
                "\n" +
                "(** ** Log2 *)\n" +
                "\n" +
                "(** This base-2 logarithm is linear and tail-recursive.\n" +
                "  In [log2_iter], we maintain the logarithm [p] of the counter [q],\n" +
                "  while [r] is the distance between [q] and the next power of 2,\n" +
                "  more precisely [q + S r = 2^(S p)] and [r<2^p]. At each\n" +
                "  recursive call, [q] goes up while [r] goes down. When [r]\n" +
                "  is 0, we know that [q] has almost reached a power of 2,\n" +
                "  and we increase [p] at the next call, while resetting [r]\n" +
                "  to [q].\n" +
                "  Graphically (numbers are [q], stars are [r]) :\n" +
                "<<\n" +
                "                    10\n" +
                "                  9\n" +
                "                8\n" +
                "              7   *\n" +
                "            6       *\n" +
                "          5           ...\n" +
                "        4\n" +
                "      3   *\n" +
                "    2       *\n" +
                "  1   *       *\n" +
                "0   *   *       *\n" +
                ">>\n" +
                "  We stop when [k], the global downward counter reaches 0.\n" +
                "  At that moment, [q] is the number we're considering (since\n" +
                "  [k+q] is invariant), and [p] its logarithm.\n" +
                "*)\n" +
                "\n" +
                "Fixpoint log2_iter k p q r :=\n" +
                "  match k with\n" +
                "    | O => p\n" +
                "    | S k' => match r with\n" +
                "                | O => log2_iter k' (S p) (S q) q\n" +
                "                | S r' => log2_iter k' p (S q) r'\n" +
                "              end\n" +
                "  end.\n" +
                "\n" +
                "Definition log2 n := log2_iter (pred n) 0 1 0.\n" +
                "\n" +
                "(** Iterator on natural numbers *)\n" +
                "\n" +
                "Definition iter (n:nat) {A} (f:A->A) (x:A) : A :=\n" +
                " nat_rect (fun _ => A) x (fun _ => f) n.\n" +
                "\n" +
                "(** Bitwise operations *)\n" +
                "\n" +
                "(** We provide here some bitwise operations for unary numbers.\n" +
                "  Some might be really naive, they are just there for fullfiling\n" +
                "  the same interface as other for natural representations. As\n" +
                "  soon as binary representations such as NArith are available,\n" +
                "  it is clearly better to convert to/from them and use their ops.\n" +
                "*)\n" +
                "\n" +
                "Fixpoint div2 n :=\n" +
                "  match n with\n" +
                "  | 0 => 0\n" +
                "  | S 0 => 0\n" +
                "  | S (S n') => S (div2 n')\n" +
                "  end.\n" +
                "\n" +
                "Fixpoint testbit a n : bool :=\n" +
                " match n with\n" +
                "   | 0 => odd a\n" +
                "   | S n => testbit (div2 a) n\n" +
                " end.\n" +
                "\n" +
                "Definition shiftl a := nat_rect _ a (fun _ => double).\n" +
                "Definition shiftr a := nat_rect _ a (fun _ => div2).\n" +
                "\n" +
                "Fixpoint bitwise (op:bool->bool->bool) n a b :=\n" +
                " match n with\n" +
                "  | 0 => 0\n" +
                "  | S n' =>\n" +
                "    (if op (odd a) (odd b) then 1 else 0) +\n" +
                "    2*(bitwise op n' (div2 a) (div2 b))\n" +
                " end.\n" +
                "\n" +
                "Definition land a b := bitwise andb a a b.\n" +
                "Definition lor a b := bitwise orb (max a b) a b.\n" +
                "Definition ldiff a b := bitwise (fun b b' => andb b (negb b')) a a b.\n" +
                "Definition lxor a b := bitwise xorb (max a b) a b.";

        public static final String notations = "(************************************************************************)\n" +
                "(*         *   The Coq Proof Assistant / The Coq Development Team       *)\n" +
                "(*  v      *   INRIA, CNRS and contributors - Copyright 1999-2018       *)\n" +
                "(* <O___,, *       (see CREDITS file for the list of authors)           *)\n" +
                "(*   \\VV/  **************************************************************)\n" +
                "(*    //   *    This file is distributed under the terms of the         *)\n" +
                "(*         *     GNU Lesser General Public License Version 2.1          *)\n" +
                "(*         *     (see LICENSE file for the text of the license)         *)\n" +
                "(************************************************************************)\n" +
                "\n" +
                "(** These are the notations whose level and associativity are imposed by Coq *)\n" +
                "\n" +
                "(** Notations for propositional connectives *)\n" +
                "\n" +
                "Reserved Notation \"x -> y\" (at level 99, right associativity, y at level 200).\n" +
                "Reserved Notation \"x <-> y\" (at level 95, no associativity).\n" +
                "Reserved Notation \"x /\\ y\" (at level 80, right associativity).\n" +
                "Reserved Notation \"x \\/ y\" (at level 85, right associativity).\n" +
                "Reserved Notation \"~ x\" (at level 75, right associativity).\n" +
                "\n" +
                "(** Notations for equality and inequalities *)\n" +
                "\n" +
                "Reserved Notation \"x = y  :>  T\"\n" +
                "(at level 70, y at next level, no associativity).\n" +
                "Reserved Notation \"x = y\" (at level 70, no associativity).\n" +
                "Reserved Notation \"x = y = z\"\n" +
                "(at level 70, no associativity, y at next level).\n" +
                "\n" +
                "Reserved Notation \"x <> y  :>  T\"\n" +
                "(at level 70, y at next level, no associativity).\n" +
                "Reserved Notation \"x <> y\" (at level 70, no associativity).\n" +
                "\n" +
                "Reserved Notation \"x <= y\" (at level 70, no associativity).\n" +
                "Reserved Notation \"x < y\" (at level 70, no associativity).\n" +
                "Reserved Notation \"x >= y\" (at level 70, no associativity).\n" +
                "Reserved Notation \"x > y\" (at level 70, no associativity).\n" +
                "\n" +
                "Reserved Notation \"x <= y <= z\" (at level 70, y at next level).\n" +
                "Reserved Notation \"x <= y < z\" (at level 70, y at next level).\n" +
                "Reserved Notation \"x < y < z\" (at level 70, y at next level).\n" +
                "Reserved Notation \"x < y <= z\" (at level 70, y at next level).\n" +
                "\n" +
                "(** Arithmetical notations (also used for type constructors) *)\n" +
                "\n" +
                "Reserved Notation \"x + y\" (at level 50, left associativity).\n" +
                "Reserved Notation \"x - y\" (at level 50, left associativity).\n" +
                "Reserved Notation \"x * y\" (at level 40, left associativity).\n" +
                "Reserved Notation \"x / y\" (at level 40, left associativity).\n" +
                "Reserved Notation \"- x\" (at level 35, right associativity).\n" +
                "Reserved Notation \"/ x\" (at level 35, right associativity).\n" +
                "Reserved Notation \"x ^ y\" (at level 30, right associativity).\n" +
                "\n" +
                "(** Notations for booleans *)\n" +
                "\n" +
                "Reserved Notation \"x || y\" (at level 50, left associativity).\n" +
                "Reserved Notation \"x && y\" (at level 40, left associativity).\n" +
                "\n" +
                "(** Notations for pairs *)\n" +
                "\n" +
                "Reserved Notation \"( x , y , .. , z )\" (at level 0).\n" +
                "\n" +
                "(** Notation \"{ x }\" is reserved and has a special status as component\n" +
                "    of other notations such as \"{ A } + { B }\" and \"A + { B }\" (which\n" +
                "    are at the same level as \"x + y\");\n" +
                "    \"{ x }\" is at level 0 to factor with \"{ x : A | P }\" *)\n" +
                "\n" +
                "Reserved Notation \"{ x }\" (at level 0, x at level 99).\n" +
                "\n" +
                "(** Notations for sigma-types or subsets *)\n" +
                "\n" +
                "Reserved Notation \"{ A }  + { B }\" (at level 50, left associativity).\n" +
                "Reserved Notation \"A + { B }\" (at level 50, left associativity).\n" +
                "\n" +
                "Reserved Notation \"{ x  |  P }\" (at level 0, x at level 99).\n" +
                "Reserved Notation \"{ x  |  P  & Q }\" (at level 0, x at level 99).\n" +
                "\n" +
                "Reserved Notation \"{ x : A  |  P }\" (at level 0, x at level 99).\n" +
                "Reserved Notation \"{ x : A  |  P  & Q }\" (at level 0, x at level 99).\n" +
                "\n" +
                "Reserved Notation \"{ x  &  P }\" (at level 0, x at level 99).\n" +
                "Reserved Notation \"{ x : A  & P }\" (at level 0, x at level 99).\n" +
                "Reserved Notation \"{ x : A  & P  & Q }\" (at level 0, x at level 99).\n" +
                "\n" +
                "Reserved Notation \"{ ' pat | P }\"\n" +
                "  (at level 0, pat strict pattern, format \"{ ' pat  |  P  }\").\n" +
                "Reserved Notation \"{ ' pat | P & Q }\"\n" +
                "  (at level 0, pat strict pattern, format \"{ ' pat  |  P  & Q }\").\n" +
                "\n" +
                "Reserved Notation \"{ ' pat : A | P }\"\n" +
                "  (at level 0, pat strict pattern, format \"{ ' pat  :  A  |  P }\").\n" +
                "Reserved Notation \"{ ' pat : A | P & Q }\"\n" +
                "  (at level 0, pat strict pattern, format \"{ ' pat  :  A  |  P  & Q }\").\n" +
                "\n" +
                "Reserved Notation \"{ ' pat : A & P }\"\n" +
                "  (at level 0, pat strict pattern, format \"{ ' pat  :  A  & P }\").\n" +
                "Reserved Notation \"{ ' pat : A & P & Q }\"\n" +
                "  (at level 0, pat strict pattern, format \"{ ' pat  :  A  & P  & Q }\").\n" +
                "\n" +
                "(** Support for Gonthier-Ssreflect's \"if c is pat then u else v\" *)\n" +
                "\n" +
                "Module IfNotations.\n" +
                "\n" +
                "Notation \"'if' c 'is' p 'then' u 'else' v\" :=\n" +
                "  (match c with p => u | _ => v end)\n" +
                "  (at level 200, p pattern at level 100).\n" +
                "\n" +
                "End IfNotations.\n" +
                "\n" +
                "(** Scopes *)\n" +
                "\n" +
                "Delimit Scope type_scope with type.\n" +
                "Delimit Scope function_scope with function.\n" +
                "Delimit Scope core_scope with core.\n" +
                "\n" +
                "Bind Scope type_scope with Sortclass.\n" +
                "Bind Scope function_scope with Funclass.\n" +
                "\n" +
                "Open Scope core_scope.\n" +
                "Open Scope function_scope.\n" +
                "Open Scope type_scope.\n" +
                "\n" +
                "(** ML Tactic Notations *)\n" +
                "\n" +
                "Declare ML Module \"ltac_plugin\".\n" +
                "\n" +
                "Global Set Default Proof Mode \"Classic\".";

        public static final String peano = "(************************************************************************)\n" +
                "(*         *   The Coq Proof Assistant / The Coq Development Team       *)\n" +
                "(*  v      *   INRIA, CNRS and contributors - Copyright 1999-2018       *)\n" +
                "(* <O___,, *       (see CREDITS file for the list of authors)           *)\n" +
                "(*   \\VV/  **************************************************************)\n" +
                "(*    //   *    This file is distributed under the terms of the         *)\n" +
                "(*         *     GNU Lesser General Public License Version 2.1          *)\n" +
                "(*         *     (see LICENSE file for the text of the license)         *)\n" +
                "(************************************************************************)\n" +
                "\n" +
                "(** The type [nat] of Peano natural numbers (built from [O] and [S])\n" +
                "    is defined in [Datatypes.v] *)\n" +
                "\n" +
                "(** This module defines the following operations on natural numbers :\n" +
                "    - predecessor [pred]\n" +
                "    - addition [plus]\n" +
                "    - multiplication [mult]\n" +
                "    - less or equal order [le]\n" +
                "    - less [lt]\n" +
                "    - greater or equal [ge]\n" +
                "    - greater [gt]\n" +
                "   It states various lemmas and theorems about natural numbers,\n" +
                "   including Peano's axioms of arithmetic (in Coq, these are provable).\n" +
                "   Case analysis on [nat] and induction on [nat * nat] are provided too\n" +
                " *)\n" +
                "\n" +
                "Require Import Notations.\n" +
                "Require Import Datatypes.\n" +
                "Require Import Logic.\n" +
                "Require Coq.Init.Nat.\n" +
                "\n" +
                "Open Scope nat_scope.\n" +
                "\n" +
                "Definition eq_S := f_equal S.\n" +
                "Definition f_equal_nat := f_equal (A:=nat).\n" +
                "\n" +
                "Hint Resolve f_equal_nat: core.\n" +
                "\n" +
                "(** The predecessor function *)\n" +
                "\n" +
                "Notation pred := Nat.pred (only parsing).\n" +
                "\n" +
                "Definition f_equal_pred := f_equal pred.\n" +
                "\n" +
                "Theorem pred_Sn : forall n:nat, n = pred (S n).\n" +
                "Proof.\n" +
                "  simpl; reflexivity.\n" +
                "Qed.\n" +
                "\n" +
                "(** Injectivity of successor *)\n" +
                "\n" +
                "Definition eq_add_S n m (H: S n = S m): n = m := f_equal pred H.\n" +
                "Hint Immediate eq_add_S: core.\n" +
                "\n" +
                "Theorem not_eq_S : forall n m:nat, n <> m -> S n <> S m.\n" +
                "Proof.\n" +
                "  red; auto.\n" +
                "Qed.\n" +
                "Hint Resolve not_eq_S: core.\n" +
                "\n" +
                "Definition IsSucc (n:nat) : Prop :=\n" +
                "  match n with\n" +
                "  | O => False\n" +
                "  | S p => True\n" +
                "  end.\n" +
                "\n" +
                "(** Zero is not the successor of a number *)\n" +
                "\n" +
                "Theorem O_S : forall n:nat, 0 <> S n.\n" +
                "Proof.\n" +
                "  discriminate.\n" +
                "Qed.\n" +
                "Hint Resolve O_S: core.\n" +
                "\n" +
                "Theorem n_Sn : forall n:nat, n <> S n.\n" +
                "Proof.\n" +
                "  induction n; auto.\n" +
                "Qed.\n" +
                "Hint Resolve n_Sn: core.\n" +
                "\n" +
                "(** Addition *)\n" +
                "\n" +
                "Notation plus := Nat.add (only parsing).\n" +
                "Infix \"+\" := Nat.add : nat_scope.\n" +
                "\n" +
                "Definition f_equal2_plus := f_equal2 plus.\n" +
                "Definition f_equal2_nat := f_equal2 (A1:=nat) (A2:=nat). \n" +
                "Hint Resolve f_equal2_nat: core.\n" +
                "\n" +
                "Lemma plus_n_O : forall n:nat, n = n + 0.\n" +
                "Proof.\n" +
                "  induction n; simpl; auto.\n" +
                "Qed.\n" +
                "\n" +
                "Remove Hints eq_refl : core.\n" +
                "Hint Resolve plus_n_O eq_refl: core.  (* We want eq_refl to have higher priority than plus_n_O *)\n" +
                "\n" +
                "Lemma plus_O_n : forall n:nat, 0 + n = n.\n" +
                "Proof.\n" +
                "  reflexivity.\n" +
                "Qed.\n" +
                "\n" +
                "Lemma plus_n_Sm : forall n m:nat, S (n + m) = n + S m.\n" +
                "Proof.\n" +
                "  intros n m; induction n; simpl; auto.\n" +
                "Qed.\n" +
                "Hint Resolve plus_n_Sm: core.\n" +
                "\n" +
                "Lemma plus_Sn_m : forall n m:nat, S n + m = S (n + m).\n" +
                "Proof.\n" +
                "  reflexivity.\n" +
                "Qed.\n" +
                "\n" +
                "(** Standard associated names *)\n" +
                "\n" +
                "Notation plus_0_r_reverse := plus_n_O (only parsing).\n" +
                "Notation plus_succ_r_reverse := plus_n_Sm (only parsing).\n" +
                "\n" +
                "(** Multiplication *)\n" +
                "\n" +
                "Notation mult := Nat.mul (only parsing).\n" +
                "Infix \"*\" := Nat.mul : nat_scope.\n" +
                "\n" +
                "Definition f_equal2_mult := f_equal2 mult.\n" +
                "Hint Resolve f_equal2_mult: core.\n" +
                "\n" +
                "Lemma mult_n_O : forall n:nat, 0 = n * 0.\n" +
                "Proof.\n" +
                "  induction n; simpl; auto.\n" +
                "Qed.\n" +
                "Hint Resolve mult_n_O: core.\n" +
                "\n" +
                "Lemma mult_n_Sm : forall n m:nat, n * m + n = n * S m.\n" +
                "Proof.\n" +
                "  intros; induction n as [| p H]; simpl; auto.\n" +
                "  destruct H; rewrite <- plus_n_Sm; apply eq_S.\n" +
                "  pattern m at 1 3; elim m; simpl; auto.\n" +
                "Qed.\n" +
                "Hint Resolve mult_n_Sm: core.\n" +
                "\n" +
                "(** Standard associated names *)\n" +
                "\n" +
                "Notation mult_0_r_reverse := mult_n_O (only parsing).\n" +
                "Notation mult_succ_r_reverse := mult_n_Sm (only parsing).\n" +
                "\n" +
                "(** Truncated subtraction: [m-n] is [0] if [n>=m] *)\n" +
                "\n" +
                "Notation minus := Nat.sub (only parsing).\n" +
                "Infix \"-\" := Nat.sub : nat_scope.\n" +
                "\n" +
                "(** Definition of the usual orders, the basic properties of [le] and [lt]\n" +
                "    can be found in files Le and Lt *)\n" +
                "\n" +
                "Inductive le (n:nat) : nat -> Prop :=\n" +
                "  | le_n : n <= n\n" +
                "  | le_S : forall m:nat, n <= m -> n <= S m\n" +
                "\n" +
                "where \"n <= m\" := (le n m) : nat_scope.\n" +
                "\n" +
                "Hint Constructors le: core.\n" +
                "(*i equivalent to : \"Hints Resolve le_n le_S : core.\" i*)\n" +
                "\n" +
                "Definition lt (n m:nat) := S n <= m.\n" +
                "Hint Unfold lt: core.\n" +
                "\n" +
                "Infix \"<\" := lt : nat_scope.\n" +
                "\n" +
                "Definition ge (n m:nat) := m <= n.\n" +
                "Hint Unfold ge: core.\n" +
                "\n" +
                "Infix \">=\" := ge : nat_scope.\n" +
                "\n" +
                "Definition gt (n m:nat) := m < n.\n" +
                "Hint Unfold gt: core.\n" +
                "\n" +
                "Infix \">\" := gt : nat_scope.\n" +
                "\n" +
                "Notation \"x <= y <= z\" := (x <= y /\\ y <= z) : nat_scope.\n" +
                "Notation \"x <= y < z\" := (x <= y /\\ y < z) : nat_scope.\n" +
                "Notation \"x < y < z\" := (x < y /\\ y < z) : nat_scope.\n" +
                "Notation \"x < y <= z\" := (x < y /\\ y <= z) : nat_scope.\n" +
                "\n" +
                "Theorem le_pred : forall n m, n <= m -> pred n <= pred m.\n" +
                "Proof.\n" +
                "induction 1; auto. destruct m; simpl; auto.\n" +
                "Qed.\n" +
                "\n" +
                "Theorem le_S_n : forall n m, S n <= S m -> n <= m.\n" +
                "Proof.\n" +
                "intros n m. exact (le_pred (S n) (S m)).\n" +
                "Qed.\n" +
                "\n" +
                "Theorem le_0_n : forall n, 0 <= n.\n" +
                "Proof.\n" +
                " induction n; constructor; trivial.\n" +
                "Qed.\n" +
                "\n" +
                "Theorem le_n_S : forall n m, n <= m -> S n <= S m.\n" +
                "Proof.\n" +
                " induction 1; constructor; trivial.\n" +
                "Qed.\n" +
                "\n" +
                "(** Case analysis *)\n" +
                "\n" +
                "Theorem nat_case :\n" +
                " forall (n:nat) (P:nat -> Prop), P 0 -> (forall m:nat, P (S m)) -> P n.\n" +
                "Proof.\n" +
                "  induction n; auto.\n" +
                "Qed.\n" +
                "\n" +
                "(** Principle of double induction *)\n" +
                "\n" +
                "Theorem nat_double_ind :\n" +
                " forall R:nat -> nat -> Prop,\n" +
                "   (forall n:nat, R 0 n) ->\n" +
                "   (forall n:nat, R (S n) 0) ->\n" +
                "   (forall n m:nat, R n m -> R (S n) (S m)) -> forall n m:nat, R n m.\n" +
                "Proof.\n" +
                "  induction n; auto.\n" +
                "  destruct m; auto.\n" +
                "Qed.\n" +
                "\n" +
                "(** Maximum and minimum : definitions and specifications *)\n" +
                "\n" +
                "Notation max := Nat.max (only parsing).\n" +
                "Notation min := Nat.min (only parsing).\n" +
                "\n" +
                "Lemma max_l n m : m <= n -> Nat.max n m = n.\n" +
                "Proof.\n" +
                " revert m; induction n; destruct m; simpl; trivial.\n" +
                " - inversion 1.\n" +
                " - intros. apply f_equal, IHn, le_S_n; trivial.\n" +
                "Qed.\n" +
                "\n" +
                "Lemma max_r n m : n <= m -> Nat.max n m = m.\n" +
                "Proof.\n" +
                " revert m; induction n; destruct m; simpl; trivial.\n" +
                " - inversion 1.\n" +
                " - intros. apply f_equal, IHn, le_S_n; trivial.\n" +
                "Qed.\n" +
                "\n" +
                "Lemma min_l n m : n <= m -> Nat.min n m = n.\n" +
                "Proof.\n" +
                " revert m; induction n; destruct m; simpl; trivial.\n" +
                " - inversion 1.\n" +
                " - intros. apply f_equal, IHn, le_S_n; trivial.\n" +
                "Qed.\n" +
                "\n" +
                "Lemma min_r n m : m <= n -> Nat.min n m = m.\n" +
                "Proof.\n" +
                " revert m; induction n; destruct m; simpl; trivial.\n" +
                " - inversion 1.\n" +
                " - intros. apply f_equal, IHn, le_S_n; trivial.\n" +
                "Qed.\n" +
                "\n" +
                "\n" +
                "Lemma nat_rect_succ_r {A} (f: A -> A) (x:A) n :\n" +
                "  nat_rect (fun _ => A) x (fun _ => f) (S n) = nat_rect (fun _ => A) (f x) (fun _ => f) n.\n" +
                "Proof.\n" +
                "  induction n; intros; simpl; rewrite <- ?IHn; trivial.\n" +
                "Qed.\n" +
                "\n" +
                "Theorem nat_rect_plus :\n" +
                "  forall (n m:nat) {A} (f:A -> A) (x:A),\n" +
                "    nat_rect (fun _ => A) x (fun _ => f) (n + m) =\n" +
                "      nat_rect (fun _ => A) (nat_rect (fun _ => A) x (fun _ => f) m) (fun _ => f) n.\n" +
                "Proof.\n" +
                "  induction n; intros; simpl; rewrite ?IHn; trivial.\n" +
                "Qed.";

        public final static String prelude = "(************************************************************************)\n" +
                "(*         *   The Coq Proof Assistant / The Coq Development Team       *)\n" +
                "(*  v      *   INRIA, CNRS and contributors - Copyright 1999-2018       *)\n" +
                "(* <O___,, *       (see CREDITS file for the list of authors)           *)\n" +
                "(*   \\VV/  **************************************************************)\n" +
                "(*    //   *    This file is distributed under the terms of the         *)\n" +
                "(*         *     GNU Lesser General Public License Version 2.1          *)\n" +
                "(*         *     (see LICENSE file for the text of the license)         *)\n" +
                "(************************************************************************)\n" +
                "\n" +
                "Require Export Notations.\n" +
                "Require Export Logic.\n" +
                "Require Export Logic_Type.\n" +
                "Require Export Datatypes.\n" +
                "Require Export Specif.\n" +
                "Require Coq.Init.Decimal.\n" +
                "Require Coq.Init.Nat.\n" +
                "Require Export Peano.\n" +
                "Require Export Coq.Init.Wf.\n" +
                "Require Export Coq.Init.Tactics.\n" +
                "Require Export Coq.Init.Tauto.\n" +
                "(* Initially available plugins\n" +
                "   (+ nat_syntax_plugin loaded in Datatypes) *)\n" +
                "Declare ML Module \"cc_plugin\".\n" +
                "Declare ML Module \"ground_plugin\".\n" +
                "(* Default substrings not considered by queries like SearchAbout *)\n" +
                "Add Search Blacklist \"_subproof\" \"_subterm\" \"Private_\".";

        public static final String specif = "************************************************************************)\n" +
                "(*         *   The Coq Proof Assistant / The Coq Development Team       *)\n" +
                "(*  v      *   INRIA, CNRS and contributors - Copyright 1999-2018       *)\n" +
                "(* <O___,, *       (see CREDITS file for the list of authors)           *)\n" +
                "(*   \\VV/  **************************************************************)\n" +
                "(*    //   *    This file is distributed under the terms of the         *)\n" +
                "(*         *     GNU Lesser General Public License Version 2.1          *)\n" +
                "(*         *     (see LICENSE file for the text of the license)         *)\n" +
                "(************************************************************************)\n" +
                "\n" +
                "(** Basic specifications : sets that may contain logical information *)\n" +
                "\n" +
                "Set Implicit Arguments.\n" +
                "Set Reversible Pattern Implicit.\n" +
                "\n" +
                "Require Import Notations.\n" +
                "Require Import Datatypes.\n" +
                "Require Import Logic.\n" +
                "\n" +
                "(** Subsets and Sigma-types *)\n" +
                "\n" +
                "(** [(sig A P)], or more suggestively [{x:A | P x}], denotes the subset\n" +
                "    of elements of the type [A] which satisfy the predicate [P].\n" +
                "    Similarly [(sig2 A P Q)], or [{x:A | P x & Q x}], denotes the subset\n" +
                "    of elements of the type [A] which satisfy both [P] and [Q]. *)\n" +
                "\n" +
                "Inductive sig (A:Type) (P:A -> Prop) : Type :=\n" +
                "    exist : forall x:A, P x -> sig P.\n" +
                "\n" +
                "Inductive sig2 (A:Type) (P Q:A -> Prop) : Type :=\n" +
                "    exist2 : forall x:A, P x -> Q x -> sig2 P Q.\n" +
                "\n" +
                "(** [(sigT A P)], or more suggestively [{x:A & (P x)}] is a Sigma-type.\n" +
                "    Similarly for [(sigT2 A P Q)], also written [{x:A & (P x) & (Q x)}]. *)\n" +
                "\n" +
                "Inductive sigT (A:Type) (P:A -> Type) : Type :=\n" +
                "    existT : forall x:A, P x -> sigT P.\n" +
                "\n" +
                "Inductive sigT2 (A:Type) (P Q:A -> Type) : Type :=\n" +
                "    existT2 : forall x:A, P x -> Q x -> sigT2 P Q.\n" +
                "\n" +
                "(* Notations *)\n" +
                "\n" +
                "Arguments sig (A P)%type.\n" +
                "Arguments sig2 (A P Q)%type.\n" +
                "Arguments sigT (A P)%type.\n" +
                "Arguments sigT2 (A P Q)%type.\n" +
                "\n" +
                "Notation \"{ x  |  P }\" := (sig (fun x => P)) : type_scope.\n" +
                "Notation \"{ x  |  P  & Q }\" := (sig2 (fun x => P) (fun x => Q)) : type_scope.\n" +
                "Notation \"{ x : A  |  P }\" := (sig (A:=A) (fun x => P)) : type_scope.\n" +
                "Notation \"{ x : A  |  P  & Q }\" := (sig2 (A:=A) (fun x => P) (fun x => Q)) :\n" +
                "  type_scope.\n" +
                "Notation \"{ x  &  P }\" := (sigT (fun x => P)) : type_scope.\n" +
                "Notation \"{ x : A  & P }\" := (sigT (A:=A) (fun x => P)) : type_scope.\n" +
                "Notation \"{ x : A  & P  & Q }\" := (sigT2 (A:=A) (fun x => P) (fun x => Q)) :\n" +
                "  type_scope.\n" +
                "\n" +
                "Notation \"{ ' pat  |  P }\" := (sig (fun pat => P)) : type_scope.\n" +
                "Notation \"{ ' pat  |  P  & Q }\" := (sig2 (fun pat => P) (fun pat => Q)) : type_scope.\n" +
                "Notation \"{ ' pat : A  |  P }\" := (sig (A:=A) (fun pat => P)) : type_scope.\n" +
                "Notation \"{ ' pat : A  |  P  & Q }\" := (sig2 (A:=A) (fun pat => P) (fun pat => Q)) :\n" +
                "  type_scope.\n" +
                "Notation \"{ ' pat : A  & P }\" := (sigT (A:=A) (fun pat => P)) : type_scope.\n" +
                "Notation \"{ ' pat : A  & P  & Q }\" := (sigT2 (A:=A) (fun pat => P) (fun pat => Q)) :\n" +
                "  type_scope.\n" +
                "\n" +
                "Add Printing Let sig.\n" +
                "Add Printing Let sig2.\n" +
                "Add Printing Let sigT.\n" +
                "Add Printing Let sigT2.\n" +
                "\n" +
                "\n" +
                "(** Projections of [sig]\n" +
                "    An element [y] of a subset [{x:A | (P x)}] is the pair of an [a]\n" +
                "    of type [A] and of a proof [h] that [a] satisfies [P].  Then\n" +
                "    [(proj1_sig y)] is the witness [a] and [(proj2_sig y)] is the\n" +
                "    proof of [(P a)] *)\n" +
                "\n" +
                "(* Set Universe Polymorphism. *)\n" +
                "Section Subset_projections.\n" +
                "\n" +
                "  Variable A : Type.\n" +
                "  Variable P : A -> Prop.\n" +
                "\n" +
                "  Definition proj1_sig (e:sig P) := match e with\n" +
                "                                    | exist _ a b => a\n" +
                "                                    end.\n" +
                "\n" +
                "  Definition proj2_sig (e:sig P) :=\n" +
                "    match e return P (proj1_sig e) with\n" +
                "    | exist _ a b => b\n" +
                "    end.\n" +
                "\n" +
                "End Subset_projections.\n" +
                "\n" +
                "\n" +
                "(** [sig2] of a predicate can be projected to a [sig].\n" +
                "    This allows [proj1_sig] and [proj2_sig] to be usable with [sig2].\n" +
                "    The [let] statements occur in the body of the [exist] so that\n" +
                "    [proj1_sig] of a coerced [X : sig2 P Q] will unify with [let (a,\n" +
                "    _, _) := X in a] *)\n" +
                "\n" +
                "Definition sig_of_sig2 (A : Type) (P Q : A -> Prop) (X : sig2 P Q) : sig P\n" +
                "  := exist P\n" +
                "           (let (a, _, _) := X in a)\n" +
                "           (let (x, p, _) as s return (P (let (a, _, _) := s in a)) := X in p).\n" +
                "\n" +
                "(** Projections of [sig2]\n" +
                "    An element [y] of a subset [{x:A | (P x) & (Q x)}] is the triple\n" +
                "    of an [a] of type [A], a of a proof [h] that [a] satisfies [P],\n" +
                "    and a proof [h'] that [a] satisfies [Q].  Then\n" +
                "    [(proj1_sig (sig_of_sig2 y))] is the witness [a],\n" +
                "    [(proj2_sig (sig_of_sig2 y))] is the proof of [(P a)], and\n" +
                "    [(proj3_sig y)] is the proof of [(Q a)]. *)\n" +
                "\n" +
                "Section Subset_projections2.\n" +
                "\n" +
                "  Variable A : Type.\n" +
                "  Variables P Q : A -> Prop.\n" +
                "\n" +
                "  Definition proj3_sig (e : sig2 P Q) :=\n" +
                "    let (a, b, c) return Q (proj1_sig (sig_of_sig2 e)) := e in c.\n" +
                "\n" +
                "End Subset_projections2.\n" +
                "\n" +
                "\n" +
                "(** Projections of [sigT]\n" +
                "    An element [x] of a sigma-type [{y:A & P y}] is a dependent pair\n" +
                "    made of an [a] of type [A] and an [h] of type [P a].  Then,\n" +
                "    [(projT1 x)] is the first projection and [(projT2 x)] is the\n" +
                "    second projection, the type of which depends on the [projT1]. *)\n" +
                "\n" +
                "\n" +
                "\n" +
                "Section Projections.\n" +
                "\n" +
                "  Variable A : Type.\n" +
                "  Variable P : A -> Type.\n" +
                "\n" +
                "  Definition projT1 (x:sigT P) : A := match x with\n" +
                "                                      | existT _ a _ => a\n" +
                "                                      end.\n" +
                "\n" +
                "  Definition projT2 (x:sigT P) : P (projT1 x) :=\n" +
                "    match x return P (projT1 x) with\n" +
                "    | existT _ _ h => h\n" +
                "    end.\n" +
                "\n" +
                "End Projections.\n" +
                "\n" +
                "(** [sigT2] of a predicate can be projected to a [sigT].\n" +
                "    This allows [projT1] and [projT2] to be usable with [sigT2].\n" +
                "    The [let] statements occur in the body of the [existT] so that\n" +
                "    [projT1] of a coerced [X : sigT2 P Q] will unify with [let (a,\n" +
                "    _, _) := X in a] *)\n" +
                "\n" +
                "Definition sigT_of_sigT2 (A : Type) (P Q : A -> Type) (X : sigT2 P Q) : sigT P\n" +
                "  := existT P\n" +
                "            (let (a, _, _) := X in a)\n" +
                "            (let (x, p, _) as s return (P (let (a, _, _) := s in a)) := X in p).\n" +
                "\n" +
                "(** Projections of [sigT2]\n" +
                "    An element [x] of a sigma-type [{y:A & P y & Q y}] is a dependent\n" +
                "    pair made of an [a] of type [A], an [h] of type [P a], and an [h']\n" +
                "    of type [Q a].  Then, [(projT1 (sigT_of_sigT2 x))] is the first\n" +
                "    projection, [(projT2 (sigT_of_sigT2 x))] is the second projection,\n" +
                "    and [(projT3 x)] is the third projection, the types of which\n" +
                "    depends on the [projT1]. *)\n" +
                "\n" +
                "Section Projections2.\n" +
                "\n" +
                "  Variable A : Type.\n" +
                "  Variables P Q : A -> Type.\n" +
                "\n" +
                "  Definition projT3 (e : sigT2 P Q) :=\n" +
                "    let (a, b, c) return Q (projT1 (sigT_of_sigT2 e)) := e in c.\n" +
                "\n" +
                "End Projections2.\n" +
                "\n" +
                "(** [sigT] of a predicate is equivalent to [sig] *)\n" +
                "\n" +
                "Definition sig_of_sigT (A : Type) (P : A -> Prop) (X : sigT P) : sig P\n" +
                "  := exist P (projT1 X) (projT2 X).\n" +
                "\n" +
                "Definition sigT_of_sig (A : Type) (P : A -> Prop) (X : sig P) : sigT P\n" +
                "  := existT P (proj1_sig X) (proj2_sig X).\n" +
                "\n" +
                "(** [sigT2] of a predicate is equivalent to [sig2] *)\n" +
                "\n" +
                "Definition sig2_of_sigT2 (A : Type) (P Q : A -> Prop) (X : sigT2 P Q) : sig2 P Q\n" +
                "  := exist2 P Q (projT1 (sigT_of_sigT2 X)) (projT2 (sigT_of_sigT2 X)) (projT3 X).\n" +
                "\n" +
                "Definition sigT2_of_sig2 (A : Type) (P Q : A -> Prop) (X : sig2 P Q) : sigT2 P Q\n" +
                "  := existT2 P Q (proj1_sig (sig_of_sig2 X)) (proj2_sig (sig_of_sig2 X)) (proj3_sig X).\n" +
                "\n" +
                "(** η Principles *)\n" +
                "Definition sigT_eta {A P} (p : { a : A & P a })\n" +
                "  : p = existT _ (projT1 p) (projT2 p).\n" +
                "Proof. destruct p; reflexivity. Defined.\n" +
                "\n" +
                "Definition sig_eta {A P} (p : { a : A | P a })\n" +
                "  : p = exist _ (proj1_sig p) (proj2_sig p).\n" +
                "Proof. destruct p; reflexivity. Defined.\n" +
                "\n" +
                "Definition sigT2_eta {A P Q} (p : { a : A & P a & Q a })\n" +
                "  : p = existT2 _ _ (projT1 (sigT_of_sigT2 p)) (projT2 (sigT_of_sigT2 p)) (projT3 p).\n" +
                "Proof. destruct p; reflexivity. Defined.\n" +
                "\n" +
                "Definition sig2_eta {A P Q} (p : { a : A | P a & Q a })\n" +
                "  : p = exist2 _ _ (proj1_sig (sig_of_sig2 p)) (proj2_sig (sig_of_sig2 p)) (proj3_sig p).\n" +
                "Proof. destruct p; reflexivity. Defined.\n" +
                "\n" +
                "(** [exists x : A, B] is equivalent to [inhabited {x : A | B}] *)\n" +
                "Lemma exists_to_inhabited_sig {A P} : (exists x : A, P x) -> inhabited {x : A | P x}.\n" +
                "Proof.\n" +
                "  intros [x y]. exact (inhabits (exist _ x y)).\n" +
                "Qed.\n" +
                "\n" +
                "Lemma inhabited_sig_to_exists {A P} : inhabited {x : A | P x} -> exists x : A, P x.\n" +
                "Proof.\n" +
                "  intros [[x y]];exists x;exact y.\n" +
                "Qed.\n" +
                "\n" +
                "(** Equality of sigma types *)\n" +
                "Import EqNotations.\n" +
                "Local Notation \"'rew' 'dependent' H 'in' H'\"\n" +
                "  := (match H with\n" +
                "      | eq_refl => H'\n" +
                "      end)\n" +
                "       (at level 10, H' at level 10,\n" +
                "        format \"'[' 'rew'  'dependent'  '/    ' H  in  '/' H' ']'\").\n" +
                "\n" +
                "(** Equality for [sigT] *)\n" +
                "Section sigT.\n" +
                "  Local Unset Implicit Arguments.\n" +
                "  (** Projecting an equality of a pair to equality of the first components *)\n" +
                "  Definition projT1_eq {A} {P : A -> Type} {u v : { a : A & P a }} (p : u = v)\n" +
                "    : projT1 u = projT1 v\n" +
                "    := f_equal (@projT1 _ _) p.\n" +
                "\n" +
                "  (** Projecting an equality of a pair to equality of the second components *)\n" +
                "  Definition projT2_eq {A} {P : A -> Type} {u v : { a : A & P a }} (p : u = v)\n" +
                "    : rew projT1_eq p in projT2 u = projT2 v\n" +
                "    := rew dependent p in eq_refl.\n" +
                "\n" +
                "  (** Equality of [sigT] is itself a [sigT] (forwards-reasoning version) *)\n" +
                "  Definition eq_existT_uncurried {A : Type} {P : A -> Type} {u1 v1 : A} {u2 : P u1} {v2 : P v1}\n" +
                "             (pq : { p : u1 = v1 & rew p in u2 = v2 })\n" +
                "    : existT _ u1 u2 = existT _ v1 v2.\n" +
                "  Proof.\n" +
                "    destruct pq as [p q].\n" +
                "    destruct q; simpl in *.\n" +
                "    destruct p; reflexivity.\n" +
                "  Defined.\n" +
                "\n" +
                "  (** Equality of [sigT] is itself a [sigT] (backwards-reasoning version) *)\n" +
                "  Definition eq_sigT_uncurried {A : Type} {P : A -> Type} (u v : { a : A & P a })\n" +
                "             (pq : { p : projT1 u = projT1 v & rew p in projT2 u = projT2 v })\n" +
                "    : u = v.\n" +
                "  Proof.\n" +
                "    destruct u as [u1 u2], v as [v1 v2]; simpl in *.\n" +
                "    apply eq_existT_uncurried; exact pq.\n" +
                "  Defined.\n" +
                "\n" +
                "  (** Curried version of proving equality of sigma types *)\n" +
                "  Definition eq_sigT {A : Type} {P : A -> Type} (u v : { a : A & P a })\n" +
                "             (p : projT1 u = projT1 v) (q : rew p in projT2 u = projT2 v)\n" +
                "    : u = v\n" +
                "    := eq_sigT_uncurried u v (existT _ p q).\n" +
                "\n" +
                "  (** Equality of [sigT] when the property is an hProp *)\n" +
                "  Definition eq_sigT_hprop {A P} (P_hprop : forall (x : A) (p q : P x), p = q)\n" +
                "             (u v : { a : A & P a })\n" +
                "             (p : projT1 u = projT1 v)\n" +
                "    : u = v\n" +
                "    := eq_sigT u v p (P_hprop _ _ _).\n" +
                "\n" +
                "  (** Equivalence of equality of [sigT] with a [sigT] of equality *)\n" +
                "  (** We could actually prove an isomorphism here, and not just [<->],\n" +
                "      but for simplicity, we don't. *)\n" +
                "  Definition eq_sigT_uncurried_iff {A P}\n" +
                "             (u v : { a : A & P a })\n" +
                "    : u = v <-> { p : projT1 u = projT1 v & rew p in projT2 u = projT2 v }.\n" +
                "  Proof.\n" +
                "    split; [ intro; subst; exists eq_refl; reflexivity | apply eq_sigT_uncurried ].\n" +
                "  Defined.\n" +
                "\n" +
                "  (** Induction principle for [@eq (sigT _)] *)\n" +
                "  Definition eq_sigT_rect {A P} {u v : { a : A & P a }} (Q : u = v -> Type)\n" +
                "             (f : forall p q, Q (eq_sigT u v p q))\n" +
                "    : forall p, Q p.\n" +
                "  Proof. intro p; specialize (f (projT1_eq p) (projT2_eq p)); destruct u, p; exact f. Defined.\n" +
                "  Definition eq_sigT_rec {A P u v} (Q : u = v :> { a : A & P a } -> Set) := eq_sigT_rect Q.\n" +
                "  Definition eq_sigT_ind {A P u v} (Q : u = v :> { a : A & P a } -> Prop) := eq_sigT_rec Q.\n" +
                "\n" +
                "  (** Equivalence of equality of [sigT] involving hProps with equality of the first components *)\n" +
                "  Definition eq_sigT_hprop_iff {A P} (P_hprop : forall (x : A) (p q : P x), p = q)\n" +
                "             (u v : { a : A & P a })\n" +
                "    : u = v <-> (projT1 u = projT1 v)\n" +
                "    := conj (fun p => f_equal (@projT1 _ _) p) (eq_sigT_hprop P_hprop u v).\n" +
                "\n" +
                "  (** Non-dependent classification of equality of [sigT] *)\n" +
                "  Definition eq_sigT_nondep {A B : Type} (u v : { a : A & B })\n" +
                "             (p : projT1 u = projT1 v) (q : projT2 u = projT2 v)\n" +
                "    : u = v\n" +
                "    := @eq_sigT _ _ u v p (eq_trans (rew_const _ _) q).\n" +
                "\n" +
                "  (** Classification of transporting across an equality of [sigT]s *)\n" +
                "  Lemma rew_sigT {A x} {P : A -> Type} (Q : forall a, P a -> Prop) (u : { p : P x & Q x p }) {y} (H : x = y)\n" +
                "    : rew [fun a => { p : P a & Q a p }] H in u\n" +
                "      = existT\n" +
                "          (Q y)\n" +
                "          (rew H in projT1 u)\n" +
                "          (rew dependent H in (projT2 u)).\n" +
                "  Proof.\n" +
                "    destruct H, u; reflexivity.\n" +
                "  Defined.\n" +
                "End sigT.\n" +
                "\n" +
                "(** Equality for [sig] *)\n" +
                "Section sig.\n" +
                "  Local Unset Implicit Arguments.\n" +
                "  (** Projecting an equality of a pair to equality of the first components *)\n" +
                "  Definition proj1_sig_eq {A} {P : A -> Prop} {u v : { a : A | P a }} (p : u = v)\n" +
                "    : proj1_sig u = proj1_sig v\n" +
                "    := f_equal (@proj1_sig _ _) p.\n" +
                "\n" +
                "  (** Projecting an equality of a pair to equality of the second components *)\n" +
                "  Definition proj2_sig_eq {A} {P : A -> Prop} {u v : { a : A | P a }} (p : u = v)\n" +
                "    : rew proj1_sig_eq p in proj2_sig u = proj2_sig v\n" +
                "    := rew dependent p in eq_refl.\n" +
                "\n" +
                "  (** Equality of [sig] is itself a [sig] (forwards-reasoning version) *)\n" +
                "  Definition eq_exist_uncurried {A : Type} {P : A -> Prop} {u1 v1 : A} {u2 : P u1} {v2 : P v1}\n" +
                "             (pq : { p : u1 = v1 | rew p in u2 = v2 })\n" +
                "    : exist _ u1 u2 = exist _ v1 v2.\n" +
                "  Proof.\n" +
                "    destruct pq as [p q].\n" +
                "    destruct q; simpl in *.\n" +
                "    destruct p; reflexivity.\n" +
                "  Defined.\n" +
                "\n" +
                "  (** Equality of [sig] is itself a [sig] (backwards-reasoning version) *)\n" +
                "  Definition eq_sig_uncurried {A : Type} {P : A -> Prop} (u v : { a : A | P a })\n" +
                "             (pq : { p : proj1_sig u = proj1_sig v | rew p in proj2_sig u = proj2_sig v })\n" +
                "    : u = v.\n" +
                "  Proof.\n" +
                "    destruct u as [u1 u2], v as [v1 v2]; simpl in *.\n" +
                "    apply eq_exist_uncurried; exact pq.\n" +
                "  Defined.\n" +
                "\n" +
                "  (** Curried version of proving equality of sigma types *)\n" +
                "  Definition eq_sig {A : Type} {P : A -> Prop} (u v : { a : A | P a })\n" +
                "             (p : proj1_sig u = proj1_sig v) (q : rew p in proj2_sig u = proj2_sig v)\n" +
                "    : u = v\n" +
                "    := eq_sig_uncurried u v (exist _ p q).\n" +
                "\n" +
                "  (** Induction principle for [@eq (sig _)] *)\n" +
                "  Definition eq_sig_rect {A P} {u v : { a : A | P a }} (Q : u = v -> Type)\n" +
                "             (f : forall p q, Q (eq_sig u v p q))\n" +
                "    : forall p, Q p.\n" +
                "  Proof. intro p; specialize (f (proj1_sig_eq p) (proj2_sig_eq p)); destruct u, p; exact f. Defined.\n" +
                "  Definition eq_sig_rec {A P u v} (Q : u = v :> { a : A | P a } -> Set) := eq_sig_rect Q.\n" +
                "  Definition eq_sig_ind {A P u v} (Q : u = v :> { a : A | P a } -> Prop) := eq_sig_rec Q.\n" +
                "\n" +
                "  (** Equality of [sig] when the property is an hProp *)\n" +
                "  Definition eq_sig_hprop {A} {P : A -> Prop} (P_hprop : forall (x : A) (p q : P x), p = q)\n" +
                "             (u v : { a : A | P a })\n" +
                "             (p : proj1_sig u = proj1_sig v)\n" +
                "    : u = v\n" +
                "    := eq_sig u v p (P_hprop _ _ _).\n" +
                "\n" +
                "  (** Equivalence of equality of [sig] with a [sig] of equality *)\n" +
                "  (** We could actually prove an isomorphism here, and not just [<->],\n" +
                "      but for simplicity, we don't. *)\n" +
                "  Definition eq_sig_uncurried_iff {A} {P : A -> Prop}\n" +
                "             (u v : { a : A | P a })\n" +
                "    : u = v <-> { p : proj1_sig u = proj1_sig v | rew p in proj2_sig u = proj2_sig v }.\n" +
                "  Proof.\n" +
                "    split; [ intro; subst; exists eq_refl; reflexivity | apply eq_sig_uncurried ].\n" +
                "  Defined.\n" +
                "\n" +
                "  (** Equivalence of equality of [sig] involving hProps with equality of the first components *)\n" +
                "  Definition eq_sig_hprop_iff {A} {P : A -> Prop} (P_hprop : forall (x : A) (p q : P x), p = q)\n" +
                "             (u v : { a : A | P a })\n" +
                "    : u = v <-> (proj1_sig u = proj1_sig v)\n" +
                "    := conj (fun p => f_equal (@proj1_sig _ _) p) (eq_sig_hprop P_hprop u v).\n" +
                "\n" +
                "  Lemma rew_sig {A x} {P : A -> Type} (Q : forall a, P a -> Prop) (u : { p : P x | Q x p }) {y} (H : x = y)\n" +
                "    : rew [fun a => { p : P a | Q a p }] H in u\n" +
                "      = exist\n" +
                "          (Q y)\n" +
                "          (rew H in proj1_sig u)\n" +
                "          (rew dependent H in proj2_sig u).\n" +
                "  Proof.\n" +
                "    destruct H, u; reflexivity.\n" +
                "  Defined.\n" +
                "End sig.\n" +
                "\n" +
                "(** Equality for [sigT] *)\n" +
                "Section sigT2.\n" +
                "  (* We make [sigT_of_sigT2] a coercion so we can use [projT1], [projT2] on [sigT2] *)\n" +
                "  Local Coercion sigT_of_sigT2 : sigT2 >-> sigT.\n" +
                "  Local Unset Implicit Arguments.\n" +
                "  (** Projecting an equality of a pair to equality of the first components *)\n" +
                "  Definition sigT_of_sigT2_eq {A} {P Q : A -> Type} {u v : { a : A & P a & Q a }} (p : u = v)\n" +
                "    : u = v :> { a : A & P a }\n" +
                "    := f_equal _ p.\n" +
                "  Definition projT1_of_sigT2_eq {A} {P Q : A -> Type} {u v : { a : A & P a & Q a }} (p : u = v)\n" +
                "    : projT1 u = projT1 v\n" +
                "    := projT1_eq (sigT_of_sigT2_eq p).\n" +
                "\n" +
                "  (** Projecting an equality of a pair to equality of the second components *)\n" +
                "  Definition projT2_of_sigT2_eq {A} {P Q : A -> Type} {u v : { a : A & P a & Q a }} (p : u = v)\n" +
                "    : rew projT1_of_sigT2_eq p in projT2 u = projT2 v\n" +
                "    := rew dependent p in eq_refl.\n" +
                "\n" +
                "  (** Projecting an equality of a pair to equality of the third components *)\n" +
                "  Definition projT3_eq {A} {P Q : A -> Type} {u v : { a : A & P a & Q a }} (p : u = v)\n" +
                "    : rew projT1_of_sigT2_eq p in projT3 u = projT3 v\n" +
                "    := rew dependent p in eq_refl.\n" +
                "\n" +
                "  (** Equality of [sigT2] is itself a [sigT2] (forwards-reasoning version) *)\n" +
                "  Definition eq_existT2_uncurried {A : Type} {P Q : A -> Type}\n" +
                "             {u1 v1 : A} {u2 : P u1} {v2 : P v1} {u3 : Q u1} {v3 : Q v1}\n" +
                "             (pqr : { p : u1 = v1\n" +
                "                    & rew p in u2 = v2 & rew p in u3 = v3 })\n" +
                "    : existT2 _ _ u1 u2 u3 = existT2 _ _ v1 v2 v3.\n" +
                "  Proof.\n" +
                "    destruct pqr as [p q r].\n" +
                "    destruct r, q, p; simpl.\n" +
                "    reflexivity.\n" +
                "  Defined.\n" +
                "\n" +
                "  (** Equality of [sigT2] is itself a [sigT2] (backwards-reasoning version) *)\n" +
                "  Definition eq_sigT2_uncurried {A : Type} {P Q : A -> Type} (u v : { a : A & P a & Q a })\n" +
                "             (pqr : { p : projT1 u = projT1 v\n" +
                "                    & rew p in projT2 u = projT2 v & rew p in projT3 u = projT3 v })\n" +
                "    : u = v.\n" +
                "  Proof.\n" +
                "    destruct u as [u1 u2 u3], v as [v1 v2 v3]; simpl in *.\n" +
                "    apply eq_existT2_uncurried; exact pqr.\n" +
                "  Defined.\n" +
                "\n" +
                "  (** Curried version of proving equality of sigma types *)\n" +
                "  Definition eq_sigT2 {A : Type} {P Q : A -> Type} (u v : { a : A & P a & Q a })\n" +
                "             (p : projT1 u = projT1 v)\n" +
                "             (q : rew p in projT2 u = projT2 v)\n" +
                "             (r : rew p in projT3 u = projT3 v)\n" +
                "    : u = v\n" +
                "    := eq_sigT2_uncurried u v (existT2 _ _ p q r).\n" +
                "\n" +
                "  (** Equality of [sigT2] when the second property is an hProp *)\n" +
                "  Definition eq_sigT2_hprop {A P Q} (Q_hprop : forall (x : A) (p q : Q x), p = q)\n" +
                "             (u v : { a : A & P a & Q a })\n" +
                "             (p : u = v :> { a : A & P a })\n" +
                "    : u = v\n" +
                "    := eq_sigT2 u v (projT1_eq p) (projT2_eq p) (Q_hprop _ _ _).\n" +
                "\n" +
                "  (** Equivalence of equality of [sigT2] with a [sigT2] of equality *)\n" +
                "  (** We could actually prove an isomorphism here, and not just [<->],\n" +
                "      but for simplicity, we don't. *)\n" +
                "  Definition eq_sigT2_uncurried_iff {A P Q}\n" +
                "             (u v : { a : A & P a & Q a })\n" +
                "    : u = v\n" +
                "      <-> { p : projT1 u = projT1 v\n" +
                "          & rew p in projT2 u = projT2 v & rew p in projT3 u = projT3 v }.\n" +
                "  Proof.\n" +
                "    split; [ intro; subst; exists eq_refl; reflexivity | apply eq_sigT2_uncurried ].\n" +
                "  Defined.\n" +
                "\n" +
                "  (** Induction principle for [@eq (sigT2 _ _)] *)\n" +
                "  Definition eq_sigT2_rect {A P Q} {u v : { a : A & P a & Q a }} (R : u = v -> Type)\n" +
                "             (f : forall p q r, R (eq_sigT2 u v p q r))\n" +
                "    : forall p, R p.\n" +
                "  Proof.\n" +
                "    intro p.\n" +
                "    specialize (f (projT1_of_sigT2_eq p) (projT2_of_sigT2_eq p) (projT3_eq p)).\n" +
                "    destruct u, p; exact f.\n" +
                "  Defined.\n" +
                "  Definition eq_sigT2_rec {A P Q u v} (R : u = v :> { a : A & P a & Q a } -> Set) := eq_sigT2_rect R.\n" +
                "  Definition eq_sigT2_ind {A P Q u v} (R : u = v :> { a : A & P a & Q a } -> Prop) := eq_sigT2_rec R.\n" +
                "\n" +
                "  (** Equivalence of equality of [sigT2] involving hProps with equality of the first components *)\n" +
                "  Definition eq_sigT2_hprop_iff {A P Q} (Q_hprop : forall (x : A) (p q : Q x), p = q)\n" +
                "             (u v : { a : A & P a & Q a })\n" +
                "    : u = v <-> (u = v :> { a : A & P a })\n" +
                "    := conj (fun p => f_equal (@sigT_of_sigT2 _ _ _) p) (eq_sigT2_hprop Q_hprop u v).\n" +
                "\n" +
                "  (** Non-dependent classification of equality of [sigT] *)\n" +
                "  Definition eq_sigT2_nondep {A B C : Type} (u v : { a : A & B & C })\n" +
                "             (p : projT1 u = projT1 v) (q : projT2 u = projT2 v) (r : projT3 u = projT3 v)\n" +
                "    : u = v\n" +
                "    := @eq_sigT2 _ _ _ u v p (eq_trans (rew_const _ _) q) (eq_trans (rew_const _ _) r).\n" +
                "\n" +
                "  (** Classification of transporting across an equality of [sigT2]s *)\n" +
                "  Lemma rew_sigT2 {A x} {P : A -> Type} (Q R : forall a, P a -> Prop)\n" +
                "        (u : { p : P x & Q x p & R x p })\n" +
                "        {y} (H : x = y)\n" +
                "    : rew [fun a => { p : P a & Q a p & R a p }] H in u\n" +
                "      = existT2\n" +
                "          (Q y)\n" +
                "          (R y)\n" +
                "          (rew H in projT1 u)\n" +
                "          (rew dependent H in projT2 u)\n" +
                "          (rew dependent H in projT3 u).\n" +
                "  Proof.\n" +
                "    destruct H, u; reflexivity.\n" +
                "  Defined.\n" +
                "End sigT2.\n" +
                "\n" +
                "(** Equality for [sig2] *)\n" +
                "Section sig2.\n" +
                "  (* We make [sig_of_sig2] a coercion so we can use [proj1], [proj2] on [sig2] *)\n" +
                "  Local Coercion sig_of_sig2 : sig2 >-> sig.\n" +
                "  Local Unset Implicit Arguments.\n" +
                "  (** Projecting an equality of a pair to equality of the first components *)\n" +
                "  Definition sig_of_sig2_eq {A} {P Q : A -> Prop} {u v : { a : A | P a & Q a }} (p : u = v)\n" +
                "    : u = v :> { a : A | P a }\n" +
                "    := f_equal _ p.\n" +
                "  Definition proj1_sig_of_sig2_eq {A} {P Q : A -> Prop} {u v : { a : A | P a & Q a }} (p : u = v)\n" +
                "    : proj1_sig u = proj1_sig v\n" +
                "    := proj1_sig_eq (sig_of_sig2_eq p).\n" +
                "\n" +
                "  (** Projecting an equality of a pair to equality of the second components *)\n" +
                "  Definition proj2_sig_of_sig2_eq {A} {P Q : A -> Prop} {u v : { a : A | P a & Q a }} (p : u = v)\n" +
                "    : rew proj1_sig_of_sig2_eq p in proj2_sig u = proj2_sig v\n" +
                "    := rew dependent p in eq_refl.\n" +
                "\n" +
                "  (** Projecting an equality of a pair to equality of the third components *)\n" +
                "  Definition proj3_sig_eq {A} {P Q : A -> Prop} {u v : { a : A | P a & Q a }} (p : u = v)\n" +
                "    : rew proj1_sig_of_sig2_eq p in proj3_sig u = proj3_sig v\n" +
                "    := rew dependent p in eq_refl.\n" +
                "\n" +
                "  (** Equality of [sig2] is itself a [sig2] (fowards-reasoning version) *)\n" +
                "  Definition eq_exist2_uncurried {A} {P Q : A -> Prop}\n" +
                "             {u1 v1 : A} {u2 : P u1} {v2 : P v1} {u3 : Q u1} {v3 : Q v1}\n" +
                "             (pqr : { p : u1 = v1\n" +
                "                    | rew p in u2 = v2 & rew p in u3 = v3 })\n" +
                "    : exist2 _ _ u1 u2 u3 = exist2 _ _ v1 v2 v3.\n" +
                "  Proof.\n" +
                "    destruct pqr as [p q r].\n" +
                "    destruct r, q, p; simpl.\n" +
                "    reflexivity.\n" +
                "  Defined.\n" +
                "\n" +
                "  (** Equality of [sig2] is itself a [sig2] (backwards-reasoning version) *)\n" +
                "  Definition eq_sig2_uncurried {A} {P Q : A -> Prop} (u v : { a : A | P a & Q a })\n" +
                "             (pqr : { p : proj1_sig u = proj1_sig v\n" +
                "                    | rew p in proj2_sig u = proj2_sig v & rew p in proj3_sig u = proj3_sig v })\n" +
                "    : u = v.\n" +
                "  Proof.\n" +
                "    destruct u as [u1 u2 u3], v as [v1 v2 v3]; simpl in *.\n" +
                "    apply eq_exist2_uncurried; exact pqr.\n" +
                "  Defined.\n" +
                "\n" +
                "  (** Curried version of proving equality of sigma types *)\n" +
                "  Definition eq_sig2 {A} {P Q : A -> Prop} (u v : { a : A | P a & Q a })\n" +
                "             (p : proj1_sig u = proj1_sig v)\n" +
                "             (q : rew p in proj2_sig u = proj2_sig v)\n" +
                "             (r : rew p in proj3_sig u = proj3_sig v)\n" +
                "    : u = v\n" +
                "    := eq_sig2_uncurried u v (exist2 _ _ p q r).\n" +
                "\n" +
                "  (** Equality of [sig2] when the second property is an hProp *)\n" +
                "  Definition eq_sig2_hprop {A} {P Q : A -> Prop} (Q_hprop : forall (x : A) (p q : Q x), p = q)\n" +
                "             (u v : { a : A | P a & Q a })\n" +
                "             (p : u = v :> { a : A | P a })\n" +
                "    : u = v\n" +
                "    := eq_sig2 u v (proj1_sig_eq p) (proj2_sig_eq p) (Q_hprop _ _ _).\n" +
                "\n" +
                "  (** Equivalence of equality of [sig2] with a [sig2] of equality *)\n" +
                "  (** We could actually prove an isomorphism here, and not just [<->],\n" +
                "      but for simplicity, we don't. *)\n" +
                "  Definition eq_sig2_uncurried_iff {A P Q}\n" +
                "             (u v : { a : A | P a & Q a })\n" +
                "    : u = v\n" +
                "      <-> { p : proj1_sig u = proj1_sig v\n" +
                "          | rew p in proj2_sig u = proj2_sig v & rew p in proj3_sig u = proj3_sig v }.\n" +
                "  Proof.\n" +
                "    split; [ intro; subst; exists eq_refl; reflexivity | apply eq_sig2_uncurried ].\n" +
                "  Defined.\n" +
                "\n" +
                "  (** Induction principle for [@eq (sig2 _ _)] *)\n" +
                "  Definition eq_sig2_rect {A P Q} {u v : { a : A | P a & Q a }} (R : u = v -> Type)\n" +
                "             (f : forall p q r, R (eq_sig2 u v p q r))\n" +
                "    : forall p, R p.\n" +
                "  Proof.\n" +
                "    intro p.\n" +
                "    specialize (f (proj1_sig_of_sig2_eq p) (proj2_sig_of_sig2_eq p) (proj3_sig_eq p)).\n" +
                "    destruct u, p; exact f.\n" +
                "  Defined.\n" +
                "  Definition eq_sig2_rec {A P Q u v} (R : u = v :> { a : A | P a & Q a } -> Set) := eq_sig2_rect R.\n" +
                "  Definition eq_sig2_ind {A P Q u v} (R : u = v :> { a : A | P a & Q a } -> Prop) := eq_sig2_rec R.\n" +
                "\n" +
                "  (** Equivalence of equality of [sig2] involving hProps with equality of the first components *)\n" +
                "  Definition eq_sig2_hprop_iff {A} {P Q : A -> Prop} (Q_hprop : forall (x : A) (p q : Q x), p = q)\n" +
                "             (u v : { a : A | P a & Q a })\n" +
                "    : u = v <-> (u = v :> { a : A | P a })\n" +
                "    := conj (fun p => f_equal (@sig_of_sig2 _ _ _) p) (eq_sig2_hprop Q_hprop u v).\n" +
                "\n" +
                "  (** Non-dependent classification of equality of [sig] *)\n" +
                "  Definition eq_sig2_nondep {A} {B C : Prop} (u v : @sig2 A (fun _ => B) (fun _ => C))\n" +
                "             (p : proj1_sig u = proj1_sig v) (q : proj2_sig u = proj2_sig v) (r : proj3_sig u = proj3_sig v)\n" +
                "    : u = v\n" +
                "    := @eq_sig2 _ _ _ u v p (eq_trans (rew_const _ _) q) (eq_trans (rew_const _ _) r).\n" +
                "\n" +
                "  (** Classification of transporting across an equality of [sig2]s *)\n" +
                "  Lemma rew_sig2 {A x} {P : A -> Type} (Q R : forall a, P a -> Prop)\n" +
                "        (u : { p : P x | Q x p & R x p })\n" +
                "        {y} (H : x = y)\n" +
                "    : rew [fun a => { p : P a | Q a p & R a p }] H in u\n" +
                "      = exist2\n" +
                "          (Q y)\n" +
                "          (R y)\n" +
                "          (rew H in proj1_sig u)\n" +
                "          (rew dependent H in proj2_sig u)\n" +
                "          (rew dependent H in proj3_sig u).\n" +
                "  Proof.\n" +
                "    destruct H, u; reflexivity.\n" +
                "  Defined.\n" +
                "End sig2.\n" +
                "\n" +
                "\n" +
                "(** [sumbool] is a boolean type equipped with the justification of\n" +
                "    their value *)\n" +
                "\n" +
                "Inductive sumbool (A B:Prop) : Set :=\n" +
                "  | left : A -> {A} + {B}\n" +
                "  | right : B -> {A} + {B}\n" +
                " where \"{ A } + { B }\" := (sumbool A B) : type_scope.\n" +
                "\n" +
                "Add Printing If sumbool.\n" +
                "\n" +
                "Arguments left {A B} _, [A] B _.\n" +
                "Arguments right {A B} _ , A [B] _.\n" +
                "\n" +
                "(** [sumor] is an option type equipped with the justification of why\n" +
                "    it may not be a regular value *)\n" +
                "\n" +
                "Inductive sumor (A:Type) (B:Prop) : Type :=\n" +
                "  | inleft : A -> A + {B}\n" +
                "  | inright : B -> A + {B}\n" +
                " where \"A + { B }\" := (sumor A B) : type_scope.\n" +
                "\n" +
                "Add Printing If sumor.\n" +
                "\n" +
                "Arguments inleft {A B} _ , [A] B _.\n" +
                "Arguments inright {A B} _ , A [B] _.\n" +
                "\n" +
                "(* Unset Universe Polymorphism. *)\n" +
                "\n" +
                "(** Various forms of the axiom of choice for specifications *)\n" +
                "\n" +
                "Section Choice_lemmas.\n" +
                "\n" +
                "  Variables S S' : Set.\n" +
                "  Variable R : S -> S' -> Prop.\n" +
                "  Variable R' : S -> S' -> Set.\n" +
                "  Variables R1 R2 : S -> Prop.\n" +
                "\n" +
                "  Lemma Choice :\n" +
                "   (forall x:S, {y:S' | R x y}) -> {f:S -> S' | forall z:S, R z (f z)}.\n" +
                "  Proof.\n" +
                "   intro H.\n" +
                "   exists (fun z => proj1_sig (H z)).\n" +
                "   intro z; destruct (H z); assumption.\n" +
                "  Defined.\n" +
                "\n" +
                "  Lemma Choice2 :\n" +
                "   (forall x:S, {y:S' & R' x y}) -> {f:S -> S' & forall z:S, R' z (f z)}.\n" +
                "  Proof.\n" +
                "    intro H.\n" +
                "    exists (fun z => projT1 (H z)).\n" +
                "    intro z; destruct (H z); assumption.\n" +
                "  Defined.\n" +
                "\n" +
                "  Lemma bool_choice :\n" +
                "   (forall x:S, {R1 x} + {R2 x}) ->\n" +
                "     {f:S -> bool | forall x:S, f x = true /\\ R1 x \\/ f x = false /\\ R2 x}.\n" +
                "  Proof.\n" +
                "    intro H.\n" +
                "    exists (fun z:S => if H z then true else false).\n" +
                "    intro z; destruct (H z); auto.\n" +
                "  Defined.\n" +
                "\n" +
                "End Choice_lemmas.\n" +
                "\n" +
                "Section Dependent_choice_lemmas.\n" +
                "\n" +
                "  Variables X : Set.\n" +
                "  Variable R : X -> X -> Prop.\n" +
                "\n" +
                "  Lemma dependent_choice :\n" +
                "    (forall x:X, {y | R x y}) ->\n" +
                "    forall x0, {f : nat -> X | f O = x0 /\\ forall n, R (f n) (f (S n))}.\n" +
                "  Proof.\n" +
                "    intros H x0.\n" +
                "    set (f:=fix f n := match n with O => x0 | S n' => proj1_sig (H (f n')) end).\n" +
                "    exists f.\n" +
                "    split. reflexivity.\n" +
                "    induction n; simpl; apply proj2_sig.\n" +
                "  Defined.\n" +
                "\n" +
                "End Dependent_choice_lemmas.\n" +
                "\n" +
                "\n" +
                " (** A result of type [(Exc A)] is either a normal value of type [A] or\n" +
                "     an [error] :\n" +
                "     [Inductive Exc [A:Type] : Type := value : A->(Exc A) | error : (Exc A)].\n" +
                "     It is implemented using the option type. *)\n" +
                "Section Exc.\n" +
                "  Variable A : Type.\n" +
                "\n" +
                "  Definition Exc := option A.\n" +
                "  Definition value := @Some A.\n" +
                "  Definition error := @None A.\n" +
                "End Exc.\n" +
                "Arguments error {A}.\n" +
                "\n" +
                "Definition except := False_rec. (* for compatibility with previous versions *)\n" +
                "\n" +
                "Arguments except [P] _.\n" +
                "\n" +
                "Theorem absurd_set : forall (A:Prop) (C:Set), A -> ~ A -> C.\n" +
                "Proof.\n" +
                "  intros A C h1 h2.\n" +
                "  apply False_rec.\n" +
                "  apply (h2 h1).\n" +
                "Defined.\n" +
                "\n" +
                "Hint Resolve left right inleft inright: core.\n" +
                "Hint Resolve exist exist2 existT existT2: core.\n" +
                "\n" +
                "(* Compatibility *)\n" +
                "\n" +
                "Notation sigS := sigT (compat \"8.6\").\n" +
                "Notation existS := existT (compat \"8.6\").\n" +
                "Notation sigS_rect := sigT_rect (compat \"8.6\").\n" +
                "Notation sigS_rec := sigT_rec (compat \"8.6\").\n" +
                "Notation sigS_ind := sigT_ind (compat \"8.6\").\n" +
                "Notation projS1 := projT1 (compat \"8.6\").\n" +
                "Notation projS2 := projT2 (compat \"8.6\").\n" +
                "\n" +
                "Notation sigS2 := sigT2 (compat \"8.6\").\n" +
                "Notation existS2 := existT2 (compat \"8.6\").\n" +
                "Notation sigS2_rect := sigT2_rect (compat \"8.6\").\n" +
                "Notation sigS2_rec := sigT2_rec (compat \"8.6\").\n" +
                "Notation sigS2_ind := sigT2_ind (compat \"8.6\").";

        public final static String tactics = "(************************************************************************)\n" +
                "(*         *   The Coq Proof Assistant / The Coq Development Team       *)\n" +
                "(*  v      *   INRIA, CNRS and contributors - Copyright 1999-2018       *)\n" +
                "(* <O___,, *       (see CREDITS file for the list of authors)           *)\n" +
                "(*   \\VV/  **************************************************************)\n" +
                "(*    //   *    This file is distributed under the terms of the         *)\n" +
                "(*         *     GNU Lesser General Public License Version 2.1          *)\n" +
                "(*         *     (see LICENSE file for the text of the license)         *)\n" +
                "(************************************************************************)\n" +
                "\n" +
                "Require Import Notations.\n" +
                "Require Import Logic.\n" +
                "Require Import Specif.\n" +
                "\n" +
                "(** * Useful tactics *)\n" +
                "\n" +
                "(** Ex falso quodlibet : a tactic for proving False instead of the current goal.\n" +
                "    This is just a nicer name for tactics such as [elimtype False]\n" +
                "    and other [cut False]. *)\n" +
                "\n" +
                "Ltac exfalso := elimtype False.\n" +
                "\n" +
                "(** A tactic for proof by contradiction. With contradict H,\n" +
                "    -   H:~A |-  B    gives       |-  A\n" +
                "    -   H:~A |- ~B    gives  H: B |-  A\n" +
                "    -   H: A |-  B    gives       |- ~A\n" +
                "    -   H: A |- ~B    gives  H: B |- ~A\n" +
                "    -   H:False leads to a resolved subgoal.\n" +
                "   Moreover, negations may be in unfolded forms,\n" +
                "   and A or B may live in Type *)\n" +
                "\n" +
                "Ltac contradict H :=\n" +
                "  let save tac H := let x:=fresh in intro x; tac H; rename x into H\n" +
                "  in\n" +
                "  let negpos H := case H; clear H\n" +
                "  in\n" +
                "  let negneg H := save negpos H\n" +
                "  in\n" +
                "  let pospos H :=\n" +
                "    let A := type of H in (exfalso; revert H; try fold (~A))\n" +
                "  in\n" +
                "  let posneg H := save pospos H\n" +
                "  in\n" +
                "  let neg H := match goal with\n" +
                "   | |- (~_) => negneg H\n" +
                "   | |- (_->False) => negneg H\n" +
                "   | |- _ => negpos H\n" +
                "  end in\n" +
                "  let pos H := match goal with\n" +
                "   | |- (~_) => posneg H\n" +
                "   | |- (_->False) => posneg H\n" +
                "   | |- _ => pospos H\n" +
                "  end in\n" +
                "  match type of H with\n" +
                "   | (~_) => neg H\n" +
                "   | (_->False) => neg H\n" +
                "   | _ => (elim H;fail) || pos H\n" +
                "  end.\n" +
                "\n" +
                "(* To contradict an hypothesis without copying its type. *)\n" +
                "\n" +
                "Ltac absurd_hyp H :=\n" +
                "  idtac \"absurd_hyp is OBSOLETE: use contradict instead.\";\n" +
                "  let T := type of H in\n" +
                "  absurd T.\n" +
                "\n" +
                "(* A useful complement to contradict. Here H:A while G allows concluding ~A *)\n" +
                "\n" +
                "Ltac false_hyp H G :=\n" +
                "  let T := type of H in absurd T; [ apply G | assumption ].\n" +
                "\n" +
                "(* A case with no loss of information. *)\n" +
                "\n" +
                "Ltac case_eq x := generalize (eq_refl x); pattern x at -1; case x.\n" +
                "\n" +
                "(* use either discriminate or injection on a hypothesis *)\n" +
                "\n" +
                "Ltac destr_eq H := discriminate H || (try (injection H as H)).\n" +
                "\n" +
                "(* Similar variants of destruct *)\n" +
                "\n" +
                "Tactic Notation \"destruct_with_eqn\" constr(x) :=\n" +
                "  destruct x eqn:?.\n" +
                "Tactic Notation \"destruct_with_eqn\" ident(n) :=\n" +
                "  try intros until n; destruct n eqn:?.\n" +
                "Tactic Notation \"destruct_with_eqn\" \":\" ident(H) constr(x) :=\n" +
                "  destruct x eqn:H.\n" +
                "Tactic Notation \"destruct_with_eqn\" \":\" ident(H) ident(n) :=\n" +
                "  try intros until n; destruct n eqn:H.\n" +
                "\n" +
                "(** Break every hypothesis of a certain type *)\n" +
                "\n" +
                "Ltac destruct_all t :=\n" +
                " match goal with\n" +
                "  | x : t |- _ => destruct x; destruct_all t\n" +
                "  | _ => idtac\n" +
                " end.\n" +
                "\n" +
                "(* Rewriting in all hypothesis several times everywhere *)\n" +
                "\n" +
                "Tactic Notation \"rewrite_all\" constr(eq) := repeat rewrite eq in *.\n" +
                "Tactic Notation \"rewrite_all\" \"<-\" constr(eq) := repeat rewrite <- eq in *.\n" +
                "\n" +
                "(** Tactics for applying equivalences.\n" +
                "The following code provides tactics \"apply -> t\", \"apply <- t\",\n" +
                "\"apply -> t in H\" and \"apply <- t in H\". Here t is a term whose type\n" +
                "consists of nested dependent and nondependent products with an\n" +
                "equivalence A <-> B as the conclusion. The tactics with \"->\" in their\n" +
                "names apply A -> B while those with \"<-\" in the name apply B -> A. *)\n" +
                "\n" +
                "(* The idea of the tactics is to first provide a term in the context\n" +
                "whose type is the implication (in one of the directions), and then\n" +
                "apply it. The first idea is to produce a statement \"forall ..., A ->\n" +
                "B\" (call this type T) and then do \"assert (H : T)\" for a fresh H.\n" +
                "Thus, T can be proved from the original equivalence and then used to\n" +
                "perform the application. However, currently in Ltac it is difficult\n" +
                "to produce such T from the original formula.\n" +
                "Therefore, we first pose the original equivalence as H. If the type of\n" +
                "H is a dependent product, we create an existential variable and apply\n" +
                "H to this variable. If the type of H has the form C -> D, then we do a\n" +
                "cut on C. Once we eliminate all products, we split (i.e., destruct)\n" +
                "the conjunction into two parts and apply the relevant one. *)\n" +
                "\n" +
                "Ltac find_equiv H :=\n" +
                "let T := type of H in\n" +
                "lazymatch T with\n" +
                "| ?A -> ?B =>\n" +
                "  let H1 := fresh in\n" +
                "  let H2 := fresh in\n" +
                "  cut A;\n" +
                "  [intro H1; pose proof (H H1) as H2; clear H H1;\n" +
                "   rename H2 into H; find_equiv H |\n" +
                "   clear H]\n" +
                "| forall x : ?t, _ =>\n" +
                "  let a := fresh \"a\" with\n" +
                "      H1 := fresh \"H\" in\n" +
                "    evar (a : t); pose proof (H a) as H1; unfold a in H1;\n" +
                "    clear a; clear H; rename H1 into H; find_equiv H\n" +
                "| ?A <-> ?B => idtac\n" +
                "| _ => fail \"The given statement does not seem to end with an equivalence.\"\n" +
                "end.\n" +
                "\n" +
                "Ltac bapply lemma todo :=\n" +
                "let H := fresh in\n" +
                "  pose proof lemma as H;\n" +
                "  find_equiv H; [todo H; clear H | .. ].\n" +
                "\n" +
                "Tactic Notation \"apply\" \"->\" constr(lemma) :=\n" +
                "bapply lemma ltac:(fun H => destruct H as [H _]; apply H).\n" +
                "\n" +
                "Tactic Notation \"apply\" \"<-\" constr(lemma) :=\n" +
                "bapply lemma ltac:(fun H => destruct H as [_ H]; apply H).\n" +
                "\n" +
                "Tactic Notation \"apply\" \"->\" constr(lemma) \"in\" hyp(J) :=\n" +
                "bapply lemma ltac:(fun H => destruct H as [H _]; apply H in J).\n" +
                "\n" +
                "Tactic Notation \"apply\" \"<-\" constr(lemma) \"in\" hyp(J) :=\n" +
                "bapply lemma ltac:(fun H => destruct H as [_ H]; apply H in J).\n" +
                "\n" +
                "(** An experimental tactic simpler than auto that is useful for ending\n" +
                "    proofs \"in one step\" *)\n" +
                "\n" +
                "Ltac easy :=\n" +
                "  let rec use_hyp H :=\n" +
                "    match type of H with\n" +
                "    | _ /\\ _ => exact H || destruct_hyp H\n" +
                "    | _ => try solve [inversion H]\n" +
                "    end\n" +
                "  with do_intro := let H := fresh in intro H; use_hyp H\n" +
                "  with destruct_hyp H := case H; clear H; do_intro; do_intro in\n" +
                "  let rec use_hyps :=\n" +
                "    match goal with\n" +
                "    | H : _ /\\ _ |- _  => exact H || (destruct_hyp H; use_hyps)\n" +
                "    | H : _ |- _ => solve [inversion H]\n" +
                "    | _ => idtac\n" +
                "    end in\n" +
                "  let do_atom :=\n" +
                "    solve [ trivial with eq_true | reflexivity | symmetry; trivial | contradiction ] in\n" +
                "  let rec do_ccl :=\n" +
                "    try do_atom;\n" +
                "    repeat (do_intro; try do_atom);\n" +
                "    solve [ split; do_ccl ] in\n" +
                "  solve [ do_atom | use_hyps; do_ccl ] ||\n" +
                "  fail \"Cannot solve this goal\".\n" +
                "\n" +
                "Tactic Notation \"now\" tactic(t) := t; easy.\n" +
                "\n" +
                "(** Slightly more than [easy]*)\n" +
                "\n" +
                "Ltac easy' := repeat split; simpl; easy || now destruct 1.\n" +
                "\n" +
                "(** A tactic to document or check what is proved at some point of a script *)\n" +
                "\n" +
                "Ltac now_show c := change c.\n" +
                "\n" +
                "(** Support for rewriting decidability statements *)\n" +
                "\n" +
                "Set Implicit Arguments.\n" +
                "\n" +
                "Lemma decide_left : forall (C:Prop) (decide:{C}+{~C}),\n" +
                "  C -> forall P:{C}+{~C}->Prop, (forall H:C, P (left _ H)) -> P decide.\n" +
                "Proof.\n" +
                "intros; destruct decide. apply H0. contradiction.\n" +
                "Qed.\n" +
                "\n" +
                "Lemma decide_right : forall (C:Prop) (decide:{C}+{~C}),\n" +
                "  ~C -> forall P:{C}+{~C}->Prop, (forall H:~C, P (right _ H)) -> P decide.\n" +
                "Proof.\n" +
                "intros; destruct decide. contradiction. apply H0.\n" +
                "Qed.\n" +
                "\n" +
                "Tactic Notation \"decide\" constr(lemma) \"with\" constr(H) :=\n" +
                "  let try_to_merge_hyps H :=\n" +
                "     try (clear H; intro H) ||\n" +
                "     (let H' := fresh H \"bis\" in intro H'; try clear H') ||\n" +
                "     (let H' := fresh in intro H'; try clear H') in\n" +
                "  match type of H with\n" +
                "  | ~ ?C => apply (decide_right lemma H); try_to_merge_hyps H\n" +
                "  | ?C -> False => apply (decide_right lemma H); try_to_merge_hyps H\n" +
                "  | _ => apply (decide_left lemma H); try_to_merge_hyps H\n" +
                "  end.\n" +
                "\n" +
                "(** Clear an hypothesis and its dependencies *)\n" +
                "\n" +
                "Tactic Notation \"clear\" \"dependent\" hyp(h) :=\n" +
                " let rec depclear h :=\n" +
                "  clear h ||\n" +
                "  match goal with\n" +
                "   | H : context [ h ] |- _ => depclear H; depclear h\n" +
                "  end ||\n" +
                "  fail \"hypothesis to clear is used in the conclusion (maybe indirectly)\"\n" +
                " in depclear h.\n" +
                "\n" +
                "(** Revert an hypothesis and its dependencies :\n" +
                "    this is actually generalize dependent... *)\n" +
                "\n" +
                "Tactic Notation \"revert\" \"dependent\" hyp(h) :=\n" +
                " generalize dependent h.\n" +
                "\n" +
                "(** Provide an error message for dependent induction that reports an import is\n" +
                "required to use it. Importing Coq.Program.Equality will shadow this notation\n" +
                "with the actual [dependent induction] tactic. *)\n" +
                "\n" +
                "Tactic Notation \"dependent\" \"induction\" ident(H) :=\n" +
                "  fail \"To use dependent induction, first [Require Import Coq.Program.Equality.]\".\n" +
                "\n" +
                "(** *** [inversion_sigma] *)\n" +
                "(** The built-in [inversion] will frequently leave equalities of\n" +
                "    dependent pairs.  When the first type in the pair is an hProp or\n" +
                "    otherwise simplifies, [inversion_sigma] is useful; it will replace\n" +
                "    the equality of pairs with a pair of equalities, one involving a\n" +
                "    term casted along the other.  This might also prove useful for\n" +
                "    writing a version of [inversion] / [dependent destruction] which\n" +
                "    does not lose information, i.e., does not turn a goal which is\n" +
                "    provable into one which requires axiom K / UIP.  *)\n" +
                "\n" +
                "Ltac simpl_proj_exist_in H :=\n" +
                "  repeat match type of H with\n" +
                "         | context G[proj1_sig (exist _ ?x ?p)]\n" +
                "           => let G' := context G[x] in change G' in H\n" +
                "         | context G[proj2_sig (exist _ ?x ?p)]\n" +
                "           => let G' := context G[p] in change G' in H\n" +
                "         | context G[projT1 (existT _ ?x ?p)]\n" +
                "           => let G' := context G[x] in change G' in H\n" +
                "         | context G[projT2 (existT _ ?x ?p)]\n" +
                "           => let G' := context G[p] in change G' in H\n" +
                "         | context G[proj3_sig (exist2 _ _ ?x ?p ?q)]\n" +
                "           => let G' := context G[q] in change G' in H\n" +
                "         | context G[projT3 (existT2 _ _ ?x ?p ?q)]\n" +
                "           => let G' := context G[q] in change G' in H\n" +
                "         | context G[sig_of_sig2 (@exist2 ?A ?P ?Q ?x ?p ?q)]\n" +
                "           => let G' := context G[@exist A P x p] in change G' in H\n" +
                "         | context G[sigT_of_sigT2 (@existT2 ?A ?P ?Q ?x ?p ?q)]\n" +
                "           => let G' := context G[@existT A P x p] in change G' in H\n" +
                "         end.\n" +
                "Ltac induction_sigma_in_using H rect :=\n" +
                "  let H0 := fresh H in\n" +
                "  let H1 := fresh H in\n" +
                "  induction H as [H0 H1] using (rect _ _ _ _);\n" +
                "  simpl_proj_exist_in H0;\n" +
                "  simpl_proj_exist_in H1.\n" +
                "Ltac induction_sigma2_in_using H rect :=\n" +
                "  let H0 := fresh H in\n" +
                "  let H1 := fresh H in\n" +
                "  let H2 := fresh H in\n" +
                "  induction H as [H0 H1 H2] using (rect _ _ _ _ _);\n" +
                "  simpl_proj_exist_in H0;\n" +
                "  simpl_proj_exist_in H1;\n" +
                "  simpl_proj_exist_in H2.\n" +
                "Ltac inversion_sigma_step :=\n" +
                "  match goal with\n" +
                "  | [ H : _ = exist _ _ _ |- _ ]\n" +
                "    => induction_sigma_in_using H @eq_sig_rect\n" +
                "  | [ H : _ = existT _ _ _ |- _ ]\n" +
                "    => induction_sigma_in_using H @eq_sigT_rect\n" +
                "  | [ H : exist _ _ _ = _ |- _ ]\n" +
                "    => induction_sigma_in_using H @eq_sig_rect\n" +
                "  | [ H : existT _ _ _ = _ |- _ ]\n" +
                "    => induction_sigma_in_using H @eq_sigT_rect\n" +
                "  | [ H : _ = exist2 _ _ _ _ _ |- _ ]\n" +
                "    => induction_sigma2_in_using H @eq_sig2_rect\n" +
                "  | [ H : _ = existT2 _ _ _ _ _ |- _ ]\n" +
                "    => induction_sigma2_in_using H @eq_sigT2_rect\n" +
                "  | [ H : exist2 _ _ _ _ _ = _ |- _ ]\n" +
                "    => induction_sigma_in_using H @eq_sig2_rect\n" +
                "  | [ H : existT2 _ _ _ _ _ = _ |- _ ]\n" +
                "    => induction_sigma_in_using H @eq_sigT2_rect\n" +
                "  end.\n" +
                "Ltac inversion_sigma := repeat inversion_sigma_step.\n" +
                "\n" +
                "(** A version of [time] that works for constrs *)\n" +
                "\n" +
                "Ltac time_constr tac :=\n" +
                "  let eval_early := match goal with _ => restart_timer end in\n" +
                "  let ret := tac () in\n" +
                "  let eval_early := match goal with _ => finish_timing ( \"Tactic evaluation\" ) end in\n" +
                "  ret.\n" +
                "\n" +
                "(** Useful combinators *)\n" +
                "\n" +
                "Ltac assert_fails tac :=\n" +
                "  tryif tac then fail 0 tac \"succeeds\" else idtac.\n" +
                "Ltac assert_succeeds tac :=\n" +
                "  tryif (assert_fails tac) then fail 0 tac \"fails\" else idtac.\n" +
                "Tactic Notation \"assert_succeeds\" tactic3(tac) :=\n" +
                "  assert_succeeds tac.\n" +
                "Tactic Notation \"assert_fails\" tactic3(tac) :=\n" +
                "assert_fails tac.";

        public final static String tauto = "Require Import Notations.\n" +
                "Require Import Datatypes.\n" +
                "Require Import Logic.\n" +
                "\n" +
                "Declare ML Module \"tauto_plugin\".\n" +
                "\n" +
                "Local Ltac not_dep_intros :=\n" +
                "  repeat match goal with\n" +
                "  | |- (forall (_: ?X1), ?X2) => intro\n" +
                "  | |- (Coq.Init.Logic.not _) => unfold Coq.Init.Logic.not at 1; intro\n" +
                "  end.\n" +
                "\n" +
                "Local Ltac axioms flags :=\n" +
                "  match reverse goal with\n" +
                "    | |- ?X1 => is_unit_or_eq flags X1; constructor 1\n" +
                "    | _:?X1 |- _ => is_empty flags X1; elimtype X1; assumption\n" +
                "    | _:?X1 |- ?X1 => assumption\n" +
                "  end.\n" +
                "\n" +
                "Local Ltac simplif flags :=\n" +
                "  not_dep_intros;\n" +
                "  repeat\n" +
                "     (match reverse goal with\n" +
                "      | id: ?X1 |- _ => is_conj flags X1; elim id; do 2 intro; clear id\n" +
                "      | id: (Coq.Init.Logic.iff _ _) |- _ => elim id; do 2 intro; clear id\n" +
                "      | id: (Coq.Init.Logic.not _) |- _ => red in id\n" +
                "      | id: ?X1 |- _ => is_disj flags X1; elim id; intro; clear id\n" +
                "      | id0: (forall (_: ?X1), ?X2), id1: ?X1|- _ =>\n" +
                "    (* generalize (id0 id1); intro; clear id0 does not work\n" +
                "       (see Marco Maggiesi's BZ#301)\n" +
                "    so we instead use Assert and exact. *)\n" +
                "    assert X2; [exact (id0 id1) | clear id0]\n" +
                "      | id: forall (_ : ?X1), ?X2|- _ =>\n" +
                "        is_unit_or_eq flags X1; cut X2;\n" +
                "    [ intro; clear id\n" +
                "    | (* id : forall (_: ?X1), ?X2 |- ?X2 *)\n" +
                "      cut X1; [exact id| constructor 1; fail]\n" +
                "    ]\n" +
                "      | id: forall (_ : ?X1), ?X2|- _ =>\n" +
                "        flatten_contravariant_conj flags X1 X2 id\n" +
                "  (* moved from \"id:(?A/\\?B)->?X2|-\" to \"?A->?B->?X2|-\" *)\n" +
                "      | id: forall (_: Coq.Init.Logic.iff ?X1 ?X2), ?X3|- _ =>\n" +
                "        assert (forall (_: forall _:X1, X2), forall (_: forall _: X2, X1), X3)\n" +
                "    by (do 2 intro; apply id; split; assumption);\n" +
                "          clear id\n" +
                "      | id: forall (_:?X1), ?X2|- _ =>\n" +
                "        flatten_contravariant_disj flags X1 X2 id\n" +
                "  (* moved from \"id:(?A\\/?B)->?X2|-\" to \"?A->?X2,?B->?X2|-\" *)\n" +
                "      | |- ?X1 => is_conj flags X1; split\n" +
                "      | |- (Coq.Init.Logic.iff _ _) => split\n" +
                "      | |- (Coq.Init.Logic.not _) => red\n" +
                "      end;\n" +
                "      not_dep_intros).\n" +
                "\n" +
                "Local Ltac tauto_intuit flags t_reduce t_solver :=\n" +
                " let rec t_tauto_intuit :=\n" +
                " (simplif flags; axioms flags\n" +
                " || match reverse goal with\n" +
                "    | id:forall(_: forall (_: ?X1), ?X2), ?X3|- _ =>\n" +
                "  cut X3;\n" +
                "    [ intro; clear id; t_tauto_intuit\n" +
                "    | cut (forall (_: X1), X2);\n" +
                "\t[ exact id\n" +
                "\t| generalize (fun y:X2 => id (fun x:X1 => y)); intro; clear id;\n" +
                "\t  solve [ t_tauto_intuit ]]]\n" +
                "    | id:forall (_:not ?X1), ?X3|- _ =>\n" +
                "  cut X3;\n" +
                "    [ intro; clear id; t_tauto_intuit\n" +
                "    | cut (not X1); [ exact id | clear id; intro; solve [t_tauto_intuit ]]]\n" +
                "    | |- ?X1 =>\n" +
                "        is_disj flags X1; solve [left;t_tauto_intuit | right;t_tauto_intuit]\n" +
                "    end\n" +
                "  ||\n" +
                "  (* NB: [|- _ -> _] matches any product *)\n" +
                "  match goal with | |- forall (_ : _),  _ => intro; t_tauto_intuit\n" +
                "  |  |- _  => t_reduce;t_solver\n" +
                "  end\n" +
                "  ||\n" +
                "  t_solver\n" +
                " ) in t_tauto_intuit.\n" +
                "\n" +
                "Local Ltac intuition_gen flags solver := tauto_intuit flags reduction_not_iff solver.\n" +
                "Local Ltac tauto_intuitionistic flags := intuition_gen flags fail || fail \"tauto failed\".\n" +
                "Local Ltac tauto_classical flags :=\n" +
                "  (apply_nnpp || fail \"tauto failed\"); (tauto_intuitionistic flags || fail \"Classical tauto failed\").\n" +
                "Local Ltac tauto_gen flags := tauto_intuitionistic flags || tauto_classical flags.\n" +
                "\n" +
                "Ltac tauto := with_uniform_flags ltac:(fun flags => tauto_gen flags).\n" +
                "Ltac dtauto := with_power_flags ltac:(fun flags => tauto_gen flags).\n" +
                "\n" +
                "Ltac intuition := with_uniform_flags ltac:(fun flags => intuition_gen flags ltac:(auto with *)).\n" +
                "Local Ltac intuition_then tac := with_uniform_flags ltac:(fun flags => intuition_gen flags tac).\n" +
                "\n" +
                "Ltac dintuition := with_power_flags ltac:(fun flags => intuition_gen flags ltac:(auto with *)).\n" +
                "Local Ltac dintuition_then tac := with_power_flags ltac:(fun flags => intuition_gen flags tac).\n" +
                "\n" +
                "Tactic Notation \"intuition\" := intuition.\n" +
                "Tactic Notation \"intuition\" tactic(t) := intuition_then t.\n" +
                "\n" +
                "Tactic Notation \"dintuition\" := dintuition.\n" +
                "Tactic Notation \"dintuition\" tactic(t) := dintuition_then t.";

        public final static String wf = "(************************************************************************)\n" +
                "(*         *   The Coq Proof Assistant / The Coq Development Team       *)\n" +
                "(*  v      *   INRIA, CNRS and contributors - Copyright 1999-2018       *)\n" +
                "(* <O___,, *       (see CREDITS file for the list of authors)           *)\n" +
                "(*   \\VV/  **************************************************************)\n" +
                "(*    //   *    This file is distributed under the terms of the         *)\n" +
                "(*         *     GNU Lesser General Public License Version 2.1          *)\n" +
                "(*         *     (see LICENSE file for the text of the license)         *)\n" +
                "(************************************************************************)\n" +
                "\n" +
                "(** * This module proves the validity of\n" +
                "    - well-founded recursion (also known as course of values)\n" +
                "    - well-founded induction\n" +
                "    from a well-founded ordering on a given set *)\n" +
                "\n" +
                "Set Implicit Arguments.\n" +
                "\n" +
                "Require Import Notations.\n" +
                "Require Import Logic.\n" +
                "Require Import Datatypes.\n" +
                "\n" +
                "(** Well-founded induction principle on [Prop] *)\n" +
                "\n" +
                "Section Well_founded.\n" +
                "\n" +
                " Variable A : Type.\n" +
                " Variable R : A -> A -> Prop.\n" +
                "\n" +
                " (** The accessibility predicate is defined to be non-informative *)\n" +
                " (** (Acc_rect is automatically defined because Acc is a singleton type) *)\n" +
                "\n" +
                " Inductive Acc (x: A) : Prop :=\n" +
                "     Acc_intro : (forall y:A, R y x -> Acc y) -> Acc x.\n" +
                "\n" +
                " Lemma Acc_inv : forall x:A, Acc x -> forall y:A, R y x -> Acc y.\n" +
                "  destruct 1; trivial.\n" +
                " Defined.\n" +
                "\n" +
                " Global Arguments Acc_inv [x] _ [y] _, [x] _ y _.\n" +
                "\n" +
                " (** A relation is well-founded if every element is accessible *)\n" +
                "\n" +
                " Definition well_founded := forall a:A, Acc a.\n" +
                "\n" +
                " (** Well-founded induction on [Set] and [Prop] *)\n" +
                "\n" +
                " Hypothesis Rwf : well_founded.\n" +
                "\n" +
                " Theorem well_founded_induction_type :\n" +
                "  forall P:A -> Type,\n" +
                "    (forall x:A, (forall y:A, R y x -> P y) -> P x) -> forall a:A, P a.\n" +
                " Proof.\n" +
                "  intros; apply Acc_rect; auto.\n" +
                " Defined.\n" +
                "\n" +
                " Theorem well_founded_induction :\n" +
                "  forall P:A -> Set,\n" +
                "    (forall x:A, (forall y:A, R y x -> P y) -> P x) -> forall a:A, P a.\n" +
                " Proof.\n" +
                "  exact (fun P:A -> Set => well_founded_induction_type P).\n" +
                " Defined.\n" +
                "\n" +
                " Theorem well_founded_ind :\n" +
                "  forall P:A -> Prop,\n" +
                "    (forall x:A, (forall y:A, R y x -> P y) -> P x) -> forall a:A, P a.\n" +
                " Proof.\n" +
                "  exact (fun P:A -> Prop => well_founded_induction_type P).\n" +
                " Defined.\n" +
                "\n" +
                "(** Well-founded fixpoints *)\n" +
                "\n" +
                " Section FixPoint.\n" +
                "\n" +
                "  Variable P : A -> Type.\n" +
                "  Variable F : forall x:A, (forall y:A, R y x -> P y) -> P x.\n" +
                "\n" +
                "  Fixpoint Fix_F (x:A) (a:Acc x) : P x :=\n" +
                "    F (fun (y:A) (h:R y x) => Fix_F (Acc_inv a h)).\n" +
                "\n" +
                "  Scheme Acc_inv_dep := Induction for Acc Sort Prop.\n" +
                "\n" +
                "  Lemma Fix_F_eq :\n" +
                "   forall (x:A) (r:Acc x),\n" +
                "     F (fun (y:A) (p:R y x) => Fix_F (x:=y) (Acc_inv r p)) = Fix_F (x:=x) r.\n" +
                "  Proof.\n" +
                "   destruct r using Acc_inv_dep; auto.\n" +
                "  Qed.\n" +
                "\n" +
                "  Definition Fix (x:A) := Fix_F (Rwf x).\n" +
                "\n" +
                "  (** Proof that [well_founded_induction] satisfies the fixpoint equation.\n" +
                "      It requires an extra property of the functional *)\n" +
                "\n" +
                "  Hypothesis\n" +
                "    F_ext :\n" +
                "      forall (x:A) (f g:forall y:A, R y x -> P y),\n" +
                "        (forall (y:A) (p:R y x), f y p = g y p) -> F f = F g.\n" +
                "\n" +
                "  Lemma Fix_F_inv : forall (x:A) (r s:Acc x), Fix_F r = Fix_F s.\n" +
                "  Proof.\n" +
                "   intro x; induction (Rwf x); intros.\n" +
                "   rewrite <- (Fix_F_eq r); rewrite <- (Fix_F_eq s); intros.\n" +
                "   apply F_ext; auto.\n" +
                "  Qed.\n" +
                "\n" +
                "  Lemma Fix_eq : forall x:A, Fix x = F (fun (y:A) (p:R y x) => Fix y).\n" +
                "  Proof.\n" +
                "   intro x; unfold Fix.\n" +
                "   rewrite <- Fix_F_eq.\n" +
                "   apply F_ext; intros.\n" +
                "   apply Fix_F_inv.\n" +
                "  Qed.\n" +
                "\n" +
                " End FixPoint.\n" +
                "\n" +
                "End Well_founded.\n" +
                "\n" +
                "(** Well-founded fixpoints over pairs *)\n" +
                "\n" +
                "Section Well_founded_2.\n" +
                "\n" +
                "  Variables A B : Type.\n" +
                "  Variable R : A * B -> A * B -> Prop.\n" +
                "\n" +
                "  Variable P : A -> B -> Type.\n" +
                "\n" +
                "  Section FixPoint_2.\n" +
                "\n" +
                "  Variable\n" +
                "    F :\n" +
                "      forall (x:A) (x':B),\n" +
                "        (forall (y:A) (y':B), R (y, y') (x, x') -> P y y') -> P x x'.\n" +
                "\n" +
                "  Fixpoint Fix_F_2 (x:A) (x':B) (a:Acc R (x, x')) : P x x' :=\n" +
                "    F\n" +
                "      (fun (y:A) (y':B) (h:R (y, y') (x, x')) =>\n" +
                "         Fix_F_2 (x:=y) (x':=y') (Acc_inv a (y,y') h)).\n" +
                "\n" +
                "  End FixPoint_2.\n" +
                "\n" +
                "  Hypothesis Rwf : well_founded R.\n" +
                "\n" +
                "  Theorem well_founded_induction_type_2 :\n" +
                "   (forall (x:A) (x':B),\n" +
                "      (forall (y:A) (y':B), R (y, y') (x, x') -> P y y') -> P x x') ->\n" +
                "   forall (a:A) (b:B), P a b.\n" +
                "  Proof.\n" +
                "   intros; apply Fix_F_2; auto.\n" +
                "  Defined.\n" +
                "\n" +
                "End Well_founded_2.\n" +
                "\n" +
                "Notation Acc_iter   := Fix_F   (only parsing). (* compatibility *)\n" +
                "Notation Acc_iter_2 := Fix_F_2 (only parsing). (* compatibility *)\n" +
                "\n" +
                "\n" +
                "\n" +
                "(* Added by Julien Forest on 13/11/20 *)\n" +
                "Section Acc_generator.\n" +
                "  Variable A : Type.\n" +
                "  Variable R : A -> A -> Prop.\n" +
                "\n" +
                "  (* *Lazily* add 2^n - 1 Acc_intro on top of wf. \n" +
                "     Needed for fast reductions using Function and Program Fixpoint \n" +
                "     and probably using Fix and Fix_F_2 \n" +
                "   *)    \n" +
                "  Fixpoint Acc_intro_generator n (wf : well_founded R)  := \n" +
                "    match n with \n" +
                "        | O => wf\n" +
                "        | S n => fun x => Acc_intro x (fun y _ => Acc_intro_generator n (Acc_intro_generator n wf) y)\n" +
                "    end.\n" +
                "\n" +
                "\n" +
                "End Acc_generator.";
    }

    @Test
    public void testSpecif(){
        assertEquals("Not the same tree",
                CoqParser.parseCoqFile(" (** Classification of transporting across an equality of [sigT]s *)\n" +
                        "  Lemma rew_sigT {A x} {P : A -> Type} (Q : forall a, P a -> Prop) (u : { p : P x & Q x p }) {y} (H : x = y)\n" +
                        "    : rew [fun a => { p : P a & Q a p }] H in u\n" +
                        "      = existT\n" +
                        "          (Q y)\n" +
                        "          (rew H in projT1 u)\n" +
                        "          (rew dependent H in (projT2 u)).\n" +
                        "  Proof.\n" +
                        "    destruct H, u; reflexivity.\n" +
                        "  Defined.\n" +
                        "End sigT.")
                ,CoqParser.parseCoqFile(CoqParser.parseCoqFile(" (** Classification of transporting across an equality of [sigT]s *)\n" +
                        "  Lemma rew_sigT {A x} {P : A -> Type} (Q : forall a, P a -> Prop) (u : { p : P x & Q x p }) {y} (H : x = y)\n" +
                        "    : rew [fun a => { p : P a & Q a p }] H in u\n" +
                        "      = existT\n" +
                        "          (Q y)\n" +
                        "          (rew H in projT1 u)\n" +
                        "          (rew dependent H in (projT2 u)).\n" +
                        "  Proof.\n" +
                        "    destruct H, u; reflexivity.\n" +
                        "  Defined.\n" +
                        "End sigT.").accept(new PrettyPrintCoqFileVisitor(
                                PrettyPrintConfiguration.fromIndentType(PrettyPrintConfiguration.IndentType.TABS)),
                        new PrettyPrintContext(0,PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))));
    }

    @Test
    public void testLogic_Type(){
        assertEquals("Not the same tree",
                CoqParser.parseCoqFile(CoqFiles.logic_typeV)
        ,CoqParser.parseCoqFile(CoqParser.parseCoqFile(CoqFiles.logic_typeV).accept(new PrettyPrintCoqFileVisitor(
                PrettyPrintConfiguration.fromIndentType(PrettyPrintConfiguration.IndentType.TABS)),
                        new PrettyPrintContext(0,PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))));
    }

    @Test
    public void testDatatypes(){
        assertEquals("Not the same tree",
                CoqParser.parseCoqFile(CoqFiles.datatypes)
                ,CoqParser.parseCoqFile(CoqParser.parseCoqFile(CoqFiles.datatypes).accept(new PrettyPrintCoqFileVisitor(
                                PrettyPrintConfiguration.fromIndentType(PrettyPrintConfiguration.IndentType.TABS)),
                        new PrettyPrintContext(0,PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))));
    }

    @Test
    public void testLogic(){
        assertEquals("Not the same tree",
                CoqParser.parseCoqFile(CoqFiles.logic)
                ,CoqParser.parseCoqFile(
                        CoqParser.parseCoqFile(CoqFiles.logic)
                                .accept(new PrettyPrintCoqFileVisitor(
                                                PrettyPrintConfiguration.fromIndentType(
                                                        PrettyPrintConfiguration.
                                                                IndentType.TABS)),
                                        new PrettyPrintContext(0,
                                                PrettyPrintConfiguration.HIGHESTPREC,
                                                PrettyPrintContext.TREETYPE.MULTI))));
    }



    @Test
    public void testDecimal(){
        assertEquals("Not the same tree", CoqParser.parseCoqFile(CoqFiles.decimal)
                ,CoqParser.parseCoqFile(CoqParser.parseCoqFile(CoqFiles.decimal).accept(new PrettyPrintCoqFileVisitor(
                                PrettyPrintConfiguration.fromIndentType(PrettyPrintConfiguration.IndentType.TABS)),
                        new PrettyPrintContext(0,PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))));
    }

    @Test
    public void testNat(){
        assertEquals("Not the same tree", CoqParser.parseCoqFile(CoqFiles.nat)
                ,CoqParser.parseCoqFile(CoqParser.parseCoqFile(CoqFiles.nat).accept(new PrettyPrintCoqFileVisitor(
                                PrettyPrintConfiguration.fromIndentType(PrettyPrintConfiguration.IndentType.TABS)),
                        new PrettyPrintContext(0,PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))));
    }

    @Test
    public void testNotations(){
        assertEquals("Not the same tree", CoqParser.parseCoqFile(CoqFiles.notations)
                ,CoqParser.parseCoqFile(CoqParser.parseCoqFile(CoqFiles.notations).accept(new PrettyPrintCoqFileVisitor(
                                PrettyPrintConfiguration.fromIndentType(PrettyPrintConfiguration.IndentType.TABS)),
                        new PrettyPrintContext(0,PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))));
    }

    @Test
    public void testPeano(){
        assertEquals("Not the same tree", CoqParser.parseCoqFile(CoqFiles.peano)
                ,CoqParser.parseCoqFile(CoqParser.parseCoqFile(CoqFiles.peano).accept(new PrettyPrintCoqFileVisitor(
                                PrettyPrintConfiguration.fromIndentType(PrettyPrintConfiguration.IndentType.TABS)),
                        new PrettyPrintContext(0,PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))));
    }

    @Test
    public void testPrelude(){
        assertEquals("Not the same tree", CoqParser.parseCoqFile(CoqFiles.prelude)
                ,CoqParser.parseCoqFile(CoqParser.parseCoqFile(CoqFiles.prelude).accept(new PrettyPrintCoqFileVisitor(
                                PrettyPrintConfiguration.fromIndentType(PrettyPrintConfiguration.IndentType.TABS)),
                        new PrettyPrintContext(0,PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))));
    }

    @Test
    public void testTactics(){
        assertEquals("Not the same",CoqParser.parseCoqFile(CoqFiles.tactics),
                CoqParser.parseCoqFile(CoqParser.parseCoqFile(CoqFiles.tactics).accept(new PrettyPrintCoqFileVisitor(
                                PrettyPrintConfiguration.fromIndentType(PrettyPrintConfiguration.IndentType.TABS)),
                        new PrettyPrintContext(0,PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))));
    }

    @Test
    public void testTauto(){
        assertEquals("Not the same",CoqParser.parseCoqFile(CoqFiles.tauto),
                CoqParser.parseCoqFile(CoqParser.parseCoqFile(CoqFiles.tauto).accept(new PrettyPrintCoqFileVisitor(
                                PrettyPrintConfiguration.fromIndentType(PrettyPrintConfiguration.IndentType.TABS)),
                        new PrettyPrintContext(0,PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))));
    }
    @Test
    public void testWf(){
        assertEquals("Not the same",CoqParser.parseCoqFile(CoqFiles.wf),
                CoqParser.parseCoqFile(CoqParser.parseCoqFile(CoqFiles.wf).accept(new PrettyPrintCoqFileVisitor(
                                PrettyPrintConfiguration.fromIndentType(PrettyPrintConfiguration.IndentType.TABS)),
                        new PrettyPrintContext(0,PrettyPrintConfiguration.HIGHESTPREC, PrettyPrintContext.TREETYPE.MULTI))));
    }
}
