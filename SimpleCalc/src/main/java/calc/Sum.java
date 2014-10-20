package calc;

public class Sum extends CollectionExp {
	
	public Sum(CalcExp... exprs) {
		super(exprs);
	}
	
	@Override
	public String prettyString() {
		return "sum" + super.prettyString();
	}
	
	@Override
	public int eval() {
		int result = 0;
		for (CalcExp expr : array) {
			result += expr.eval();
		}
		return result;
	}
}
