package calc;

import org.junit.Assert;
import org.junit.Test;


public class PlusTest {
	
	@Test
	public void Plus_simpleInit() {
		CalcExp left = new IntValue(1);
		CalcExp right = new IntValue(2);
		Plus p = new Plus(left, right);
		
		Assert.assertSame(left, p.left);
		Assert.assertSame(right, p.right);
		Assert.assertEquals("+", p.operator);
	}
	
	@Test
	public void Plus_simpleEvals() {
		Plus p = new Plus(new IntValue(1), new IntValue(2));
		Assert.assertEquals(3, p.eval());
		
		p = new Plus(new IntValue(0), new IntValue(2));
		Assert.assertEquals(2, p.eval());
		
		p = new Plus(new IntValue(2), new IntValue(1));
		Assert.assertEquals(3, p.eval());
	}
	
}
