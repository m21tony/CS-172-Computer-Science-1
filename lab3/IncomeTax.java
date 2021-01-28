// ****************************************************************
// CS 172 Section M01
// IncomeTax.java
// Written By: Antonio Maldonado
// February 07, 2017
// Purpose: This program will allow the user to input their annual
//    salary and will calculate their tax rate and the amount of
//    tax they have to pay
// Input: Annual salary
// Output: Annual salary, tax rate, and tax to pay
// ****************************************************************

import java.util.Scanner;

public class IncomeTax {
   public static void main(String [] args){
   
      // Declare variables
      Scanner scan = new Scanner(System.in);
      int annualSalary = 0;
      double taxRate   = 0.0;
      int taxToPay     = 0;
      
      // Input from user
      System.out.println("Enter annual salary: ");
      annualSalary = scan.nextInt();
      
      // Error message if user input is <= 0
      if (annualSalary <= 0)
         System.out.println("ERROR: Enter value above 0.");
      
      // Determine the tax rate from the annual salary
      if (annualSalary <= 20000)
         taxRate = 0.10;
         else if (annualSalary <= 50000)
            taxRate = 0.20;
            else if (annualSalary <= 100000)
               taxRate = 0.30;
               else
                  taxRate = 0.40;
      
      // Calculations and outputs
      taxToPay = (int)(annualSalary * taxRate);
      System.out.println("Annual salary: " + annualSalary);
      System.out.println("Tax rate: " + taxRate);
      System.out.println("Tax to pay: " + taxToPay);
      
      return;
      
   } // end main
} // end class