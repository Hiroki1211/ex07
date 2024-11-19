package mapEvoSuiteTest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ex07.Calculator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import java.util.ArrayList;

public class Calculator_MapTest {

@Test
  public void mapTest0(){
      Calculator calculator0 = new Calculator();
      int int0 = calculator0.run(15, 3, "/");
      assertEquals(5, int0);
  }

@Test
  public void mapTest1(){
      Calculator calculator0 = new Calculator();
      int int0 = calculator0.run(15, 3, "/");
      assertEquals(5, int0);
  }

@Test
  public void mapTest2(){
      Calculator calculator0 = new Calculator();
      int int0 = calculator0.run(3, 4, "*");
      assertEquals(12, int0);
  }

@Test
  public void mapTest3(){
      Calculator calculator0 = new Calculator();
      int int0 = calculator0.run(5, 3, "-");
      assertEquals(2, int0);
  }

@Test
  public void mapTest4(){
      Calculator calculator0 = new Calculator();
      int int0 = calculator0.run(5, 3, "-");
      assertEquals(2, int0);
  }

@Test
  public void mapTest5(){
      Calculator calculator0 = new Calculator();
      int int0 = calculator0.run(1, 2, "+");
      assertEquals(3, int0);
  }

@Test
  public void mapTest6(){
      Calculator calculator0 = new Calculator();
      int int0 = calculator0.run(3, 0, "/");
      assertEquals(0, int0);
  }

@Test
  public void mapTest7(){
      Calculator calculator0 = new Calculator();
      int int0 = calculator0.run(0, 0, "");
      assertEquals(0, int0);
  }

  // not match evosuite test
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      // Undeclared exception!
      try { 
        calculator0.run(0, (-1597), (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

}
