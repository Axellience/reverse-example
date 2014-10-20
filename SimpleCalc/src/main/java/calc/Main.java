package calc;

public class Main {
	public static void main(String[] args) {
		CalcExp expr = new Mult(new IntValue(3), new Plus(new IntValue(4), new IntValue(1)));
		System.out.println(expr.prettyString());
		System.out.println(expr.eval());
		
		expr = new Sum(new IntValue(1), new IntValue(2), new IntValue(3), new Mult(new IntValue(3), new IntValue(4)));
		System.out.println(expr.prettyString());
		System.out.println(expr.eval());
	}
}
