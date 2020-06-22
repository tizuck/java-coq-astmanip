package model.term.utilities;

import model.term.Qualid;
import model.term.Term;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class MatchItem {

	private Term term;

	private Optional<Name> oName;

	private Optional<Qualid> oQualid;

	private Optional<List<Pattern>> pattern;

	public MatchItem(Term term, Optional<Name> oName, Optional<Qualid> oQualid, Optional<List<Pattern>> pattern) {
		this.term = term;
		this.oName = oName;
		this.oQualid = oQualid;
		this.pattern = pattern;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		MatchItem matchItem = (MatchItem) o;
		return Objects.equals(term, matchItem.term) &&
				Objects.equals(oName, matchItem.oName) &&
				Objects.equals(oQualid, matchItem.oQualid) &&
				Objects.equals(pattern, matchItem.pattern);
	}

	@Override
	public int hashCode() {
		return Objects.hash(term, oName, oQualid, pattern);
	}

	public Term getTerm() {
		return term;
	}

	public Optional<Name> getoName() {
		return oName;
	}

	public Optional<Qualid> getoQualid() {
		return oQualid;
	}

	public Optional<List<Pattern>> getPattern() {
		return pattern;
	}
}
