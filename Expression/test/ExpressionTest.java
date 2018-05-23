import static org.junit.Assert.*;

import org.itstep.Factorial;
import org.junit.Test;

public class ExpressionTest {

	@Test
	public void getFactorial() {
		Factorial myTest = new Factorial();
		 int runTest = myTest.getFactorial(2);
		 assertEquals(2, runTest);
	}

}
