// ***************************************************************
//
// CS 172 Section M01
// Lab4.java
// Written By: Antonio Maldonado
// Date: February 23, 2017
// Purpose: To give considerable practice using loops
//
// ***************************************************************

import java.util.*;

public class Lab4 {
   public static void main(String args[]){
      
      //
      // Problem 1a - a for loop that will print the odd numbers from 1 to 99
      //
      
      System.out.println("\nThis is the output from problem 1a - for loop\n");
      
      for (int x = 1; x <= 99; x = x + 2){
         System.out.println(x);
      } // end for loop
      
     
      //
      // Problem 1b - a while loop that will print the odd number from 1 to 99
      //
      
      System.out.println("\nThis is the ouput from problem 1b - while loop\n");
      
      int x = 1;
      
      while (x <= 99) {
         System.out.println(x);
         x = x + 2;
      } // end while loop
      
      System.out.println();
      
      
      //
      // Problem 2a - a for loop that will input 10 int values and print the
      //             smallest value
      //
      
      System.out.println("This is the ouput from problem 2a - for loop\n");
      
      System.out.print("Enter 10 numbers: ");

      Scanner scan = new Scanner(System.in);
      int value;
      int minValue = Integer.MAX_VALUE;
      
      for (int i = 0; i < 10; i++){
         value = scan.nextInt();
         if(value < minValue) {
            minValue = value;
            
         } // end if
            
      } // end for
      
      System.out.println("Smallest value is: " + minValue);
      
      //
      // Problem 2b - a while loop that will input 10 int values and print the
      //             smallest value
      //
      
      System.out.println("\nThis is the ouput from problem 2b - while loop\n");
      
      int n;
      int smallValue = Integer.MAX_VALUE;
      int i = 0;
      
      while (i < 10){
         System.out.println("Enter an integer: ");
         n = scan.nextInt();
         
         if (n < smallValue) {
            smallValue = n;
            
         } // end if
         i++;
      } // end while
      
      System.out.println("The smallest integer is " + smallValue);
      
      //
      // Problem 3a - a for loop that will input a string and count the amount
      //             of each vowel in the string
      
      System.out.println("\nThis is the ouput from problem 3a - for loop\n");
      
      int a = 0, e = 0, y = 0;
      int o = 0, u = 0;
      String sentence;
      
      Scanner scnr = new Scanner(System.in);
      System.out.println("Type a sentence: ");
      sentence = scnr.nextLine();
      
      for (i = 0; i < sentence.length(); i++) {
         char c = sentence.charAt(i);
         
         if (c == 'a' || c == 'A')
            a++;
            
         else if (c == 'e' || c == 'E')
            e++;
         
         else if (c == 'i' || c == 'I')
            y++;
         
         else if (c == 'o' || c == 'O')
            o++;
            
         else if (c == 'u' || c == 'U')
            u++;
             
      } // end for
      
      System.out.println("a: " + a + "\n" +
      "e: " + e + "\n" +
      "i: " + y + "\n" + 
      "o: " + o + "\n" +
      "u: " + u + "\n");
      
      //
      // Problem 3b - a while loop that will input a string and count the amount
      //             of each vowel in the string
      
      System.out.println("\nThis is the ouput from problem 3b - while loop\n");
      
      int a1 = 0, e1 = 0, y1 = 0;
      int o1 = 0, u1 = 0;
      int t = 0;
      String sentence2;
         
      System.out.println("Type another sentence: ");
      sentence2 = scnr.nextLine();
      
      while (t < sentence2.length()){
         char c1 = sentence2.charAt(t);
            t++;
            
         if (c1 == 'a' || c1 == 'A')
            a1++;
         
         else if (c1 == 'e' || c1 == 'E')
            e1++;
         
         else if (c1 == 'i' || c1 == 'I')
            y1++;
            
         else if (c1 == 'o' || c1 == 'O')
            o1++;
         
         else if (c1 == 'u' || c1 == 'U')
            u1++;
      
      } // end while 
           
      System.out.println("a: " + a1 + "\n" +
      "e: " + e1 + "\n" +
      "i: " + y1 + "\n" + 
      "o: " + o1 + "\n" +
      "u: " + u1 + "\n");

      
   } // end main
} // end class   