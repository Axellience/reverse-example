package calc;

public class Plus extends BinaryOp {

	public Plus(CalcExp left, CalcExp right) {
		super("+", left, right);
	}

	@Override
	public int eval() {
		return left.eval() + right.eval();
	}
}
