/*
CS 172 Section M01
Lab6.java
Written By: Antonio Maldonado
Date: March 14, 2017
Purpose: This program will solve two problems that deal with arrays
Input: For problem 1, input is 20 string words and a letter from the user.
       For problem 2, input is 100 random numbers between 1 and 1000.
Output: Output for problem 1 is all the words that contain
*/

import java.util.*;

public class Lab6{
   public static void main(String args[]){
   
      System.out.println("Problem 1");
      
      // Declaring variables
      Scanner scan = new Scanner(System.in);
      char userChar;
      boolean has = false;
      int sum = 0;
      float average = 0;
      int min = 0;
      int max = 0;
      String userLetter;
      int i;
      String words[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
                        "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
      
      // Input letter from user
      System.out.println("Type a letter: ");
      userLetter = scan.nextLine();
      userChar = userLetter.toLowerCase().charAt(0);
      
      while(userChar < 'a' || userChar > 'z'){
         System.out.println("Type a letter: ");
         userLetter = scan.nextLine();
         userChar = userLetter.toLowerCase().charAt(0);
      }
      
      // Check if elements contain letter
      for(i = 0; i < words.length; i++){
         if(words[i].indexOf(userChar) != -1){
            System.out.println(words[i]);
            has = true;
         }
      }
      if(has == false)
         System.out.println("No elements contain the letter.");  
         
      System.out.println();
      
      //Problem 2
      System.out.println("Problem 2");
      
      int array[] = new int[100];
      
      for(i = 0; i < 100; i++){
         array[i]= (int)(Math.random()*1000)+1;
      }
         
      for(i = 0; i < 100; i++){
         System.out.printf("%4d",array[i]);
         if((i+1)%10==0)
            System.out.println();
      }
      
      min = array[0];
      max = array[0];
      sum = array[0];
      
      for(i = 1; i < 100; i++){
         sum = sum + array[i];
         if(array[i] < min){
            min = array[i];
         }
         if(array[i] > max){
            max = array[i];
         }
      }
      
      average = (float) sum / array.length;
      System.out.println("The avg is: " + average);
      System.out.println("The min is: " + min);
      System.out.println("The max is: " + max);
      
   } // end main
}// end class