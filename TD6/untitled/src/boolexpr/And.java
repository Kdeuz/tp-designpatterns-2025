package boolexpr;

public class And extends BinaryOperator {

	public And(Node leftOperand, Node rightOperand) {
		super(leftOperand, rightOperand);
	}


	@Override
	public boolean evaluate() throws NoSuchFieldException {
		if(leftOperand instanceof Bool bl) {
			if(rightOperand instanceof Bool br) {
				return bl.evaluate() && br.evaluate();
			} else {
				return bl.evaluate() && ((Operator)rightOperand).evaluate();
			}
		} else if(rightOperand instanceof Bool br) {
			return br.evaluate() && ((Operator)leftOperand).evaluate();
		}
		return ((Operator)rightOperand).evaluate() && ((Operator)leftOperand).evaluate();
	}

	@Override
	public String getName() {
		return "(" + leftOperand.getName() + " AND " + rightOperand.getName() + ")";
	}
}
