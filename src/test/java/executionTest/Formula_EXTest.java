package executionTest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ex07.Formula;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import java.util.ArrayList;
import java.io.IOException;

public class Formula_EXTest {

  public ArrayList<String> test0() throws IOException {
      ArrayList<String> results = new ArrayList<String>();
Formula formula0 = new Formula("1 + 2");
String string0 = formula0.getOpe();
      results.add(String.valueOf(formula0.getB()));
      results.add(String.valueOf(string0));
      return results;
  }

  public ArrayList<String> test1() throws IOException {
      ArrayList<String> results = new ArrayList<String>();
Formula formula0 = new Formula("");
int int0 = formula0.getB();
      results.add(String.valueOf(int0));
      results.add(String.valueOf(formula0.getA()));
      return results;
  }

  public ArrayList<String> test2() throws IOException {
      ArrayList<String> results = new ArrayList<String>();
Formula formula0 = new Formula("1 + 2");
int int0 = formula0.getA();
      results.add(String.valueOf(formula0.getOpe()));
      results.add(String.valueOf(int0));
      results.add(String.valueOf(formula0.getB()));
      return results;
  }

  public ArrayList<String> test3() throws IOException {
      ArrayList<String> results = new ArrayList<String>();
Formula formula0 = new Formula("1 + 2");
int int0 = formula0.getB();
      results.add(String.valueOf(formula0.getOpe()));
      results.add(String.valueOf(int0));
      return results;
  }
}
