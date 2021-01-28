/********************************************************************************

-CS 172 Section M01
-Lab9.java
-Written By: Antonio Maldonado
-Date: April 27, 2017
-Purpose: To give practice writing recursive methods

********************************************************************************/

public class Lab9{

   public static void printLettersForward (char c){
      
      // error case
      if ((c < 'a' && c > 'Z') || (c < 'A' || c > 'z'))
         return;
         
      // recursive step
      if (c != 'a' || c != 'A')
         printLettersForward((char) (c-1));
         else 
            System.out.println();
      
      System.out.print(c);
      
   } // end printLettersForward
   
   
   
   
   public static void printLettersBackward (char c){
      
      // error case
      if ((c < 'a' && c > 'Z') || (c < 'A' || c > 'z'))
         return;
         
      System.out.print(c);
      
      // recursive step 
      if (c != 'a' || c != 'A')
         printLettersBackward ((char) (c-1));
         
   }// end printLettersBackward
   
   
   
   
   public static void triangle (int n){
   
      // error case
      if (n == 0)
         return;
         
      // recursive step
      triangle(n-1);
      
      for (int stars = 1; stars <= n; stars++)
         System.out.print("*");
         
      System.out.println();
      
   }// end triangle
   
   
   
   
   public static double powerOfTen (int n){
      
      // base case
      if (n == 0)
         return 1;
      
      // recursive step
      if (n > 0)
         return (10 * powerOfTen(n - 1));
         else
            return (0.1 * powerOfTen(n+1));
            
   }// end powerOfTen
   
   
   
   
   public static void main (String args[]){
      
      // testing printLettersForward
      System.out.println("Testing printLettersFoward with 'F'");
      printLettersForward('F');
      
      System.out.println();
      
      System.out.println("Testing with 'i'");
      printLettersForward('i');
      
      System.out.println();
      
      System.out.println("Testing with '.'");
      printLettersForward('.');
      
      System.out.println();
      
      // testing printLettersBackward
      System.out.println("Testing printLettersBackward with 'H'");
      printLettersBackward('H');
      
      System.out.println();
      
      System.out.println("Testing with 'm'");
      printLettersBackward('m');
      
      System.out.println();
      
      System.out.println("Testing with '*'");
      printLettersBackward('*');
      
      System.out.println();
      
      // testing triangle
      System.out.println("Testing triangle with 6, 3, and 1 lines:");
      triangle(6);
      System.out.println();
      
      triangle(3);
      System.out.println();
      
      triangle(1);
      System.out.println();
      
      //testing powerOfTen
      System.out.println("Testing powerOfTen with 2, 5, -2 and -5:");
      
      System.out.println(powerOfTen(2));
      System.out.println();
      
      System.out.println(powerOfTen(5));
      System.out.println();
      
      System.out.println(powerOfTen(-2));
      System.out.println();
      
      System.out.println(powerOfTen(-5));
      System.out.println();
    
   
   }//end main
   
}// end class   