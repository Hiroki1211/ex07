package executionTest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ex07.Executer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import java.util.ArrayList;
import java.io.IOException;

public class Executer_EXTest {

  public ArrayList<String> test0() throws IOException {
      ArrayList<String> results = new ArrayList<String>();
Executer executer0 = new Executer();
int int0 = executer0.run("");
      results.add(String.valueOf(int0));
      return results;
  }
}
