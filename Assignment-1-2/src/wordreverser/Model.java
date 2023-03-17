package wordreverser;
/*Author: Tyler Hryko, modified from Frantisek Niscak's original
 * Date: 1/17/2016
 * File: Model.java
 * 
 * Problem Description: 
 * Demonstrate that your ArrayListStack class works by using it in PROBLEM 1.
 * Use JavaFX to create GUI that demonstrates that your ArrayListStack works.
 * 
 * INPUTS: Clicks on the graphical interface by the user
 * 
 * OUTPUTS: One of two strings. Which one appears is based on a random number 
 * generator. 1 in 2 odds of either showing up.  
 */
import jsjf.*;
import jsjf.exceptions.*;
import java.util.*;


public class Model
{
  ArrayStack<String> stack;

  public Model()
  {
    stack = new ArrayStack<String>();
  }

  public void pushStack()
  {
    ArrayListStack als = new ArrayListStack();
    String sentence = "";
    Random randomGenerator = new Random();
    int rando = randomGenerator.nextInt(2)+1;
    if(rando > 1)
    {
      sentence = "It's a two!";
    }
    else
    {
      sentence = "It's a one!";
    }
    als.wordReverse(sentence);
    String str = "" + als.wordReverse(sentence);
    
    stack.push(str);
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
    while( !stack.isEmpty())
    {
       list.add(stack.pop());
    }
    Collections.reverse(list);
    
    for(int pos = 0; pos < list.size(); pos++)
    {
      stack.push(list.get(pos));
    }
    Collections.reverse(list);

    return list;
  }
}