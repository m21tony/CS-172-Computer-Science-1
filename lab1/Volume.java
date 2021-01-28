//*****************************************************************
//Volume.java
//Print the volume of a cylinder with given its height and diameter
//*****************************************************************
import java.util.Scanner;

public class Volume {
   public static void main(String[] args) {
   Scanner scnr = new Scanner(System.in);
      
      double height;
      System.out.println( "Enter the height (in)" );
      height = scnr.nextDouble();
     
      double diameter;
      System.out.println( "Enter the diameter (in)" );
      diameter = scnr.nextDouble();
      
      double volume = Math.PI * ((diameter/2) * (diameter/2)) * height;
      
      System.out.println( "The height is " + height + " inches, and the diameter is " + diameter + " inches." );
      System.out.println( "The volume is " + volume + " cubic inches." );
      
   } // end main
} // end class