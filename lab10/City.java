import java.applet.*;
import java.awt.*;
public class City extends Applet {
	public void paint( Graphics g ) {
		//Red Building + outline
		g.setColor( Color.black );
		g.drawRect( 30, 100, 50, 100 );
		g.setColor( Color.red );
		g.fillRect( 30, 100, 50, 100 );
		//Red Building's Windows
		g.setColor( Color.white );
		g.fillRect( 40, 110, 10, 20 );
		g.fillRect( 60, 110, 10, 20 );
		g.fillRect( 40, 140, 10, 20 );
		g.fillRect( 60, 140, 10, 20 );
		//Red Buildings Doors
		g.setColor( Color.lightGray );
		g.fillRect( 50, 180, 10, 20 );
		// #2
		/*
		//Random Color Code
		int red=(int)(Math.random()*(255-0+1));
		int green=(int)(Math.random()*250);
		int blue =(int)(Math.random()*256);
		Color random = new Color (red,green,blue);
		*/
		//Dark Grey Building + outline
		g.setColor( Color.cyan );
		g.fillRect( 80, 80, 50, 120 );
		g.setColor( Color.black );
		g.drawRect( 80, 80, 50, 120 );
		//Grey Building's Windows & door
		g.setColor( Color.white );
		g.fillRect( 90, 90, 10, 20 );
		g.fillRect( 90, 120, 10, 20 );
		g.fillRect( 110, 90, 10, 20 );
		g.fillRect( 110, 120, 10, 20 );
		g.fillRect( 110, 150, 10, 20 );
		g.fillRect( 90, 150, 10, 20 );
		g.fillRect( 90, 180, 10, 20 );
		g.setColor( Color.lightGray );
		g.fillRect( 110, 180, 10, 20 );
		//orange building 
		g.setColor( Color.black );
		g.drawRect( 150, 100, 50, 100 );
		g.setColor( Color.orange );
		g.fillRect( 150, 100, 50, 100 );
		//orange Building's Windows
		g.setColor( Color.white );
		g.fillRect( 160, 110, 10, 20 );
		g.fillRect( 180, 110, 10, 20 );
		g.fillRect( 160, 140, 10, 20 );
		g.fillRect( 180, 140, 10, 20 );
		//orange Buildings Doors
		g.setColor( Color.lightGray );
		g.fillRect( 170, 180, 10, 20 );
		//road
		g.setColor( Color.black );
		g.fillRect( 0, 200, 500, 40 );
		//stripes
		g.setColor( Color.yellow );
		g.fillRect( 10, 217, 10, 5 );
		g.fillRect( 30, 217, 10, 5 );
		g.fillRect( 50, 217, 10, 5 );
		g.fillRect( 70, 217, 10, 5 );
		g.fillRect( 90, 217, 10, 5 );
		g.fillRect( 110, 217, 10, 5 );
		g.fillRect( 130, 217, 10, 5 );
		g.fillRect( 150, 217, 10, 5 );
		g.fillRect( 170, 217, 10, 5 );
		g.fillRect( 190, 217, 10, 5 );
		g.fillRect( 210, 217, 10, 5 );
		g.fillRect( 230, 217, 10, 5 );
		g.fillRect( 250, 217, 10, 5 );
		g.fillRect( 270, 217, 10, 5 );
		g.fillRect( 290, 217, 10, 5 );
		g.fillRect( 310, 217, 10, 5 );
		g.fillRect( 330, 217, 10, 5 );
		g.fillRect( 350, 217, 10, 5 );
		g.fillRect( 370, 217, 10, 5 );
		g.fillRect( 390, 217, 10, 5 );
		g.fillRect( 410, 217, 10, 5 );
	}
}