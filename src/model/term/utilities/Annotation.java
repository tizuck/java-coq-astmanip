package model.term.utilities;

import java.util.Objects;

public class Annotation {

	private String annotation;

	public Annotation(String annotation) {
		this.annotation = annotation;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Annotation that = (Annotation) o;
		return Objects.equals(annotation, that.annotation);
	}

	@Override
	public int hashCode() {
		return Objects.hash(annotation);
	}

	public String getAnnotation() {
		return annotation;
	}
}
