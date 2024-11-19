package executionTest;

import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AllExecutionTestExecuter {

  public static void main(String[] args) {

      ArrayList<String> result;
      File file = new File("src/test/java/executionTest/result.txt");
      file.setExecutable(true);
      file.setReadable(true);
      file.setWritable(true);

      try {
          FileWriter fw = new FileWriter(file);

          System.out.println("Calculator_ESTest");
          fw.write("Calculator_EXTest" + "\n");
          Calculator_EXTest executeCalculator = new Calculator_EXTest();
          result = executeCalculator.test0();
          fw.write(result.toString() + "\n");
          System.out.print("0, ");
          result = executeCalculator.test1();
          fw.write(result.toString() + "\n");
          System.out.print("1, ");
          result = executeCalculator.test2();
          fw.write(result.toString() + "\n");
          System.out.print("2, ");
          result = executeCalculator.test3();
          fw.write(result.toString() + "\n");
          System.out.print("3, ");
          result = executeCalculator.test4();
          fw.write(result.toString() + "\n");
          System.out.print("4, ");
          result = executeCalculator.test5();
          fw.write(result.toString() + "\n");
          System.out.print("5, ");
          result = executeCalculator.test6();
          fw.write(result.toString() + "\n");
          System.out.print("6, ");
          result = executeCalculator.test7();
          fw.write(result.toString() + "\n");
          System.out.print("7, ");
          result = executeCalculator.test8();
          fw.write(result.toString() + "\n");
          System.out.print("8, ");
          System.out.println();

          System.out.println("Executer_ESTest");
          fw.write("Executer_EXTest" + "\n");
          Executer_EXTest executeExecuter = new Executer_EXTest();
          result = executeExecuter.test0();
          fw.write(result.toString() + "\n");
          System.out.print("0, ");
          System.out.println();

          System.out.println("Formula_ESTest");
          fw.write("Formula_EXTest" + "\n");
          Formula_EXTest executeFormula = new Formula_EXTest();
          result = executeFormula.test0();
          fw.write(result.toString() + "\n");
          System.out.print("0, ");
          result = executeFormula.test1();
          fw.write(result.toString() + "\n");
          System.out.print("1, ");
          result = executeFormula.test2();
          fw.write(result.toString() + "\n");
          System.out.print("2, ");
          result = executeFormula.test3();
          fw.write(result.toString() + "\n");
          System.out.print("3, ");
          System.out.println();
          fw.close();
      } catch (IOException e) {
          e.printStackTrace();
      }
  }
}
