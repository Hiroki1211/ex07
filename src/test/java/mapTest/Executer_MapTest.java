package mapTest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ex07.Executer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import java.io.IOException;

public class Executer_MapTest {

  @Test
  public void mapTest0() throws IOException{
Executer executer0 = new Executer();
int int0 = executer0.run("");
      assertEquals(0, int0);
  }

  // not match evosuite test
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Executer executer0 = new Executer();
      // Undeclared exception!
      try { 
        executer0.run((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ex07.Formula", e);
      }
  }

}
