package testing;

/*Author: Tyler Hryko
 * Date: 1/17/2016
 * File: Model.java
 * 
 * Problem Description: 
 * Create a package "testing" that will contain  JUnit tests of your ArrayListStack implementation.
 * 
 * INPUTS: N/A
 * OUTPUTS: If the ArrayListStack is faulty, it will print a string and flag it as a fail in Junit.
 * The test relies on all methods to pass, and given that it passes, there should be no faulty 
 * methods in either program.
 * 
 */
import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;

import jsjf.ArrayStack;
import wordreverser.ArrayListStack;


public class ALSTest
{
  ArrayStack<String> stack;

  @Test
  public void evaluateReversal()
  {
    stack = new ArrayStack<String>();
    //initializes ArrayStack
    ArrayListStack test = new ArrayListStack();
    //initializes ArrayListStack
    String teststring = " tseT";
    String sentence = "Test";
    String str = "" + test.wordReverse(sentence);
    System.out.println(test.wordReverse(sentence));
    stack.push(str);
    if (Objects.equals(test.wordReverse(sentence), teststring))
      //if the output is the same as the expected result, it bypasses the fail flag
      //and prints a pass indicator to the terminal.
    {
      System.out.println("<<<<<<Pass!>>>>>>");
    }
    else
      fail("Your strings do not match. There is a faliure in"
           + "the ArrayListStack.");
  }

  public void popStack()
  {
    stack.pop();
  }

  public int getSize()
  {
    return stack.size();
  }

  public List<String> getList()
  {
    ArrayList<String> list = new ArrayList<String>();
    while (!stack.isEmpty())
    {
      list.add(stack.pop());
    }
    Collections.reverse(list);

    for (int pos = 0; pos < list.size(); pos++)
    {
      stack.push(list.get(pos));
    }
    Collections.reverse(list);

    return list;
  }

}
