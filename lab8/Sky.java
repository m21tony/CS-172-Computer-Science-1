/**************************************************************************
-CS 172 Section MO1
-Sky.java
-Written By: Antonio Maldonado
-Date: April 18, 2017
-Purpose: This program will draw 10 five pointed stars randomly scattered
          across the window
**************************************************************************/

import java.awt.*;
import javax.swing.JApplet;

public class Sky extends JApplet{

   public void fillStar(Graphics g, int x, int y, int size){
   
      int xCoords[] = new int[10];
      int yCoords[] = new int[10];
      
      xCoords[0] = x;
      yCoords[0] = y;
      
      xCoords[1] = x + (int)(0.4 * size);
      yCoords[1] = y + (int)(0.7 * size);
      
      xCoords[2] = xCoords[1] + size; 
      yCoords[2] = yCoords[1];
      
      xCoords[3] = xCoords[2] - (int)(0.6 * size);
      yCoords[3] = yCoords[2] + (int)(0.7 * size);
      
      xCoords[4] = xCoords[3] + (int)(0.2 * size);
      yCoords[4] = yCoords[3] + (int)(0.9 * size);
      
      xCoords[5] = xCoords[0];
      yCoords[5] = yCoords[4] - (int)(0.5 * size);
      
      xCoords[9] = xCoords[0] - (int)(0.4 * size);
      yCoords[9] = yCoords[0] + (int)(0.7 * size);
      
      xCoords[8] = xCoords[9] - size;
      yCoords[8] = yCoords[9];
      
      xCoords[7] = xCoords[8] + (int)(0.6 * size);
      yCoords[7] = yCoords[3];
      
      xCoords[6] = xCoords[7] - (int)(0.2 * size); 
      yCoords[6] = yCoords[4];
      
      
   
      g.fillPolygon(xCoords, yCoords, 10);
      
   } // end fillStar
   
   public void paint(Graphics g){
      
      g.setColor(Color.orange);
      
      for(int x=0; x<10; x++){
         int xC = (int) (Math.random()*(500-100))+100;
         int yC = (int)(Math.random()*(500-100))+100;
         int size= (int)(Math.random()*(100-40))+40;
         fillStar(g,xC,yC,size);
     } // end for loop
     
     
   } // end paint
} // end class