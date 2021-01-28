//***************************************************************************
// ChangeWithCoins.java
// CS 172 - section m01
// Written by Antonio Maldonado
// Date written: January 31,2017
// Purpose: This porgram will allow the user to enter an amount of change to
//  give in dollars and cents.
//  The program will calculate the number of bills (twenties, tens, fives,
//  and ones) and the number of coins (quarters, dimes, nickels, and pennies)
// Input: Amount of change to give
// Output: Number of bills (twenties, tens, finves, and ones)and number of
//  cents (quarters, dimes, nickels, and pennies)
//***************************************************************************

import java.util.Scanner;

public class ChangeWithCoins {
   public static void main(String[] args) {
   
      // Declare variables
      double amountToChange = 0;
      int numTwenties       = 0;
      int numTens           = 0;
      int numFives          = 0;
      int numOnes           = 0;
      int numQuarters       = 0;
      int numDimes          = 0;
      int numNickels        = 0;  
      int numPennies        = 0;  
      int residual          = 0;
      int decimal           = 0;
     
      // Add a scanner (for inputs)
      Scanner scan= new Scanner(System.in);
      
      // Prompt for input from user
      System.out.println("Enter the amount of money you need change for: ");
      amountToChange = scan.nextDouble();
      
      residual       = (int)amountToChange;
      decimal        = (int)((amountToChange*100)%100);
      
      // Calculations
      // Add (int) in beginning of calculation to convert from double to int
      numTwenties = (int) residual /  20;
      residual    = residual % 20;
      
      numTens     = (int) residual /  10;
      residual    = residual % 10;
      
      numFives    = (int) residual /   5;
      residual    = residual % 5;
      
      numOnes     = (int) residual /   1;
      residual    = residual % 1;
      
      numQuarters = (int) (decimal /25);
      decimal     = decimal % 25;
      
      numDimes    = (int) (decimal / 10);
      decimal     = decimal % 10;
      
      numNickels  = (int) (decimal / 5);
      decimal     = decimal % 5;
      
      numPennies  = (int) (decimal / 1);
      decimal     = decimal % 1;
      
      // Print statements for outputs
      System.out.print("numTwenties: ");
      System.out.println(numTwenties);
      
      System.out.print("numTens: ");
      System.out.println(numTens);
      
      System.out.print("numFives: ");
      System.out.println(numFives);
      
      System.out.print("numOnes: ");
      System.out.println(numOnes);
      
      System.out.print("numQuarters: ");
      System.out.println(numQuarters);
      
      System.out.print("numDimes: ");
      System.out.println(numDimes);
      
      System.out.print("numNickels: ");
      System.out.println(numNickels);
      
      System.out.print("numPennies: ");
      System.out.println(numPennies);
      
      
      
     return;
     
   } //end main
} //end class