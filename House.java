import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
public class House extends Applet
{
	public  void paint ( Graphics g )
	{
		g.setColor(Color.green);
		g.fillRect(0, 0, 500, 500);
		g.setColor(Color.blue);
		g.fillRect(0, 0, 500, 250);
		//tree
		Color dlightGreen = new Color(0.75f, 1.0f, 0.25f);
		g.setColor(dlightGreen);
		g.fillOval(0, 200, 50,100);
		Color lightGreen = new Color(0.30f, 1.0f, 0.25f);
		g.setColor(lightGreen);
		g.fillOval(20, 190, 50,100);
		g.setColor(dlightGreen);
		g.fillOval(40, 180, 50,100);
	    g.setColor(lightGreen);
		g.fillOval(60, 185, 50,100);
	    g.setColor(dlightGreen);
		g.fillOval(75, 195, 50,100);
		int [] xValues = {120, 160, 260, 300};
		int[] yValues = { 180, 140, 140, 180};
		g.setColor( Color.red);
		g.fillPolygon( xValues, yValues, 4);
		g.setColor(Color.black);
		g.drawPolygon(xValues, yValues, 4);
		g.setColor(Color.darkGray);
		g.fillRect(120, 180, 180, 120);
		g.setColor(Color.red);
		g.fillRect(200, 120, 20,20);
		g.setColor(Color.black);
		g.drawRect(200, 120, 20,20);
		g.setColor(Color.lightGray);
		g.fillOval(200,100,20, 20);
		g.fillOval(210,90,20, 20);
		g.fillOval(215,50, 20, 50 );
		g.fillOval(220,20, 40, 70); 
		//sun 
		g.setColor(Color.yellow);
		g.fillOval(400,10,50, 50);
		g.setColor(Color.blue);
		g.fillOval(390,10,40, 40);
		//1st window
		g.setColor(Color.yellow);
		g.fillRect(140, 200, 40,20);
		g.setColor(Color.black);
		g.drawLine(140, 210, 180, 210); 
		g.drawLine(160, 200, 160, 220);
		g.drawRect(140, 200, 40,20); 
		//2nd Window
		g.setColor(Color.yellow);
		g.fillRect(200, 200, 20,20);
		g.setColor(Color.black);
		g.drawLine(210, 200, 210,220);
		g.drawLine(200, 210, 220, 210);
		g.drawRect(200, 200, 20,20);
		//3rd Window
		g.setColor(Color.yellow);
		g.fillRect(240, 200, 40,20);
		g.setColor(Color.black);
		g.drawRect(240, 200, 40,20);
		g.drawLine(260,200, 260,220);
		g.drawLine(240, 210, 280,210);
		//4th  Window
		g.setColor(Color.yellow);
		g.fillRect(140, 260, 40,20);
		g.drawRect(140, 260, 40,20);
		g.setColor(Color.black);
		g.drawLine(160,260,160,280);
		g.drawLine(140,270,180,270);

		// 5th Window
		g.setColor(Color.yellow);
		g.fillRect(240, 260, 40,20);
		g.drawRect(240, 260, 40,20);
		g.setColor(Color.black);
		g.drawLine(260,260, 260, 280);
		g.drawLine(240, 270, 280, 270);
		// the door
		g.setColor(Color.orange);
		g.fillRect(200, 260, 20,40);
		g.setColor(Color.black);
		g.drawLine(200,280, 220, 280);
	
		// wall
		g.setColor(Color.darkGray);
		g.fillRect(0, 250, 120, 50);
		/*g.setColor(Color.black);
		g.drawRect(0, 250, 120, 50);
	*/	// footpath
		Color mycolor = new Color(1.00f, 1.0f, 0.25f);
		g.setColor(mycolor);
		g.fillRect(180, 300, 60,200);

	
		


	}

}