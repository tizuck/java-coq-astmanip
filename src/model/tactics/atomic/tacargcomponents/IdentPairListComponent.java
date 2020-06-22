package model.tactics.atomic.tacargcomponents;

import model.term.utilities.Ident;
import model.visitor.atomic.TacArgComponentVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IdentPairListComponent extends TacArgComponent {

	public class IdentPair {
		private Ident id1;

		private Ident id2;


		public IdentPair(Ident id1, Ident id2) {
			this.id1 = id1;
			this.id2 = id2;
		}

		public Ident getId1() {
			return id1;
		}

		public Ident getId2() {
			return id2;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			IdentPair identPair = (IdentPair) o;
			return Objects.equals(id1, identPair.id1) &&
					Objects.equals(id2, identPair.id2);
		}

		@Override
		public int hashCode() {
			return Objects.hash(id1, id2);
		}
	}

	private List<IdentPair> identPairs;

	public IdentPairListComponent(List<Ident> ids1, List<Ident> ids2) {
		identPairs = new ArrayList<>();
		for (int i = 0; i < ids1.size(); i++) {
			identPairs.add(new IdentPair(ids1.get(i),ids2.get(i)));
		}
	}

	public IdentPairListComponent(ComponentType componentType, List<Ident> ids1, List<Ident> ids2) {
		super(componentType);
		identPairs = new ArrayList<>();
		for (int i = 0; i < ids1.size(); i++) {
			identPairs.add(new IdentPair(ids1.get(i),ids2.get(i)));
		}
	}

	public List<IdentPair> getIdentPairs() {
		return identPairs;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		IdentPairListComponent that = (IdentPairListComponent) o;
		return Objects.equals(identPairs, that.identPairs);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), identPairs);
	}

	@Override
	public <R, P> R accept(TacArgComponentVisitor<R, P> tacArgComponentVisitor, P p) {
		return tacArgComponentVisitor.visit(this,p);
	}



}
