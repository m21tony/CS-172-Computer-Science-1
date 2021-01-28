//***************************************************************************
// ComputingChange.java
// CS 172 - section m01
// Written by Antonio Maldonado
// Date written: January 31,2017
// Purpose: This porgram calculates the number of bills needed to give change
// Input: Amount of change to give in dollars
// Output: Number of bills (twenties, tens, finves, and ones)
//***************************************************************************

import java.util.Scanner;

public class ComputingChange {
   public static void main(String[] args) {
      // Declare variables
      int amountToChange = 0;
      int numTwenties    = 0;
      int numTens        = 0;
      int numFives       = 0;
      int numOnes        = 0;
     
      // Add a scanner (for inputs)
      Scanner scan= new Scanner(System.in);
      
      // Prompt for input from user
      System.out.println("Enter the amount of money you need change for: ");
      amountToChange = scan.nextInt();
      
      // Calculations
      numTwenties = amountToChange / 20;
      numTens     = amountToChange / 10;
      numFives    = amountToChange / 5;
      numOnes     = amountToChange / 1;
      
      // Print outputs
      System.out.print("numTwenties: ");
      System.out.println(numTwenties);
      System.out.print("numTens: ");
      System.out.println(numTens);
      System.out.print("numFives: ");
      System.out.println(numFives);
      System.out.print("numOnes: ");
      System.out.println(numOnes);
      
      
     return;
     
   } //end main
} //end class