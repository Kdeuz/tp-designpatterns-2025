package src.tree.visitors;

import src.boolexpr.And;
import src.boolexpr.Bool;
import src.boolexpr.Not;
import src.boolexpr.Or;

public interface Visitor {
    void visit(Bool b);
    void visit(Not n);
    void visit(And a);
    void visit(Or o);
}
