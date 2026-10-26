package boolexpr;

public class Not extends UnaryOperator {

	public Not(Node operand) {
		super(operand);
	}

	@Override
	public String getName() {
		return "NOT " + operand.getName();
	}

	@Override
	public boolean evaluate() throws NoSuchFieldException {
		if(operand instanceof Bool b) {
			return !b.evaluate();
		} else if(operand instanceof Operator o) {
			return !o.evaluate();
		}
		throw new NoSuchFieldException();
	}
}
