package wordreverser;
/*Author: Tyler Hryko
 * Date: 1/17/2016
 * File: Reverser.java
 * 
 * Problem Description: 
 * Design and implement an application that reads a sentence from
   the user and prints the sentence with the characters of each
   word backwards. Use a stack to reverse the characters of each
   word.
 * 
 * INPUTS: a string from the user, via the Scanner utility.
 * 
 * OUTPUTS: that string, with the words individually reversed and reassembled. 
 * 
 */
import java.util.Scanner;
import java.util.Stack;


public class Reverser
{
  public static void main(String[] args)
  {

    
    Scanner scan = new Scanner(System.in);
    //initialize scanner
    
    System.out.println("Please enter a sentence to be reversed.");
    //prompts user for input
    
    String sentence = scan.nextLine();
    //scans line user types
    
    String[] words = sentence.split(" ");
    //splits the sentence on spaces to seperate the words for reversal,
    //then forms an array out of the result

    for (int i = 0; i < words.length; i++)
      //crawls the length of the array
    {
      String word = words[i];
      //initializes the word string at array index
      System.out.print(wordReverse(word));
      if (i != words.length - 1)
        //runs the loop as long as it's not the last word
      {
        System.out.print(" ");
        //puts a space between each word
      }

    }
  }

  public static String wordReverse(String sentence)
  {
    Stack<Character> reversed = new Stack();
    //initializes a stack to store the characters from the words
    for (int j = 0; j < sentence.length(); j++)
    {
      reversed.push(sentence.charAt(j));
      //pushes the characters into the stack
    }
    String output = " ";
    while (reversed.size() != 0)
      //as long as the stack size isn't 0, it continues to pop
    {
      output += reversed.pop();
      //pops from stack
    }
    sentence = output;
    return sentence;
  }
}
