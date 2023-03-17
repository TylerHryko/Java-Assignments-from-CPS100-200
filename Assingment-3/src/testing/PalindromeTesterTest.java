//************************************************
// File:        PalindromeTesterTest
// Author:      Tyler Hryko
// Date:        Feb. 1st, 2016
// Course:      CPS 101
// 
// PROBLEM STATEMENT: Create a system using a stack and a queue
// to test whether a given string is a palindrome (i.e., the characters 
// read the same forward or backward).
//
// ADDENDUM TO PROBLEM:
// Be sure that the following strings are considered valid palindromes: 
// "Aha", "Ah HA!", and "Dammit, I'm mad!".
//
// create a package "testing" that will contain  JUnit tests for all classes
// that you develop/modify to solve this problem (except for the Driver class).
// 
// INPUT:  N/A, all variables are self-declared.
// 
// OUTPUT: Junit test results indicating whether or not each method behaves 
// according to its' predetermined expectations.
//*************************************************
package testing;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PalindromeTesterTest
{

  boolean isPalindrome = true;

  @Before
  public void setUp() throws Exception
  {

  }

  @After
  public void tearDown() throws Exception
  {
  }

  @Test
  public void testPalindromeTestString()
  {
    String toBeTested = "RaDa r!";
    toBeTested = toBeTested.toLowerCase().replaceAll("\\W", "");
    //strips out all punctuation from the string and changes the
    //characters to lowercase. This allows for strings with 
    //punctuation or uppercase characters to be read correctly.

    String result = "";
    if (isPalindrome == true)
    {
      result = "True!";
    }
    else
    {
      result = "False!";
    }
    assertEquals(result, "True!");
    assertEquals(toBeTested, "radar");
  }
  
  @Test
  public void testPalindromeTestBoolean()
  {
    isPalindrome = false;
    assertEquals(isPalindrome, false);
  }
  
  
  @Test
  public void testPalindromeCheck()
  {
    String toBeTested = "radar";
    String charToCheck = "";
    Queue<String> checkerQueue = new LinkedList<String>();
    //initializes a queue interface via LinkedList 

    Stack<String> checkerStack = new Stack<String>();
    //initializes a stack

    for (int index = 0; index < toBeTested.length(); index++)
    {
      charToCheck = "" + toBeTested.charAt(index);
      checkerStack.push(charToCheck);
      checkerQueue.add(charToCheck);
    }
    //while the index counter is less than the number of characters
    //in the string being tested, the loop pushes the character at the
    //index position to the stack and adds it to the queue simultaneously 

    while (!checkerStack.isEmpty())
    //as long as the stack has something in it, the loop runs. 
    {
      if (!checkerStack.pop().equals(checkerQueue.remove()))
      {
        isPalindrome = false;
      }
      //pops an element from the stack and removes an element from the queue.
      //if they're the same, it sets the ispalindrome boolean to false. 
    }
    assertEquals(isPalindrome, true);
  }

}
