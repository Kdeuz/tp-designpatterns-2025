package boolexpr;

public class Bool implements Node {

	private boolean value;

	public Bool(boolean value) {
		this.value = value;
	}

	public boolean evaluate() {
		return value;
	}

	@Override
	public String getName() {
		return this.value ? "true":"false";
	}
}
