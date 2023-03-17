//************************************************
// File:        PalindromeDriver
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
// INPUT:  A string from the user containing a palindrome to be tested.
// 
// OUTPUT: A message to the console indicating the result of the test.
//*************************************************

package palindromeprogram;

import java.util.*;


public class PalindromeDriver
{

  public static void main(String[] args)
  {
    //**************************************************************
    // Method:        main
    // 
    // Parameters:    N/A. 
    //
    // Return Value:  N/A.
    //
    // 1) initialize an instance of the PalindromeTester class and
    //    toBeTested string variable.
    // 2) Prompt user for input.
    // 3) Store input in the toBeTested string variable.
    // 4) Perform a test using the PalindromeTester's
    //    palindromeTestBoolean method to determine whether or not
    //    the input string is a palindrome. 
    // 5) Indicate the results via the console.
    // 6) Perform a test using the PalindromeTester's 
    //    plaindromeTestString method to determine whether or not the
    //    input string is a palindrome.
    // 7) Indicate the results via the console. Note that this returns
    //    a pre-composed string from the called method itself. 
    //**************************************************************
    PalindromeTester tester = new PalindromeTester();
    String toBeTested = "";
    //initializing string and tester

    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a palindrome to test.");
    toBeTested = scan.nextLine();
    //scans the string to be tested from the user

    //prints result of boolean test to console.
    if (tester.palindromeTestBoolean(toBeTested) == true)
    {
      System.out.println("The boolean result was \"true.\"");
    }
    else
    {
      System.out.println("The boolean result was \"false.\"");
    }



    System.out.print(tester.palindromeTestString(toBeTested));
    //prints result of string test to console.


  }

}
