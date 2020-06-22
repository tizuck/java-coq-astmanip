package model.term.utilities;

import model.visitor.term.IdentVisitor;

public class AccessIdent extends Ident {

    public AccessIdent(String id) {
        super(id);
    }

    @Override
    public <R, P> R accept(IdentVisitor<R, P> identVisitor, P p) {
        return identVisitor.visit(this,p);
    }
}
