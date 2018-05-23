import static org.junit.Assert.*;

import org.itstep.Function;
import org.junit.Test;

public class test2 {

 @Test
 public void getFunction() {
  Function myTest = new Function();
  int runTest = myTest.getFunction(2);
  assertEquals(8, runTest );
  
 }

}
