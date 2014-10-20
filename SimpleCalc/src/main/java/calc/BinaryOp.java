package calc;

public abstract class BinaryOp implements CalcExp {
	protected CalcExp left;
	protected CalcExp right;
	protected String operator;
	
	public BinaryOp(String operator, CalcExp left, CalcExp right) {
		this.left = left;
		this.right = right;
		this.operator = operator;
	}

	@Override
	public String prettyString() {
		return '(' + left.prettyString() + operator + right.prettyString() + ")";
	}
}
