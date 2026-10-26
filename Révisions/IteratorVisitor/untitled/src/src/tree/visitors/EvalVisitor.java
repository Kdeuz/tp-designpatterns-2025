package src.tree.visitors;

import src.boolexpr.And;
import src.boolexpr.Bool;
import src.boolexpr.Not;
import src.boolexpr.Or;

public class EvalVisitor implements Visitor{

    private boolean res;

    public boolean getRes() {
        return res;
    }

    @Override
    public void visit(Bool b) {
        res = b.getValue();
    }

    @Override
    public void visit(Not n) {
        n.getOperand().accept(this);
        res = !res;
    }

    @Override
    public void visit(And a) {
        a.getLeftOperand().accept(this);
        boolean leftValue = res;

        a.getRightOperand().accept(this);
        boolean rightValue = res;

        res = leftValue && rightValue;
    }

    @Override
    public void visit(Or o) {
        o.getLeftOperand().accept(this);
        boolean leftValue = res;

        o.getRightOperand().accept(this);
        boolean rightValue = res;

        res = leftValue || rightValue;
    }
}
