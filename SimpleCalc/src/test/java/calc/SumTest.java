package calc;

import org.junit.Assert;
import org.junit.Test;


public class SumTest {
	
	@Test
	public void Plus_simpleInit() {
		IntValue[] array = new IntValue[] {
								new IntValue(5),
								new IntValue(4),
								new IntValue(33),
								new IntValue(88)
								};
		Sum s = new Sum(array);
		Assert.assertEquals(array.length, s.array.length);
		for (int i = 0; i < array.length; i++) {
			Assert.assertEquals(array[i], s.array[i]);
		}
	}
	
	@Test
	public void Plus_simpleEvals() {
		IntValue[] array = new IntValue[] {
				new IntValue(5),
				new IntValue(4),
				new IntValue(33),
				new IntValue(88)
				};
		Sum s = new Sum(array);
		Assert.assertEquals(130, s.eval());
		
		array = new IntValue[] {
				new IntValue(88),
				new IntValue(33),
				new IntValue(4),
				new IntValue(5)
				};
		s = new Sum(array);
		Assert.assertEquals(130, s.eval());
	}
	
}
