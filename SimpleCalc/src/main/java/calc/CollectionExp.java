package calc;

public abstract class CollectionExp implements CalcExp {
	protected CalcExp[] array;
	
	public CollectionExp(CalcExp... exprs) {
		this.array = new CalcExp[exprs.length];
		System.arraycopy(exprs, 0, this.array, 0, exprs.length);
	}
	
	@Override
	public String prettyString() {
		String s = "(";
		for (int i = 0; i < array.length - 1; i++) {
			s += array[i].prettyString() + ",";
		}
		s += array[array.length - 1].prettyString();
		s += ")";
		return s;
	}

	@Override
	public int eval() {
		// TODO Auto-generated method stub
		return 0;
	}

}
