/*********************************************************************************
 
-CS 172 Section M01
-CreateCity.java
-Written By: Antonio Maldonado
-Date: April 18, 2017
-Purpose: This program contains two methods which will draw a 'city' with buildings
          and a road in front of the buildings, all of different color

**********************************************************************************/

import java.awt.*;
import javax.swing.JApplet;

public class CreateCity extends JApplet {
   
   public void drawBuilding(Graphics g, int x, int y, int width, int height){
   
      int doorWidth = 40;
      int doorHeight = 60;
      int windowWidth = 40;
      int windowHeight = 40;
      int windowSpace = 40;
      
      g.fillRect(x, y, width, height);
      
      // windows
      g.setColor(Color.white);
      g.fillRect(x + windowSpace, y + windowSpace, windowWidth, windowHeight);
      g.fillRect(x +(2 * windowSpace + windowWidth), y + windowSpace, windowWidth, windowHeight);
      g.fillRect(x + windowSpace, y + (2 * windowSpace + windowWidth), windowWidth, windowHeight);
      g.fillRect(x + (2 * windowSpace + windowWidth), y + (2 * windowSpace + windowWidth), windowWidth, windowHeight);
      
      // doors
      g.setColor(Color.gray);
      g.fillRect(x+(width/2)-(doorWidth/2),y+(height-doorHeight), doorWidth, doorHeight);
         
   
   } // end drawBuilding method
   
   public void paint(Graphics g){
    
      // first building
      // random color
      int red = (int) (Math.random() * 256);
      int green = (int) (Math.random() * 256);
      int blue = (int) (Math.random() * 256);
      Color random1 = new Color(red, green, blue);
      
      g.setColor(random1);
      drawBuilding(g,40,320,201,321);
      
      g.setColor(Color.black);
      g.drawRect(40,320,200,321);
      
      // second building
      red = (int) (Math.random() * 256);
      green = (int) (Math.random() * 256);
      blue = (int) (Math.random() * 256);
      Color random2 = new Color(red, green, blue);
      
      g.setColor(random2);
      drawBuilding(g,240,160,201,481);
      
      g.setColor(Color.black);
      g.drawRect(240,160,201,481);
      
      // third building
      red = (int) (Math.random() * 256);
      green = (int) (Math.random() * 256);
      blue = (int) (Math.random() * 256);
      Color random3 = new Color(red, green, blue);
      
      g.setColor(random3);
      drawBuilding(g,441,400,200,241);
      
      g.setColor(Color.black);
      g.drawRect(441,400,179,241);
      
      // fourth building
      red = (int) (Math.random() * 256);
      green = (int) (Math.random() * 256);
      blue = (int) (Math.random() * 256);
      Color random4 = new Color(red, green, blue);
      
      g.setColor(random4);
      drawBuilding(g,620,40,201,601);
      
      g.setColor(Color.black);
      g.drawRect(620,40,201,601);
      
      // road
      g.fillRect(0,660,860,2);
      g.fillRect(0,740,860,2);
      
      g.setColor(Color.orange);
      g.drawRect(0,700,860,2);
   
   } // end paint
}// end class