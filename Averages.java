//****************************************************************************
//
// CS 172 Section M01
// Averages.java
// Written By: Antonio Maldonado
// Date: March 08, 2017
// Purpose: This program will allow a user to input their name, n exam scores,
//          and will calculate the average of the n exam scores
// Input: User's name and the exam scores for which they want the average for
// Output: User's name and the average
//
//****************************************************************************

import java.util.*;

public class Averages {
   public static void main(String args[]) {
      
      Scanner scan = new Scanner(System.in);
      int sum = 0;
      int count = 0;
      String name = "";
      int ex1 = 0;
      int ex2 = 0;
      int ex3 = 0;
      
      System.out.println("Enter your name: ");
      name = scan.nextLine();
      
      System.out.println("Enter exam scores, seperated by space (enter when done): ");
      ex1 = scan.nextInt();
      ex2 = scan.nextInt();
      ex3 = scan.nextInt();
      
      sum = ex1 + ex2 + ex3;
      
      System.out.print(ex1 + " " + ex2 + " " + ex3);
   }
}