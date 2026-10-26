package src.boolexpr;

import src.tree.visitors.Visitor;

public class Bool implements Node {

	private boolean value;

	public Bool(boolean value) {
		this.value = value;
	}

	public boolean getValue() {
		return value;
	}

	@Override
	public boolean evaluate() {
		return value;
	}

	@Override
	public String print() {
		if(value) {
			return "true";
		} else {
			return "false";
		}
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
