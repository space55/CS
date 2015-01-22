//name: Eamonn Nugent
//boxArrow (Drawing Project)

import TurtleGraphics.*;

public class boxArrow
{
	public static void main(String[] args)
	{
		StandardPen pen = new StandardPen();
		
		pen.home();
		pen.setDirection(270);
		pen.up();
		pen.move(30);
		pen.down();
		pen.turn(90);
		pen.move(35);
		pen.turn(90);
		pen.move(15);
		//Start arrow
		pen.turn(270);
		pen.move(15);
		pen.turn(270);
		pen.move(10);
		pen.turn(135);
		pen.move(20);
		pen.turn(90);
		pen.move(20);
		pen.turn(135);
		pen.move(10);
		pen.turn(270);
		pen.move(15);
		pen.turn(270);
		pen.move(15);
		//End Arrow
		pen.turn(90);
		pen.move(35);
		pen.turn(90);
		pen.move(15);
		pen.turn(270);
		//Start Arrow
		pen.move(15);
		pen.turn(270);
		pen.move(10);
		pen.turn(135);
		pen.move(20);
		pen.turn(90);
		pen.move(20);
		pen.turn(135);
		pen.move(10);
		pen.turn(270);
		pen.move(15);
		pen.turn(270);
		pen.move(15);
	}
}
