/*****************************************************************************************************

-CS 172 Section M01
-Lab7Test.java
-Written By: Antonio Maldonado
-Date: April 06, 2017
-Purpose: This program will test methods written in a different class by calling them
-Input: A variety of user inputs for each method call
-Output: Results from methods called

 *****************************************************************************************************/

import java.util.Scanner;

public class Lab7Test{
   public static void main(String args[]){
      
      Scanner scan = new Scanner(System.in);
      
      
      // Testing method printOddNumbers
      
      System.out.println("**TEST CALLING METHOD printOddNumbers:");
      System.out.println();
      
      // Test call #1
      System.out.println("Testing with parameter 100...");
      Lab7Methods.printOddNumbers(100);
      System.out.println();
      
      // Test call #2
      System.out.println("Testing with parameter 50...");
      Lab7Methods.printOddNumbers(50);
      System.out.println();
      
      
      
      
      
      //Testing method countNumbers
      
      System.out.println("\n**TEST CALLING METHOD countNumbers:");
      
      // Test call #1
      
      int test[] = new int[10];
      int testNum;
      int numCount = 0;
      
      System.out.println();
      System.out.println("Testing with user input parameters...");
      
      for(int x = 0; x < test.length; x++){
         System.out.println("Enter an integer:");
         test[x] = scan.nextInt();
      } // end for loop
      
      System.out.println("Type a number to look for:");
      testNum = scan.nextInt();
      
      numCount = Lab7Methods.countNumbers(test,testNum);
      
      System.out.println("\n" + testNum + " is found in the array " + numCount + " times.");
      
      // Test call #2
      
      int test2[] = {1,2,3,4,5,6,7,8,9,0};
      int testNum2 = 3;
      int numCount2 = 0;
      
      System.out.println("\nTesting with parameters (1,2,3,4,5,6,7,8,9,0), searching for '3':");
      
      numCount2 = Lab7Methods.countNumbers(test2,testNum2);
      
      System.out.println("\n" + testNum2 + " is found in the array " + numCount2 + " times.");
      
      
      
      
      
      // Testing method formatName 
      
      System.out.println("\n**TEST CALLING METHOD formatName");
      
      // Test call #1 - user input
      scan.nextLine();
      
      String usrName = "";
      
      System.out.println("\nFirst test with user input...");   
      System.out.println("\nEnter your first and last name:");
      usrName = scan.nextLine();
      
      String c = Lab7Methods.formatName(usrName);
      System.out.println("\nThe newly formatted string is:" + c);
      
      // Test call #2 - fixed string
      
      System.out.println("\nSecond test with fixed string 'First Last'...");
      
      String testName = "First Last";
      
      String a = Lab7Methods.formatName(testName);
      System.out.println("\nThe newly formatted string is:" + a);
      
      
      
      
      
      // Testing method hasLower
      
      System.out.println("\n**TEST CALLING METHOD hasLower:");
      
      // Test call #1 - user input
      
      String userString = "";
      
      System.out.println("\nFirst test with user input...");  
      System.out.println("Enter a short sentence or word:");
      userString = scan.nextLine();
      
      boolean testNum1 = Lab7Methods.hasLower(userString);
      System.out.println("\nThe user inputted string has lowercase letters:" + testNum1);
      
      // Test call #2 - fixed uppercase string
      
      String testString = "HELLO GRADER, I HOPE YOU FIND NOTHING WRONG WITH THIS CODE";
      
      System.out.println("\nSecond test with fixed input..."); 
      
      boolean testNumber2 = Lab7Methods.hasLower(testString);
      System.out.println("\nThe fixed uppercase string '" + testString + "' has lowercase letters:" + testNumber2);
      
      // Test call #3 - fixed lowercase string
      
      String testString1 = "anything wrong yet? I hope not";
      
      System.out.println("\nThird test with fixed input..."); 
      
      boolean testNum3 = Lab7Methods.hasLower(testString1);
      System.out.println("\nThe fixed lowercase string '" + testString1 + "' has lowercase letters:" + testNum3);
      
      
      
      // Testing method gradeTable
      
      System.out.println("\n**TEST CALLING METHOD gradeTable:");
      
      // Test call #1 - user inputted grades
      
      System.out.println("\nFirst test with user inputted grades..."); 
      
      int numGrades;
      
      System.out.println("How many grades to enter?");
      numGrades = scan.nextInt();
      
      float gradeArray[] = new float[numGrades];
      
      System.out.println("Enter grades in format ##.##");
      for (int x = 0; x < gradeArray.length; x++){
         System.out.println("Enter grades:");
         gradeArray[x] = scan.nextFloat();
      }
      
      int gradeTest[] = Lab7Methods.gradeTable(gradeArray);
      
      System.out.println("\nThe result is:");
      System.out.println(gradeTest[0] + " number of A's\n" + gradeTest[1] + " number of B's\n"
      + gradeTest[2] + " number of C's\n" + gradeTest[3] + " number of D's\n" + gradeTest[4] + " number of F's");
      
      // Test call #2 - fixed inputted grades
      
      System.out.println("\nSecond test with fixed inputted grades(69.10, 70.30, 99.69, 84.50, 21.04)...");
      
      float gradeArray2[] = {69.10f, 70.30f, 99.69f, 84.50f, 21.04f};
      
      int gradeTest1[] = Lab7Methods.gradeTable(gradeArray2);
       
      System.out.println("\nThe result is:");
      System.out.println(gradeTest1[0] + " number of A's\n" + gradeTest1[1] + " number of B's\n"
      + gradeTest1[2] + " number of C's\n" + gradeTest1[3] + " number of D's\n" + gradeTest1[4] + " number of F's");
      

      
      
   } //end main
} // end class