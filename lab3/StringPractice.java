// ***********************************************************************
// CS 172 Section M01
// StringPractice.java
// Written By: Antonio Maldonado
// February 07, 2017
// Purpose: This program will allow the user to input a string then output
//    the 1) length of the string, 2) first word of the string, 3) string
//    in all uppecase letters, 4) string in all lowercase letters, 5) string
//    will all 'n' characters changed to 'm', 6) location of the first 'a',
//    7) last character of the string, 8) and the first 8 letters of the 
//    string if longer than 8 letters, otherwise the entire string.
// Input: A string from the user
// Output: The 1) length of the string, 2) first word of the string, 3) string
//    in all uppecase letters, 4) string in all lowercase letters, 5) string
//    will all 'n' characters changed to 'm', 6) location of the first 'a',
//    7) last character of the string, 8) and the first 8 letters of the 
//    string if longer than 8 letters, otherwise the entire string.
// ***********************************************************************

import java.util.Scanner;

public class StringPractice {
   public static void main(String args[]){
   
      // Declare Variables
      Scanner scan = new Scanner(System.in);
      String input;
      
      // Get input from user
      System.out.println("Type something here with at least two words: ");
      input = scan.nextLine();
      
      // Outputs
      System.out.println("The length of the string is " + input.length() + ".");
      System.out.println("The string in all uppercase is " + input.toUpperCase() + ".");
      System.out.println("The string in all lowercase is " + input.toLowerCase() + ".");
      System.out.println("The string with all 'n' characters (if any) changed to 'm' is " + input.replace('n','m') + ".");
      System.out.println("The location of the first 'a' (if any) in the string is " + input.indexOf('a') + ".");
      System.out.println(" (A '-1' means there are no 'a' characters in the string.)");
      System.out.println("The last character in the string is " + input.charAt(input.length()-1) + ".");
      
      if((input.length()) >= 8)
         System.out.println(input.substring(0,9));
         else if((input.length()) < 8)
            System.out.println(input);
      
      
   } // end main
} // end class