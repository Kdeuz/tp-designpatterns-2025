package src.tree.visitors;

import src.boolexpr.And;
import src.boolexpr.Bool;
import src.boolexpr.Not;
import src.boolexpr.Or;

public class DisplayVisitor implements Visitor{

    @Override
    public void visit(Bool b) {
        System.out.println(b.getValue());
    }

    @Override
    public void visit(Not n) {
        System.out.print("(NOT ");
        n.getOperand().accept(this);
        System.out.print(")");
    }

    @Override
    public void visit(And a) {
        System.out.print("(");
        a.getLeftOperand().accept(this);
        System.out.print(" And ");
        a.getRightOperand().accept(this);
        System.out.print(")");
    }

    @Override
    public void visit(Or o) {
        System.out.print("(");
        o.getLeftOperand().accept(this);
        System.out.print(" Or ");
        o.getRightOperand().accept(this);
        System.out.print(")");
    }
}
