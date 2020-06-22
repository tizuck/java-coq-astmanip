package model.term.utilities;

import model.term.Number;
import model.visitor.term.PatternVisitor;

import java.util.Objects;

public class NumPattern implements SinglePattern {

	private Number num;

	public NumPattern(Number num) {
		this.num = num;
	}

	public Number getNum() {
		return num;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		NumPattern that = (NumPattern) o;
		return Objects.equals(num, that.num);
	}

	@Override
	public int hashCode() {
		return Objects.hash(num);
	}

	@Override
	public <R, P> R accept(PatternVisitor<R, P> patternVisitor, P p) {
		return patternVisitor.visit(this,p);
	}
}
