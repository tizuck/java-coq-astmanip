package model.vernacular.utilities;


import java.util.List;
import java.util.Objects;

public class IndBodyAlloc {

	private List<IndBodyAllocElement> indBodyAllocElementList;

	public List<IndBodyAllocElement> getIndBodyAllocElementList() {
		return indBodyAllocElementList;
	}

	public IndBodyAlloc(List<IndBodyAllocElement> indBodyAllocElementList) {
		this.indBodyAllocElementList = indBodyAllocElementList;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		IndBodyAlloc that = (IndBodyAlloc) o;
		return Objects.equals(indBodyAllocElementList, that.indBodyAllocElementList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(indBodyAllocElementList);
	}
}
