package mapTest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ex07.Formula;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import java.io.IOException;

public class Formula_MapTest {

  @Test
  public void mapTest0() throws IOException{
Formula formula0 = new Formula("1 + 2");
String string0 = formula0.getOpe();
      assertEquals(2, formula0.getB());
      assertEquals("+", string0);
  }

  @Test
  public void mapTest1() throws IOException{
Formula formula0 = new Formula("");
int int0 = formula0.getB();
      assertEquals(0, int0);
      assertEquals(0, formula0.getA());
  }

  @Test
  public void mapTest2() throws IOException{
Formula formula0 = new Formula("1 + 2");
int int0 = formula0.getA();
      assertEquals("+", formula0.getOpe());
      assertEquals(1, int0);
      assertEquals(2, formula0.getB());
  }

  @Test
  public void mapTest3() throws IOException{
Formula formula0 = new Formula("1 + 2");
int int0 = formula0.getB();
      assertEquals("+", formula0.getOpe());
      assertEquals(2, int0);
  }

  // not match evosuite test
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Formula formula0 = null;
      try {
        formula0 = new Formula((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ex07.Formula", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Formula formula0 = new Formula("3 (eA}r &");
      int int0 = formula0.getA();
      assertEquals(0, int0);
      assertEquals(0, formula0.getB());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Formula formula0 = new Formula(" w'-Wx7 _jk");
      formula0.getOpe();
      assertEquals(0, formula0.getA());
      assertEquals(0, formula0.getB());
  }

}
