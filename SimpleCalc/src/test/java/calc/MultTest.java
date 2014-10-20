package calc;

import org.junit.Assert;
import org.junit.Test;


public class MultTest {
	
	@Test
	public void Plus_simpleInit() {
		CalcExp left = new IntValue(1);
		CalcExp right = new IntValue(2);
		Mult m = new Mult(left, right);
		
		Assert.assertSame(left, m.left);
		Assert.assertSame(right, m.right);
		Assert.assertEquals("*", m.operator);
	}
	
	@Test
	public void Plus_simpleEvals() {
		Mult m = new Mult(new IntValue(1), new IntValue(2));
		Assert.assertEquals(2, m.eval());
		
		m = new Mult(new IntValue(0), new IntValue(2));
		Assert.assertEquals(0, m.eval());
		
		m = new Mult(new IntValue(2), new IntValue(1));
		Assert.assertEquals(2, m.eval());
	}
	
}
