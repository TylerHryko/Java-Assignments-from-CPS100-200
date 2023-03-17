package wordreverser;

import java.util.*;
import jsjf.*;
/*Author: Tyler Hryko
 * Date: 1/17/2016
 * File: ArrayListStack.java
 * 
 * Problem Description: 
 * Develop a new implementation of StackADT using java ArrayList class from Java API. 
 * The new class should be called ArrayListStack and it should fully implement the 
 * StackADT interface.
 * 
 * INPUTS: a string from an external class. 
 * 
 * OUTPUTS: that string, with the words individually reversed and reassembled. 
 * 
 */


public class ArrayListStack<E> implements StackADT<E>
{
  private java.util.List<E> list = new java.util.ArrayList<E>();

  public boolean isEmpty()
  {
    return this.list.isEmpty();
    //if empty, it returns the isEmpty boolean as true. 

  }

  public E peek()
  {
    return this.list.get(this.list.size() - 1);
    //returns the top of the stack via the list.
  }

  public E pop()
  {
    return this.list.remove(this.list.size() - 1);
    //pops the top of the stack, removes the top from the list.
  }

  public void push(E elem)
  {
    this.list.add(elem);
    //pushes an element into the stack, adds it to the list.
  }

  public int size()
  {
    return this.list.size();
    //returns the size of the list (and thereby the stack)
  }

  public static void main(String[] args)
  {
    String sentence = "";
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
    StackADT<Character> reversed = new ArrayListStack<Character>();
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
    return output;
  }
}
