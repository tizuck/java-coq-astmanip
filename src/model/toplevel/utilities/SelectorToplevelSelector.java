package model.toplevel.utilities;

import model.tactics.expr.utilities.Selector;

import java.util.Objects;

public class SelectorToplevelSelector implements ToplevelSelector {

	private Selector slector;

	public SelectorToplevelSelector(Selector slector) {
		this.slector = slector;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SelectorToplevelSelector that = (SelectorToplevelSelector) o;
		return Objects.equals(slector, that.slector);
	}

	@Override
	public int hashCode() {
		return Objects.hash(slector);
	}
}
