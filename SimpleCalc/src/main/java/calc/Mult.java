package calc;

public class Mult extends BinaryOp {
	
	public Mult(CalcExp left, CalcExp right) {
		super("*", left, right);
	}

	@Override
	public int eval() {
		return left.eval() * right.eval();
	}
}
