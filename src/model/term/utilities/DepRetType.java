package model.term.utilities;

import java.util.Objects;
import java.util.Optional;

public class DepRetType {

	private Optional<Name> oName;

	private ReturnType returnType;

	public DepRetType(Optional<Name> oName, ReturnType returnType) {
		this.oName = oName;
		this.returnType = returnType;
	}

	public Optional<Name> getoName() {
		return oName;
	}

	public ReturnType getReturnType() {
		return returnType;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		DepRetType that = (DepRetType) o;
		return Objects.equals(oName, that.oName) &&
				Objects.equals(returnType, that.returnType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(oName, returnType);
	}
}
