//name: Eamonn Nugent
//Star

import TurtleGraphics.*;

public class star
{
	public static void main(String[] args)
	{
		StandardPen pen = new StandardPen();
		
		pen.home();
		pen.turn(18);
		pen.move(20);
		pen.turn(144);
		pen.move(20);
		pen.setDirection(180);
		pen.move(20);
		pen.turn(144);
		pen.move(20);
		pen.turn(288);
		pen.move(20);
		pen.turn(144);
		pen.move(20);
		pen.turn(288);
		pen.move(20);
		pen.turn(144);
		pen.move(20);
		pen.turn(288);
		pen.move(20);
		pen.turn(144);
		pen.move(20);
	}
}