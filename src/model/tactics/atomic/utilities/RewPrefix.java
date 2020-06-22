package model.tactics.atomic.utilities;

import model.visitor.atomic.RewPrefixVisitor;

import java.util.Objects;
import java.util.Optional;

public abstract class RewPrefix {

	private Optional<Number> oNum;

	public RewPrefix(Optional<Number> oNum) {
		this.oNum = oNum;
	}

	public Optional<Number> getoNum() {
		return oNum;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		RewPrefix rewPrefix = (RewPrefix) o;
		return Objects.equals(oNum, rewPrefix.oNum);
	}

	@Override
	public int hashCode() {
		return Objects.hash(oNum);
	}

	public abstract <R,P> R accept(RewPrefixVisitor<R,P> rewPrefixVisitor,P p);
}
