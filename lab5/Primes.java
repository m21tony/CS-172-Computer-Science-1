// *******************************************************************************
//
// CS 172 Section M01
// Primes.java
// Written by: Antonio Maldonado
// Date: March 09, 2017
// Purpose: This program will print all the prime numbers that are less than 1000
// Output: The prime numbers from 2 to 1000, 10 numbers per lin
//
// *******************************************************************************

import java.util.*;

public class Primes {
   public static void main(String args[]) {
      
      Scanner scan = new Scanner(System.in);
      int f = 2;
      int n;
      int count =0;
      boolean isPrime = true;
      
      for( n = 2; n < 1000; n++){
         isPrime = true;
         f= 2;
         while ((isPrime) && (f <= Math.sqrt(n))){
            if (n % f == 0) 
               isPrime = false;
            f++;  
         }
         
         if (isPrime){
            count++;
            System.out.print(n+" ");
            
            if(count%10 ==0)
               System.out.println("");
         }
     }
   }
}