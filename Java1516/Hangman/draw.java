//Name: Eamonn Nugent
//ENugentHangmanDraw

import TurtleGraphics.*;

public class draw
{	
	public static void drawHeadLoc(StandardPen pen, int relSize)
	{
		pen.home();
		pen.up();
		pen.setDirection(90);
		pen.move(relSize*180/Math.PI+145*relSize);
		pen.setDirection(180);
		pen.move(relSize*180/Math.PI + relSize*4/3);
		pen.down();
	}
	
	public static void drawHead(StandardPen pen, int relSize)
	{
        drawHeadLoc(pen, relSize);
		for (int counter = 0; counter < 360; counter++)
		{
			pen.move(relSize);
			pen.turn(1);
		}
	}
	
	public static void drawTophat(StandardPen pen, int relSize)
	{
		drawTophatLoc(pen, relSize);
		pen.up();
		pen.setDirection(180);
		pen.move(relSize*180/Math.PI/4*3);
		pen.down();
		pen.turn(180);
		pen.move(relSize*360/Math.PI/4*3);
		pen.turn(180);
		pen.move(relSize*360/Math.PI/4*3/4);
		pen.turn(270);
		pen.move(30*relSize);
		pen.turn(90);
		pen.move(relSize*360/Math.PI/4*3/2);
		pen.turn(90);
		pen.move(30*relSize);
		pen.turn(270);
	}
	
	public static void drawTophatLoc(StandardPen pen, int relSize)
	{
		pen.home();
		pen.up();
		pen.setDirection(90);
		pen.move(relSize*180/Math.PI+145*relSize);
		pen.setDirection(180);
		pen.move(relSize*180/Math.PI);
		pen.down();
	}
	
	public static void drawHeadEye1(StandardPen pen, int relSize)
	{
		pen.home();
		pen.up();
		pen.setDirection(90);
		pen.move(relSize*180/Math.PI+145*relSize);
		pen.turn(90);
		pen.move(relSize*180/Math.PI-15*relSize);
		pen.turn(90);
		pen.move(20*relSize);
		pen.down();
		pen.setDirection(270);
		pen.move(relSize*15);
		pen.turn(120);
		pen.move(relSize*15);
		pen.turn(120);
		pen.move(relSize*15);
		pen.turn(120);
	}
	
	public static void drawHeadEye2(StandardPen pen, int relSize)
	{
		pen.home();
		pen.up();
		pen.setDirection(90);
		pen.move(relSize*180/Math.PI+145*relSize);
		pen.turn(90);
		pen.move(relSize*180/Math.PI+25*relSize);
		pen.turn(90);
		pen.move(20*relSize);
		pen.down();
		pen.setDirection(270);
		pen.move(relSize*15);
		pen.turn(120);
		pen.move(relSize*15);
		pen.turn(120);
		pen.move(relSize*15);
		pen.turn(120);
	}
	
	public static void drawNoseLoc(StandardPen pen, int relSize)
	{
		pen.up();
		pen.home();
		pen.move(relSize*180/Math.PI+145*relSize);
		pen.setDirection(180);
		pen.move(relSize*180/Math.PI);
		pen.setDirection(270);
		pen.move(relSize*50);
		pen.turn(270);
		pen.move(6);
		pen.down();
	}
	
	public static void drawNose(StandardPen pen, int relSize)
	{
        drawNoseLoc(pen, relSize);
		pen.setDirection(270);
		pen.move(7*relSize);
		pen.turn(120);
		pen.move(7*relSize);
		pen.turn(120);
		pen.move(7*relSize);
	}
	
	public static void drawMouthLoc(StandardPen pen, int relSize)
	{
		pen.up();
		pen.home();
		pen.move(relSize*180/Math.PI+145*relSize);
        pen.turn(90);
        pen.move(relSize*180/Math.PI + relSize*180/Math.PI/2 - relSize*3);
		pen.turn(90);
		pen.move(relSize*30);
        pen.setDirection(270);
        pen.move(relSize*45);
		pen.down();
	}
	
	public static void drawMouth(StandardPen pen, int relSize)
	{
        drawMouthLoc(pen, relSize);
		pen.setDirection(130);
        pen.turn(180);
		for (int counter = 0; counter < 50; counter++)
		{
			pen.move(1*relSize);
			pen.turn(2);
		}
		pen.setDirection(200);
		for (int counter = 0; counter < 42; counter++)
		{
			pen.move(1*relSize);
			pen.turn(-1);
		}
	}
	
	public static void drawBodyLoc(StandardPen pen, int relSize)
	{
		pen.up();
		pen.home();
		pen.setDirection(180);
		pen.move(relSize*180/Math.PI + relSize*4/3);
		pen.setDirection(90);
		pen.move(145*relSize-relSize*180/Math.PI);
		pen.setDirection(270);
		pen.down();
	}
	
	public static void drawBody(StandardPen pen, int relSize)
	{
		drawBodyLoc(pen, relSize);
		pen.move(200*relSize);
	}
    
    public static void drawArmLoc(StandardPen pen, int relSize)
    {
		pen.up();
		pen.home();
		pen.setDirection(180);
		pen.move(relSize*180/Math.PI + relSize*4/3);
		pen.setDirection(90);
		pen.move(145*relSize-relSize*180/Math.PI);
		pen.setDirection(270);
        pen.move(30);
		pen.down();
    }
    
    public static void drawLegLoc(StandardPen pen, int relSize)
    {
		pen.up();
		pen.home();
		pen.setDirection(180);
		pen.move(relSize*180/Math.PI + relSize*4/3);
		pen.setDirection(90);
		pen.move(145*relSize-relSize*180/Math.PI);
		pen.setDirection(270);
        pen.move(200);
		pen.down();
    }
    
    public static void drawArmL(StandardPen pen, int relSize)
    {
        drawArmLoc(pen, relSize);
        pen.turn(45);
        pen.move(75);
    }
    
    public static void drawArmR(StandardPen pen, int relSize)
    {
        drawArmLoc(pen, relSize);
        pen.turn(-45);
        pen.move(75);
    }
    
    public static void drawLegL(StandardPen pen, int relSize)
    {
        drawLegLoc(pen, relSize);
        pen.turn(45);
        pen.move(100);
    }
    
    public static void drawLegR(StandardPen pen, int relSize)
    {
        drawLegLoc(pen, relSize);
        pen.turn(-45);
        pen.move(100);
    }
	
	public static void drawNoose(StandardPen pen, int relSize)
	{
		drawNooseLoc(pen, relSize);
		pen.move(40*relSize);
		pen.turn(270);
		pen.move(150*relSize);
		pen.turn(270);
		pen.move(450*relSize+30*relSize);
		pen.turn(90);
		pen.move(100*relSize);
		pen.turn(180);
		pen.move(200*relSize);
	}
	
	public static void drawNooseLoc(StandardPen pen, int relSize)
	{
		pen.up();
		pen.home();
		pen.setDirection(90);
		pen.move(relSize*180/Math.PI);
		pen.turn(90);
		pen.move(relSize*180/Math.PI + relSize*4/3);
		pen.setDirection(90);
		pen.move(relSize*360/Math.PI+31*relSize);
		pen.move(30*relSize);
		pen.down();
	}
	
	public static void drawMoustache(StandardPen pen, int relSize)
	{
		pen.home();
	}
	
	public static void test(StandardPen pen) // This was used for debugging, such as when I wanted to know where the heck my pen decided it wanted to be
	{
        pen.down();
		pen.move(100);
		pen.turn(180);
		pen.move(100);
		pen.turn(180);
	}
}