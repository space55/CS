//name: Eamonn Nugent
//Arrow (Drawing Project)

import TurtleGraphics.*;

public class arrow
{
	public static void main(String[] args)
	{
		StandardPen pen = new StandardPen();
		
		pen.home();
		pen.up();
		pen.setDirection(180);
		pen.move(30);
		pen.down();
		pen.setDirection(0);
		pen.move(50);
		pen.turn(270);
		pen.move(10);
		pen.turn(135);
		pen.move(20);
		pen.turn(90);
		pen.move(20);
		pen.turn(135);
		pen.move(10);
		pen.turn(270);
		pen.move(50);
		pen.turn(135);
		pen.move(7);
		pen.turn(270);
		pen.move(7);
	}
}
