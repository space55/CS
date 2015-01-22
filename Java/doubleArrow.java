//name: Eamonn Nugent
//Double Arrow

import TurtleGraphics.*;

public class doubleArrow
{
	public static void main(String[] args)
	{
		StandardPen pen = new StandardPen();
		
		pen.home();
		pen.setDirection(0);
		pen.move(30);
		pen.turn(270);
		pen.move(10);
		pen.turn(135);
		pen.move(20);
		pen.turn(90);
		pen.move(20);
		pen.setDirection(270);
		pen.move(10);
		pen.turn(270);
		pen.move(60);
		pen.turn(270);
		pen.move(10);
		pen.turn(135);
		pen.move(20);
		pen.turn(90);
		pen.move(20);
		pen.setDirection(90);
		pen.move(10);
		pen.turn(270);
		pen.move(30);
	}
}