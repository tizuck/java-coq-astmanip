package model.tactics.expr.utilities;

import model.term.utilities.Ident;

import java.util.List;
import java.util.Optional;
import model.tactics.expr.Expr;
import model.term.utilities.Name;

public class LetClause {

	private Ident id;

	private Optional<List<Name>> oNames;

	private Expr expr;

	public LetClause(Ident id, Optional<List<Name>> oNames, Expr expr) {
		this.id = id;
		this.oNames = oNames;
		this.expr = expr;
	}

	public Ident getId() {
		return id;
	}

	public Optional<List<Name>> getoNames() {
		return oNames;
	}

	public Expr getExpr() {
		return expr;
	}
}
