package src.boolexpr;

import src.tree.visitors.Visitor;

public interface Node {
    public boolean evaluate();
    public String print();
    void accept(Visitor v);
}
