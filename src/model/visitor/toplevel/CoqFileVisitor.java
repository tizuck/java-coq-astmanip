package model.visitor.toplevel;

import model.toplevel.CompilationUnit;

public interface CoqFileVisitor<R,P> {
    R visit(CompilationUnit compilationUnit,P p);
}
