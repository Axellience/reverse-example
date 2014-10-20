package calc;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class IntValueTest {

	@Test
	public void IntValue_eval() {
		int random = new Random().nextInt(1234);
		IntValue intval = new IntValue(random);
		Assert.assertEquals(random, intval.eval());
	}
}
