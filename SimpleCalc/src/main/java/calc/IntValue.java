package calc;

public class IntValue implements CalcExp {
	private int value;
	
	public IntValue(int value) {
		this.value = value;
	}
	
	@Override
	public String prettyString() {
		return "" + value;
	}

	@Override
	public int eval() {
		return value;
	}

}
