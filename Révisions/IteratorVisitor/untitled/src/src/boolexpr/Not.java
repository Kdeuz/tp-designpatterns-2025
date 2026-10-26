package src.boolexpr;

import src.tree.visitors.Visitor;

public class Not extends UnaryOperator {

	public Not(Node operand) {
		super(operand);
	}

	@Override
	public boolean evaluate() {
		return !this.getOperand().evaluate();
	}

	@Override
	public String print() {
		return "(Not" + operand.print() + ")";
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
