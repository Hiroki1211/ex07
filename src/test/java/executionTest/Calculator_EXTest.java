package executionTest;

import org.junit.Test;
import static org.junit.Assert.*;
import ex07.Calculator;
import java.util.ArrayList;
import java.io.IOException;

public class Calculator_EXTest {

  public ArrayList<String> test0() throws IOException {
      ArrayList<String> results = new ArrayList<String>();
Calculator calculator0 = new Calculator();
int int0 = calculator0.run(15, 3, "/");
      results.add(String.valueOf(int0));
      return results;
  }

  public ArrayList<String> test1() throws IOException {
      ArrayList<String> results = new ArrayList<String>();
Calculator calculator0 = new Calculator();
int int0 = calculator0.run(15, 3, "/");
      results.add(String.valueOf(int0));
      return results;
  }

  public ArrayList<String> test2() throws IOException {
      ArrayList<String> results = new ArrayList<String>();
Calculator calculator0 = new Calculator();
int int0 = calculator0.run(3, 4, "*");
      results.add(String.valueOf(int0));
      return results;
  }

  public ArrayList<String> test3() throws IOException {
      ArrayList<String> results = new ArrayList<String>();
Calculator calculator0 = new Calculator();
int int0 = calculator0.run(3, 4, "*");
      results.add(String.valueOf(int0));
      return results;
  }

  public ArrayList<String> test4() throws IOException {
      ArrayList<String> results = new ArrayList<String>();
Calculator calculator0 = new Calculator();
int int0 = calculator0.run(5, 3, "-");
      results.add(String.valueOf(int0));
      return results;
  }

  public ArrayList<String> test5() throws IOException {
      ArrayList<String> results = new ArrayList<String>();
Calculator calculator0 = new Calculator();
int int0 = calculator0.run(5, 3, "-");
      results.add(String.valueOf(int0));
      return results;
  }

  public ArrayList<String> test6() throws IOException {
      ArrayList<String> results = new ArrayList<String>();
Calculator calculator0 = new Calculator();
int int0 = calculator0.run(1, 2, "+");
      results.add(String.valueOf(int0));
      return results;
  }

  public ArrayList<String> test7() throws IOException {
      ArrayList<String> results = new ArrayList<String>();
Calculator calculator0 = new Calculator();
int int0 = calculator0.run(3, 0, "/");
      results.add(String.valueOf(int0));
      return results;
  }

  public ArrayList<String> test8() throws IOException {
      ArrayList<String> results = new ArrayList<String>();
Calculator calculator0 = new Calculator();
int int0 = calculator0.run(0, 0, "");
      results.add(String.valueOf(int0));
      return results;
  }
}
