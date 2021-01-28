/*****************************************************************************************************

-CS 172 Section M01
-Lab7Methods.java
-Written By: Antonio Maldonado
-Date: April 06, 2017
-Purpose: To give us significant practice writing methods

******************************************************************************************************/

public class Lab7Methods{
   
   
   public static void printOddNumbers(int max){
      
      // this method returns the odd numbers less than or equal to 'max'
      
      int n = 1;
      int count = 0;
      
      while (n <= max){
         System.out.printf("%5d", n); // prints the number in the field of 5
         n = n + 2;
         count++;
         System.out.print((count % 10 == 0) ? "\n" : "");
      } // end while loop
      
      return;
      
   } // end printOddNumbers method
   
   
   
   
   
   public static int countNumbers(int data[], int num){
      
      // this method returns the amount of times 'num' is found in the 'data' array
      
      int count1 = 0;
      
      for (int i = 0; i < data.length; i++){
         if (data[i] == num)
            count1++;
      } // end for loop
      
      return count1;
      
   } // end countNumbers method
   
   
   
   
   
   public static String formatName(String name){
   
      // this method creates and returns new string format of 'name'
      
      String newStr = "";
      int space = name.indexOf(' ');
      
      newStr = name.substring(space, name.length())+", " + name.substring(0,space);
      
      return newStr;
            
   } // end formatName method
   
   
   
   
   
   public static boolean hasLower(String text){
      
      // this method checks 'text' for lowercase letters and returns true if there are any, otherwise false
      
      for (int i = 0; i < text.length(); i++){
         if ('a' <= text.charAt(i) && text.charAt(i) <= 'z')
            return true;
      } // end for loop
      
      return false;
      
   } // end hasLower method
   
   
   
   
   
   public static int[] gradeTable(float scores[]){
      
      // this method returns an array list with 5 elements stating how many students received each letter grade
      
      int grades[] = {0, 0, 0, 0, 0};
      
      for (int i = 0; i < scores.length; i++){
         if(scores[i] >= 0.0 && scores[i] < 60.0)
            grades[4]++;
            
         else if (scores[i] >= 60.0 && scores[i] < 70.0)
            grades[3]++;
            
         else if (scores[i] >= 70.0 && scores[i] < 80.0)
            grades[2]++;
         
         else if (scores[i] >= 80.0 && scores[i] < 90.0)
            grades[1]++;
         
         else if (scores[i] >= 90.0 && scores[i] <= 100.0)
            grades[0]++;
      } // end for loop
      
      return grades;

   } // end method gradeTable
   
   
} // end class