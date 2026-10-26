package src.boolexpr;

import src.tree.visitors.Visitor;

public class Or extends BinaryOperator {

	public Or(Node leftOperand, Node rightOperand) {
		super(leftOperand, rightOperand);
	}

	@Override
	public boolean evaluate() {
		return this.leftOperand.evaluate() || this.rightOperand.evaluate();
	}

	@Override
	public String print() {
		return "(" + leftOperand.print() + " Or " + rightOperand.print() + ")";
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
