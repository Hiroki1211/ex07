package mapEvoSuiteTest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ex07.Formula;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import java.util.ArrayList;

public class Formula_MapTest {

@Test
  public void mapTest0(){
      Formula formula0 = new Formula("1 + 2");
      int int0 = formula0.getA();
      assertEquals("+", formula0.getOpe());
      assertEquals(1, int0);
      assertEquals(2, formula0.getB());
  }

@Test
  public void mapTest1(){
      Formula formula0 = new Formula("1 + 2");
      int int0 = formula0.getA();
      assertEquals("+", formula0.getOpe());
      assertEquals(1, int0);
      assertEquals(2, formula0.getB());
  }

@Test
  public void mapTest2(){
      Formula formula0 = new Formula("");
      assertEquals(0, formula0.getA());
      assertEquals(0, formula0.getB());
  }

@Test
  public void mapTest3(){
      Formula formula0 = new Formula("1 + 2");
      int int0 = formula0.getB();
      assertEquals("+", formula0.getOpe());
      assertEquals(2, int0);
  }

@Test
  public void mapTest4(){
      Formula formula0 = new Formula("1 + 2");
      int int0 = formula0.getB();
      assertEquals(2, int0);
      assertEquals("+", formula0.getOpe());
  }

@Test
  public void mapTest5(){
      Formula formula0 = new Formula("1 + 2");
      String string0 = formula0.getOpe();
      assertEquals("+", string0);
      assertEquals(2, formula0.getB());
  }

  // not match evosuite test
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Formula formula0 = new Formula(" 't+c*+>A y&h");
      int int0 = formula0.getB();
      assertEquals(0, int0);
      assertEquals(0, formula0.getA());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
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
      Formula formula0 = new Formula(" w'-Wx7 _jk");
      formula0.getOpe();
      assertEquals(0, formula0.getB());
      assertEquals(0, formula0.getA());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Formula formula0 = new Formula("3 (eA}r &");
      int int0 = formula0.getA();
      assertEquals(0, formula0.getB());
      assertEquals(0, int0);
  }

}
