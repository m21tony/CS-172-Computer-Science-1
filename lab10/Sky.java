import java.applet.*;
import java.awt.*;
import java.util.*;

public class Sky extends Applet {
   public void paint( Graphics g ) {
   
g.setColor(Color.yellow);
int i;
int[] a={0,0,0,0,0,0,0,0,0,0,0};
int[] b={0,0,0,0,0,0,0,0,0,0,0};


int[] x  = {62,72,92,72,80,60,45,48,29,52,62};
int[] y = {58,82,88,100,125,105,122,95,78,80,58};
g.fillPolygon(x,y,11);
g.setColor(Color.yellow);
g.drawPolygon(x,y,10);

//Random Star Code
for(int j=0;j<10;j++){
Random r = new Random();
int z=r.nextInt(10)+1;
for(i=0;i<11;i++){
a[i] = x[i] * z;
b[i] = y[i] * z;
 
}
g.setColor(Color.black);
g.drawPolygon(a,b,11);
g.setColor(Color.yellow);
g.fillPolygon(a,b,11);
   }
   }
   }
   