package src.boolexpr;

import src.tree.visitors.Visitor;

public class And extends BinaryOperator {

	public And(Node leftOperand, Node rightOperand) {
		super(leftOperand, rightOperand);
	}

	@Override
	public boolean evaluate() {
		return this.leftOperand.evaluate() && this.rightOperand.evaluate();
	}

	@Override
	public String print() {
		return "(" + leftOperand.print() + " And " + rightOperand.print() + ")";
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}


}
