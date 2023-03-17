//************************************************
// File:        PalindromeTester
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
// INPUT:  A string from the driver class.
// 
// OUTPUT: A result indicating whether or not the string is a palindrome,
// in either string or boolean format depending on the method called.
//*************************************************

package palindromeprogram;

import java.util.*;


public class PalindromeTester
{

  boolean isPalindrome = true;

  //**************************************************************
  // Method:        palidromeTestString()  
  // 
  // Parameters:    A string containing a potential palindrome
  //
  // Return Value:  A string containing the result of the palindrome
  //                test.
  //
  // 1) remove punctuation from input string and convert to lower-
  //    case letters.
  // 2) Send string to palindromeCheck method for evaulating and
  //    Apply boolean result of palindromeCheck.
  // 3) Return appropriate string for boolean result indicated.
  //**************************************************************
  public String palindromeTestString(String toBeTested)
  {
    String result = "";
    //strips out all punctuation from the string and changes the
    //characters to lowercase. This allows for strings with 
    //punctuation or uppercase characters to be read correctly.
    toBeTested = toBeTested.toLowerCase().replaceAll("\\W", "");

    //Calls on palindromeCheck method to test the potential palindrome
    //and return a boolean result.
    isPalindrome = palindromeCheck(toBeTested, isPalindrome);

    //loop simply changes the content of the result string
    //depending on whether or not the boolean ispalindrome is 
    //set to true or false.
    if (isPalindrome == true)
    {
      result = "Your string is a palindrome.";
    }
    else
    {
      result = "Your string is not a palindrome.";
    }

    return result;
  }


  //**************************************************************
  // Method:        palidromeTestBoolean()  
  // 
  // Parameters:    A string containing a potential palindrome
  //
  // Return Value:  A boolean indicating whether or not the string
  //                is a palindrome.
  //
  // 1) remove punctuation from input string and convert to lower-
  //    case letters.
  // 2) Send string to palindromeCheck method for evaulating and
  //    Apply boolean result of palindromeCheck.
  // 3) Return boolean result indicated.
  //**************************************************************
  public boolean palindromeTestBoolean(String toBeTested)
  {
    toBeTested = toBeTested.toLowerCase().replaceAll("\\W", "");
    isPalindrome = palindromeCheck(toBeTested, isPalindrome);
    return isPalindrome;
  }


  //**************************************************************
  // Method:        palidromeCheck()  
  // 
  // Parameters:    A string containing a potential palindrome
  //
  // Return Value:  A boolean indicating whether or not the string
  //                is a palindrome.
  //
  // 1) Accept string parameter from other classes
  // 2) Initialize a stack and queue and individually push/add the
  //    characters of the supplied string parameter to them.
  // 3) Incrementally remove/pop characters from the queue and stack
  //    and compare them to each other. 
  // 4a)If they are dissimilar, immediately stop comparing and flag
  //    the boolean result as false. 
  // 4b)If similar, continue comparing until there are no more 
  //    characters. No change to the boolean.
  //**************************************************************
  private boolean palindromeCheck(String toBeTested, Boolean isPalindrome)
  {
    String charToCheck = "";

    //initializes a queue interface via LinkedList 
    Queue<String> checkerQueue = new LinkedList<String>();

    //initializes a stack
    Stack<String> checkerStack = new Stack<String>();

    //while the index counter is less than the number of characters
    //in the string being tested, the loop pushes the character at the
    //index position to the stack and adds it to the queue simultaneously 
    for (int index = 0; index < toBeTested.length(); index++)
    {
      charToCheck = "" + toBeTested.charAt(index);
      checkerStack.push(charToCheck);
      checkerQueue.add(charToCheck);
    }

    //as long as the stack has something in it, the while loop runs. 
    while (!checkerStack.isEmpty())
    {
      //pops an element from the stack and removes an element from the queue.
      //if they're not the same, it sets the isPalindrome boolean to false. 
      if (!checkerStack.pop().equals(checkerQueue.remove()))
      {
        isPalindrome = false;
      }

    }
    //returns the result as a boolean.
    return isPalindrome;
  }
}

