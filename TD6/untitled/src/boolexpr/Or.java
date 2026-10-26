package boolexpr;

public class Or extends BinaryOperator {

	public Or(Node leftOperand, Node rightOperand) {
		super(leftOperand, rightOperand);
	}

	@Override
	public boolean evaluate() throws NoSuchFieldException {
		if(leftOperand instanceof Bool bl) {
			if(rightOperand instanceof Bool br) {
				return bl.evaluate() || br.evaluate();
			}
			else if(rightOperand instanceof Operator or) {
				return bl.evaluate() || or.evaluate();
			}
		}
		else if(rightOperand instanceof Bool br) {
			return ((Operator)leftOperand).evaluate() || br.evaluate();
		}
		return ((Operator) leftOperand).evaluate() || ((Operator) rightOperand).evaluate();
	}

	@Override
	public String getName() {
		return leftOperand.getName() + " OR " + rightOperand.getName();
	}
}
